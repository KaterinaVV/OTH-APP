package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param email E-Mail address of the organizer. Uniquely identifies a organizer.
 * @param name Name of the organizer
 * @param description Description of the organizer
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lde/oth/othappserver/model/Organizer;", "", "email", "", "name", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getEmail", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class Organizer {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "email", required = true)
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "description")
    private final java.lang.String description = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public Organizer(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * @param email E-Mail address of the organizer. Uniquely identifies a organizer.
     * @param name Name of the organizer
     * @param description Description of the organizer
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Organizer copy(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
        return null;
    }
    
    /**
     * @param email E-Mail address of the organizer. Uniquely identifies a organizer.
     * @param name Name of the organizer
     * @param description Description of the organizer
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param email E-Mail address of the organizer. Uniquely identifies a organizer.
     * @param name Name of the organizer
     * @param description Description of the organizer
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param email E-Mail address of the organizer. Uniquely identifies a organizer.
     * @param name Name of the organizer
     * @param description Description of the organizer
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}