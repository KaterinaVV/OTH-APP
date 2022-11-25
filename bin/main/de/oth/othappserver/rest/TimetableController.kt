package de.oth.othappserver.rest

import de.oth.othappserver.api.TimetableApi
import de.oth.othappserver.model.Semester
import de.oth.othappserver.model.TimetableLecture
import de.oth.othappserver.service.IWebUntisService
import de.oth.othappserver.webuntis.WebUntisProperties
import de.oth.othappserver.webuntis.WebUntisUtils.Companion.WebUntisDateFormatter
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.time.ZoneId

@RestController
@ConditionalOnProperty(WebUntisProperties.ENABLED)
open class TimetableController(
    private val webUntisService: IWebUntisService
) : TimetableApi {

    override fun timetableLecture(id: Int, semesterId: Int?, startDate: LocalDate?, endDate: LocalDate?): ResponseEntity<TimetableLecture> {
        val start = startDate ?: LocalDate.now(ZoneId.of("Europe/Berlin"))
        val end = endDate ?: LocalDate.parse(webUntisService.getCurrentSchoolyear().endDate, WebUntisDateFormatter)

        val timetableLecture = webUntisService.getTimetableLecture(id, semesterId, start, end)

        return ResponseEntity.ok(timetableLecture)
    }

    override fun timetableLectureSemesters(id: Int, startDate: LocalDate?, endDate: LocalDate?): ResponseEntity<List<Semester>> {
        val start = startDate ?: LocalDate.now(ZoneId.of("Europe/Berlin"))
        val end = endDate ?: LocalDate.parse(webUntisService.getCurrentSchoolyear().endDate, WebUntisDateFormatter)

        val semesters = webUntisService.getLectureSemesters(id, start, end)

        return ResponseEntity.ok(semesters)
    }
}
