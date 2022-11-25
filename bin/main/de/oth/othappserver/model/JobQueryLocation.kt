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
 * Filters for jobs in a specific area.
 * @param lat Latitude
 * @param lng Longitude
 * @param radius Radius in km.
 */
data class JobQueryLocation(

    @get:DecimalMin("1")
    @field:JsonProperty("lat", required = true) val lat: java.math.BigDecimal,

    @get:DecimalMin("1")
    @field:JsonProperty("lng", required = true) val lng: java.math.BigDecimal,

    @get:Min(1)
    @field:JsonProperty("radius", required = true) val radius: kotlin.Int
) {

}
