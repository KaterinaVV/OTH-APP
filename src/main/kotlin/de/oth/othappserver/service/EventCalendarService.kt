package de.oth.othappserver.service

import de.oth.othappserver.Tables.EVENTCATEGORY
import de.oth.othappserver.config.CacheConfig.Companion.LIFETIME_CACHE
import de.oth.othappserver.exchange.*
import de.oth.othappserver.model.*
import de.oth.othappserver.service.tags.EventTagsParser
import de.oth.othappserver.tables.pojos.TEventcategory
import de.oth.othappserver.tables.pojos.TEventorganizer
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.zalando.problem.Problem
import org.zalando.problem.Status.BAD_REQUEST
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeParseException
import java.util.*
import kotlin.streams.toList

@Service
@CacheConfig(cacheNames = [LIFETIME_CACHE], keyGenerator = "customKeyGenerator")
private open class EventCalendarService @Autowired constructor(
    private val dsl: DSLContext,
    private val exchangeEventsService: IExchangeEventsService,
    // getCategories(), getOrganizers(), queryEvents()
    private val organizerService: IOrganizerService,
    //getOrganizerByEmail(email:string), getOrganizerByName(name:string), getOrganizers
    private val eventTagsParser: EventTagsParser

) : IEventCalendarService {

    companion object {
        private const val ILLEGAL_DATEFORMAT_ERROR = "Could not parse %s as date. Valid formats are \"YYYY-MM-DD\" or \"YYYY-MM-DDTHH:MM:SS±HH:MM\""
        private const val TITLE_REQUIRED_ERROR = "An Event must have a title"
        private const val EUROPE_BERLIN_TZ = "Europe/Berlin"
    }

    @Cacheable
    override fun getCategories(): List<TEventcategory> {
        return dsl.select(EVENTCATEGORY.ID, EVENTCATEGORY.NAME, EVENTCATEGORY.COLOR)
            .from(EVENTCATEGORY)
            .fetch { record ->
                val (id, name, color) = record
                TEventcategory(id, name, color)
            }
    }

    override fun getOrganizers(): List<TEventorganizer> {
        return organizerService.getOrganizers()
    }

    override fun queryEvents(minStartDate: String, maxStartDate: String, deltaToken: String?, skipToken: String?, paged: Boolean): EventQueryResult {
        try {
            val startDateTime = sanitizeDateString(minStartDate, true)
            val endDateTime = sanitizeDateString(maxStartDate, false)
            val exchangeResult = exchangeEventsService.query(startDateTime, endDateTime, deltaToken, skipToken, paged)

            val filteredEvents = exchangeResult.events.stream()
                .filter { event -> isValidEvent(event) }
                .map { event -> toEvent(event) }
                .toList()

            return EventQueryResult(filteredEvents, exchangeResult.deltaToken, exchangeResult.skipToken)
        } catch (e: DateTimeParseException) {
            throw Problem.valueOf(BAD_REQUEST, ILLEGAL_DATEFORMAT_ERROR.format(e.parsedString))
        }
    }

    private fun sanitizeDateString(dateString: String, start: Boolean): String {
        return if ("T" in dateString) {
            dateString
        } else {
            val localDate = LocalDate.parse(dateString)
            val time = when (start) {
                true -> LocalTime.MIN.plusSeconds(1)
                false -> LocalTime.MAX
            }
            val dateTime = ZonedDateTime.of(localDate, time, ZoneId.of(EUROPE_BERLIN_TZ))
            dateTime.toString()
        }
    }

    private fun toEvent(event: IExchangeEvent): Event {
        return when (event) {
            is ExchangeUpdateEvent -> {
                val data = event.data
                val extractTagResult = eventTagsParser.extractTag(data)
                val description = extractTagResult.data ?: data.body?.content

                UpdateEvent(
                    data.subject ?: throw IllegalArgumentException(TITLE_REQUIRED_ERROR),
                    data.categories, data.startDateTime, data.endDateTime, data.isAllDay,
                    data.id, EventType.UPDATE, data.location, getOrganizer(data, extractTagResult.tag), description
                )
            }
            is ExchangeDeleteEvent -> DeleteEvent(event.id, EventType.DELETE)
            is ExchangeSeriesOccurrenceEvent -> OccurrenceEvent(event.seriesMasterId, event.start, event.end, event.id, EventType.OCCURRENCE)
            is ExchangeSeriesMasterEvent -> {
                val data = event.data
                val extractTagResult = eventTagsParser.extractTag(data)
                val description = extractTagResult.data ?: data.body?.content

                SeriesMaster(
                    data.subject ?: throw IllegalArgumentException(TITLE_REQUIRED_ERROR),
                    data.categories, data.startDateTime, data.endDateTime, data.isAllDay,
                    data.id, EventType.SERIES_MASTER, data.location, getOrganizer(data, extractTagResult.tag), description
                )
            }
            is ExchangeSeriesExceptionEvent -> {
                val data = event.data
                val extractTagResult = eventTagsParser.extractTag(data)
                val description = extractTagResult.data ?: data.body?.content

                ExceptionEvent(
                    data.subject ?: throw IllegalArgumentException(TITLE_REQUIRED_ERROR),
                    data.categories, data.startDateTime, data.endDateTime, data.isAllDay,
                    event.seriesMasterId, data.id, EventType.EXCEPTION, data.location, getOrganizer(data, extractTagResult.tag), description
                )
            }
        }
    }

    /**
     * Finds a Organizer by name or creates a default with the given name.
     */
    private fun getOrganizer(data: EventData, tag: Optional<String>): Organizer? {
        val organizerTag = tag.orElse(data.organizer)

        if (organizerTag == "oth-app-veranstaltungen@oth-regensburg.de") return null

        return if ("@" in organizerTag) {
            organizerService.getOrganizerByEmail(organizerTag)
                .map { Organizer(it.email, it.name, it.description) }
                .orElse(Organizer(organizerTag))
        } else {
            organizerService.getOrganizerByName(organizerTag)
                .map { Organizer(it.email, it.name, it.description) }
                .orElse(Organizer("", organizerTag))
        }
    }

    private fun isValidEvent(event: IExchangeEvent) = when (event) {
        is ExchangeUpdateEvent -> !event.data.subject.isNullOrEmpty()
        is ExchangeSeriesMasterEvent -> !event.data.subject.isNullOrEmpty()
        else -> true
    }
}
