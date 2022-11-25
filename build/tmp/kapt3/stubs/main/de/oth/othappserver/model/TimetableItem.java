package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param id Id of the timetable item.
 * @param startDateTime Start date time of the timetable occurrence.
 * @param endDateTime Start date time of the timetable occurrence.
 * @param rooms 
 * @param lecture Id of the lecture.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010JH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\""}, d2 = {"Lde/oth/othappserver/model/TimetableItem;", "", "id", "", "startDateTime", "Ljava/time/OffsetDateTime;", "endDateTime", "rooms", "", "lecture", "(ILjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/util/List;Ljava/lang/Integer;)V", "getEndDateTime", "()Ljava/time/OffsetDateTime;", "getId", "()I", "getLecture", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRooms", "()Ljava/util/List;", "getStartDateTime", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/util/List;Ljava/lang/Integer;)Lde/oth/othappserver/model/TimetableItem;", "equals", "", "other", "hashCode", "toString", "", "oth-app-server"})
public final class TimetableItem {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", required = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "startDateTime", required = true)
    private final java.time.OffsetDateTime startDateTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "endDateTime", required = true)
    private final java.time.OffsetDateTime endDateTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "rooms", required = true)
    private final java.util.List<java.lang.Integer> rooms = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lecture")
    private final java.lang.Integer lecture = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getStartDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getEndDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLecture() {
        return null;
    }
    
    public TimetableItem(int id, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime startDateTime, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime endDateTime, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> rooms, @org.jetbrains.annotations.Nullable()
    java.lang.Integer lecture) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    /**
     * @param id Id of the timetable item.
     * @param startDateTime Start date time of the timetable occurrence.
     * @param endDateTime Start date time of the timetable occurrence.
     * @param rooms 
     * @param lecture Id of the lecture.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.TimetableItem copy(int id, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime startDateTime, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime endDateTime, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> rooms, @org.jetbrains.annotations.Nullable()
    java.lang.Integer lecture) {
        return null;
    }
    
    /**
     * @param id Id of the timetable item.
     * @param startDateTime Start date time of the timetable occurrence.
     * @param endDateTime Start date time of the timetable occurrence.
     * @param rooms 
     * @param lecture Id of the lecture.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param id Id of the timetable item.
     * @param startDateTime Start date time of the timetable occurrence.
     * @param endDateTime Start date time of the timetable occurrence.
     * @param rooms 
     * @param lecture Id of the lecture.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param id Id of the timetable item.
     * @param startDateTime Start date time of the timetable occurrence.
     * @param endDateTime Start date time of the timetable occurrence.
     * @param rooms 
     * @param lecture Id of the lecture.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}