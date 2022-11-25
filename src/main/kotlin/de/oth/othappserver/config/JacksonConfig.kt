package de.oth.othappserver.config

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.afterburner.AfterburnerModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import de.oth.othappserver.exchange.data.ExchangeErrorCode
import de.oth.othappserver.model.EventType
import de.oth.othappserver.model.RoomType
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.zalando.problem.ProblemModule
import org.zalando.problem.violations.ConstraintViolationProblemModule

@Configuration
open class JacksonConfig {

    companion object {
        val mapper: ObjectMapper = jacksonObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .registerModule(JavaTimeModule())
            .registerModules(ProblemModule(), ConstraintViolationProblemModule())
            .registerModule(
                SimpleModule()
                    .addSerializer(
                        object : StdSerializer<EventType>(EventType::class.java) {
                            override fun serialize(eventType: EventType, gen: JsonGenerator, serializers: SerializerProvider) {
                                gen.writeString(eventType.value)
                            }
                        }
                    )
                    .addDeserializer(
                        EventType::class.java,
                        object : StdDeserializer<EventType>(EventType::class.java) {
                            private val regex = Regex("([A-Z])")

                            override fun deserialize(p: JsonParser, ctxt: DeserializationContext): EventType {
                                val value = p.valueAsString.replace(regex, "_$1").toUpperCase()

                                return EventType.valueOf(value)
                            }
                        }
                    )
                    .addSerializer(RoomTypeSerializer())
                    .addDeserializer(RoomType::class.java, RoomTypeDeserializer())
                    .addDeserializer(ExchangeErrorCode::class.java, ExchangeErrorCodeDeserializer())
            )
            .registerModule(AfterburnerModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
    }

    @Bean
    open fun objectMapper(): ObjectMapper = mapper
}

class RoomTypeSerializer : StdSerializer<RoomType>(RoomType::class.java) {
    override fun serialize(rommType: RoomType, gen: JsonGenerator, provider: SerializerProvider) {
        gen.writeString(rommType.value)
    }
}

class RoomTypeDeserializer : StdDeserializer<RoomType>(RoomType::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): RoomType {
        return RoomType.valueOf(p.valueAsString.toUpperCase().replace(" ", "_"))
    }
}

class ExchangeErrorCodeDeserializer : StdDeserializer<ExchangeErrorCode>(ExchangeErrorCode::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ExchangeErrorCode {
        return try {
            ExchangeErrorCode.valueOf(p.valueAsString)
        } catch (e: Exception) {
            ExchangeErrorCode.OTHER
        }
    }
}
