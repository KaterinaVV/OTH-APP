package de.oth.othappserver.rest

import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.IntegrationTest
import de.oth.othappserver.model.*
import de.oth.othappserver.utils.TestUtils
import de.oth.othappserver.utils.entityContains
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.CloseableHttpClient
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.data.Index
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import java.time.OffsetDateTime

internal class TimetableControllerTest @Autowired constructor(
    private val restTemplate: TestRestTemplate
) : IntegrationTest() {

    companion object {
        const val REQUEST_START_DATE = "2021-12-01"
        const val REQUEST_END_DATE = "2021-12-31"
        const val REQUEST_START_DATE_2 = "2022-01-01"
        const val REQUEST_END_DATE_2 = "2022-01-06"
        const val LECTURE_ID = 5297
        const val LECTURE_NAME = "Theoretische Informatik"
        const val LECTURE_SHORTNAME = "TI"
        const val SEMESTER_ID = "24545"
        const val SEMESTER_ID_2 = "19578"
    }

    @MockBean
    private lateinit var client: CloseableHttpClient

    @Test
    fun `Get a single timetable lecture`() {
        whenever(client.execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())).thenAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("getTimetable") -> TestUtils.mockResponseFromFile("webuntis/responses/lectureTimetableCustomResponse.json")
                else -> throw IllegalAccessException("Nothing should post the $httpPost")
            }
        }
        val request = RequestEntity
            .get(createURLWithPort("/v1/timetable/lectures/$LECTURE_ID?startDate=$REQUEST_START_DATE&endDate=$REQUEST_END_DATE"))
            .build()
        val response = restTemplate.exchange<TimetableLecture>(request)

        assertNotNull(response)
        assertEquals(HttpStatus.OK, response.statusCode)
        assertNotNull(response.body)

        val result = response.body as TimetableLecture
        assertEquals(LECTURE_ID, result.id)
        assertEquals(LECTURE_NAME, result.name)
        assertEquals(LECTURE_SHORTNAME, result.shortName)
        assertNotNull(result.uniqueOccurrences)
        assertEquals(8, result.uniqueOccurrences.size)

        val expectedOccurrence1 = TimetableLectureUniqueOccurrences(
            nextStartDateTime = OffsetDateTime.parse("2021-12-01T10:45Z"),
            nextEndDateTime = OffsetDateTime.parse("2021-12-01T12:15Z"),
            semesters = listOf(
                Semester(
                        id = 24545,
                        name = "I1[A-K]",
                        longName = "Bachelor IN1[A-K]"
                ),
                Semester(
                    id = 19578,
                    name = "IM2",
                    longName = "Bachelor IM2"
                )
            ),
            rooms = listOf(
                Room(
                    id = 907,
                    name = "K015",
                    longName = "K015 (Hörsaal - 72(19) - IM)"
                )
            ),
            lecturers = listOf(
                Lecturer(
                    id = 3218,
                    name = "Maw",
                    longName = "Mauerer"
                ),
                Lecturer(
                    id = 3842,
                    name = "TT",
                    longName = "Tutor"
                )
            )
        )
        val expectedOccurrence8 = TimetableLectureUniqueOccurrences(
            nextStartDateTime = OffsetDateTime.parse("2021-12-03T10:45Z"),
            nextEndDateTime = OffsetDateTime.parse("2021-12-03T12:15Z"),
            semesters = listOf(
                Semester(
                    id = 19578,
                    name = "IM2",
                    longName = "Bachelor IM2"
                )
            ),
            rooms = listOf(
                Room(
                        id = 907,
                        name = "K015",
                        longName = "K015 (Hörsaal - 72(19) - IM)"
                ),
                Room(
                    id = 873,
                    name = "K018",
                    longName = "K018 (Hörsaal - 75(19) - IM)"
                )
            ),
            lecturers = listOf(
                Lecturer(
                    id = 3218,
                    name = "Maw",
                    longName = "Mauerer"
                )
            )
        )
        assertThat(result.uniqueOccurrences).contains(expectedOccurrence1, Index.atIndex(0))
        assertThat(result.uniqueOccurrences).contains(expectedOccurrence8, Index.atIndex(7))
    }

    @Test
    fun `Get a single timetable lecture by semester`() {
        whenever(client.execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())).thenAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("getTimetable") -> TestUtils.mockResponseFromFile("webuntis/responses/lectureTimetableCustomResponse.json")
                else -> throw IllegalAccessException("Nothing should post the $httpPost")
            }
        }
        val request = RequestEntity
                .get(createURLWithPort("/v1/timetable/lectures/$LECTURE_ID?semesterId=$SEMESTER_ID&startDate=$REQUEST_START_DATE&endDate=$REQUEST_END_DATE"))
                .build()
        val response = restTemplate.exchange<TimetableLecture>(request)

        assertNotNull(response)
        assertEquals(HttpStatus.OK, response.statusCode)
        assertNotNull(response.body)

        val result = response.body as TimetableLecture
        assertEquals(LECTURE_ID, result.id)
        assertEquals(LECTURE_NAME, result.name)
        assertEquals(LECTURE_SHORTNAME, result.shortName)
        assertNotNull(result.uniqueOccurrences)
        assertEquals(1, result.uniqueOccurrences.size)

        val expectedOccurrence = TimetableLectureUniqueOccurrences(
            nextStartDateTime = OffsetDateTime.parse("2021-12-08T10:45Z"),
            nextEndDateTime = OffsetDateTime.parse("2021-12-08T12:15Z"),
            semesters = listOf(
                Semester(
                    id = 24545,
                    name = "I1[A-K]",
                    longName = "Bachelor IN1[A-K]"
                ),
                Semester(
                    id = 19578,
                    name = "IM2",
                    longName = "Bachelor IM2"
                )
            ),
            rooms = listOf(
                Room(
                    id = 907,
                    name = "K015",
                    longName = "K015 (Hörsaal - 72(19) - IM)"
                )
            ),
            lecturers = listOf(
                Lecturer(
                    id = 3218,
                    name = "Maw",
                    longName = "Mauerer"
                )
            )
        )
        assertThat(result.uniqueOccurrences).contains(expectedOccurrence, Index.atIndex(0))
    }

    @Test
    fun `Get a single timetable lecture with no occurrences in the given time period`() {
        whenever(client.execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())).thenAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("getTimetable") -> TestUtils.mockResponseFromFile("webuntis/responses/emptyResponse.json")
                httpPost.entityContains("getSubjects") -> TestUtils.mockResponseFromFile("webuntis/responses/lectureResponse.json")
                else -> throw IllegalAccessException("Nothing should post the $httpPost")
            }
        }
        val request = RequestEntity
            .get(createURLWithPort("/v1/timetable/lectures/$LECTURE_ID?startDate=$REQUEST_START_DATE_2&endDate=$REQUEST_END_DATE_2"))
            .build()
        val response = restTemplate.exchange<TimetableLecture>(request)

        assertNotNull(response)
        assertEquals(HttpStatus.OK, response.statusCode)
        assertNotNull(response.body)

        val result = response.body as TimetableLecture
        assertEquals(LECTURE_ID, result.id)
        assertEquals(LECTURE_NAME, result.name)
        assertEquals(LECTURE_SHORTNAME, result.shortName)
        assertNotNull(result.uniqueOccurrences)
        assertEquals(0, result.uniqueOccurrences.size)
    }

    @Test
    fun `Get semesters for a given lecture`() {
        whenever(client.execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())).thenAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("getTimetable") -> TestUtils.mockResponseFromFile("webuntis/responses/lectureTimetableCustomResponse.json")
                else -> throw IllegalAccessException("Nothing should post the $httpPost")
            }
        }
        val request = RequestEntity
                .get(createURLWithPort("/v1/timetable/lectures/$LECTURE_ID/semesters?startDate=$REQUEST_START_DATE&endDate=$REQUEST_END_DATE"))
                .build()
        val response = restTemplate.exchange<List<Semester>>(request)

        assertNotNull(response)
        assertEquals(HttpStatus.OK, response.statusCode)
        assertNotNull(response.body)

        val result = response.body as List<Semester>
        assertEquals(2, result.size)

        val expectedSemesters = listOf(
            Semester(
                id = 24545,
                name = "I1[A-K]",
                longName = "Bachelor IN1[A-K]"
            ),
            Semester(
                id = 19578,
                name = "IM2",
                longName = "Bachelor IM2"
            )
        )
        assertEquals(expectedSemesters, result)
    }
}
