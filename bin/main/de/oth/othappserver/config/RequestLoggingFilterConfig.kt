package de.oth.othappserver.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.filter.CommonsRequestLoggingFilter
import org.springframework.web.filter.GenericFilterBean
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest

private class DelegatingApiRequestsLogger : GenericFilterBean() {
    private val loggingFilter = object : CommonsRequestLoggingFilter() {
        fun isDebugEnabled() = logger.isDebugEnabled
    }

    init {
        loggingFilter.setIncludeQueryString(true)
    }

    override fun doFilter(request: ServletRequest?, response: ServletResponse, chain: FilterChain) {
        when (request) {
            is HttpServletRequest -> {
                if (request.requestURI.startsWith("/v") && loggingFilter.isDebugEnabled()) {
                    loggingFilter.doFilter(request, response, chain)
                } else chain.doFilter(request, response)
            }
            else -> chain.doFilter(request, response)
        }
    }
}

@Configuration
open class RequestLoggingFilterConfig {

    @Bean
    open fun logFilter(): Filter = DelegatingApiRequestsLogger()
}
