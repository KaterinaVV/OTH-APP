package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
 * @param name The complete faculty's name.
 * @param feeds The Faculty's RSS feeds.
 * @param semesters The Faculty's Semesters.
 * @param lecturer The Faculty's Lecturers.
 * @param color A faculty's color in hex.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JY\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006#"}, d2 = {"Lde/oth/othappserver/model/FacultyDetail;", "", "identifier", "", "name", "feeds", "", "Lde/oth/othappserver/model/Feed;", "semesters", "Lde/oth/othappserver/model/Semester;", "lecturer", "Lde/oth/othappserver/model/Lecturer;", "color", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getFeeds", "()Ljava/util/List;", "getIdentifier", "getLecturer", "getName", "getSemesters", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class FacultyDetail {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "identifier", required = true)
    private final java.lang.String identifier = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name", required = true)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "feeds", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Feed> feeds = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "semesters", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Semester> semesters = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lecturer", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Lecturer> lecturer = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "color")
    private final java.lang.String color = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 1, max = 3)
    public final java.lang.String getIdentifier() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 1)
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Feed> getFeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Semester> getSemesters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Lecturer> getLecturer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 6)
    @javax.validation.constraints.Pattern(regexp = "[\\dA-F]{6}")
    public final java.lang.String getColor() {
        return null;
    }
    
    public FacultyDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Feed> feeds, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Semester> semesters, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Lecturer> lecturer, @org.jetbrains.annotations.Nullable()
    java.lang.String color) {
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
    public final java.util.List<de.oth.othappserver.model.Feed> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Semester> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Lecturer> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param feeds The Faculty's RSS feeds.
     * @param semesters The Faculty's Semesters.
     * @param lecturer The Faculty's Lecturers.
     * @param color A faculty's color in hex.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.FacultyDetail copy(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Feed> feeds, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Semester> semesters, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Lecturer> lecturer, @org.jetbrains.annotations.Nullable()
    java.lang.String color) {
        return null;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param feeds The Faculty's RSS feeds.
     * @param semesters The Faculty's Semesters.
     * @param lecturer The Faculty's Lecturers.
     * @param color A faculty's color in hex.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param feeds The Faculty's RSS feeds.
     * @param semesters The Faculty's Semesters.
     * @param lecturer The Faculty's Lecturers.
     * @param color A faculty's color in hex.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param feeds The Faculty's RSS feeds.
     * @param semesters The Faculty's Semesters.
     * @param lecturer The Faculty's Lecturers.
     * @param color A faculty's color in hex.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}