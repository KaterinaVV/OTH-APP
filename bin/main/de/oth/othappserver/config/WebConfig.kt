package de.oth.othappserver.config

import de.oth.othappserver.model.RoomType
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.zalando.problem.Problem
import org.zalando.problem.Status.BAD_REQUEST

@Configuration
open class WebConfig(@Value("\${springfox.documentation.swagger-ui.base-url:}") val baseUrl: String) : WebMvcConfigurer {

    override fun addFormatters(registry: FormatterRegistry) {
        registry.addConverter(StringToRoomTypeConverter())
        registry.addConverter(RoomTypeToStringConverter())
    }

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("$baseUrl/swagger-ui/")
            .setViewName("forward:$baseUrl/swagger-ui.html")
        registry.addViewController("$baseUrl/swagger-ui")
            .setViewName("forward:$baseUrl/swagger-ui.html")
        registry.addViewController("$baseUrl/redoc.html")
            .setViewName("$baseUrl/redoc.html")
        registry.addViewController("$baseUrl/redoc/")
            .setViewName("forward:$baseUrl/redoc.html")
        registry.addViewController("$baseUrl/redoc")
            .setViewName("forward:$baseUrl/redoc.html")
    }
}

class StringToRoomTypeConverter : Converter<String, RoomType> {
    override fun convert(source: String): RoomType {
        for (roomType in RoomType.values()) {
            if (roomType.value == source) {
                return roomType
            }
        }

        throw Problem.valueOf(BAD_REQUEST, "RoomType '$source' is not a valid value. Valid values are: ${RoomType.values().joinToString { it.value }}")
    }
}

class RoomTypeToStringConverter : Converter<RoomType, String> {
    override fun convert(source: RoomType): String {
        return source.value
    }
}
