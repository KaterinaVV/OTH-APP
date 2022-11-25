package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Event
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
 */
class DeleteEvent(

    @field:JsonProperty("eventId", required = true) override val eventId: kotlin.String,

    @field:Valid
    @field:JsonProperty("eventType", required = true) override val eventType: EventType
) : Event{

}
