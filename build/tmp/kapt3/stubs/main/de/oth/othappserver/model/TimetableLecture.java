package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param id Id of the lecture
 * @param name Name of the lecture
 * @param shortName Short name of the lecture
 * @param uniqueOccurrences List of unique occurrences of the given lecture. Unique occurrences are defined by the same weekday and timeslot. In most cases, there will be one occurrence representing the lecture slot and one or more occurrences representing the slots for the exercises.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lde/oth/othappserver/model/TimetableLecture;", "", "id", "", "name", "", "shortName", "uniqueOccurrences", "", "Lde/oth/othappserver/model/TimetableLectureUniqueOccurrences;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getShortName", "getUniqueOccurrences", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "oth-app-server"})
public final class TimetableLecture {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", required = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name", required = true)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "shortName", required = true)
    private final java.lang.String shortName = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "uniqueOccurrences", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.TimetableLectureUniqueOccurrences> uniqueOccurrences = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShortName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 0)
    public final java.util.List<de.oth.othappserver.model.TimetableLectureUniqueOccurrences> getUniqueOccurrences() {
        return null;
    }
    
    public TimetableLecture(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String shortName, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.TimetableLectureUniqueOccurrences> uniqueOccurrences) {
        super();
    }
    
    public final int component1() {
        return 0;
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
    public final java.util.List<de.oth.othappserver.model.TimetableLectureUniqueOccurrences> component4() {
        return null;
    }
    
    /**
     * @param id Id of the lecture
     * @param name Name of the lecture
     * @param shortName Short name of the lecture
     * @param uniqueOccurrences List of unique occurrences of the given lecture. Unique occurrences are defined by the same weekday and timeslot. In most cases, there will be one occurrence representing the lecture slot and one or more occurrences representing the slots for the exercises.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.TimetableLecture copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String shortName, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.TimetableLectureUniqueOccurrences> uniqueOccurrences) {
        return null;
    }
    
    /**
     * @param id Id of the lecture
     * @param name Name of the lecture
     * @param shortName Short name of the lecture
     * @param uniqueOccurrences List of unique occurrences of the given lecture. Unique occurrences are defined by the same weekday and timeslot. In most cases, there will be one occurrence representing the lecture slot and one or more occurrences representing the slots for the exercises.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param id Id of the lecture
     * @param name Name of the lecture
     * @param shortName Short name of the lecture
     * @param uniqueOccurrences List of unique occurrences of the given lecture. Unique occurrences are defined by the same weekday and timeslot. In most cases, there will be one occurrence representing the lecture slot and one or more occurrences representing the slots for the exercises.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param id Id of the lecture
     * @param name Name of the lecture
     * @param shortName Short name of the lecture
     * @param uniqueOccurrences List of unique occurrences of the given lecture. Unique occurrences are defined by the same weekday and timeslot. In most cases, there will be one occurrence representing the lecture slot and one or more occurrences representing the slots for the exercises.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}