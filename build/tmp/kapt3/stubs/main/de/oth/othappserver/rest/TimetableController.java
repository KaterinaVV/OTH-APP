package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u0010\u000eJ0\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lde/oth/othappserver/rest/TimetableController;", "Lde/oth/othappserver/api/TimetableApi;", "webUntisService", "Lde/oth/othappserver/service/IWebUntisService;", "(Lde/oth/othappserver/service/IWebUntisService;)V", "timetableLecture", "Lorg/springframework/http/ResponseEntity;", "Lde/oth/othappserver/model/TimetableLecture;", "id", "", "semesterId", "startDate", "Ljava/time/LocalDate;", "endDate", "(ILjava/lang/Integer;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lorg/springframework/http/ResponseEntity;", "timetableLectureSemesters", "", "Lde/oth/othappserver/model/Semester;", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.web.bind.annotation.RestController()
public class TimetableController implements de.oth.othappserver.api.TimetableApi {
    private final de.oth.othappserver.service.IWebUntisService webUntisService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.TimetableLecture> timetableLecture(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer semesterId, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Semester>> timetableLectureSemesters(int id, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    public TimetableController(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IWebUntisService webUntisService) {
        super();
    }
}