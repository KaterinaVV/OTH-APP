package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Feed
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
 * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
 * @param name The complete faculty's name.
 * @param color A faculty's color in hex.
 * @param feeds The Faculty's RSS feeds.
 */
data class Faculty(

    @get:Size(min=1,max=3)
    @field:JsonProperty("identifier", required = true) val identifier: kotlin.String,

    @get:Size(min=1)
    @field:JsonProperty("name", required = true) val name: kotlin.String,
    @get:Pattern(regexp="[\\dA-F]{6}")
    @get:Size(max=6)
    @field:JsonProperty("color") val color: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("feeds") val feeds: kotlin.collections.List<Feed>? = null
) {

}
