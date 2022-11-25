package de.oth.othappserver.jobmarket

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.bind.DefaultValue

@ConstructorBinding
@ConfigurationProperties(prefix = JobmarketProperties.prefix)
data class JobmarketProperties(
    /** Username used for JobMarket authentication. */
    val clientId: String,
    /** Password key used for JobMarket authentication. */
    val clientKey: String,
    /** URI pointing to JobMarket API. */
    @DefaultValue("https://jobboerse.oth-regensburg.de/srv.php/API2")
    val uri: String,
    /** Flag enabling JobMarket feature. */
    val enabled: Boolean = false
) {
    companion object {
        const val prefix = "app.jobmarket"
        const val ENABLED = "$prefix.enabled"
    }
}
