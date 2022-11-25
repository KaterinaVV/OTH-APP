package de.oth.othappserver.webuntis

import java.time.LocalDate
import java.util.*

class WebUntisRequests {
    companion object {

        fun authenticate(user: String, password: String, client: String): WebUntisRequest<WebUntisUser> {
            val params = mapOf(
                Pair("user", user),
                Pair("password", password),
                Pair("client", client)
            )

            return WebUntisRequest(WebUntisUser::class.java, UUID.randomUUID().toString(), "authenticate", params)
        }

        fun getSemesters(): WebUntisRequest<WebUntisSemester> {
            return WebUntisRequest(WebUntisSemester::class.java, UUID.randomUUID().toString(), "getKlassen", null)
        }

        fun getLectures(): WebUntisRequest<WebUntisLecture> {
            return WebUntisRequest(WebUntisLecture::class.java, UUID.randomUUID().toString(), "getSubjects", null)
        }

        fun getRooms(): WebUntisRequest<WebUntisRoom> {
            return WebUntisRequest(WebUntisRoom::class.java, UUID.randomUUID().toString(), "getRooms", null)
        }

        fun getFaculties(): WebUntisRequest<WebUntisFaculty> {
            return WebUntisRequest(WebUntisFaculty::class.java, UUID.randomUUID().toString(), "getDepartments", null)
        }

        fun getCurrentSchoolyear(): WebUntisRequest<WebUntisSchoolyear> {
            return WebUntisRequest(WebUntisSchoolyear::class.java, UUID.randomUUID().toString(), "getCurrentSchoolyear", null)
        }

        fun getSchoolyears(): WebUntisRequest<WebUntisSchoolyear> {
            return WebUntisRequest(WebUntisSchoolyear::class.java, UUID.randomUUID().toString(), "getSchoolyears", null)
        }

        fun getHolidays(): WebUntisRequest<WebUntisHoliday> {
            return WebUntisRequest(WebUntisHoliday::class.java, UUID.randomUUID().toString(), "getHolidays", null)
        }

        fun getTeachers(): WebUntisRequest<WebUntisTeacher> {
            return WebUntisRequest(WebUntisTeacher::class.java, UUID.randomUUID().toString(), "getTeachers", null)
        }

        fun getTimetable(elementId: Int, type: WebUnitsResourceType, startDate: LocalDate? = null, endDate: LocalDate? = null): WebUntisRequest<WebUntisTimetable> {
            val params = mutableMapOf<String, Any>(
                Pair("id", elementId),
                Pair("type", type.value)
            )
            if (startDate != null) params.put("startDate", WebUntisUtils.WebUntisDateFormatter.format(startDate))
            if (endDate != null) params.put("endDate", WebUntisUtils.WebUntisDateFormatter.format(endDate))

            return WebUntisRequest(WebUntisTimetable::class.java, UUID.randomUUID().toString(), "getTimetable", params)
        }

        /**
         * Get all timetable items for a specific WebUntis resource in a given time period, specified with two dates.
         *
         * @param elementId Id of the WebUntis resource
         * @param type Type of the WebUntis resource
         * @param startDate Start date of the time period
         * @param endDate End date of the time period
         * @param embedSubjectNames If true, the returned array of subjects of the respective timetable element will include a name and long name
         * @param embedRoomNames If true, the returned array of rooms of the respective timetable element will include a name and long name
         * @param embedSemesterNames If true, the returned array of semesters of the respective timetable element will include a name and long name
         * @param embedTeacherNames If true, the returned array of teachers of the respective timetable element will include a name and long name
         */
        fun getTimetableCustomizable(
            elementId: Int,
            type: WebUnitsResourceType,
            startDate: LocalDate? = null,
            endDate: LocalDate? = null,
            embedSubjectNames: Boolean = false,
            embedRoomNames: Boolean = false,
            embedSemesterNames: Boolean = false,
            embedTeacherNames: Boolean = false
        ): WebUntisRequest<WebUntisTimetable> {
            val elementSelector = mutableMapOf<String, Any>(
                Pair("id", elementId),
                Pair("type", type.value)
            )
            val options = mutableMapOf<String, Any>(
                Pair("element", elementSelector),
            )

            if (startDate != null) options["startDate"] = WebUntisUtils.WebUntisDateFormatter.format(startDate)
            if (endDate != null) options["endDate"] = WebUntisUtils.WebUntisDateFormatter.format(endDate)

            val embeddedFields = listOf("id", "name", "longname")
            if (embedSubjectNames) options["subjectFields"] = embeddedFields
            if (embedRoomNames) options["roomFields"] = embeddedFields
            if (embedSemesterNames) options["klasseFields"] = embeddedFields
            if (embedTeacherNames) options["teacherFields"] = embeddedFields

            // Add "options" field to "params" field, as required by the customizable timetable WebUntis endpoint
            val params = mapOf<String, Any>(
                Pair("options", options)
            )

            return WebUntisRequest(WebUntisTimetable::class.java, UUID.randomUUID().toString(), "getTimetable", params)
        }
    }
}
