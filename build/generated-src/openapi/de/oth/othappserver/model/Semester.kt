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
 * @param id Id of the resource
 * @param name Short name of the Semester
 * @param longName Long name of the Semester
 */
data class Semester(

    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:JsonProperty("longName", required = true) val longName: kotlin.String
) {

}
