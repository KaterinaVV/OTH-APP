package de.oth.othappserver.actuator.health

import de.oth.othappserver.exceptions.ThirdPartyProblem
import de.oth.othappserver.webuntis.WebUntisClient
import de.oth.othappserver.webuntis.WebUntisProperties
import de.oth.othappserver.webuntis.WebUntisRequests
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator
import org.springframework.boot.actuate.health.AbstractHealthIndicator
import org.springframework.boot.actuate.health.Health
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

/**
 * Simple implementation of a {@link HealthIndicator} returning status information for
 * an WebUntis API.
 */
@Component
@ConditionalOnEnabledHealthIndicator("webuntis")
@ConditionalOnProperty(WebUntisProperties.ENABLED)
class WebUntisHealthIndicator(private val webUntisClient: WebUntisClient) : AbstractHealthIndicator() {
    override fun doHealthCheck(builder: Health.Builder) {
        try {
            webUntisClient.getAll(WebUntisRequests.getFaculties())
        } catch (e: ThirdPartyProblem) {
            builder
                .withDetail("title", e.title)
                .withDetail("detail", e.title)
                .down()
        }

        builder.up()
    }
}
