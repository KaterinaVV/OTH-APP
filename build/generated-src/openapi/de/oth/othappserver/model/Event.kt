package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import de.oth.othappserver.model.EventType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param eventId Unique event ID.
 * @param eventType 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "eventType", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = DeleteEvent::class, name = "delete"),
      JsonSubTypes.Type(value = ExceptionEvent::class, name = "exception"),
      JsonSubTypes.Type(value = OccurrenceEvent::class, name = "occurrence"),
      JsonSubTypes.Type(value = SeriesMaster::class, name = "seriesMaster"),
      JsonSubTypes.Type(value = UpdateEvent::class, name = "update")
)

interface Event{
        
        val eventId: kotlin.String
        
        val eventType: EventType

}
