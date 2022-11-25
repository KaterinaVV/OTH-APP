package de.oth.othappserver.webuntis

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(WebUntisProperties::class)
open class WebUntisConfig
