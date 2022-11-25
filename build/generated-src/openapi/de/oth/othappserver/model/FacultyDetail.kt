package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Feed
import de.oth.othappserver.model.Lecturer
import de.oth.othappserver.model.Semester
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
 * @param feeds The Faculty's RSS feeds.
 * @param semesters The Faculty's Semesters.
 * @param lecturer The Faculty's Lecturers.
 * @param color A faculty's color in hex.
 */
data class FacultyDetail(

    @get:Size(min=1,max=3)
    @field:JsonProperty("identifier", required = true) val identifier: kotlin.String,

    @get:Size(min=1)
    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @field:JsonProperty("feeds", required = true) val feeds: kotlin.collections.List<Feed>,

    @field:Valid
    @field:JsonProperty("semesters", required = true) val semesters: kotlin.collections.List<Semester>,

    @field:Valid
    @field:JsonProperty("lecturer", required = true) val lecturer: kotlin.collections.List<Lecturer>,
    @get:Pattern(regexp="[\\dA-F]{6}")
    @get:Size(max=6)
    @field:JsonProperty("color") val color: kotlin.String? = null
) {

}
