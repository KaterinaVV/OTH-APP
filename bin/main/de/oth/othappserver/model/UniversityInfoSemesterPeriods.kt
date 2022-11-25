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
 * Period of the current semester. Borders are inclusive.
 * @param name Arbitrary name of the semester period.
 * @param start Start date of the semester period.
 * @param end End date of the semester period.
 */
data class UniversityInfoSemesterPeriods(

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @field:JsonProperty("start", required = true) val start: java.time.LocalDate,

    @field:Valid
    @field:JsonProperty("end", required = true) val end: java.time.LocalDate
) {

}
