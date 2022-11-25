package de.oth.othappserver.service

import de.oth.othappserver.exchange.ExchangeClient
import de.oth.othappserver.exchange.ExchangeResult
import org.assertj.core.util.Lists
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.mockito.Mockito.*
import java.time.ZonedDateTime

internal class ExchangeEventsServiceTest {

    /**
     * Tests that the service converts start and end datetime and calls the ExchangeClient with them.
     */
    @Test
    fun query() {
        val start = "2019-10-18T11:30:00Z"
        val end = "2019-10-20T11:30:00Z"
        val startDateTime = ZonedDateTime.parse(start)
        val endDateTime = ZonedDateTime.parse(end)
        val deltaToken = "token"

        // Mocks
        val exchangeClientMock = mock(ExchangeClient::class.java)

        // Stubs
        `when`(exchangeClientMock.queryEvents(startDateTime, endDateTime, deltaToken, false)).thenReturn(ExchangeResult(Lists.emptyList(), deltaToken, null))

        // Instance to test
        val service = ExchangeEventsService(exchangeClientMock)
        val result = service.query(start, end, deltaToken, null, false)

        Assertions.assertEquals(ExchangeResult(Lists.emptyList(), deltaToken, null), result)
        verify(exchangeClientMock, times(1)).queryEvents(startDateTime, endDateTime, deltaToken, false)
    }
}
