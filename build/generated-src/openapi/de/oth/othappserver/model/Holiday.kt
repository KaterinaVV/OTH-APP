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
 * @param name Short name of the holiday
 * @param longName Long name of the holiday
 * @param startDate Start date of the holiday.
 * @param endDate End date of the holiday.
 */
data class Holiday(

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:JsonProperty("longName", required = true) val longName: kotlin.String,

    @field:Valid
    @field:JsonProperty("startDate", required = true) val startDate: java.time.LocalDate,

    @field:Valid
    @field:JsonProperty("endDate", required = true) val endDate: java.time.LocalDate
) {

}
