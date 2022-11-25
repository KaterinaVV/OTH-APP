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
 * @param name Name of the category. Uniquely identifies a category.
 * @param color A Category's color in hex.
 */
data class Category(

    @field:JsonProperty("name", required = true) val name: kotlin.String,
    @get:Pattern(regexp="[\\dA-F]{6}")
    @get:Size(max=6)
    @field:JsonProperty("color") val color: kotlin.String? = null
) {

}
