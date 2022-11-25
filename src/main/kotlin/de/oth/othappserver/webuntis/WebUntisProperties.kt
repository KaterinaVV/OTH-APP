package de.oth.othappserver.webuntis

import de.oth.othappserver.exceptions.MissingConfigurationException
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.bind.DefaultValue

/**
 * Configuration container for WebUntis.
 */
@ConstructorBinding
@ConfigurationProperties(prefix = WebUntisProperties.prefix)
data class WebUntisProperties(
    /** Username used for WebUntis authentication. */
    @DefaultValue("")
    val username: String,
    /** Password used for WebUntis authentication. */
    @DefaultValue("")
    val password: String,
    /** URI pointing at a valid WebUntis service. */
    @DefaultValue("https://kephiso.webuntis.com/WebUntis/jsonrpc.do?school=OTH-Regensburg")
    val uri: String,
    /** Flag enabling WebUntis feature. */
    @DefaultValue("false")
    val enabled: Boolean,
) {
    companion object {
        const val prefix = "app.webuntis"
        const val ENABLED = "$prefix.enabled"
    }

    init {
        if (enabled) {
            if (username.isBlank()) throw MissingConfigurationException("$prefix.username")
            if (password.isBlank()) throw MissingConfigurationException("$prefix.password")
            if (uri.isBlank()) throw MissingConfigurationException("$prefix.uri")
        }
    }
}
