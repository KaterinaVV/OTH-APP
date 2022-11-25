package de.oth.othappserver.webuntis

import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.protocol.HttpClientContext
import org.apache.http.impl.client.BasicCookieStore
import org.apache.http.protocol.HttpContext
import org.apache.http.util.EntityUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component
import org.zalando.problem.Problem
import org.zalando.problem.Status
import java.io.IOException
import java.time.LocalDateTime
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.withLock

/**
 * Provides access to a authenticated HttpContext for a WebUntis session and functionality to execute authentication.
 */
@Component
@ConditionalOnProperty(WebUntisProperties.ENABLED)
class WebUntisAuthenticator(private val httpClient: HttpClient, private val props: WebUntisProperties, private val mapper: ObjectMapper) {
    companion object {
        private val logger: Logger = LoggerFactory.getLogger(WebUntisAuthenticator::class.java)
    }

    private val cookieStore = BasicCookieStore()
    private var authTime = LocalDateTime.MIN
    private val lock = ReentrantReadWriteLock()

    /**
     * A context containing cookies which enable access to WebUntis.
     */
    fun getContext(): HttpContext = lock.readLock().withLock {
        val clientContext = HttpClientContext.create()
        val cStore = BasicCookieStore()
        cStore.addCookies(cookieStore.cookies.toTypedArray())
        clientContext.cookieStore = cStore

        return clientContext
    }

    /**
     * Returs a HttpContext for authentication.
     *
     * This context contains the internal cookieStore.
     */
    private fun doGetContext(): HttpClientContext {
        val clientContext = HttpClientContext.create()
        clientContext.cookieStore = cookieStore

        return clientContext
    }

    /**
     * Authenticates with WebUntis.
     */
    fun authenticate() {
        logger.debug("Initiating authentication.")
        lock.writeLock().withLock {
            // check if there was an authentication in the last few seconds
            if (!LocalDateTime.now().minusSeconds(5).isAfter(authTime)) {
                logger.debug("Skipping authentication. Should be already logged in.")
                return
            }

            logger.info("Authenticating for WebUntis session.")
            // clear current cookie store so we get new cookies for JSESSIONID
            cookieStore.clear()

            val login = WebUntisRequests.authenticate(props.username, props.password, "CLIENT")
                .asHttpPost(mapper, props.uri)

            val loginResponse = kotlin.runCatching { doLogin(login) }
                .getOrElse {
                    when (it) {
                        is IOException -> throw Problem.valueOf(Status.GATEWAY_TIMEOUT)
                        else -> throw it
                    }
                }

            if (loginResponse.error != null) {
                logger.error("Authentication failed with code ${loginResponse.error.code}: ${loginResponse.error.message}")

                throw Problem.valueOf(Status.INTERNAL_SERVER_ERROR)
            } else {
                authTime = LocalDateTime.now()
                logger.info("Successfully authenticated.")
            }
        }
    }

    private fun doLogin(login: HttpPost): WebUntisResponse<WebUntisUser> {
        return httpClient.execute(login, doGetContext()).let { response ->
            response.entity.content.use { stream ->
                val paraType = mapper.typeFactory.constructParametricType(WebUntisResponse::class.java, WebUntisUser::class.java)

                mapper.readValue(stream, paraType) as WebUntisResponse<WebUntisUser>
            }.also {
                EntityUtils.consumeQuietly(response.entity)
            }
        }
    }
}
