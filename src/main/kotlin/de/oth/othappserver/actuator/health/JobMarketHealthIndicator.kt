package de.oth.othappserver.actuator.health

import de.oth.othappserver.exceptions.ThirdPartyProblem
import de.oth.othappserver.jobmarket.JobMarketClient
import de.oth.othappserver.jobmarket.JobMarketRequests
import de.oth.othappserver.jobmarket.JobmarketProperties
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator
import org.springframework.boot.actuate.health.AbstractHealthIndicator
import org.springframework.boot.actuate.health.Health
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

/**
 * Simple implementation of a HealthIndicator returning status information for the JobMarket API.
 */
@Component
@ConditionalOnEnabledHealthIndicator("jobmarket")
@ConditionalOnProperty(JobmarketProperties.ENABLED)
class JobMarketHealthIndicator(private val jobMarketClient: JobMarketClient) : AbstractHealthIndicator() {
    override fun doHealthCheck(builder: Health.Builder) {
        try {
            jobMarketClient.execute(JobMarketRequests.types())
        } catch (e: ThirdPartyProblem) {
            builder
                .withDetail("title", e.title)
                .withDetail("detail", e.title)
                .down()
        }

        builder.up()
    }
}
