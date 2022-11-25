package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Event
import de.oth.othappserver.model.EventType
import de.oth.othappserver.model.OccurrenceEventAllOf
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
 * @param masterId ID of the associated series master event.
 * @param startTime Start time of the event in Europe/Berlin timezone.
 * @param endTime End time of the event in  Europe/Berlin timezone.
 */
data class OccurrenceEvent(

    @field:JsonProperty("masterId", required = true) val masterId: kotlin.String,

    @field:JsonProperty("startTime", required = true) val startTime: kotlin.String,

    @field:JsonProperty("endTime", required = true) val endTime: kotlin.String,

    @field:JsonProperty("eventId", required = true) override val eventId: kotlin.String,

    @field:Valid
    @field:JsonProperty("eventType", required = true) override val eventType: EventType
) : Event{

}
