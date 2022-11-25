package de.oth.othappserver.exchange.data

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import de.oth.othappserver.exchange.*

interface ExchangeEvent {
    val id: String
}

data class ExchangeContainer(
    @JsonDeserialize(using = ExchangeEventDeserializer::class)
    @JsonProperty("value")
    val events: List<ExchangeEvent>,
    @JsonProperty("@odata.deltaLink", required = false) val deltaLink: String?,
    @JsonProperty("@odata.nextLink", required = false) val nextLink: String?
)

data class Body(val content: String, val type: TYPE) {
    enum class TYPE { HTML, TEXT }
    companion object {
        fun fromHtml(content: String) = Body(content, TYPE.HTML)
        fun fromText(content: String) = Body(content, TYPE.TEXT)
    }
}

data class SingleInstanceEvent(
    override val id: String,
    val subject: String?,
    val categories: List<String>?,
    val start: String,
    val end: String,
    val isAllDay: Boolean,
    val organizer: String?,
    val location: String?,
    val body: Body?
) : ExchangeEvent {
    fun toExchangeEvent(): IExchangeEvent {
        val data = EventData(id, subject, categories.orEmpty(), start, end, isAllDay, organizer ?: "", location, body)

        return ExchangeUpdateEvent(data)
    }
}

data class SeriesMasterEvent(
    override val id: String,
    val subject: String?,
    val categories: List<String>?,
    val start: String,
    val end: String,
    val isAllDay: Boolean,
    val organizer: String?,
    val location: String?,
    val body: Body?
) : ExchangeEvent {
    fun toExchangeEvent(): IExchangeEvent {
        val data = EventData(id, subject, categories.orEmpty(), start, end, isAllDay, organizer ?: "", location, body)

        return ExchangeSeriesMasterEvent(data)
    }
}

data class SeriesOccurrenceEvent(
    override val id: String,
    val seriesMasterId: String,
    val start: String,
    val end: String
) : ExchangeEvent {
    fun toExchangeEvent(master: SeriesMasterEvent): IExchangeEvent {
        return ExchangeSeriesOccurrenceEvent(id, master.id, start, end)
    }
}

data class SeriesExceptionEvent(
    override val id: String,
    val seriesMasterId: String,
    val subject: String?,
    val categories: List<String>?,
    val start: String,
    val end: String,
    val isAllDay: Boolean,
    val organizer: String?,
    val location: String?,
    val body: Body?
) : ExchangeEvent {
    fun toExchangeEvent(): IExchangeEvent {
        val data = EventData(id, subject, categories.orEmpty(), start, end, isAllDay, organizer ?: "", location, body)

        return ExchangeSeriesExceptionEvent(seriesMasterId, data)
    }
}

data class DeletedEvent(
    override val id: String
) : ExchangeEvent {
    fun toExchangeEvent(): IExchangeEvent = ExchangeDeleteEvent(id)
}

data class ExchangeFailure(val error: ExchangeError)

data class ExchangeError(val code: ExchangeErrorCode, val message: String)
enum class ExchangeErrorCode {
    SyncStateNotFound, OTHER
}
