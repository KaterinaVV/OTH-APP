package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Equipment
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
 * Filters which can be used for the <a href=\"/#operation/freeRooms\">RoomFinder endpoint</a>
 * @param buildings Available buildings. Values can be used for the `building` parameter.
 * @param equipment Available room equipment. Values can be used for the `equipment` parameter.
 * @param roomTypes Available room tyes. Values can be used for the `roomType` parameter.
 */
data class UniversityInfoRoomFinderFilter(

    @field:JsonProperty("buildings", required = true) val buildings: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @field:JsonProperty("equipment", required = true) val equipment: kotlin.collections.List<Equipment>,

    @field:Valid
    @field:JsonProperty("roomTypes", required = true) val roomTypes: kotlin.collections.List<RoomType>
) {

}
