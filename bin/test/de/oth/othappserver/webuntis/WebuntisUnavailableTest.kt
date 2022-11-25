package de.oth.othappserver.webuntis

import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.BaseIntegrationTest
import de.oth.othappserver.model.FacultyDetail
import de.oth.othappserver.model.UniversityInfo
import de.oth.othappserver.utils.TestUtils
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.CloseableHttpClient
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.any
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import org.springframework.test.annotation.DirtiesContext
import org.zalando.problem.Problem

@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
class WebuntisUnavailableTest : BaseIntegrationTest() {
    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @MockBean(name = "httpClient")
    private lateinit var client: CloseableHttpClient

    @BeforeEach
    fun setUp() {
        doAnswer { TestUtils.mock302FoundResponse() }
            .whenever(client).execute(any(HttpPost::class.java), any())
    }

    @Test
    fun `query all university rooms with webuntis unavailable`() {
        val request = RequestEntity.get(createURLWithPort("/v1/university/room")).build()
        val response = restTemplate.exchange<Problem>(request)

        assertEquals(HttpStatus.SERVICE_UNAVAILABLE.value(), response.statusCode.value())
    }

    @Test
    fun `query university info with webuntis unavailable`() {
        val request = RequestEntity.get(createURLWithPort("/v1/university/info")).build()
        val response = restTemplate.exchange<UniversityInfo>(request)

        assertTrue(response.statusCode.is2xxSuccessful)

        val body = response.body!!
        assertTrue(body.holidays.isEmpty())
        assertTrue(body.semesterPeriods.isEmpty())
        assertNotNull(body.roomFinderFilter)
    }

    @Test
    fun `query faculty details with webuntis unavailable`() {
        val request = RequestEntity.get(createURLWithPort("/v1/faculty/IM")).build()
        val response = restTemplate.exchange<FacultyDetail>(request)

        assertTrue(response.statusCode.is2xxSuccessful)

        val body = response.body!!
        assertEquals("4A78D3", body.color)
        assertTrue(body.feeds.isNotEmpty())
        assertNotNull("IM", body.identifier)
        assertNotNull("Informatik und Mathematik", body.name)
        assertNotNull(body.lecturer.isEmpty())
        assertNotNull(body.semesters.isEmpty())
    }
}
