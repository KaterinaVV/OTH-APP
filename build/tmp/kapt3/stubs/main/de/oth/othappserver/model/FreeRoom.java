package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param name Short name of Room.
 * @param longName Name of Room with description.
 * @param type 
 * @param equipment List of room equipment.
 * @param times List of objects with start and end times representing the times intervals at which a room is not occupied.
 * @param floor Floor of the building the room is contained in. `null` if the floor could not be determined.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\tH\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lde/oth/othappserver/model/FreeRoom;", "", "name", "", "longName", "type", "Lde/oth/othappserver/model/RoomType;", "equipment", "", "", "times", "Lde/oth/othappserver/model/FreeTime;", "floor", "(Ljava/lang/String;Ljava/lang/String;Lde/oth/othappserver/model/RoomType;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getEquipment", "()Ljava/util/List;", "getFloor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLongName", "()Ljava/lang/String;", "getName", "getTimes", "getType", "()Lde/oth/othappserver/model/RoomType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lde/oth/othappserver/model/RoomType;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lde/oth/othappserver/model/FreeRoom;", "equals", "", "other", "hashCode", "toString", "oth-app-server"})
public final class FreeRoom {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name", required = true)
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "longName", required = true)
    private final java.lang.String longName = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type", required = true)
    @javax.validation.Valid()
    private final de.oth.othappserver.model.RoomType type = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "equipment", required = true)
    private final java.util.List<java.lang.Integer> equipment = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "times", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.FreeTime> times = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "floor")
    private final java.lang.Integer floor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLongName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.RoomType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 0)
    public final java.util.List<java.lang.Integer> getEquipment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 1)
    public final java.util.List<de.oth.othappserver.model.FreeTime> getTimes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFloor() {
        return null;
    }
    
    public FreeRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String longName, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.RoomType type, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> equipment, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.FreeTime> times, @org.jetbrains.annotations.Nullable()
    java.lang.Integer floor) {
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
    public final de.oth.othappserver.model.RoomType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.FreeTime> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    /**
     * @param name Short name of Room.
     * @param longName Name of Room with description.
     * @param type 
     * @param equipment List of room equipment.
     * @param times List of objects with start and end times representing the times intervals at which a room is not occupied.
     * @param floor Floor of the building the room is contained in. `null` if the floor could not be determined.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.FreeRoom copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String longName, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.RoomType type, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> equipment, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.FreeTime> times, @org.jetbrains.annotations.Nullable()
    java.lang.Integer floor) {
        return null;
    }
    
    /**
     * @param name Short name of Room.
     * @param longName Name of Room with description.
     * @param type 
     * @param equipment List of room equipment.
     * @param times List of objects with start and end times representing the times intervals at which a room is not occupied.
     * @param floor Floor of the building the room is contained in. `null` if the floor could not be determined.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param name Short name of Room.
     * @param longName Name of Room with description.
     * @param type 
     * @param equipment List of room equipment.
     * @param times List of objects with start and end times representing the times intervals at which a room is not occupied.
     * @param floor Floor of the building the room is contained in. `null` if the floor could not be determined.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param name Short name of Room.
     * @param longName Name of Room with description.
     * @param type 
     * @param equipment List of room equipment.
     * @param times List of objects with start and end times representing the times intervals at which a room is not occupied.
     * @param floor Floor of the building the room is contained in. `null` if the floor could not be determined.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}