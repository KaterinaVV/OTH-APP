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
 * @param start Start time when the room is free. A string `start` is returned representing the start of the day.
 * @param end End time when the room is free. A string `end` is returned representing the end of the day.
 */
data class FreeTime(

    @field:JsonProperty("start", required = true) val start: kotlin.String,

    @field:JsonProperty("end", required = true) val end: kotlin.String
) {

}
