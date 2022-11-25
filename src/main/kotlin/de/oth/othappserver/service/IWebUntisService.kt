package de.oth.othappserver.service

import com.github.benmanes.caffeine.cache.Cache
import de.oth.othappserver.model.Lecture
import de.oth.othappserver.model.Semester
import de.oth.othappserver.model.TimetableLecture
import de.oth.othappserver.webuntis.*
import java.time.LocalDate

/**
 * Service API declaration for accessing WebUntis resources.
 */
interface IWebUntisService {
    /**
     * Retrieves a list of semesters from webuntis.
     */
    fun getSemesters(): List<WebUntisSemester>

    /**
     * Retrieves a list of lectures from webuntis.
     */
    fun getLectures(): List<WebUntisLecture>

    /**
     * Retrieves a list of rooms from webuntis.
     */
    fun getRooms(): List<WebUntisRoom>

    /**
     * Retrieves a list of faculties from webuntis.
     */
    fun getFaculties(): List<WebUntisFaculty>

    /**
     * Retrieves a list of holidays from webuntis.
     */
    fun getHolidays(): List<WebUntisHoliday>

    /**
     * Retrieves the current schoolyear from WebUntis.
     */
    fun getCurrentSchoolyear(): WebUntisSchoolyear

    /**
     * Retrieves a list of schoolyears from WebUntis.
     */
    fun getSchoolyears(): List<WebUntisSchoolyear>

    /**
     * Retrieves a list of teachers from WebUntis.
     */
    fun getTeachers(): List<WebUntisTeacher>

    /**
     * Retrieves a semesters lectures in a given time window.
     *
     * @param id Id of the semester
     * @param startDate Start of the time period
     * @param endDate End of the time period
     */
    fun getSemesterLectures(id: Int, startDate: LocalDate, endDate: LocalDate): List<Lecture>

    /**
     * Retrieves a list of semesters that offer a given lecture in a given time window.
     *
     * @param id The id of the lecture
     * @param startDate Start of the time period
     * @param endDate End of the time period
     */
    fun getLectureSemesters(id: Int, startDate: LocalDate?, endDate: LocalDate?): List<Semester>

    fun getTimetable(id: Int, type: WebUnitsResourceType, startDate: LocalDate?, endDate: LocalDate?): List<WebUntisTimetable>

    /**
     * Retrieves a lecture with timetable information by id.
     *
     * @param id The id of the lecture
     * @param startDate Start of the time period
     * @param endDate End of the time period
     */
    fun getTimetableLecture(id: Int, semesterId: Int?, startDate: LocalDate?, endDate: LocalDate?): TimetableLecture

    fun getRoomTimetable(id: Int, date: LocalDate): List<WebUntisTimetable>

    /**
     * Retrieves Lectures for a Faculty in a given time window.
     *
     * @param facultyId The WebUntis faculty Id
     * @param startDate Start date of the time window
     * @param endDate End date of the time window
     */
    fun getFacultyLectures(facultyId: Int, startDate: LocalDate, endDate: LocalDate): List<Lecture>

    fun getRoomCache(): Cache<Any, Any>
}
