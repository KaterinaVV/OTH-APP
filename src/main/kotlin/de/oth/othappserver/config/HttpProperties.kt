package de.oth.othappserver.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.bind.DefaultValue

@ConstructorBinding
@ConfigurationProperties(prefix = HttpProperties.prefix)
data class HttpProperties(
    /**
     * Timeout until a HTTP connection has to be established with the remote host.
     */
    @DefaultValue("-1")
    val connectTimout: Int,
    /** Timeout until a HTTP connection has to be finished sending. */
    @DefaultValue("-1")
    val connectionTimout: Int,
    /**
     * Defines the socket timeout in milliseconds, which is the timeout for waiting for data or, put differently,
     * a maximum period inactivity between two consecutive data packets).
     */
    @DefaultValue("-1")
    val socketTimout: Int
) {
    companion object {
        const val prefix = "app.http"
    }
}
