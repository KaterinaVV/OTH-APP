package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.TimetableLectureUniqueOccurrences
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
 * @param id Id of the lecture
 * @param name Name of the lecture
 * @param shortName Short name of the lecture
 * @param uniqueOccurrences List of unique occurrences of the given lecture. Unique occurrences are defined by the same weekday and timeslot. In most cases, there will be one occurrence representing the lecture slot and one or more occurrences representing the slots for the exercises. 
 */
data class TimetableLecture(

    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:JsonProperty("shortName", required = true) val shortName: kotlin.String,

    @field:Valid
    @get:Size(min=0)
    @field:JsonProperty("uniqueOccurrences", required = true) val uniqueOccurrences: kotlin.collections.List<TimetableLectureUniqueOccurrences>
) {

}
