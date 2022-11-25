package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param masterId ID of the associated series master event.
 * @param startTime Start time of the event in Europe/Berlin timezone.
 * @param endTime End time of the event in  Europe/Berlin timezone.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lde/oth/othappserver/model/OccurrenceEvent;", "Lde/oth/othappserver/model/Event;", "masterId", "", "startTime", "endTime", "eventId", "eventType", "Lde/oth/othappserver/model/EventType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/oth/othappserver/model/EventType;)V", "getEndTime", "()Ljava/lang/String;", "getEventId", "getEventType", "()Lde/oth/othappserver/model/EventType;", "getMasterId", "getStartTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "oth-app-server"})
public final class OccurrenceEvent implements de.oth.othappserver.model.Event {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "masterId", required = true)
    private final java.lang.String masterId = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "startTime", required = true)
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "endTime", required = true)
    private final java.lang.String endTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "eventId", required = true)
    private final java.lang.String eventId = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "eventType", required = true)
    @javax.validation.Valid()
    private final de.oth.othappserver.model.EventType eventType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMasterId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getEventId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.oth.othappserver.model.EventType getEventType() {
        return null;
    }
    
    public OccurrenceEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String masterId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.EventType eventType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.EventType component5() {
        return null;
    }
    
    /**
     * @param masterId ID of the associated series master event.
     * @param startTime Start time of the event in Europe/Berlin timezone.
     * @param endTime End time of the event in  Europe/Berlin timezone.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.OccurrenceEvent copy(@org.jetbrains.annotations.NotNull()
    java.lang.String masterId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.EventType eventType) {
        return null;
    }
    
    /**
     * @param masterId ID of the associated series master event.
     * @param startTime Start time of the event in Europe/Berlin timezone.
     * @param endTime End time of the event in  Europe/Berlin timezone.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param masterId ID of the associated series master event.
     * @param startTime Start time of the event in Europe/Berlin timezone.
     * @param endTime End time of the event in  Europe/Berlin timezone.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param masterId ID of the associated series master event.
     * @param startTime Start time of the event in Europe/Berlin timezone.
     * @param endTime End time of the event in  Europe/Berlin timezone.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}