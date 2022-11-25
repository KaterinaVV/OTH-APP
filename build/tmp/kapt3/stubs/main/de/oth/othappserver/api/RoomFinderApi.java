package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001Jh\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004H\u0017\u00a8\u0006\u0010"}, d2 = {"Lde/oth/othappserver/api/RoomFinderApi;", "", "freeRooms", "Lorg/springframework/http/ResponseEntity;", "", "Lde/oth/othappserver/model/FreeRoomBuilding;", "start", "", "date", "Ljava/time/LocalDate;", "end", "building", "equipment", "", "roomType", "Lde/oth/othappserver/model/RoomType;", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface RoomFinderApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/freerooms"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.FreeRoomBuilding>> freeRooms(@org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "start", required = false)
    @javax.validation.constraints.Pattern(regexp = "^((\\d\\d:\\d\\d)(:\\d\\d)?)|(now)$")
    java.lang.String start, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "date", required = false)
    java.time.LocalDate date, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "end", required = false)
    @javax.validation.constraints.Pattern(regexp = "^\\d\\d:\\d\\d$")
    java.lang.String end, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "building", required = false)
    java.lang.String building, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "equipment", required = false)
    java.util.List<java.lang.Integer> equipment, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "roomType", required = false)
    java.util.List<? extends de.oth.othappserver.model.RoomType> roomType);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/freerooms"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.FreeRoomBuilding>> freeRooms(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.RoomFinderApi $this, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "start", required = false)
        @javax.validation.constraints.Pattern(regexp = "^((\\d\\d:\\d\\d)(:\\d\\d)?)|(now)$")
        java.lang.String start, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "date", required = false)
        java.time.LocalDate date, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "end", required = false)
        @javax.validation.constraints.Pattern(regexp = "^\\d\\d:\\d\\d$")
        java.lang.String end, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "building", required = false)
        java.lang.String building, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "equipment", required = false)
        java.util.List<java.lang.Integer> equipment, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "roomType", required = false)
        java.util.List<? extends de.oth.othappserver.model.RoomType> roomType) {
            return null;
        }
    }
}