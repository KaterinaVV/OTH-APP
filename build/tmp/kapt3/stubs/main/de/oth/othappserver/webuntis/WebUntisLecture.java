package de.oth.othappserver.webuntis;

import java.lang.System;

/**
 * A WebUntis resource representing a lecture.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisLecture;", "Lde/oth/othappserver/webuntis/NamedWebUntisResource;", "id", "", "name", "", "longName", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getLongName", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getLectureName", "hashCode", "toModel", "Lde/oth/othappserver/model/Lecture;", "toString", "oth-app-server"})
public final class WebUntisLecture extends de.oth.othappserver.webuntis.NamedWebUntisResource {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String longName = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Lecture toModel() {
        return null;
    }
    
    /**
     * Returns the string after the first '_'.
     * Most lecture names are of the pattern 'XYZ_NAME' where XYZ is the faculties shortname e.g. IM.
     */
    private final java.lang.String getLectureName(java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLongName() {
        return null;
    }
    
    public WebUntisLecture(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String longName) {
        super(0, null, null);
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
    
    /**
     * A WebUntis resource representing a lecture.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.webuntis.WebUntisLecture copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String longName) {
        return null;
    }
    
    /**
     * A WebUntis resource representing a lecture.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A WebUntis resource representing a lecture.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}