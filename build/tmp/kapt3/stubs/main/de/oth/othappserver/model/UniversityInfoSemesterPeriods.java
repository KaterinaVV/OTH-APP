package de.oth.othappserver.model;

import java.lang.System;

/**
 * Period of the current semester. Borders are inclusive.
 * @param name Arbitrary name of the semester period.
 * @param start Start date of the semester period.
 * @param end End date of the semester period.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lde/oth/othappserver/model/UniversityInfoSemesterPeriods;", "", "name", "", "start", "Ljava/time/LocalDate;", "end", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "getEnd", "()Ljava/time/LocalDate;", "getName", "()Ljava/lang/String;", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class UniversityInfoSemesterPeriods {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name", required = true)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "start", required = true)
    @javax.validation.Valid()
    private final java.time.LocalDate start = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "end", required = true)
    @javax.validation.Valid()
    private final java.time.LocalDate end = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getEnd() {
        return null;
    }
    
    public UniversityInfoSemesterPeriods(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component3() {
        return null;
    }
    
    /**
     * Period of the current semester. Borders are inclusive.
     * @param name Arbitrary name of the semester period.
     * @param start Start date of the semester period.
     * @param end End date of the semester period.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.UniversityInfoSemesterPeriods copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate end) {
        return null;
    }
    
    /**
     * Period of the current semester. Borders are inclusive.
     * @param name Arbitrary name of the semester period.
     * @param start Start date of the semester period.
     * @param end End date of the semester period.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Period of the current semester. Borders are inclusive.
     * @param name Arbitrary name of the semester period.
     * @param start Start date of the semester period.
     * @param end End date of the semester period.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Period of the current semester. Borders are inclusive.
     * @param name Arbitrary name of the semester period.
     * @param start Start date of the semester period.
     * @param end End date of the semester period.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}