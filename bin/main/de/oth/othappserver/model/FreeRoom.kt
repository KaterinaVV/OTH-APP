package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.FreeTime
import de.oth.othappserver.model.RoomType
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
 * @param name Short name of Room.
 * @param longName Name of Room with description.
 * @param type 
 * @param equipment List of room equipment.
 * @param times List of objects with start and end times representing the times intervals at which a room is not occupied.
 * @param floor Floor of the building the room is contained in. `null` if the floor could not be determined.
 */
data class FreeRoom(

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:JsonProperty("longName", required = true) val longName: kotlin.String,

    @field:Valid
    @field:JsonProperty("type", required = true) val type: RoomType,

    @get:Size(min=0)
    @field:JsonProperty("equipment", required = true) val equipment: kotlin.collections.List<kotlin.Int>,

    @field:Valid
    @get:Size(min=1)
    @field:JsonProperty("times", required = true) val times: kotlin.collections.List<FreeTime>,

    @field:JsonProperty("floor") val floor: kotlin.Int? = null
) {

}
