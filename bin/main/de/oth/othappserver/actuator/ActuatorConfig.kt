package de.oth.othappserver.actuator

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Contains additional configuration for actuator endpoints.
 */
@Configuration
open class ActuatorConfig {

    /**
     * Adds common tags for metrics like the applications name.
     */
    @Bean
    open fun metricsCommonTags(@Value("\${spring.application.name}") applicationName: String): MeterRegistryCustomizer<MeterRegistry>? {
        return MeterRegistryCustomizer { registry: MeterRegistry ->
            registry.config()
                .commonTags("application", applicationName)
        }
    }
}
