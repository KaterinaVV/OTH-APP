package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.FreeRoom
import de.oth.othappserver.model.FreeRoomBuildingPlans
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
 * @param letter Letter of the building.
 * @param faculties Name of the building.
 * @param rooms A list of available and free rooms.
 * @param plans 
 */
data class FreeRoomBuilding(

    @get:Size(min=1,max=1)
    @field:JsonProperty("letter", required = true) val letter: kotlin.String,

    @get:Size(min=1)
    @field:JsonProperty("faculties", required = true) val faculties: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @get:Size(min=0)
    @field:JsonProperty("rooms", required = true) val rooms: kotlin.collections.List<FreeRoom>,

    @field:Valid
    @field:JsonProperty("plans") val plans: kotlin.collections.List<FreeRoomBuildingPlans>? = null
) {

}
