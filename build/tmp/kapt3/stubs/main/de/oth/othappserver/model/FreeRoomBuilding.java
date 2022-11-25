package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param letter Letter of the building.
 * @param faculties Name of the building.
 * @param rooms A list of available and free rooms.
 * @param plans
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H\u00c6\u0003JE\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lde/oth/othappserver/model/FreeRoomBuilding;", "", "letter", "", "faculties", "", "rooms", "Lde/oth/othappserver/model/FreeRoom;", "plans", "Lde/oth/othappserver/model/FreeRoomBuildingPlans;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFaculties", "()Ljava/util/List;", "getLetter", "()Ljava/lang/String;", "getPlans", "getRooms", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class FreeRoomBuilding {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "letter", required = true)
    private final java.lang.String letter = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "faculties", required = true)
    private final java.util.List<java.lang.String> faculties = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "rooms", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.FreeRoom> rooms = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "plans")
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.FreeRoomBuildingPlans> plans = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 1, max = 1)
    public final java.lang.String getLetter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 1)
    public final java.util.List<java.lang.String> getFaculties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 0)
    public final java.util.List<de.oth.othappserver.model.FreeRoom> getRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<de.oth.othappserver.model.FreeRoomBuildingPlans> getPlans() {
        return null;
    }
    
    public FreeRoomBuilding(@org.jetbrains.annotations.NotNull()
    java.lang.String letter, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> faculties, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.FreeRoom> rooms, @org.jetbrains.annotations.Nullable()
    java.util.List<de.oth.othappserver.model.FreeRoomBuildingPlans> plans) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.FreeRoom> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<de.oth.othappserver.model.FreeRoomBuildingPlans> component4() {
        return null;
    }
    
    /**
     * @param letter Letter of the building.
     * @param faculties Name of the building.
     * @param rooms A list of available and free rooms.
     * @param plans
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.FreeRoomBuilding copy(@org.jetbrains.annotations.NotNull()
    java.lang.String letter, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> faculties, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.FreeRoom> rooms, @org.jetbrains.annotations.Nullable()
    java.util.List<de.oth.othappserver.model.FreeRoomBuildingPlans> plans) {
        return null;
    }
    
    /**
     * @param letter Letter of the building.
     * @param faculties Name of the building.
     * @param rooms A list of available and free rooms.
     * @param plans
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param letter Letter of the building.
     * @param faculties Name of the building.
     * @param rooms A list of available and free rooms.
     * @param plans
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param letter Letter of the building.
     * @param faculties Name of the building.
     * @param rooms A list of available and free rooms.
     * @param plans
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}