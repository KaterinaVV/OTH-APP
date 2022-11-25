package de.oth.othappserver.exchange

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import de.oth.othappserver.exchange.data.Body
import org.apache.http.HttpEntity
import org.apache.http.StatusLine
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.protocol.HttpClientContext
import org.apache.http.impl.client.CloseableHttpClient
import org.assertj.core.util.Lists
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import java.net.URLEncoder
import java.time.ZonedDateTime

class HttpExchangeClientTest {
    companion object {
        private const val PARSABLE_RESPONSE =
            """
            {
              "@odata.context": "...",
              "value": [
                {
                  "Id": "S0me Id-with_SpecialSigns=andNumbers=",
                  "Categories": [],
                  "OriginalStartTimeZone": "W. Europe Standard Time",
                  "OriginalEndTimeZone": "W. Europe Standard Time",
                  "Subject": "Subject",
                  "IsAllDay": false,
                  "Body": {
                    "ContentType": "HTML",
                    "Content": "Body"
                  },
                  "Start": {
                    "DateTime": "2019-10-11T14:00:00.0000000",
                    "TimeZone": "UTC"
                  },
                  "End": {
                    "DateTime": "2019-10-11T15:00:00.0000000",
                    "TimeZone": "UTC"
                  },
                  "Location": {
                    "DisplayName": "K002"
                  },
                  "Recurrence": null,
                  "Organizer": {
                    "EmailAddress": {
                      "Name": "Max Mustermann",
                      "Address": "max.mustermann@oth-regensburg.de"
                    }
                  }
                }
                ]
            }
        """
        private const val expectedToken = "token"
        private const val FINAL_REQUEST_RESPONSE =
            """
            {
              "@odata.context": "...",
              "value": [],
              "@odata.deltaLink":"https://exchange.hs-regensburg.de/api/v2.0/me/calendarview/?startDateTime=...&endDateTime=...&%24deltaToken=$expectedToken"
            }
        """
        private val mapper = jacksonObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        private val exchangeProperties = ExchangeProperties("", "", "", "")
    }

    /**
     * Tests that a exchange response can be read and parsed successfully.
     */
    @Test
    fun queryEvents() {
        val expectedId = "S0me Id-with_SpecialSigns=andNumbers="
        val expectedSubject = "Subject"
        val expectedBody = "Body"
        val expectedStartDateTime = "2019-10-11T14:00:00.0000000"
        val expectedEndDateTime = "2019-10-11T15:00:00.0000000"
        val expectedLocation = "K002"
        val expectedOrganizer = "max.mustermann@oth-regensburg.de"
        val expectedAllDay = false
        val jsonResponse =
            """
            {
              "@odata.context": "...",
              "value": [
                {
                  "Id": "$expectedId",
                  "Categories": [],
                  "OriginalStartTimeZone": "W. Europe Standard Time",
                  "OriginalEndTimeZone": "W. Europe Standard Time",
                  "Subject": "$expectedSubject",
                  "IsAllDay": $expectedAllDay,
                  "Type": "SingleInstance",
                  "Body": {
                    "ContentType": "HTML",
                    "Content": "$expectedBody"
                  },
                  "Start": {
                    "DateTime": "$expectedStartDateTime",
                    "TimeZone": "UTC"
                  },
                  "End": {
                    "DateTime": "$expectedEndDateTime",
                    "TimeZone": "UTC"
                  },
                  "Location": {
                    "DisplayName": "$expectedLocation"
                  },
                  "Recurrence": null,
                  "Organizer": {
                    "EmailAddress": {
                      "Name": "Max Mustermann",
                      "Address": "$expectedOrganizer"
                    }
                  }
                }
                ]
            }
        """
        val calendarURI = "uri"
        val mailURI = "mailURI"
        val startRange = "2019-10-18T11:30:00Z"
        val endRange = "2019-10-19T11:30:00Z"

        // ### Mocks ###
        val contextMock = mock(HttpClientContext::class.java)
        val clientMock = mock(CloseableHttpClient::class.java)

        // ### Stubs ###
        val mockRequest = mockRequest(jsonResponse)
        val mockFinalRequest = mockRequest(FINAL_REQUEST_RESPONSE)
        `when`(clientMock.execute(any(HttpGet::class.java), eq(contextMock)))
            .thenReturn(mockRequest)
            .thenReturn(mockFinalRequest)

        // Instance to test
        val client = HttpExchangeClient(clientMock, { contextMock }, calendarURI, mailURI, mapper, exchangeProperties)

        // call method
        val start = ZonedDateTime.parse(startRange)
        val end = ZonedDateTime.parse(endRange)
        val exchangeResult = client.queryEvents(start, end, null, false)

        assertNotNull(exchangeResult)
        assertTrue(exchangeResult.events.size == 1)

        val event = exchangeResult.events[0]
        val data = EventData(expectedId, expectedSubject, Lists.emptyList(), expectedStartDateTime, expectedEndDateTime, expectedAllDay, expectedOrganizer, expectedLocation, Body.fromHtml(expectedBody))
        val expectedEvent = ExchangeUpdateEvent(data)
        assertEquals(expectedEvent, event)
        assertEquals(exchangeResult.deltaToken, expectedToken)
    }

    /**
     * Tests that the request sent to the exchange server contains valid "startDateTime" and "endDateTime" parameters.
     */
    @Test
    fun validate_startDateTime_endDateTime() {
        val calendarURI = "uri"
        val mailURI = "uri"
        val startRange = "2019-10-18T11:30Z"
        val endRange = "2019-10-19T11:30Z"

        // ### Mocks ###
        val contextMock = mock(HttpClientContext::class.java)
        val clientMock = mock(CloseableHttpClient::class.java)

        // Stubs
        val mockRequest = mockRequest(PARSABLE_RESPONSE)
        val mockFinalRequest = mockRequest(FINAL_REQUEST_RESPONSE)
        `when`(clientMock.execute(any(HttpGet::class.java), eq(contextMock))).thenAnswer {
            val request = it.getArgument<HttpGet>(0)
            assertEquals("$calendarURI?startDateTime=${URLEncoder.encode(startRange, "utf-8")}&endDateTime=${URLEncoder.encode(endRange, "utf-8")}", request.uri.toString())

            mockRequest
        }.thenReturn(mockFinalRequest)

        // Instance to test
        val client = HttpExchangeClient(clientMock, { contextMock }, calendarURI, mailURI, mapper, exchangeProperties)

        // call method
        val exchangeResult = client.queryEvents(ZonedDateTime.parse(startRange), ZonedDateTime.parse(endRange), null, false)

        assertNotNull(exchangeResult)
    }

    /**
     * Tests that the request sent to the exchange server contains a Prefer header which sets the timezone.
     */
    @Test
    fun validate_preferTimeZone_header() {
        val calendarURI = "uri"
        val mailURI = "uri"
        val startRange = "2019-10-18T11:30:00Z"
        val endRange = "2019-10-19T11:30:00Z"

        // Mocks
        val contextMock = mock(HttpClientContext::class.java)
        val clientMock = mock(CloseableHttpClient::class.java)

        // Stubs
        val responseMock = mockRequest(PARSABLE_RESPONSE)
        val mockFinalRequest = mockRequest(FINAL_REQUEST_RESPONSE)
        `when`(clientMock.execute(any(HttpGet::class.java), eq(contextMock))).thenAnswer { it ->
            val request = it.getArgument<HttpGet>(0)
            val hasTimeZone = request.getHeaders("Prefer")
                .any { it.name == "Prefer" && it.value == "outlook.timezone=\"W. Europe Standard Time\"" }
            assertTrue(hasTimeZone)

            responseMock
        }.thenReturn(mockFinalRequest)

        // Instance to test
        val client = HttpExchangeClient(clientMock, { contextMock }, calendarURI, mailURI, mapper, exchangeProperties)

        // call method
        val exchangeResult = client.queryEvents(ZonedDateTime.parse(startRange), ZonedDateTime.parse(endRange), null, false)

        assertNotNull(exchangeResult)
    }

    private fun mockRequest(data: String?): CloseableHttpResponse {
        val responseMock = mock(CloseableHttpResponse::class.java)

        val entityMock = mock(HttpEntity::class.java)
        if (data != null) {
            `when`(entityMock.content).thenReturn(data.byteInputStream())
        }
        `when`(responseMock.entity).thenReturn(entityMock)

        val statusLineMock = mock(StatusLine::class.java)
        `when`(statusLineMock.statusCode).thenReturn(200)
        `when`(responseMock.statusLine).thenReturn(statusLineMock)

        return responseMock
    }
}
