package de.oth.othappserver.model;

import java.lang.System;

/**
 * Filters which can be used for the <a href=\"/#operation/freeRooms\">RoomFinder endpoint</a>
 * @param buildings Available buildings. Values can be used for the `building` parameter.
 * @param equipment Available room equipment. Values can be used for the `equipment` parameter.
 * @param roomTypes Available room tyes. Values can be used for the `roomType` parameter.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lde/oth/othappserver/model/UniversityInfoRoomFinderFilter;", "", "buildings", "", "", "equipment", "Lde/oth/othappserver/model/Equipment;", "roomTypes", "Lde/oth/othappserver/model/RoomType;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBuildings", "()Ljava/util/List;", "getEquipment", "getRoomTypes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class UniversityInfoRoomFinderFilter {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "buildings", required = true)
    private final java.util.List<java.lang.String> buildings = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "equipment", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Equipment> equipment = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "roomTypes", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.RoomType> roomTypes = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getBuildings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Equipment> getEquipment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.RoomType> getRoomTypes() {
        return null;
    }
    
    public UniversityInfoRoomFinderFilter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> buildings, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Equipment> equipment, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.model.RoomType> roomTypes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Equipment> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.RoomType> component3() {
        return null;
    }
    
    /**
     * Filters which can be used for the <a href=\"/#operation/freeRooms\">RoomFinder endpoint</a>
     * @param buildings Available buildings. Values can be used for the `building` parameter.
     * @param equipment Available room equipment. Values can be used for the `equipment` parameter.
     * @param roomTypes Available room tyes. Values can be used for the `roomType` parameter.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.UniversityInfoRoomFinderFilter copy(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> buildings, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Equipment> equipment, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.model.RoomType> roomTypes) {
        return null;
    }
    
    /**
     * Filters which can be used for the <a href=\"/#operation/freeRooms\">RoomFinder endpoint</a>
     * @param buildings Available buildings. Values can be used for the `building` parameter.
     * @param equipment Available room equipment. Values can be used for the `equipment` parameter.
     * @param roomTypes Available room tyes. Values can be used for the `roomType` parameter.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Filters which can be used for the <a href=\"/#operation/freeRooms\">RoomFinder endpoint</a>
     * @param buildings Available buildings. Values can be used for the `building` parameter.
     * @param equipment Available room equipment. Values can be used for the `equipment` parameter.
     * @param roomTypes Available room tyes. Values can be used for the `roomType` parameter.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Filters which can be used for the <a href=\"/#operation/freeRooms\">RoomFinder endpoint</a>
     * @param buildings Available buildings. Values can be used for the `building` parameter.
     * @param equipment Available room equipment. Values can be used for the `equipment` parameter.
     * @param roomTypes Available room tyes. Values can be used for the `roomType` parameter.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}