package de.oth.othappserver.service

import de.oth.othappserver.model.EventQueryResult
import de.oth.othappserver.tables.pojos.TEventcategory
import de.oth.othappserver.tables.pojos.TEventorganizer

interface IEventCalendarService {
    /**
     * Returns a list of all categories an event can have.
     *
     * @return all categories an event can have
     */
    fun getCategories(): List<TEventcategory>
    // [id, name, color]

    /**
     * Returns a list of all organizers that are able to submit events to the calendar.
     *
     * @return all organizers that are able to submit events to the calendar
     */
    fun getOrganizers(): List<TEventorganizer>
    // [id, name, email, description]

    /**
     *  Queries the calendar for all the events that match the specified filters
     *
     * @param minStartDate Only events that started on or after the specified date are returned. Date has to be formatted as ISO 8601 Date(Time)
     * @param maxStartDate Only events that start on or before the specified date are returned. Date has to be formatted as ISO 8601 Date(Time)
     * @param deltaToken Token that was received in the last [EventQueryResult]. Only changes to the calendar since the time the token was received will then be transmitted.
     *
     * @return The EventQueryResult containing a delta token for the next request as well as a list of all events.
     *
     * @see [java.time.LocalDate.parse]
     * @see [java.time.LocalDateTime.parse]
     *
     */
    fun queryEvents(minStartDate: String, maxStartDate: String, deltaToken: String? = null, skipToken: String?, paged: Boolean): EventQueryResult
    // EventQueryResult = {Event, deltaToken, skipToken}
    // Event = {eventId, eventType}
    // eventType = {delete, update, occurrence, exception, seriesMaster}
}
