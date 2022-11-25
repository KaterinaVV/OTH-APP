package de.oth.othappserver.webuntis;

import java.lang.System;

/**
 * WebUntis Timetable info.
 *
 * @param startTime Start time of the timetable period
 * @param endTime End time of the timetable period
 * @param su List of subjects/lectures
 * @param ro List of rooms
 * @param kl List of klassen/semesters
 * @param te List of teachers/lecturers
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c2\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003Jq\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\u0018\u00100\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001a\u00a8\u00064"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisTimetable;", "Lde/oth/othappserver/webuntis/BaseWebUntisResource;", "id", "", "date", "", "startTime", "endTime", "su", "", "Lde/oth/othappserver/webuntis/NamedWebUntisResourceOptional;", "ro", "kl", "te", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "endDateTime", "Ljava/time/OffsetDateTime;", "getEndDateTime", "()Ljava/time/OffsetDateTime;", "getEndTime", "()Ljava/lang/String;", "getId", "()I", "getKl", "()Ljava/util/List;", "setKl", "(Ljava/util/List;)V", "getRo", "setRo", "startDateTime", "getStartDateTime", "getStartTime", "getSu", "getTe", "setTe", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "equalsUniqueOccurrence", "lectureId", "hashCode", "toString", "oth-app-server"})
@com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY)
public final class WebUntisTimetable extends de.oth.othappserver.webuntis.BaseWebUntisResource {
    @org.jetbrains.annotations.NotNull()
    private final java.time.OffsetDateTime startDateTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.OffsetDateTime endDateTime = null;
    private final int id = 0;
    private final java.lang.String date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> su = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> ro;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> kl;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> te;
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getStartDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getEndDateTime() {
        return null;
    }
    
    /**
     * Check whether the two WebUntis timetable items are two recurring occurrences of the same unique lecture occurrence.
     * This is the case when they share the same subject, day of week and timeslot.
     *
     * @param other The other WebUntis timetable item
     * @param lectureId The id of the lecture/subject to compare
     */
    public final boolean equalsUniqueOccurrence(@org.jetbrains.annotations.Nullable()
    java.lang.Object other, int lectureId) {
        return false;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
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
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> getSu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> getRo() {
        return null;
    }
    
    public final void setRo(@org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> getKl() {
        return null;
    }
    
    public final void setKl(@org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> getTe() {
        return null;
    }
    
    public final void setTe(@org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> p0) {
    }
    
    public WebUntisTimetable(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> su, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> ro, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> kl, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> te) {
        super(0);
    }
    
    public final int component1() {
        return 0;
    }
    
    private final java.lang.String component2() {
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
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> component8() {
        return null;
    }
    
    /**
     * WebUntis Timetable info.
     *
     * @param startTime Start time of the timetable period
     * @param endTime End time of the timetable period
     * @param su List of subjects/lectures
     * @param ro List of rooms
     * @param kl List of klassen/semesters
     * @param te List of teachers/lecturers
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.webuntis.WebUntisTimetable copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> su, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> ro, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> kl, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.webuntis.NamedWebUntisResourceOptional> te) {
        return null;
    }
    
    /**
     * WebUntis Timetable info.
     *
     * @param startTime Start time of the timetable period
     * @param endTime End time of the timetable period
     * @param su List of subjects/lectures
     * @param ro List of rooms
     * @param kl List of klassen/semesters
     * @param te List of teachers/lecturers
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * WebUntis Timetable info.
     *
     * @param startTime Start time of the timetable period
     * @param endTime End time of the timetable period
     * @param su List of subjects/lectures
     * @param ro List of rooms
     * @param kl List of klassen/semesters
     * @param te List of teachers/lecturers
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * WebUntis Timetable info.
     *
     * @param startTime Start time of the timetable period
     * @param endTime End time of the timetable period
     * @param su List of subjects/lectures
     * @param ro List of rooms
     * @param kl List of klassen/semesters
     * @param te List of teachers/lecturers
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}