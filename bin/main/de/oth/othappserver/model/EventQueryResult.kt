package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Event
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
 * @param events The events that have changed and match the filters since the deltaToken transmitted in the requests. If no token was transmitted, it simply contains all filtered events.
 * @param deltaToken Token that specifies the current state of the calendar. When passed to /v1/eventcalendar/event, only new, updated or deleted events added after this request will be returned.
 * @param skipToken Token that provides access to the next page of a paginated event query.
 */
data class EventQueryResult(

    @field:Valid
    @field:JsonProperty("events", required = true) val events: kotlin.collections.List<Event>,

    @field:JsonProperty("deltaToken") val deltaToken: kotlin.String? = null,

    @field:JsonProperty("skipToken") val skipToken: kotlin.String? = null
) {

}
