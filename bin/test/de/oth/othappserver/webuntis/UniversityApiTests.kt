package de.oth.othappserver.webuntis

import com.fasterxml.jackson.databind.type.CollectionType
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.IntegrationTest
import de.oth.othappserver.model.Lecture
import de.oth.othappserver.model.TimetableLecture
import de.oth.othappserver.model.UniversityInfo
import de.oth.othappserver.model.WebUntisResource
import de.oth.othappserver.rest.TimetableControllerTest
import de.oth.othappserver.utils.TestUtils
import de.oth.othappserver.utils.entityContains
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.CloseableHttpClient
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity

internal class UniversityApiTests @Autowired constructor(
    private val restTemplate: TestRestTemplate
) : IntegrationTest() {

    @MockBean
    private lateinit var client: CloseableHttpClient

    @Test
    fun `query University Info endpoint`() {
        whenever(client.execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())).thenAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("getHolidays") -> TestUtils.mockResponseFromFile("webuntis/responses/holidayResponse.json")
                httpPost.entityContains("getSchoolyears") -> TestUtils.mockResponseFromFile("webuntis/responses/schoolyearsResponse.json")
                else -> throw IllegalAccessException("Nothing should post the $httpPost")
            }
        }

        val response: ResponseEntity<UniversityInfo> = restTemplate.getForEntity(createURLWithPort("/v1/university/info"), UniversityInfo::class.java)

        assertNotNull(response)
        assertNotNull(response.body)
        assertTrue(response.statusCode.is2xxSuccessful)

        val info = response.body as UniversityInfo

        assertTrue(info.holidays.isNotEmpty())
        assertNotNull(info.roomFinderFilter)
        assertTrue(info.roomFinderFilter.buildings.isNotEmpty())
        assertTrue(info.roomFinderFilter.equipment.isNotEmpty())
        assertTrue(info.roomFinderFilter.roomTypes.isNotEmpty())

        assertTrue(info.semesterPeriods.isNotEmpty())
        info.semesterPeriods.forEach {
            assertNotNull(it.name)
            assertNotNull(it.start)
            assertNotNull(it.end)
        }
    }

    @Test
    fun `query Semester Lecture endpoint`() {
        whenever(client.execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())).thenAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("getTimetable") -> TestUtils.mockResponseFromFile("webuntis/responses/lectureTimetableCustomResponse.json")
                else -> throw IllegalAccessException("Nothing should post the $httpPost")
            }
        }
        val request = RequestEntity
                .get(createURLWithPort("/v1/semester/19578/lectures?startDate=2022-03-15&endDate=2022-03-15"))
                .build()
        val response = restTemplate.exchange<List<Lecture>>(request)

        assertNotNull(response)
        assertNotNull(response.body)
        assertTrue(response.statusCode.is2xxSuccessful)
    }
}
