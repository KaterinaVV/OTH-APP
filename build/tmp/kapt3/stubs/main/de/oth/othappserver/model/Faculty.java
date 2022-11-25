package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
 * @param name The complete faculty's name.
 * @param color A faculty's color in hex.
 * @param feeds The Faculty's RSS feeds.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lde/oth/othappserver/model/Faculty;", "", "identifier", "", "name", "color", "feeds", "", "Lde/oth/othappserver/model/Feed;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getColor", "()Ljava/lang/String;", "getFeeds", "()Ljava/util/List;", "getIdentifier", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class Faculty {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "identifier", required = true)
    private final java.lang.String identifier = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name", required = true)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "color")
    private final java.lang.String color = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "feeds")
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Feed> feeds = null;
    
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
    
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 6)
    @javax.validation.constraints.Pattern(regexp = "[\\dA-F]{6}")
    public final java.lang.String getColor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<de.oth.othappserver.model.Feed> getFeeds() {
        return null;
    }
    
    public Faculty(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.util.List<de.oth.othappserver.model.Feed> feeds) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<de.oth.othappserver.model.Feed> component4() {
        return null;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param color A faculty's color in hex.
     * @param feeds The Faculty's RSS feeds.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Faculty copy(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    java.util.List<de.oth.othappserver.model.Feed> feeds) {
        return null;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param color A faculty's color in hex.
     * @param feeds The Faculty's RSS feeds.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param color A faculty's color in hex.
     * @param feeds The Faculty's RSS feeds.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param identifier A short representation of the faculty's name. Uniquely identifies a faculty.
     * @param name The complete faculty's name.
     * @param color A faculty's color in hex.
     * @param feeds The Faculty's RSS feeds.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}