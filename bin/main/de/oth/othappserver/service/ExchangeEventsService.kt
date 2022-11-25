package de.oth.othappserver.service

import de.oth.othappserver.exchange.ExchangeClient
import de.oth.othappserver.exchange.ExchangeResult
import de.oth.othappserver.exchange.IExchangeEventsService
import org.springframework.stereotype.Service
import org.zalando.problem.Problem
import org.zalando.problem.Status.BAD_REQUEST
import java.time.ZonedDateTime

@Service
class ExchangeEventsService(private val client: ExchangeClient) : IExchangeEventsService {
    // redefine query
    override fun query(startDateTime: String, endDateTime: String, deltaToken: String?, skipToken: String?, paged: Boolean): ExchangeResult {
        // LocalDateTime represents local date and time，ZonedDateTime represents with time zone
        val start = ZonedDateTime.parse(startDateTime) // get a text string from ZonedDate time instance
        val end = ZonedDateTime.parse(endDateTime)

        if (start.isAfter(end)) {
            throw Problem.valueOf(BAD_REQUEST, "maxStartDate has to be after minStartDate.")
        }

        return if (skipToken != null) {
            client.queryEventsPage(start, end, skipToken)
        } else {
            client.queryEvents(start, end, deltaToken, paged)
        }
    }
}
