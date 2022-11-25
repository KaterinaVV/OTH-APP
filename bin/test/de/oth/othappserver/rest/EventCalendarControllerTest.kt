package de.oth.othappserver.rest

import com.fasterxml.jackson.databind.ObjectMapper
import com.nhaarman.mockitokotlin2.whenever
import de.oth.othappserver.IntegrationTest
import de.oth.othappserver.model.*
import org.apache.http.HttpEntity
import org.apache.http.StatusLine
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.CloseableHttpClient
import org.assertj.core.api.Assertions.assertThat
import org.jsoup.Jsoup
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.exchange
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import org.springframework.web.client.ResponseExtractor

class EventCalendarControllerTest @Autowired constructor(
    private val restTemplate: TestRestTemplate
) : IntegrationTest() {

    companion object {
        const val SINGLE_RESPONSE_START_DATE = "2019-10-11T00:00Z"
        const val SINGLE_RESPONSE_END_DATE = "2019-10-11T00:00Z"
        private const val expectedToken = "token"
        private const val FINAL_REQUEST_RESPONSE =
            """
            {
              "@odata.context": "...",
              "value": [],
              "@odata.deltaLink":"https://exchange.hs-regensburg.de/api/v2.0/me/calendarview/?startDateTime=...&endDateTime=...&%24deltaToken=$expectedToken"
            }
        """
    }

    @MockBean private lateinit var client: CloseableHttpClient

    private fun mockResponseFromFile(responseFile: String): CloseableHttpResponse {
        val responseMock = mock(CloseableHttpResponse::class.java)
        val stream = this.javaClass.classLoader.getResource(responseFile)!!.openStream()
        val entityMock = mock(HttpEntity::class.java)

        val statusLineMock = mock(StatusLine::class.java)
        `when`(statusLineMock.statusCode).thenReturn(200)

        `when`(responseMock.entity).thenReturn(entityMock)
        `when`(responseMock.entity.content).thenReturn(stream)
        `when`(responseMock.statusLine).thenReturn(statusLineMock)

        return responseMock
    }

    private fun mockResponse(response: String): CloseableHttpResponse {
        val responseMock = mock(CloseableHttpResponse::class.java)
        val entityMock = mock(HttpEntity::class.java)

        val statusLineMock = mock(StatusLine::class.java)
        `when`(statusLineMock.statusCode).thenReturn(200)

        `when`(responseMock.entity).thenReturn(entityMock)
        `when`(responseMock.entity.content).thenReturn(response.byteInputStream())
        `when`(responseMock.statusLine).thenReturn(statusLineMock)

        return responseMock
    }

    @Test
    fun `query all categories`() {
        val request = RequestEntity.get(createURLWithPort("/v1/eventcalendar/category")).build()
        val response = restTemplate.exchange<List<Category>>(request)
        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as List<Category>
        assertThat(result).isNotEmpty

        val expectedCategoryName = "Party"
        for (category in result) {
            if (category.name == expectedCategoryName) {
                // successfully found one example
                return
            }
        }
        fail("The returned list of categories didn't contain an element with name=$expectedCategoryName!\nresponse.body=$result")
    }

    @Test
    fun `query organizers`() {
        val request = RequestEntity.get(createURLWithPort("/v1/eventcalendar/organizer")).build()
        val response = restTemplate.exchange<List<Organizer>>(request)
        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as List<Organizer>
        assertThat(result).isNotEmpty

        val expectedOrganizerName = "Fachschaft IM"
        val expectedOrganizerMail = "fachschaft_im@oth-regensburg.de"
        for (organizer in result) {
            if (organizer.name == expectedOrganizerName && organizer.email == expectedOrganizerMail) {
                // successfully found one example
                return
            }
        }
        fail("The returned list of organizers didn't contain an element with name=$expectedOrganizerName and email=$expectedOrganizerMail!\nresponse.body=$result")
    }

    /**
     * Tests a events query using a minStartDate and maxStartDate in datetime format returning a single event.
     *
     * Asserts that a the returned event has all required fields.
     */
    @Test
    fun `query with single event`() {
        val responseMock = mockResponseFromFile("responses/single_singleInstance_response.json")
        val finalRequestMock = mockResponse(FINAL_REQUEST_RESPONSE)
        whenever(client.execute(any<HttpGet>(), any()))
            .thenReturn(responseMock)
            .thenReturn(finalRequestMock)

        val request = RequestEntity
            .get(createURLWithPort("/v1/eventcalendar/event?minStartDate=$SINGLE_RESPONSE_START_DATE&maxStartDate=$SINGLE_RESPONSE_END_DATE"))
            .build()
        val response = restTemplate.exchange<EventQueryResult>(request)

        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as EventQueryResult
        assertEquals(result.events.size, 1)

        // events
        val event = result.events[0] as UpdateEvent
        assertEquals("S0me Id-with_SpecialSigns=andNumbers=", event.eventId)
        assertEquals(EventType.UPDATE, event.eventType)
        assertEquals(listOf("Party"), event.categories)
        assertEquals("Subject", event.name)
        assertEquals("K002", event.location)
        assertEquals(Organizer("max.mustermann@oth-regensburg.de"), event.organizer)

        // deltaToken
        assertEquals(expectedToken, result.deltaToken)
    }

    /**
     * Tests a events query using a minStartDate and maxStartDate in date format returning a single event.
     *
     * Asserts that a the returned event has all required fields.
     */
    @Test
    fun `query with date`() {
        val responseMock = mockResponseFromFile("responses/single_singleInstance_response.json")
        val finalRequestMock = mockResponse(FINAL_REQUEST_RESPONSE)
        whenever(client.execute(any<HttpGet>(), any()))
            .thenReturn(responseMock)
            .thenReturn(finalRequestMock)

        val request = RequestEntity
            .get(createURLWithPort("/v1/eventcalendar/event?minStartDate=2019-10-11&maxStartDate=2019-10-11"))
            .build()
        val response = restTemplate.exchange<EventQueryResult>(request)

        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as EventQueryResult
        assertEquals(result.events.size, 1)
    }

    /**
     * Tests a events query using a minStartDate and maxStartDate in date format returning a single event.
     *
     * Asserts that a the returned event has all required fields.
     */
    @Test
    fun `query multiple mixed events`() {
        val responseMock = mockResponseFromFile("responses/multiple_mixedTypes_response.json")
        val finalRequestMock = mockResponse(FINAL_REQUEST_RESPONSE)
        whenever(client.execute(any<HttpGet>(), any()))
            .thenReturn(responseMock)
            .thenReturn(finalRequestMock)

        val request = RequestEntity
            .get(createURLWithPort("/v1/eventcalendar/event?minStartDate=2019-10-12&maxStartDate=2019-10-12"))
            .build()
        val response = restTemplate.exchange<EventQueryResult>(request)

        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as EventQueryResult
        assertEquals(result.events.size, 2)

        assertThat(result.events[0]).isInstanceOf(UpdateEvent::class.java)
        assertThat(result.events[1]).isInstanceOf(DeleteEvent::class.java)
    }

    /**
     * Tests a events query using a minStartDate and maxStartDate in date format returning a single event.
     *
     * Asserts that a the returned event has all required fields.
     */
    @Test
    fun `query single delete events in lowercase`() {
        val responseMock = mockResponseFromFile("responses/single_delete_response_lowercase.json")
        val finalRequestMock = mockResponse(FINAL_REQUEST_RESPONSE)
        whenever(client.execute(any<HttpGet>(), any()))
            .thenReturn(responseMock)
            .thenReturn(finalRequestMock)

        val request = RequestEntity
            .get(createURLWithPort("/v1/eventcalendar/event?minStartDate=2019-10-13&maxStartDate=2019-10-13"))
            .build()
        val response = restTemplate.exchange<EventQueryResult>(request)

        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as EventQueryResult
        assertEquals(result.events.size, 1)

        val deleteEvent = result.events[0]
        assertThat(deleteEvent).isInstanceOf(DeleteEvent::class.java)
        assertThat(deleteEvent.eventId).isEqualTo("deletedId")
    }

    /**
     * Tests a events query which returns series events.
     *
     * Asserts that the types are correctly assigned and data is correct.
     */
    @Test
    fun `query series events`() {
        val responseMock = mockResponseFromFile("responses/series_response.json")
        val finalRequestMock = mockResponse(FINAL_REQUEST_RESPONSE)
        whenever(client.execute(any<HttpGet>(), any()))
            .thenReturn(responseMock)
            .thenReturn(finalRequestMock)

        val request = RequestEntity
            .get(createURLWithPort("/v1/eventcalendar/event?minStartDate=2019-10-14&maxStartDate=2019-10-15"))
            .build()
        val response = restTemplate.exchange<EventQueryResult>(request)

        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as EventQueryResult
        assertEquals(3, result.events.size)

        val seriesMaster = result.events[0] as SeriesMaster
        val seriesOccurrence = result.events[1] as OccurrenceEvent
        val seriesException = result.events[2] as ExceptionEvent

        assertThat(seriesMaster).isInstanceOf(SeriesMaster::class.java)
        assertThat(seriesOccurrence).isInstanceOf(OccurrenceEvent::class.java)
        assertThat(seriesException).isInstanceOf(ExceptionEvent::class.java)

        assertEquals("Serie", seriesMaster.name)
        assertEquals("seriesContent", seriesMaster.description)
        assertEquals("2020-02-13T00:00:00.0000000", seriesMaster.startTime)
        assertEquals("2020-02-15T00:00:00.0000000", seriesMaster.endTime)

        assertEquals(seriesMaster.eventId, seriesOccurrence.masterId)
        assertEquals("2020-02-13T00:00:00.0000000", seriesOccurrence.startTime)
        assertEquals("2020-02-14T00:00:00.0000000", seriesOccurrence.endTime)

        assertEquals(seriesMaster.eventId, seriesException.masterId)
        assertEquals("2020-02-14T00:00:00.0000000", seriesException.startTime)
        assertEquals("2020-02-14T12:00:00.0000000", seriesException.endTime)
        assertEquals("Serie Exception", seriesException.name)
        assertEquals("Serie Exception Body", seriesException.description)
    }

    /**
     * Tests a events query which returns a event with tags.
     *
     * Asserts that the organizer is read correctly from a tag.
     */
    @Test
    fun `query event with tags`() {
        val responseMock = mockResponseFromFile("responses/singleInstance_withTags.json")
        val finalRequestMock = mockResponse(FINAL_REQUEST_RESPONSE)
        whenever(client.execute(any<HttpGet>(), any()))
            .thenReturn(responseMock)
            .thenReturn(finalRequestMock)

        val request = RequestEntity
            .get(createURLWithPort("/v1/eventcalendar/event?minStartDate=2019-10-15&maxStartDate=2019-10-16"))
            .build()
        val response = restTemplate.exchange<EventQueryResult>(request)

        assertNotNull(response)
        assertNotNull(response.body)

        val result = response.body as EventQueryResult
        assertEquals(1, result.events.size)

        val event = result.events[0] as UpdateEvent

        assertEquals("Max Mustermann", event.organizer?.name)
        val pTags = Jsoup.parse(event.description).getElementsByTag("p")
        assertTrue(1 == pTags.size)
        assertEquals("#This is ignored", pTags[0].text())
    }

    /**
     * Tests a events query with a minStartDate after the maxStartDate.
     *
     * Asserts that an error is thrown.
     */
    @Test
    fun `query min after max error`() {
        val responseAssert = ResponseExtractor {
            val body = it.body.bufferedReader().use { it.readText() }
            val json = ObjectMapper().readTree(body)

            assertEquals(HttpStatus.BAD_REQUEST, it.statusCode)
            assertEquals(400, json.get("status").asInt())
            assertEquals("Bad Request", json.get("title").asText())
            assertEquals("maxStartDate has to be after minStartDate.", json.get("detail").asText())
        }

        restTemplate.execute(
            createURLWithPort("/v1/eventcalendar/event?minStartDate=2019-10-12&maxStartDate=2019-10-11"),
            HttpMethod.GET,
            null,
            responseAssert
        )
    }
}
