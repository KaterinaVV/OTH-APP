package de.oth.othappserver.config

import com.github.benmanes.caffeine.cache.Caffeine
import de.oth.othappserver.service.IWebUntisService
import de.oth.othappserver.webuntis.WebUntisProperties
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.caffeine.CaffeineCache
import org.springframework.cache.interceptor.KeyGenerator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.util.StringUtils
import java.lang.reflect.Method
import java.util.concurrent.TimeUnit

class CustomKeyGenerator : KeyGenerator {
    override fun generate(target: Any, method: Method, vararg params: Any?): Any {
        return "${target.javaClass.simpleName}_${method.name}_${StringUtils.arrayToDelimitedString(params, "_")}"
    }
}

@EnableCaching
@Configuration
open class CacheConfig {
    companion object {
        const val SHORT_CACHE = "shortCache"
        const val DAY_CACHE = "dayCache"
        const val LIFETIME_CACHE = "lifetimeCache"
        const val ROOM_TIMETABLE_CACHE = "roomsTimetableCache"
    }

    @Bean
    open fun shortCache(): CaffeineCache = CaffeineCache(
        SHORT_CACHE,
        Caffeine.newBuilder()
            .expireAfterWrite(15, TimeUnit.MINUTES)
            .maximumSize(100)
            .recordStats()
            .build()
    )

    @Bean
    open fun dayCache(): CaffeineCache = CaffeineCache(
        DAY_CACHE,
        Caffeine.newBuilder()
            .expireAfterWrite(1, TimeUnit.DAYS)
            .maximumSize(1000)
            .recordStats()
            .build()
    )

    @Bean
    open fun lifetimeCache(): CaffeineCache = CaffeineCache(LIFETIME_CACHE, Caffeine.newBuilder().build())

    @Bean
    @ConditionalOnProperty(WebUntisProperties.ENABLED)
    open fun roomCache(webUntisService: IWebUntisService): CaffeineCache {
        return CaffeineCache(ROOM_TIMETABLE_CACHE, webUntisService.getRoomCache())
    }

    @Bean
    open fun customKeyGenerator() = CustomKeyGenerator()
}
