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
 * @param id Id of the room equipment.
 * @param name Name of the equipment.
 * @param infos Extra information about the device.
 */
data class Equipment(

    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:JsonProperty("infos", required = true) val infos: kotlin.String
) {

}
