package de.oth.othappserver.config

import com.fasterxml.jackson.databind.ObjectMapper
import de.oth.othappserver.exchange.ExchangeClient
import de.oth.othappserver.exchange.ExchangeProperties
import de.oth.othappserver.exchange.HttpExchangeClient
import org.apache.http.HttpHost
import org.apache.http.auth.AuthScope
import org.apache.http.auth.NTCredentials
import org.apache.http.auth.NTUserPrincipal
import org.apache.http.client.HttpClient
import org.apache.http.client.protocol.HttpClientContext
import org.apache.http.impl.auth.BasicScheme
import org.apache.http.impl.client.BasicAuthCache
import org.apache.http.impl.client.BasicCredentialsProvider
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment

@Configuration
@EnableConfigurationProperties(ExchangeProperties::class)
open class EventsConfig {
    private val exchangeHost = HttpHost("exchange.hs-regensburg.de", 443, "https")

    @Value("\${spring.profiles.active:}")
    private lateinit var activeProfiles: String

    @Autowired
    private lateinit var environment: Environment

    @Bean
    open fun exchangeClient(
        exchangeHttpClient: HttpClient,
        exchangeProperties: ExchangeProperties,
        objectMapper: ObjectMapper
    ): ExchangeClient {
        val credProvider = BasicCredentialsProvider()
        val basicAuthCache = BasicAuthCache()
        basicAuthCache.put(exchangeHost, BasicScheme())

        if (activeProfiles.contains("dev") && exchangeProperties.password == ExchangeProperties.NO_PASS) {
            // try RZ credentials
            val rzUser = environment.getProperty("RZ_USER") ?: ""
            val rzPass = environment.getProperty("RZ_PASSWORD") ?: ""
            if (rzUser.isNotBlank() && rzPass.isNotBlank()) {
                exchangeProperties.username = rzUser
                exchangeProperties.password = rzPass
                exchangeProperties.uri = "https://exchange.hs-regensburg.de/api/v2.0/me/calendarview"
                exchangeProperties.feedbackMailAddress = "$rzUser@st.oth-regensburg.de"
            }
        }

        if (exchangeProperties.password == ExchangeProperties.NO_PASS) {
            throw IllegalStateException(
                "Can't initialize ExchangeClient because of missing password. Either provide" +
                    " the production password via the environment variable 'app.exchange.password' or by passing in your rz credentials" +
                    " in via the env vars 'RZ_USER' and 'RZ_PASSWORD'."
            )
        }

        credProvider.setCredentials(
            AuthScope(exchangeHost, AuthScope.ANY_REALM, "ntlm"),
            NTCredentials(exchangeProperties.username, exchangeProperties.password, null, null)
        )

        val httpContextSupplier = {
            HttpClientContext.create().apply {
                credentialsProvider = credProvider
                authCache = basicAuthCache
                targetHost = exchangeHost
                userToken = NTUserPrincipal(null, exchangeProperties.username)
            }
        }

        return HttpExchangeClient(
            exchangeHttpClient,
            httpContextSupplier,
            exchangeProperties.uri,
            exchangeProperties.mailUri,
            objectMapper,
            exchangeProperties
        )
    }
}
