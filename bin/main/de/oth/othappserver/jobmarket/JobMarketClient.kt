package de.oth.othappserver.jobmarket

import com.fasterxml.jackson.databind.ObjectMapper
import de.oth.othappserver.exceptions.JobmarketNotAvailable
import de.oth.othappserver.extension.is2xxSuccessful
import org.apache.http.HttpResponse
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.utils.URIBuilder
import org.apache.http.util.EntityUtils
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component
import org.zalando.problem.Problem
import org.zalando.problem.Status
import java.io.IOException

@Component
@ConditionalOnProperty(JobmarketProperties.ENABLED)
class JobMarketClient(
    private val httpClient: HttpClient,
    private val properties: JobmarketProperties,
    private val mapper: ObjectMapper
) {
    companion object {
        private val logger = LoggerFactory.getLogger(JobMarketClient::class.java)
        const val ERROR_RESPONSE = "[\"ERROR\"]"
        const val NOT_FOUND_RESONSE = "[\"not found\"]"
    }

    private val credentials: JobMarketCredentials = JobMarketCredentials(properties.clientId, properties.clientKey)

    fun <T : JobMarketCall, R, I : JobMarketRequestResponse<T, R>> execute(requestResponse: I): R {
        val request = JobMarketRequest(credentials, listOf(requestResponse.call))
        val response = executeRequest(request)

        if (!response.is2xxSuccessful()) {
            logger.error("Jobmarket returned ${response.statusLine}.")
            // Close the opened connection before throwing an error
            EntityUtils.consumeQuietly(response.entity)
            throw JobmarketNotAvailable()
        }

        return response.entity.content.use {
            val buffer = ByteArray(response.entity.contentLength.toInt())
            it.readNBytes(buffer, 0, buffer.size)

            kotlin.runCatching {
                mapper.createParser(buffer).use { parser ->
                    parser.nextToken()
                    parser.nextToken()

                    requestResponse.parse(mapper, parser)
                }
            }.getOrElse { e ->
                throw handleError(request, buffer, e)
            }
        }.also {
            EntityUtils.consumeQuietly(response.entity)
        }
    }
//
//    fun executeBatch(vararg requestResponse: JobMarketRequestResponse<out JobMarketCall, out Any>): List<Any> {
//        val calls = requestResponse.toList().map { it.call }
//        val request = JobMarketRequest(credentials, calls)
//
//        val response = executeRequest(request)
//
//        return response.entity.content.use {
//            val json = it.bufferedReader().use { it.readText() }
//
//            if (json == "[\"not found\"]") throw NotFoundException()
//
//            val parser = mapper.createParser(json)
//            parser.nextToken()
//            parser.nextToken()
//
//            requestResponse.map { reqRes ->
//
//                reqRes.parse(mapper, parser)
//            }
//        }.also {
//            EntityUtils.consumeQuietly(response.entity)
//        }
//    }

    fun <
        T1 : JobMarketCall, R1, I1 : JobMarketRequestResponse<T1, R1>,
        T2 : JobMarketCall, R2, I2 : JobMarketRequestResponse<T2, R2>,
        T3 : JobMarketCall, R3, I3 : JobMarketRequestResponse<T3, R3>
        > executeBatch(requestResponse: I1, requestResponse2: I2, requestResponse3: I3): Triple<R1, R2, R3> {
        val request = JobMarketRequest(credentials, listOf(requestResponse.call, requestResponse2.call, requestResponse3.call))
        val response = executeRequest(request)

        if (!response.is2xxSuccessful()) {
            logger.error("Jobmarket returned ${response.statusLine}.")
            // Close the opened connection before throwing an error
            EntityUtils.consumeQuietly(response.entity)
            throw JobmarketNotAvailable()
        }

        return response.entity.content.use {
            val buffer = ByteArray(response.entity.contentLength.toInt())
            it.readNBytes(buffer, 0, buffer.size)

            kotlin.runCatching {
                mapper.createParser(buffer).use { parser ->
                    parser.nextToken()
                    parser.nextToken()

                    val result1 = requestResponse.parse(mapper, parser)
                    val result2 = requestResponse2.parse(mapper, parser)
                    val result3 = requestResponse3.parse(mapper, parser)

                    Triple(result1, result2, result3)
                }
            }.getOrElse { e ->
                throw handleError(request, buffer, e)
            }
        }.also {
            EntityUtils.consumeQuietly(response.entity)
        }
    }

    private fun handleError(request: JobMarketRequest, buffer: ByteArray, exception: Throwable): Throwable {
        val responseValue = String(buffer)
        logger.error("Failed to parse Jobmarket response $responseValue for request $request.", exception)

        return when (responseValue) {
            NOT_FOUND_RESONSE -> Problem.valueOf(Status.NOT_FOUND)
            ERROR_RESPONSE -> JobmarketNotAvailable()
            else -> exception
        }
    }

    private fun executeRequest(request: JobMarketRequest): HttpResponse {
        val httpGet = HttpGet(URIBuilder(properties.uri).setParameter("q", mapper.writeValueAsString(request)).build())

        return kotlin.runCatching { httpClient.execute(httpGet) }
            .getOrElse {
                logger.error("Failed to get jobmarket resources.", it)

                when (it) {
                    is IOException -> throw Problem.valueOf(Status.GATEWAY_TIMEOUT)
                    else -> throw Problem.valueOf(Status.INTERNAL_SERVER_ERROR)
                }
            }
    }
}
