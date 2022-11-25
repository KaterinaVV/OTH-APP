package de.oth.othappserver.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.net.URI
import java.net.URISyntaxException
import javax.sql.DataSource

@Configuration
@ConditionalOnEnvironment("DATABASE_URL")
open class DatabaseConfig {

    private val logger: Logger = LoggerFactory.getLogger(DatabaseConfig::class.java)

    @Bean
    @Throws(URISyntaxException::class)
    open fun dataSource(): DataSource {
        val envVar = System.getenv("DATABASE_URL")
        logger.info("DATABASE_URL environment variable detected! Connecting to " + envVar.substringAfter('@'))
        val dbUri = URI(envVar)
        val userInfoSplit = dbUri.userInfo.split(":")
        val username = userInfoSplit[0]
        val password = userInfoSplit[1]
        val dbUrl = "jdbc:postgresql://" + dbUri.host + ':' + dbUri.port + dbUri.path
        val dataSourceBuilder = DataSourceBuilder.create()
        dataSourceBuilder.url(dbUrl)
        dataSourceBuilder.username(username)
        dataSourceBuilder.password(password)
        return dataSourceBuilder.build()
    }
}
