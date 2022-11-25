package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param holidays A list of available holidays.
 * @param semesterPeriods A list of available semester periods.
 * @param roomFinderFilter
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\bH\u00c6\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lde/oth/othappserver/model/UniversityInfo;", "", "holidays", "", "Lde/oth/othappserver/model/Holiday;", "semesterPeriods", "Lde/oth/othappserver/model/UniversityInfoSemesterPeriods;", "roomFinderFilter", "Lde/oth/othappserver/model/UniversityInfoRoomFinderFilter;", "(Ljava/util/List;Ljava/util/List;Lde/oth/othappserver/model/UniversityInfoRoomFinderFilter;)V", "getHolidays", "()Ljava/util/List;", "getRoomFinderFilter", "()Lde/oth/othappserver/model/UniversityInfoRoomFinderFilter;", "getSemesterPeriods", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oth-app-server"})
public final class UniversityInfo {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "holidays", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Holiday> holidays = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "semesterPeriods", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.UniversityInfoSemesterPeriods> semesterPeriods = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "roomFinderFilter", required = true)
    @javax.validation.Valid()
    private final de.oth.othappserver.model.UniversityInfoRoomFinderFilter roomFinderFilter = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 0)
    public final java.util.List<de.oth.othappserver.model.Holiday> getHolidays() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 0)
    public final java.util.List<de.oth.othappserver.model.UniversityInfoSemesterPeriods> getSemesterPeriods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.UniversityInfoRoomFinderFilter getRoomFinderFilter() {
        return null;
    }
    
    public UniversityInfo(@org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Holiday> holidays, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.UniversityInfoSemesterPeriods> semesterPeriods, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.UniversityInfoRoomFinderFilter roomFinderFilter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Holiday> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.UniversityInfoSemesterPeriods> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.UniversityInfoRoomFinderFilter component3() {
        return null;
    }
    
    /**
     * @param holidays A list of available holidays.
     * @param semesterPeriods A list of available semester periods.
     * @param roomFinderFilter
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.UniversityInfo copy(@org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Holiday> holidays, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.UniversityInfoSemesterPeriods> semesterPeriods, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.UniversityInfoRoomFinderFilter roomFinderFilter) {
        return null;
    }
    
    /**
     * @param holidays A list of available holidays.
     * @param semesterPeriods A list of available semester periods.
     * @param roomFinderFilter
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param holidays A list of available holidays.
     * @param semesterPeriods A list of available semester periods.
     * @param roomFinderFilter
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param holidays A list of available holidays.
     * @param semesterPeriods A list of available semester periods.
     * @param roomFinderFilter
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}