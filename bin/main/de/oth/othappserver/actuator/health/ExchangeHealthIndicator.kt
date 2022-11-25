package de.oth.othappserver.actuator.health

import de.oth.othappserver.exchange.ExchangeClient
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator
import org.springframework.boot.actuate.health.AbstractHealthIndicator
import org.springframework.boot.actuate.health.Health
import org.springframework.stereotype.Component
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime

/**
 * Simple implementation of a {@link HealthIndicator} returning status information for
 * an exchange REST API.
 */
@Component
@ConditionalOnEnabledHealthIndicator("exchange")
class ExchangeHealthIndicator(private val exchangeClient: ExchangeClient) : AbstractHealthIndicator() {
    private val from: ZonedDateTime = ZonedDateTime.from(Instant.EPOCH.atZone(ZoneId.systemDefault()))
    private val to: ZonedDateTime = ZonedDateTime.from(Instant.EPOCH.plusMillis(1).atZone(ZoneId.systemDefault()))

    override fun doHealthCheck(builder: Health.Builder) {
        exchangeClient.queryEvents(from, to, null, false)

        builder.up()
    }
}
