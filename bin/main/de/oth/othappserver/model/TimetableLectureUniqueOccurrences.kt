package de.oth.othappserver.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import de.oth.othappserver.model.Lecturer
import de.oth.othappserver.model.Room
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
 * A unique occurrence of the lecture
 * @param nextStartDateTime Start date time of the first upcomming lecture for this lecture occurrence
 * @param nextEndDateTime End date time of the first upcomming lecture for this lecture occurrence
 * @param semesters Semesters (Studiengang) offering the lecture
 * @param rooms Rooms where lecture is given
 * @param lecturers Lecturers giving the lecture
 */
data class TimetableLectureUniqueOccurrences(

    @field:JsonProperty("nextStartDateTime", required = true) val nextStartDateTime: java.time.OffsetDateTime,

    @field:JsonProperty("nextEndDateTime", required = true) val nextEndDateTime: java.time.OffsetDateTime,

    @field:Valid
    @field:JsonProperty("semesters", required = true) val semesters: kotlin.collections.List<Semester>,

    @field:Valid
    @field:JsonProperty("rooms", required = true) val rooms: kotlin.collections.List<Room>,

    @field:Valid
    @field:JsonProperty("lecturers", required = true) val lecturers: kotlin.collections.List<Lecturer>
) {

}
