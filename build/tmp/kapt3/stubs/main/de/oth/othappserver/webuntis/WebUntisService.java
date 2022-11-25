package de.oth.othappserver.webuntis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0017J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bH\u0017J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000bH\u0017J*\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000bH\u0017J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\'0&H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010)\u001a\u00020\tH\u0002J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0016H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u000bH\u0017J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bH\u0017J&\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u000bH\u0017J\u000e\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000bH\u0017J2\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00105\u001a\u0002062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017J3\u00107\u001a\u0002082\u0006\u0010\u0013\u001a\u00020\u00142\b\u00109\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017\u00a2\u0006\u0002\u0010:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R;\u0010\u0007\u001a/\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \n*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\b\u00a2\u0006\u0002\b\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisService;", "Lde/oth/othappserver/service/IWebUntisService;", "webUntisClient", "Lde/oth/othappserver/webuntis/WebUntisClient;", "roomFinderService", "Lde/oth/othappserver/service/IRoomFinderService;", "(Lde/oth/othappserver/webuntis/WebUntisClient;Lde/oth/othappserver/service/IRoomFinderService;)V", "roomsTimetableCache", "Lcom/github/benmanes/caffeine/cache/LoadingCache;", "", "kotlin.jvm.PlatformType", "", "Lde/oth/othappserver/webuntis/WebUntisTimetable;", "Lorg/checkerframework/checker/nullness/qual/NonNull;", "convertStringToTime", "Ljava/time/LocalTime;", "time", "doGetSemesterLectures", "Lde/oth/othappserver/webuntis/BaseWebUntisResource;", "id", "", "startDate", "Ljava/time/LocalDate;", "endDate", "getCurrentSchoolyear", "Lde/oth/othappserver/webuntis/WebUntisSchoolyear;", "getFaculties", "Lde/oth/othappserver/webuntis/WebUntisFaculty;", "getFacultyLectures", "Lde/oth/othappserver/model/Lecture;", "facultyId", "getHolidays", "Lde/oth/othappserver/webuntis/WebUntisHoliday;", "getLectureSemesters", "Lde/oth/othappserver/model/Semester;", "getLectures", "Lde/oth/othappserver/webuntis/WebUntisLecture;", "getRoomCache", "Lcom/github/benmanes/caffeine/cache/Cache;", "", "getRoomTimeTable", "key", "getRoomTimetable", "date", "getRooms", "Lde/oth/othappserver/webuntis/WebUntisRoom;", "getSchoolyears", "getSemesterLectures", "getSemesters", "Lde/oth/othappserver/webuntis/WebUntisSemester;", "getTeachers", "Lde/oth/othappserver/webuntis/WebUntisTeacher;", "getTimetable", "type", "Lde/oth/othappserver/webuntis/WebUnitsResourceType;", "getTimetableLecture", "Lde/oth/othappserver/model/TimetableLecture;", "semesterId", "(ILjava/lang/Integer;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lde/oth/othappserver/model/TimetableLecture;", "Companion", "oth-app-server"})
@org.springframework.cache.annotation.CacheConfig(cacheNames = {"dayCache"}, keyGenerator = "customKeyGenerator")
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.stereotype.Service()
public class WebUntisService implements de.oth.othappserver.service.IWebUntisService {
    private final com.github.benmanes.caffeine.cache.LoadingCache<java.lang.String, java.util.List<de.oth.othappserver.webuntis.WebUntisTimetable>> roomsTimetableCache = null;
    private final de.oth.othappserver.webuntis.WebUntisClient webUntisClient = null;
    private final de.oth.othappserver.service.IRoomFinderService roomFinderService = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.webuntis.WebUntisService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.github.benmanes.caffeine.cache.Cache<java.lang.Object, java.lang.Object> getRoomCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisSemester> getSemesters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisLecture> getLectures() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisRoom> getRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisFaculty> getFaculties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisHoliday> getHolidays() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public de.oth.othappserver.webuntis.WebUntisSchoolyear getCurrentSchoolyear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisSchoolyear> getSchoolyears() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisTeacher> getTeachers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisTimetable> getTimetable(int id, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUnitsResourceType type, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public de.oth.othappserver.model.TimetableLecture getTimetableLecture(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer semesterId, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.model.Semester> getLectureSemesters(int id, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.model.Lecture> getFacultyLectures(int facultyId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.model.Lecture> getSemesterLectures(int id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate) {
        return null;
    }
    
    private final java.util.List<de.oth.othappserver.webuntis.BaseWebUntisResource> doGetSemesterLectures(int id, java.time.LocalDate startDate, java.time.LocalDate endDate) {
        return null;
    }
    
    private final java.time.LocalTime convertStringToTime(java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<de.oth.othappserver.webuntis.WebUntisTimetable> getRoomTimetable(int id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
        return null;
    }
    
    private final java.util.List<de.oth.othappserver.webuntis.WebUntisTimetable> getRoomTimeTable(java.lang.String key) {
        return null;
    }
    
    public WebUntisService(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUntisClient webUntisClient, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IRoomFinderService roomFinderService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisService$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}