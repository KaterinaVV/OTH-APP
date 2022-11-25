package de.oth.othappserver.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.security.web.authentication.HttpStatusEntryPoint
import org.springframework.security.web.authentication.preauth.RequestHeaderAuthenticationFilter
import org.springframework.security.web.util.matcher.AntPathRequestMatcher
import org.springframework.security.web.util.matcher.NegatedRequestMatcher
import org.springframework.security.web.util.matcher.OrRequestMatcher

// https://stackoverflow.com/questions/48446708/securing-spring-boot-api-with-api-key-and-secret
// https://octoperf.com/blog/2018/03/08/securing-rest-api-spring-security/#securityconfig

@Configuration
@EnableWebSecurity
@Order(1)
open class WebSecurityConfig : WebSecurityConfigurerAdapter() {
    private val principalRequestHeader: String = "X-API-Key"

    @Value("\${app.auth.token:random.uuid}")
    private lateinit var principalRequestValue: String

    private val PROTECTED_URLS = OrRequestMatcher(
        AntPathRequestMatcher("/v1/candidates/**", HttpMethod.POST.toString()),
        AntPathRequestMatcher("/v1/candidates/**", HttpMethod.PUT.toString()),
        AntPathRequestMatcher("/v1/candidates/**", HttpMethod.DELETE.toString()),
        AntPathRequestMatcher("/v1/election/**", HttpMethod.POST.toString()),
        AntPathRequestMatcher("/v1/election/**", HttpMethod.DELETE.toString()),
    )

    private val PUBLIC_URLS = NegatedRequestMatcher(PROTECTED_URLS)

    override fun configure(web: WebSecurity) {
        web.ignoring().requestMatchers(PUBLIC_URLS)
    }

    @Throws(java.lang.Exception::class)
    override fun configure(httpSecurity: HttpSecurity) {
        val filter = RequestHeaderAuthenticationFilter()
        filter.setExceptionIfHeaderMissing(false)
        filter.setPrincipalRequestHeader(principalRequestHeader)
        filter.setAuthenticationManager { authentication ->
            val principal = authentication.principal as String
            if (principalRequestValue != principal) {
                throw BadCredentialsException("The API key was not found or not the expected value.")
            }
            authentication.isAuthenticated = true
            authentication
        }

        httpSecurity.sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .exceptionHandling()
            .defaultAuthenticationEntryPointFor(unauthorized(), PROTECTED_URLS)
            .and().addFilter(filter).authorizeRequests().requestMatchers(PROTECTED_URLS).authenticated()
            .and()
            .csrf().disable()
            .formLogin().disable()
            .httpBasic().disable()
            .logout().disable()
    }

    @Bean
    open fun unauthorized(): AuthenticationEntryPoint? {
        return HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)
    }
}
