package de.oth.othappserver.webuntis

import com.fasterxml.jackson.annotation.JsonAutoDetect
import de.oth.othappserver.model.Holiday
import de.oth.othappserver.model.Lecture
import de.oth.othappserver.model.Lecturer
import de.oth.othappserver.model.Semester
import java.time.LocalDate
import java.time.OffsetDateTime

data class WebUntisResponse<T>(val id: String, val error: Error?, val result: T?) {
    override fun toString(): String {
        return "WebUntisResponse(id='$id', error=$error, result=$result)"
    }
}

data class Error(val message: String, val code: Int) {
    fun isNotAuthenticated(): Boolean {
        return code == -8520
    }

    fun isNotFound(): Boolean {
        return code == -7002
    }
}

enum class WebUnitsResourceType(val value: Int) {
    SEMESTER(1), TEACHER(2), LECTURE(3), ROOM(4), STUDENT(5)
}

/**
 * A resource from WebUntis.
 *
 * Every WebUntis resource should implement this type.
 */
sealed class WebUntisResource

/**
 * A resource from WebUntis.
 *
 * @param id Id of the resource.
 */
open class BaseWebUntisResource(open val id: Int) : WebUntisResource() {
    override fun toString(): String {
        return "id=$id"
    }
}

/**
 * A WebUntisResource with name and longName attributes.
 *
 * @param name Name of the resource in a short representation.
 * @param longName Name of the resource in a long representation.
 */
open class NamedWebUntisResource(id: Int, open val name: String, open val longName: String) : BaseWebUntisResource(id) {
    override fun toString(): String {
        return "name='$name', longName='$longName'"
    }
}

/**
 * A WebUntisResource with optional name and longName attributes.
 *
 * @param name Name of the resource in a short representation. Null if no name is given.
 * @param longName Name of the resource in a long representation. Null if no long name is given.
 */
data class NamedWebUntisResourceOptional(override val id: Int, val name: String? = null, val longName: String? = null) : BaseWebUntisResource(id)

data class WebUntisUser(val sessionId: String, val personType: Int, val personId: Int, val klasseId: Int) : WebUntisResource() {
    override fun toString(): String {
        return "WebUntisUser(sessionId='$sessionId', personType=$personType, personId=$personId, klasseId=$klasseId)"
    }
}

/**
 * @param did Id of the Department to which the semester belongs
 */
data class WebUntisSemester(override val id: Int, override val name: String, override val longName: String, val did: Int) : NamedWebUntisResource(id, name, longName) {
    fun toModel(): Semester = Semester(id, name, longName)
}

/** A WebUntis resource representing a lecture. */
data class WebUntisLecture(override val id: Int, override val name: String, override val longName: String) : NamedWebUntisResource(id, name, longName) {
    override fun toString(): String {
        return "WebUntisLecture(${super.toString()})"
    }

    fun toModel(): Lecture = Lecture(id, longName, getLectureName(name))

    /**
     * Returns the string after the first '_'.
     * Most lecture names are of the pattern 'XYZ_NAME' where XYZ is the faculties shortname e.g. IM.
     */
    private fun getLectureName(name: String): String =
        if (name.indexOf('_') != -1) {
            name.substring(name.indexOf('_') + 1)
        } else {
            name
        }
}

/** A WebUntis resource representing a room. */
data class WebUntisRoom(override val id: Int, override val name: String, override val longName: String, val building: String) : NamedWebUntisResource(id, name, longName) {
    override fun toString(): String {
        return "WebUntisRoom(${super.toString()}, building='$building'})"
    }
}

/** A WebUntis resource representing a faculty. */
data class WebUntisFaculty(override val id: Int, override val name: String, override val longName: String) : NamedWebUntisResource(id, name, longName) {
    override fun toString(): String {
        return "WebUntisFaculty(${super.toString()})"
    }
}

/**
 * WebUntis Timetable info.
 *
 * @param startTime Start time of the timetable period
 * @param endTime End time of the timetable period
 * @param su List of subjects/lectures
 * @param ro List of rooms
 * @param kl List of klassen/semesters
 * @param te List of teachers/lecturers
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class WebUntisTimetable(
    override val id: Int,
    private val date: String,
    val startTime: String,
    val endTime: String,
    val su: List<NamedWebUntisResourceOptional>,
    var ro: List<NamedWebUntisResourceOptional>,
    var kl: List<NamedWebUntisResourceOptional>,
    var te: List<NamedWebUntisResourceOptional>
) : BaseWebUntisResource(id) {
    val startDateTime: OffsetDateTime = WebUntisUtils.toBerlinOffset(date, startTime)
    val endDateTime: OffsetDateTime = WebUntisUtils.toBerlinOffset(date, endTime)

    /**
     * Check whether the two WebUntis timetable items are two recurring occurrences of the same unique lecture occurrence.
     * This is the case when they share the same subject, day of week and timeslot.
     *
     * @param other The other WebUntis timetable item
     * @param lectureId The id of the lecture/subject to compare
     */
    fun equalsUniqueOccurrence(other: Any?, lectureId: Int): Boolean {
        // The subject id is needed, just in case two timetable share the same subject id but also have other (and different)
        // ids in the su array. In that case, a simple "equals" would return false, although they both have the same required
        // subject id.
        if (other === this) return true
        if (other == null) return false
        if (other !is WebUntisTimetable) return false

        // Check the lecture/subject for equality
        if (!su.any { it.id == lectureId } || !other.su.any { it.id == lectureId }) return false

        // Check the weekday and timeslot for equality
        return (other.startDateTime.dayOfWeek == startDateTime.dayOfWeek && other.startTime == startTime && other.endTime == endTime)
    }
}

data class WebUntisSchoolyear(override val id: Int, val name: String, val startDate: String, val endDate: String) : BaseWebUntisResource(id) {
    val parsedStartDate: LocalDate = LocalDate.parse(startDate, WebUntisUtils.WebUntisDateFormatter)
    val parsedEndDate: LocalDate = LocalDate.parse(endDate, WebUntisUtils.WebUntisDateFormatter)
}

/** A WebUntis resource representing a holiday. */
data class WebUntisHoliday(override val id: Int, override val name: String, override val longName: String, val startDate: String, val endDate: String) : NamedWebUntisResource(id, name, longName) {
    fun toModel(): Holiday = Holiday(name, longName, LocalDate.parse(startDate, WebUntisUtils.WebUntisDateFormatter), LocalDate.parse(endDate, WebUntisUtils.WebUntisDateFormatter))
}

data class WebUntisTeacher(
    override val id: Int,
    override val name: String,
    override val longName: String,
    val foreName: String,
    val title: String,
    val active: Boolean,
    val dids: List<BaseWebUntisResource>
) : NamedWebUntisResource(id, name, longName) {
    fun toModel(): Lecturer = Lecturer(id, name, foreName, longName, title)
}
