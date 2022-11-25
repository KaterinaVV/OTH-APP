package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Industry
import de.oth.othappserver.model.JobType
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
 * @param industries A list of available Industries in the Job Market.
 * @param jobtypes A list of available Job Types.
 * @param countries A list of available countries to filter for.
 * @param companies A list of available companies to filter for.
 */
data class JobMarket(

    @field:Valid
    @field:JsonProperty("industries", required = true) val industries: kotlin.collections.List<Industry>,

    @field:Valid
    @field:JsonProperty("jobtypes", required = true) val jobtypes: kotlin.collections.List<JobType>,

    @field:JsonProperty("countries", required = true) val countries: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("companies", required = true) val companies: kotlin.collections.List<kotlin.String>
) {

}
