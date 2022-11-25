package de.oth.othappserver.exchange

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.bind.DefaultValue

/**
 * Properties to configure an exchange HTTP client.
 */
@ConstructorBinding
@ConfigurationProperties(prefix = "app.exchange")
data class ExchangeProperties(
    /** Username for the exchange server connection. */
    var username: String,
    /** Password for the exchange server connection. */
    @DefaultValue(NO_PASS)
    var password: String,
    /** URI for the events API exchange calendar. */
    var uri: String,
    /** Address to send feedback emails to */
    var feedbackMailAddress: String = "oth-app@oth-regensburg.de",
    /** URI for the mail API. Has a default */
    val mailUri: String = "https://exchange.hs-regensburg.de/api/v2.0/me/sendmail",
    /** Size of a page for paginated requests to exchange. */
    val pageSize: Int = 200
) {
    companion object {
        const val NO_PASS = "nopasswordprovided"
    }
}
