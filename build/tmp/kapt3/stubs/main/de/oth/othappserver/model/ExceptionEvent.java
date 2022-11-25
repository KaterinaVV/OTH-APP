package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param name Name of the event
 * @param categories 
 * @param startTime Start time of the event/series in Europe/Berlin timezone.
 * @param endTime End time of the event/series in  Europe/Berlin timezone.
 * @param isAllDay True if the event takes the whole day
 * @param masterId ID of the associated series master event.
 * @param location String describing the location of the event (no actual coordinates)
 * @param organizer 
 * @param description (HTML) description of the event
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0083\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016\u00a8\u00064"}, d2 = {"Lde/oth/othappserver/model/ExceptionEvent;", "Lde/oth/othappserver/model/Event;", "name", "", "categories", "", "startTime", "endTime", "isAllDay", "", "masterId", "eventId", "eventType", "Lde/oth/othappserver/model/EventType;", "location", "organizer", "Lde/oth/othappserver/model/Organizer;", "description", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lde/oth/othappserver/model/EventType;Ljava/lang/String;Lde/oth/othappserver/model/Organizer;Ljava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getEndTime", "getEventId", "getEventType", "()Lde/oth/othappserver/model/EventType;", "()Z", "getLocation", "getMasterId", "getName", "getOrganizer", "()Lde/oth/othappserver/model/Organizer;", "getStartTime", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "oth-app-server"})
public final class ExceptionEvent implements de.oth.othappserver.model.Event {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name", required = true)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "categories", required = true)
    private final java.util.List<java.lang.String> categories = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "startTime", required = true)
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "endTime", required = true)
    private final java.lang.String endTime = null;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "isAllDay", required = true)
    private final boolean isAllDay = false;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "masterId", required = true)
    private final java.lang.String masterId = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "eventId", required = true)
    private final java.lang.String eventId = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "eventType", required = true)
    @javax.validation.Valid()
    private final de.oth.othappserver.model.EventType eventType = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "location")
    private final java.lang.String location = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "organizer")
    @javax.validation.Valid()
    private final de.oth.othappserver.model.Organizer organizer = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "description")
    private final java.lang.String description = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
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
    
    public final boolean isAllDay() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMasterId() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.oth.othappserver.model.Organizer getOrganizer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public ExceptionEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, boolean isAllDay, @org.jetbrains.annotations.NotNull()
    java.lang.String masterId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.EventType eventType, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    de.oth.othappserver.model.Organizer organizer, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component2() {
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
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.EventType component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.oth.othappserver.model.Organizer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * @param name Name of the event
     * @param categories 
     * @param startTime Start time of the event/series in Europe/Berlin timezone.
     * @param endTime End time of the event/series in  Europe/Berlin timezone.
     * @param isAllDay True if the event takes the whole day
     * @param masterId ID of the associated series master event.
     * @param location String describing the location of the event (no actual coordinates)
     * @param organizer 
     * @param description (HTML) description of the event
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.ExceptionEvent copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, boolean isAllDay, @org.jetbrains.annotations.NotNull()
    java.lang.String masterId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.EventType eventType, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    de.oth.othappserver.model.Organizer organizer, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
        return null;
    }
    
    /**
     * @param name Name of the event
     * @param categories 
     * @param startTime Start time of the event/series in Europe/Berlin timezone.
     * @param endTime End time of the event/series in  Europe/Berlin timezone.
     * @param isAllDay True if the event takes the whole day
     * @param masterId ID of the associated series master event.
     * @param location String describing the location of the event (no actual coordinates)
     * @param organizer 
     * @param description (HTML) description of the event
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param name Name of the event
     * @param categories 
     * @param startTime Start time of the event/series in Europe/Berlin timezone.
     * @param endTime End time of the event/series in  Europe/Berlin timezone.
     * @param isAllDay True if the event takes the whole day
     * @param masterId ID of the associated series master event.
     * @param location String describing the location of the event (no actual coordinates)
     * @param organizer 
     * @param description (HTML) description of the event
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param name Name of the event
     * @param categories 
     * @param startTime Start time of the event/series in Europe/Berlin timezone.
     * @param endTime End time of the event/series in  Europe/Berlin timezone.
     * @param isAllDay True if the event takes the whole day
     * @param masterId ID of the associated series master event.
     * @param location String describing the location of the event (no actual coordinates)
     * @param organizer 
     * @param description (HTML) description of the event
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}