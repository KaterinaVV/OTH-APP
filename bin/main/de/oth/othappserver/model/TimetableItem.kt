package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param id Id of the timetable item.
 * @param startDateTime Start date time of the timetable occurrence.
 * @param endDateTime Start date time of the timetable occurrence.
 * @param rooms 
 * @param lecture Id of the lecture.
 */
data class TimetableItem(

    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:JsonProperty("startDateTime", required = true) val startDateTime: java.time.OffsetDateTime,

    @field:JsonProperty("endDateTime", required = true) val endDateTime: java.time.OffsetDateTime,

    @field:JsonProperty("rooms", required = true) val rooms: kotlin.collections.List<kotlin.Int>,

    @field:JsonProperty("lecture") val lecture: kotlin.Int? = null
) {

}
