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
 * @param id Id of the Job
 * @param title Title of the Job Offer
 * @param logo URL pointing at a logo
 * @param url URL pointing to the jobs PDF.
 * @param websiteUrl Job market URL
 * @param company Company behind this Job Offer
 * @param lat Geographical latitute
 * @param lng Geographical longitude
 * @param country Country where the Job is located at.
 * @param refreshDate Date of last refresh. A refresh indicates that a job is still up-to-date but does not imply a change of its content.
 */
data class Job(

    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:JsonProperty("title", required = true) val title: kotlin.String,

    @field:JsonProperty("logo", required = true) val logo: kotlin.String,

    @field:JsonProperty("url", required = true) val url: kotlin.String,

    @field:JsonProperty("websiteUrl", required = true) val websiteUrl: kotlin.String,

    @field:JsonProperty("company") val company: kotlin.String? = null,

    @field:JsonProperty("lat") val lat: kotlin.String? = null,

    @field:JsonProperty("lng") val lng: kotlin.String? = null,

    @field:JsonProperty("country") val country: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("refreshDate") val refreshDate: java.time.LocalDate? = null
) {

}
