package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\\\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00112\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lde/oth/othappserver/rest/RoomFinderController;", "Lde/oth/othappserver/api/RoomFinderApi;", "roomFinderService", "Lde/oth/othappserver/service/IRoomFinderService;", "webUntis", "Lde/oth/othappserver/service/IWebUntisService;", "(Lde/oth/othappserver/service/IRoomFinderService;Lde/oth/othappserver/service/IWebUntisService;)V", "roomTypesMap", "", "Lde/oth/othappserver/model/RoomType;", "", "convertFreeTimeToLocalTime", "Ljava/time/LocalTime;", "time", "convertStringToTime", "freeRooms", "Lorg/springframework/http/ResponseEntity;", "", "Lde/oth/othappserver/model/FreeRoomBuilding;", "start", "date", "Ljava/time/LocalDate;", "end", "building", "equipment", "", "roomType", "Companion", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.web.bind.annotation.RestController()
public class RoomFinderController implements de.oth.othappserver.api.RoomFinderApi {
    private final java.util.Map<de.oth.othappserver.model.RoomType, java.lang.String> roomTypesMap = null;
    private final de.oth.othappserver.service.IRoomFinderService roomFinderService = null;
    private final de.oth.othappserver.service.IWebUntisService webUntis = null;
    private static final java.time.format.DateTimeFormatter SINGLE_HOUR_DATE_PATTERN = null;
    private static final java.time.LocalTime END_DATE = null;
    private static final java.time.LocalTime START_DATE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CIP_POOL = "CIP-Pool";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOERSAAL = "H\u00f6rsaal";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLZ = "PLZ";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.rest.RoomFinderController.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.FreeRoomBuilding>> freeRooms(@org.jetbrains.annotations.Nullable()
    java.lang.String start, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate date, @org.jetbrains.annotations.Nullable()
    java.lang.String end, @org.jetbrains.annotations.Nullable()
    java.lang.String building, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> equipment, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends de.oth.othappserver.model.RoomType> roomType) {
        return null;
    }
    
    private final java.time.LocalTime convertStringToTime(java.lang.String time) {
        return null;
    }
    
    private final java.time.LocalTime convertFreeTimeToLocalTime(java.lang.String time) {
        return null;
    }
    
    public RoomFinderController(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IRoomFinderService roomFinderService, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IWebUntisService webUntis) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lde/oth/othappserver/rest/RoomFinderController$Companion;", "", "()V", "CIP_POOL", "", "END_DATE", "Ljava/time/LocalTime;", "HOERSAAL", "PLZ", "SINGLE_HOUR_DATE_PATTERN", "Ljava/time/format/DateTimeFormatter;", "START_DATE", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}