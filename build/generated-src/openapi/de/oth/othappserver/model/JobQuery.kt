package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.JobQueryLocation
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
 * @param faculty Identifier of a Faculty. Filters for Jobs of that faculty.
 * @param type Type of a Job. Filters for Jobs of that type. Multiple types are allowed.
 * @param industry Industry of a Job. Filters for Jobs of that industry. Multiple industries are allowed.
 * @param text Additional text to search in Job Offers.
 * @param country Country where the Job is located at.
 * @param company Company providing a Job Offer.
 * @param location 
 * @param since Filter for Jobs after this date (inclusive).
 * @param max Maximum number of Job results.
 */
data class JobQuery(

    @field:JsonProperty("faculty") val faculty: kotlin.String? = null,

    @field:JsonProperty("type") val type: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("industry") val industry: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("text") val text: kotlin.String? = null,

    @field:JsonProperty("country") val country: kotlin.String? = null,

    @field:JsonProperty("company") val company: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("location") val location: JobQueryLocation? = null,

    @field:Valid
    @field:JsonProperty("since") val since: java.time.LocalDate? = null,

    @get:Min(1)
    @field:JsonProperty("max") val max: kotlin.Int? = 100
) {

}
