package de.oth.othappserver.jobmarket

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnProperty("${JobmarketProperties.prefix}.enabled")
@EnableConfigurationProperties(JobmarketProperties::class)
open class JobmarketConfig
