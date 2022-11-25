package de.oth.othappserver.config

import de.oth.othappserver.log.LoggingRequestInterceptor
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Metrics
import io.micrometer.core.instrument.Tags
import io.micrometer.core.instrument.binder.httpcomponents.MicrometerHttpClientInterceptor
import io.micrometer.core.instrument.binder.httpcomponents.PoolingHttpClientConnectionManagerMetricsBinder
import org.apache.http.HttpRequest
import org.apache.http.client.HttpClient
import org.apache.http.client.config.RequestConfig
import org.apache.http.conn.HttpClientConnectionManager
import org.apache.http.impl.client.HttpClients
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager
import org.springdoc.core.SpringDocConfigProperties
import org.springdoc.core.SpringDocConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.filter.ShallowEtagHeaderFilter
import org.springframework.web.servlet.resource.ResourceUrlProvider
import java.net.URI
import javax.servlet.Filter

@Configuration
@EnableAutoConfiguration(exclude = [ErrorMvcAutoConfiguration::class])
@EnableConfigurationProperties(HttpProperties::class)
open class HttpConfig {

    @Bean
    open fun connectionManager(): PoolingHttpClientConnectionManager {
        val connManager = PoolingHttpClientConnectionManager()
        connManager.maxTotal = 100
        connManager.defaultMaxPerRoute = 15

        PoolingHttpClientConnectionManagerMetricsBinder(connManager, "default").bindTo(Metrics.globalRegistry)

        return connManager
    }

    @Bean
    open fun httpClient(connectionManager: HttpClientConnectionManager, registry: MeterRegistry, httpProps: HttpProperties): HttpClient {
        val requestInterceptor = MicrometerHttpClientInterceptor(registry, this::getUrlWithoutParameters, Tags.empty(), true)

        val config = RequestConfig.custom()
            .setConnectTimeout(httpProps.connectTimout)
            .setConnectionRequestTimeout(httpProps.connectionTimout)
            .setSocketTimeout(httpProps.connectTimout).build()

        return HttpClients.custom()
            .setConnectionManager(connectionManager)
            .addInterceptorFirst(LoggingRequestInterceptor())
            .addInterceptorFirst(requestInterceptor.requestInterceptor)
            .addInterceptorLast(requestInterceptor.responseInterceptor)
            .setDefaultRequestConfig(config)
            .build()
    }

    /**
     * Returns a uri without its query parameters for security reasons.
     */
    private fun getUrlWithoutParameters(request: HttpRequest): String {
        val uri = URI(request.requestLine.uri)

        return URI(uri.scheme, uri.authority, uri.path, null, uri.fragment).toString()
    }

    @Bean
    open fun etagFilter(): Filter = ShallowEtagHeaderFilter()

    @ControllerAdvice
    open class ResourceUrlAdvice(var resourceUrlProvider: ResourceUrlProvider) {
        @ModelAttribute("urls")
        fun urls(): ResourceUrlProvider = resourceUrlProvider
    }

    @Bean
    open fun springDocConfiguration(): SpringDocConfiguration {
        return SpringDocConfiguration()
    }

    @Bean
    open fun springDocConfigProperties(): SpringDocConfigProperties {
        return SpringDocConfigProperties()
    }
}
