package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lde/oth/othappserver/service/IEventCalendarService;", "", "getCategories", "", "Lde/oth/othappserver/tables/pojos/TEventcategory;", "getOrganizers", "Lde/oth/othappserver/tables/pojos/TEventorganizer;", "queryEvents", "Lde/oth/othappserver/model/EventQueryResult;", "minStartDate", "", "maxStartDate", "deltaToken", "skipToken", "paged", "", "oth-app-server"})
public abstract interface IEventCalendarService {
    
    /**
     * Returns a list of all categories an event can have.
     *
     * @return all categories an event can have
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.tables.pojos.TEventcategory> getCategories();
    
    /**
     * Returns a list of all organizers that are able to submit events to the calendar.
     *
     * @return all organizers that are able to submit events to the calendar
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizers();
    
    /**
     * Queries the calendar for all the events that match the specified filters
     *
     * @param minStartDate Only events that started on or after the specified date are returned. Date has to be formatted as ISO 8601 Date(Time)
     * @param maxStartDate Only events that start on or before the specified date are returned. Date has to be formatted as ISO 8601 Date(Time)
     * @param deltaToken Token that was received in the last [EventQueryResult]. Only changes to the calendar since the time the token was received will then be transmitted.
     *
     * @return The EventQueryResult containing a delta token for the next request as well as a list of all events.
     *
     * @see [java.time.LocalDate.parse]
     * @see [java.time.LocalDateTime.parse]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.model.EventQueryResult queryEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String minStartDate, @org.jetbrains.annotations.NotNull()
    java.lang.String maxStartDate, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    java.lang.String skipToken, boolean paged);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}