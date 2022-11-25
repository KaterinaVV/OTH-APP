package de.oth.othappserver.exchange;

import java.lang.System;

/**
 * Service to query calendar events with.
 *
 * Supports delta loading events by supplying a deltaToken.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lde/oth/othappserver/exchange/IExchangeEventsService;", "", "query", "Lde/oth/othappserver/exchange/ExchangeResult;", "startDateTime", "", "endDateTime", "deltaToken", "skipToken", "paged", "", "oth-app-server"})
public abstract interface IExchangeEventsService {
    
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
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.exchange.ExchangeResult query(@org.jetbrains.annotations.NotNull()
    java.lang.String startDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endDateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    java.lang.String skipToken, boolean paged);
}