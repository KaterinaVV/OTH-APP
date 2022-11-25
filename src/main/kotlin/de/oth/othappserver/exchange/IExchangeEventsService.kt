package de.oth.othappserver.exchange

import de.oth.othappserver.exchange.data.Body

// sealed class 密封类，子类若要继承必须在同一文件中
sealed class IExchangeEvent
sealed class IExchangeDataEvent : IExchangeEvent(), IDataEvent

interface IDataEvent {
    val data: EventData
}

data class EventData(
    val id: String,
    val subject: String?,
    val categories: List<String>,
    val startDateTime: String,
    val endDateTime: String,
    val isAllDay: Boolean,
    val organizer: String,
    val location: String?,
    val body: Body?
)

data class ExchangeUpdateEvent(override val data: EventData) : IExchangeDataEvent()

data class ExchangeSeriesMasterEvent(override val data: EventData) : IExchangeDataEvent()

data class ExchangeSeriesOccurrenceEvent(
    val id: String,
    val seriesMasterId: String,
    val start: String,
    val end: String
) : IExchangeEvent()

class ExchangeSeriesExceptionEvent(val seriesMasterId: String, override val data: EventData) : IExchangeDataEvent()

data class ExchangeDeleteEvent(val id: String) : IExchangeEvent()

data class ExchangeResult(val events: List<IExchangeEvent>, val deltaToken: String?, val skipToken: String?)

/**
 * Service to query calendar events with.
 *
 * Supports delta loading events by supplying a deltaToken.
 */
interface IExchangeEventsService {
    /**
     * Retrieves calendar events between to points in time.
     *
     * The deltaToken can be received after a initial call to this method
     * *without* supplying a deltaToken.
     *
     * @param startDateTime Starting datetime to retrieve events
     * @param endDateTime Ending datetime
     * @param deltaToken Previously retrieved deltaToken
     * @param skipToken  Previously retrieved skipToken
     * @param paged Flag that activates pagination
     * @return A instance of ExchangeResult
     */
    // fun 定义函数
    fun query(startDateTime: String, endDateTime: String, deltaToken: String?, skipToken: String?, paged: Boolean): ExchangeResult
}
