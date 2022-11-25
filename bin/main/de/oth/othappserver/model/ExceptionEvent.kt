package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.BaseEventData
import de.oth.othappserver.model.Event
import de.oth.othappserver.model.EventType
import de.oth.othappserver.model.ExceptionEventAllOf
import de.oth.othappserver.model.Organizer
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
 * @param name Name of the event
 * @param categories 
 * @param startTime Start time of the event/series in Europe/Berlin timezone.
 * @param endTime End time of the event/series in  Europe/Berlin timezone.
 * @param isAllDay True if the event takes the whole day
 * @param masterId ID of the associated series master event.
 * @param location String describing the location of the event (no actual coordinates)
 * @param organizer 
 * @param description (HTML) description of the event
 */
data class ExceptionEvent(

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:JsonProperty("categories", required = true) val categories: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("startTime", required = true) val startTime: kotlin.String,

    @field:JsonProperty("endTime", required = true) val endTime: kotlin.String,

    @field:JsonProperty("isAllDay", required = true) val isAllDay: kotlin.Boolean,

    @field:JsonProperty("masterId", required = true) val masterId: kotlin.String,

    @field:JsonProperty("eventId", required = true) override val eventId: kotlin.String,

    @field:Valid
    @field:JsonProperty("eventType", required = true) override val eventType: EventType,

    @field:JsonProperty("location") val location: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("organizer") val organizer: Organizer? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null
) : Event{

}
