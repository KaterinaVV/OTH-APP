package de.oth.othappserver.model;

import java.lang.System;

/**
 * A unique occurrence of the lecture
 * @param nextStartDateTime Start date time of the first upcomming lecture for this lecture occurrence
 * @param nextEndDateTime End date time of the first upcomming lecture for this lecture occurrence
 * @param semesters Semesters (Studiengang) offering the lecture
 * @param rooms Rooms where lecture is given
 * @param lecturers Lecturers giving the lecture
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006!"}, d2 = {"Lde/oth/othappserver/model/TimetableLectureUniqueOccurrences;", "", "nextStartDateTime", "Ljava/time/OffsetDateTime;", "nextEndDateTime", "semesters", "", "Lde/oth/othappserver/model/Semester;", "rooms", "Lde/oth/othappserver/model/Room;", "lecturers", "Lde/oth/othappserver/model/Lecturer;", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLecturers", "()Ljava/util/List;", "getNextEndDateTime", "()Ljava/time/OffsetDateTime;", "getNextStartDateTime", "getRooms", "getSemesters", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oth-app-server"})
public final class TimetableLectureUniqueOccurrences {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nextStartDateTime", required = true)
    private final java.time.OffsetDateTime nextStartDateTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "nextEndDateTime", required = true)
    private final java.time.OffsetDateTime nextEndDateTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "semesters", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Semester> semesters = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "rooms", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Room> rooms = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lecturers", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Lecturer> lecturers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getNextStartDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getNextEndDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Semester> getSemesters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Room> getRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Lecturer> getLecturers() {
        return null;
    }
    
    public TimetableLectureUniqueOccurrences(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime nextStartDateTime, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime nextEndDateTime, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Semester> semesters, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Room> rooms, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Lecturer> lecturers) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Semester> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Room> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Lecturer> component5() {
        return null;
    }
    
    /**
     * A unique occurrence of the lecture
     * @param nextStartDateTime Start date time of the first upcomming lecture for this lecture occurrence
     * @param nextEndDateTime End date time of the first upcomming lecture for this lecture occurrence
     * @param semesters Semesters (Studiengang) offering the lecture
     * @param rooms Rooms where lecture is given
     * @param lecturers Lecturers giving the lecture
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.TimetableLectureUniqueOccurrences copy(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime nextStartDateTime, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime nextEndDateTime, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Semester> semesters, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Room> rooms, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Lecturer> lecturers) {
        return null;
    }
    
    /**
     * A unique occurrence of the lecture
     * @param nextStartDateTime Start date time of the first upcomming lecture for this lecture occurrence
     * @param nextEndDateTime End date time of the first upcomming lecture for this lecture occurrence
     * @param semesters Semesters (Studiengang) offering the lecture
     * @param rooms Rooms where lecture is given
     * @param lecturers Lecturers giving the lecture
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A unique occurrence of the lecture
     * @param nextStartDateTime Start date time of the first upcomming lecture for this lecture occurrence
     * @param nextEndDateTime End date time of the first upcomming lecture for this lecture occurrence
     * @param semesters Semesters (Studiengang) offering the lecture
     * @param rooms Rooms where lecture is given
     * @param lecturers Lecturers giving the lecture
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A unique occurrence of the lecture
     * @param nextStartDateTime Start date time of the first upcomming lecture for this lecture occurrence
     * @param nextEndDateTime End date time of the first upcomming lecture for this lecture occurrence
     * @param semesters Semesters (Studiengang) offering the lecture
     * @param rooms Rooms where lecture is given
     * @param lecturers Lecturers giving the lecture
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}