package de.oth.othappserver.rest

import de.oth.othappserver.api.FacultyApi
import de.oth.othappserver.exceptions.WebuntisNotAvailable
import de.oth.othappserver.model.*
import de.oth.othappserver.service.IFacultyService
import de.oth.othappserver.service.IWebUntisService
import de.oth.othappserver.tables.records.FacultyRecord
import de.oth.othappserver.tables.records.FeedRecord
import de.oth.othappserver.webuntis.WebUntisProperties
import de.oth.othappserver.webuntis.WebUntisSemester
import de.oth.othappserver.webuntis.WebUntisUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.util.stream.Collectors

@RestController
@ConditionalOnProperty(WebUntisProperties.ENABLED)
open class FacultyController internal constructor(
    private val facultyService: IFacultyService,
    private val webUntisService: IWebUntisService
) : FacultyApi {

    override fun faculties(): ResponseEntity<List<Faculty>> {
        val faculties = facultyService.faculties()
            .map { (faculty, feeds) ->
                Faculty(faculty.identifier, faculty.name, faculty.color, getFeeds(feeds))
            }

        return ResponseEntity.ok()
            .body(faculties)
    }

    override fun faculty(identifier: String): ResponseEntity<FacultyDetail> {
        return runBlocking(Dispatchers.IO) {
            val semesters = async { WebuntisNotAvailable.runCatching { webUntisService.getSemesters() }.getOrElse { listOf() } }
            val teachers = async { WebuntisNotAvailable.runCatching { webUntisService.getTeachers() }.getOrElse { listOf() } }
            val faculty = facultyService.facultyFeeds(identifier)
                .let { (faculty, feeds) ->
                    val facultySemesters = filterSemesters(semesters.await(), faculty)
                    val facultyTeachers = teachers.await()
                        .filter { teacher -> teacher.dids.filter { did -> did.id == faculty.webuntisId }.any() }
                        .map { teacher -> teacher.toModel() }

                    FacultyDetail(faculty.identifier, faculty.name, getFeeds(feeds), facultySemesters, facultyTeachers, faculty.color)
                }

            ResponseEntity.ok()
                .body(faculty)
        }
    }

    override fun facultyLectures(identifier: String, startDate: LocalDate?, endDate: LocalDate?): ResponseEntity<List<Lecture>> {
        val start = startDate ?: LocalDate.parse(webUntisService.getCurrentSchoolyear().startDate, WebUntisUtils.WebUntisDateFormatter)
        val end = endDate ?: LocalDate.parse(webUntisService.getCurrentSchoolyear().endDate, WebUntisUtils.WebUntisDateFormatter)

        val faculty = facultyService.faculty(identifier)
        val result = webUntisService.getFacultyLectures(faculty.webuntisId, start, end)

        return ResponseEntity.ok()
            .body(result)
    }

    private fun getFeeds(feeds: List<FeedRecord>): List<Feed> {
        return feeds.stream()
            .filter { it.id != null }
            ?.map { feed: FeedRecord -> Feed(feed.rss, Feed.Type.BULLETIN_BOARD) }
            ?.collect(Collectors.toList()) ?: listOf()
    }

    private fun filterSemesters(semesters: List<WebUntisSemester>, faculty: FacultyRecord): List<Semester> {
        return semesters
            .filter { semester -> semester.did == faculty.webuntisId }
            .map { semester -> semester.toModel() }
    }
}
