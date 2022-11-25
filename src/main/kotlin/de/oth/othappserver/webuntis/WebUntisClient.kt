package de.oth.othappserver.webuntis

import com.fasterxml.jackson.databind.ObjectMapper
import de.oth.othappserver.exceptions.WebuntisNotAvailable
import de.oth.othappserver.extension.is2xxSuccessful
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpPost
import org.apache.http.util.EntityUtils
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service
import org.zalando.problem.Problem
import org.zalando.problem.Status
import java.io.IOException
import java.io.InputStream
import java.util.*

@Service
@ConditionalOnProperty(WebUntisProperties.ENABLED)
class WebUntisClient(
    private val httpClient: HttpClient,
    private val authenticator: WebUntisAuthenticator,
    private val mapper: ObjectMapper,
    private val props: WebUntisProperties
) {

    companion object {
        private val logger = LoggerFactory.getLogger(WebUntisClient::class.java)
    }

    fun <T : WebUntisResource> get(request: WebUntisRequest<T>): T {
        val post = request.asHttpPost(mapper, props.uri)
        val response = executeWithSingleResult(post, request)

        return if (response.error == null) {
            response.result!!
        } else {
            return handleError(response.error) {
                executeWithSingleResult(post, request)
            }
        }
    }

    fun <T : WebUntisResource> getAll(request: WebUntisRequest<T>): List<T> {
        val post = request.asHttpPost(mapper, props.uri)
        val response = executeWithArrayResult(post, request)

        return if (response.error == null) {
            response.result!!
        } else {
            return handleError(response.error) {
                executeWithArrayResult(post, request)
            }
        }
    }

    private fun <T> handleError(error: Error, request: () -> WebUntisResponse<T>): T {
        when {
            error.isNotAuthenticated() -> {
                authenticator.authenticate()

                val response = request()
                if (response.error != null) {
                    if (response.error.isNotAuthenticated()) {
                        logger.error("Received '${response.error.message}' a second time.")
                    } else {
                        logger.error("Received '${response.error.message}'.")
                    }
                    throw Problem.valueOf(Status.INTERNAL_SERVER_ERROR)
                }

                return response.result!!
            }
            error.isNotFound() -> {
                logger.debug("Received '${error.message}'.")
                throw Problem.valueOf(Status.NOT_FOUND)
            }
            else -> {
                logger.error("Received '${error.message}'.")
                throw Problem.valueOf(Status.INTERNAL_SERVER_ERROR)
            }
        }
    }

    private fun <T : WebUntisResource> executeWithSingleResult(httpPost: HttpPost, request: WebUntisRequest<T>): WebUntisResponse<T> {
        val paraType = mapper.typeFactory.constructParametricType(WebUntisResponse::class.java, request.type)

        return execute(httpPost, request) {
            mapper.readValue(it, paraType) as WebUntisResponse<T>
        }
    }

    private fun <T : WebUntisResource> executeWithArrayResult(httpPost: HttpPost, request: WebUntisRequest<T>): WebUntisResponse<List<T>> {
        val arrayType = mapper.typeFactory.constructCollectionLikeType(LinkedList::class.java, request.type)
        val paraType = mapper.typeFactory.constructParametricType(WebUntisResponse::class.java, arrayType)

        return execute(httpPost, request) {
            if (logger.isDebugEnabled) {
                val json = it.bufferedReader().use { stream -> stream.readText() }
                logger.debug("WebUntis response: $json")

                mapper.readValue(json, paraType) as WebUntisResponse<List<T>>
            } else {
                mapper.readValue(it, paraType) as WebUntisResponse<List<T>>
            }
        }
    }

    private fun <T> execute(httpPost: HttpPost, request: WebUntisRequest<*>, block: (InputStream) -> T): T {
        httpClient.execute(httpPost, authenticator.getContext()).let { response ->
            if (!response.is2xxSuccessful()) {
                logger.error("Webuntis returned ${response.statusLine.statusCode} ${response.statusLine.reasonPhrase}.")

                // Close the opened connection before throwing an error
                EntityUtils.consumeQuietly(response.entity)

                throw WebuntisNotAvailable()
            }

            return kotlin.runCatching {
                response.entity.content.use { stream ->
                    block(stream)
                }.also {
                    EntityUtils.consumeQuietly(response.entity)
                }
            }.getOrElse {
                logger.error("Failed to get webuntis resources for '${request.method}'.", it)

                when (it) {
                    is IOException -> throw Problem.valueOf(Status.GATEWAY_TIMEOUT)
                    else -> throw Problem.valueOf(Status.INTERNAL_SERVER_ERROR)
                }
            }
        }
    }
}
