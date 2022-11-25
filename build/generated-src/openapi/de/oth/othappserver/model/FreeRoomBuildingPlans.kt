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
 * @param floor The buildings floor
 * @param plan URL pointing to a plan for the corresponding floor of the building.
 */
data class FreeRoomBuildingPlans(

    @field:JsonProperty("floor") val floor: kotlin.Int? = null,

    @field:JsonProperty("plan") val plan: kotlin.String? = null
) {

}
