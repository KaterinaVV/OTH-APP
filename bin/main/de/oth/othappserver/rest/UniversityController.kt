package de.oth.othappserver.rest

import de.oth.othappserver.api.SemesterApi
import de.oth.othappserver.api.UniversityApi
import de.oth.othappserver.model.*
import de.oth.othappserver.service.IUniversityService
import de.oth.othappserver.service.IWebUntisService
import de.oth.othappserver.webuntis.WebUnitsResourceType
import de.oth.othappserver.webuntis.WebUntisProperties
import de.oth.othappserver.webuntis.WebUntisUtils
import de.oth.othappserver.webuntis.WebUntisUtils.Companion.WebUntisDateFormatter
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@ConditionalOnProperty(WebUntisProperties.ENABLED)
open class UniversityController(
    private val universityService: IUniversityService,
    private val webuntisService: IWebUntisService
) : UniversityApi, SemesterApi {

    override fun info(): ResponseEntity<UniversityInfo> {
        val info = universityService.getInformation()

        return ResponseEntity.ok(info)
    }

    override fun semesterLectures(id: Int, startDate: LocalDate?, endDate: LocalDate?): ResponseEntity<List<Lecture>> {
        val start = startDate ?: LocalDate.parse(webuntisService.getCurrentSchoolyear().startDate, WebUntisUtils.WebUntisDateFormatter)
        val end = endDate ?: LocalDate.parse(webuntisService.getCurrentSchoolyear().endDate, WebUntisUtils.WebUntisDateFormatter)
        val semesterLectures = webuntisService.getSemesterLectures(id, start, end)

        return ResponseEntity.ok(semesterLectures)
    }

    override fun semesterTimetable(id: Int, startDate: LocalDate?, endDate: LocalDate?): ResponseEntity<List<TimetableItem>> {
        val (start, end) = if (startDate == null || endDate == null) {
            val currentSchoolyear = webuntisService.getCurrentSchoolyear()
            Pair(
                LocalDate.parse(currentSchoolyear.startDate, WebUntisDateFormatter),
                LocalDate.parse(currentSchoolyear.endDate, WebUntisDateFormatter)
            )
        } else {
            Pair(startDate, endDate)
        }

        val timetable = webuntisService.getTimetable(id, WebUnitsResourceType.SEMESTER, start, end).map {
            TimetableItem(it.id, it.startDateTime, it.endDateTime, it.ro.map { r -> r.id }, it.su.firstOrNull()?.id)
        }.sortedBy { it.startDateTime }

        return ResponseEntity.ok(timetable)
    }

    override fun rooms(): ResponseEntity<List<Room>> {
        val result = webuntisService.getRooms()
            .map { Room(it.id, it.name, it.longName) }

        return ResponseEntity.ok(result)
    }
}
