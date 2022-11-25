package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\tH\u0016J0\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J0\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f0\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lde/oth/othappserver/rest/UniversityController;", "Lde/oth/othappserver/api/UniversityApi;", "Lde/oth/othappserver/api/SemesterApi;", "universityService", "Lde/oth/othappserver/service/IUniversityService;", "webuntisService", "Lde/oth/othappserver/service/IWebUntisService;", "(Lde/oth/othappserver/service/IUniversityService;Lde/oth/othappserver/service/IWebUntisService;)V", "info", "Lorg/springframework/http/ResponseEntity;", "Lde/oth/othappserver/model/UniversityInfo;", "rooms", "", "Lde/oth/othappserver/model/Room;", "semesterLectures", "Lde/oth/othappserver/model/Lecture;", "id", "", "startDate", "Ljava/time/LocalDate;", "endDate", "semesterTimetable", "Lde/oth/othappserver/model/TimetableItem;", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.web.bind.annotation.RestController()
public class UniversityController implements de.oth.othappserver.api.UniversityApi, de.oth.othappserver.api.SemesterApi {
    private final de.oth.othappserver.service.IUniversityService universityService = null;
    private final de.oth.othappserver.service.IWebUntisService webuntisService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.UniversityInfo> info() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Lecture>> semesterLectures(int id, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.TimetableItem>> semesterTimetable(int id, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Room>> rooms() {
        return null;
    }
    
    public UniversityController(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IUniversityService universityService, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IWebUntisService webuntisService) {
        super();
    }
}