package de.oth.othappserver

import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.rest.EventCalendarControllerTest
import de.oth.othappserver.utils.TestUtils
import de.oth.othappserver.utils.entityContains
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.CloseableHttpClient
import org.junit.jupiter.api.Assertions
import org.mockito.ArgumentMatchers
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ContextConfiguration

@ContextConfiguration(classes = [IntegrationTestConfiguration::class])
abstract class IntegrationTest : BaseIntegrationTest()

/**
 * Tests extending this class get a newly created Spring application context instead of a cached one.
 */
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
abstract class FreshContextIntegrationTest : IntegrationTest()

@TestConfiguration
open class IntegrationTestConfiguration {

    /**
     * Initializes the default ClosableHttpClient.
     * If you want to override this default use a class variable with [MockBean] (See [EventCalendarControllerTest])
     *
     * ## Code Example
     * ```
     * @MockBean private lateinit var client: CloseableHttpClient
     * ```
     */
    @Bean
    @Primary
    open fun testClient(): CloseableHttpClient {
        val mock = mock<CloseableHttpClient>(
            name = "integration-test-http-client",
            verboseLogging = true
        )

        var auth = false
        doAnswer {
            val httpPost = it.arguments[0] as HttpPost
            when {
                httpPost.entityContains("authenticate") -> {
                    auth = true
                    TestUtils.mockResponseFromFile("webuntis/responses/authResponse.json")
                }
                !auth -> TestUtils.mockResponseFromFile("webuntis/responses/authFailedResponse.json")
                auth -> when {
                    httpPost.entityContains("getTeachers") -> TestUtils.mockResponseFromFile("webuntis/responses/teachersResponse.json")
                    httpPost.entityContains("getDepartments") -> TestUtils.mockResponseFromFile("webuntis/responses/facultyResponse.json")
                    httpPost.entityContains("getKlassen") -> TestUtils.mockResponseFromFile("webuntis/responses/semesterResponse.json")
                    httpPost.entityContains("getHolidays") -> TestUtils.mockResponseFromFile("webuntis/responses/holidayResponse.json")
                    httpPost.entityContains("getSubjects") -> TestUtils.mockResponseFromFile("webuntis/responses/lectureResponse.json")
                    httpPost.entityContains("getRooms") -> TestUtils.mockResponseFromFile("webuntis/responses/roomsResponse.json")
                    httpPost.entityContains("getSchoolyears") -> TestUtils.mockResponseFromFile("webuntis/responses/schoolyearsResponse.json")
                    httpPost.entityContains("getCurrentSchoolyear") -> TestUtils.mockResponseFromFile("webuntis/responses/currentSchoolyearResponse.json")
                    httpPost.entityContains("getTimetable") -> TestUtils.mockResponseFromFile("webuntis/responses/semesterLectureResponse.json")
                    else -> Assertions.fail()
                }
                else -> Assertions.fail()
            }
        }.whenever(mock).execute(ArgumentMatchers.any(HttpPost::class.java), ArgumentMatchers.any())
        return mock
    }
}
