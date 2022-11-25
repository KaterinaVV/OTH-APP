package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param events The events that have changed and match the filters since the deltaToken transmitted in the requests. If no token was transmitted, it simply contains all filtered events.
 * @param deltaToken Token that specifies the current state of the calendar. When passed to /v1/eventcalendar/event, only new, updated or deleted events added after this request will be returned.
 * @param skipToken Token that provides access to the next page of a paginated event query.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lde/oth/othappserver/model/EventQueryResult;", "", "events", "", "Lde/oth/othappserver/model/Event;", "deltaToken", "", "skipToken", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDeltaToken", "()Ljava/lang/String;", "getEvents", "()Ljava/util/List;", "getSkipToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class EventQueryResult {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "events", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Event> events = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "deltaToken")
    private final java.lang.String deltaToken = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "skipToken")
    private final java.lang.String skipToken = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Event> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeltaToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSkipToken() {
        return null;
    }
    
    public EventQueryResult(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.model.Event> events, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    java.lang.String skipToken) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Event> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * @param events The events that have changed and match the filters since the deltaToken transmitted in the requests. If no token was transmitted, it simply contains all filtered events.
     * @param deltaToken Token that specifies the current state of the calendar. When passed to /v1/eventcalendar/event, only new, updated or deleted events added after this request will be returned.
     * @param skipToken Token that provides access to the next page of a paginated event query.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.EventQueryResult copy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.model.Event> events, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    java.lang.String skipToken) {
        return null;
    }
    
    /**
     * @param events The events that have changed and match the filters since the deltaToken transmitted in the requests. If no token was transmitted, it simply contains all filtered events.
     * @param deltaToken Token that specifies the current state of the calendar. When passed to /v1/eventcalendar/event, only new, updated or deleted events added after this request will be returned.
     * @param skipToken Token that provides access to the next page of a paginated event query.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param events The events that have changed and match the filters since the deltaToken transmitted in the requests. If no token was transmitted, it simply contains all filtered events.
     * @param deltaToken Token that specifies the current state of the calendar. When passed to /v1/eventcalendar/event, only new, updated or deleted events added after this request will be returned.
     * @param skipToken Token that provides access to the next page of a paginated event query.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param events The events that have changed and match the filters since the deltaToken transmitted in the requests. If no token was transmitted, it simply contains all filtered events.
     * @param deltaToken Token that specifies the current state of the calendar. When passed to /v1/eventcalendar/event, only new, updated or deleted events added after this request will be returned.
     * @param skipToken Token that provides access to the next page of a paginated event query.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}