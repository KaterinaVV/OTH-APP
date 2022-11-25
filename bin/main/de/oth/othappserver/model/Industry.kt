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
 * Industry for a Job Offer
 * @param id Id of the Industry
 * @param identifier Identifer of the Industry
 */
data class Industry(

    @field:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:JsonProperty("identifier", required = true) val identifier: kotlin.String
) {

}
