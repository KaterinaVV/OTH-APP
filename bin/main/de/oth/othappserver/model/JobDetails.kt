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
 * @param url Job market URL
 * @param creationDate Date time when this Job Offer has been created.
 * @param text Additional text describing the Job Offer.
 * @param websiteUrl Job market URL
 * @param expiryDate Date time when this Job Offer expires.
 * @param faculties List of faculties this Job applies to.
 * @param industries List of industries this Job applies to.
 * @param company Company behind this Job Offer
 * @param lat Geographical latitute
 * @param lng Geographical longitude
 * @param contactTitle Title of the person to contact.
 * @param contactForname Forname of the person to contact.
 * @param contactSurname Surname of the person to contact.
 * @param contactEmail Email of the person to contact.
 * @param country Country where the Job is located at.
 */
data class JobDetails(

    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:JsonProperty("title", required = true) val title: kotlin.String,

    @field:JsonProperty("logo", required = true) val logo: kotlin.String,

    @field:JsonProperty("url", required = true) val url: kotlin.String,

    @field:JsonProperty("creationDate", required = true) val creationDate: java.time.OffsetDateTime,

    @field:JsonProperty("text", required = true) val text: kotlin.String,

    @field:JsonProperty("websiteUrl") val websiteUrl: kotlin.String? = null,

    @field:JsonProperty("expiryDate") val expiryDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("faculties") val faculties: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("industries") val industries: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("company") val company: kotlin.String? = null,

    @field:JsonProperty("lat") val lat: java.math.BigDecimal? = null,

    @field:JsonProperty("lng") val lng: java.math.BigDecimal? = null,

    @field:JsonProperty("contactTitle") val contactTitle: kotlin.String? = null,

    @field:JsonProperty("contactForname") val contactForname: kotlin.String? = null,

    @field:JsonProperty("contactSurname") val contactSurname: kotlin.String? = null,

    @field:JsonProperty("contactEmail") val contactEmail: kotlin.String? = null,

    @field:JsonProperty("country") val country: kotlin.String? = null
) {

}
