package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u000b\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lde/oth/othappserver/rest/FacultyController;", "Lde/oth/othappserver/api/FacultyApi;", "facultyService", "Lde/oth/othappserver/service/IFacultyService;", "webUntisService", "Lde/oth/othappserver/service/IWebUntisService;", "(Lde/oth/othappserver/service/IFacultyService;Lde/oth/othappserver/service/IWebUntisService;)V", "faculties", "Lorg/springframework/http/ResponseEntity;", "", "Lde/oth/othappserver/model/Faculty;", "faculty", "Lde/oth/othappserver/model/FacultyDetail;", "identifier", "", "facultyLectures", "Lde/oth/othappserver/model/Lecture;", "startDate", "Ljava/time/LocalDate;", "endDate", "filterSemesters", "Lde/oth/othappserver/model/Semester;", "semesters", "Lde/oth/othappserver/webuntis/WebUntisSemester;", "Lde/oth/othappserver/tables/records/FacultyRecord;", "getFeeds", "Lde/oth/othappserver/model/Feed;", "feeds", "Lde/oth/othappserver/tables/records/FeedRecord;", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.web.bind.annotation.RestController()
public class FacultyController implements de.oth.othappserver.api.FacultyApi {
    private final de.oth.othappserver.service.IFacultyService facultyService = null;
    private final de.oth.othappserver.service.IWebUntisService webUntisService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Faculty>> faculties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.FacultyDetail> faculty(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Lecture>> facultyLectures(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    private final java.util.List<de.oth.othappserver.model.Feed> getFeeds(java.util.List<? extends de.oth.othappserver.tables.records.FeedRecord> feeds) {
        return null;
    }
    
    private final java.util.List<de.oth.othappserver.model.Semester> filterSemesters(java.util.List<de.oth.othappserver.webuntis.WebUntisSemester> semesters, de.oth.othappserver.tables.records.FacultyRecord faculty) {
        return null;
    }
    
    public FacultyController(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IFacultyService facultyService, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IWebUntisService webUntisService) {
        super();
    }
}