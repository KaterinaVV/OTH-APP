package de.oth.othappserver.service;

import java.lang.System;

/**
 * Service API declaration for accessing WebUntis resources.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H&J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005H&J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0016H&J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0005H&J2\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J3\u0010%\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\'\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH&\u00a2\u0006\u0002\u0010(\u00a8\u0006)"}, d2 = {"Lde/oth/othappserver/service/IWebUntisService;", "", "getCurrentSchoolyear", "Lde/oth/othappserver/webuntis/WebUntisSchoolyear;", "getFaculties", "", "Lde/oth/othappserver/webuntis/WebUntisFaculty;", "getFacultyLectures", "Lde/oth/othappserver/model/Lecture;", "facultyId", "", "startDate", "Ljava/time/LocalDate;", "endDate", "getHolidays", "Lde/oth/othappserver/webuntis/WebUntisHoliday;", "getLectureSemesters", "Lde/oth/othappserver/model/Semester;", "id", "getLectures", "Lde/oth/othappserver/webuntis/WebUntisLecture;", "getRoomCache", "Lcom/github/benmanes/caffeine/cache/Cache;", "getRoomTimetable", "Lde/oth/othappserver/webuntis/WebUntisTimetable;", "date", "getRooms", "Lde/oth/othappserver/webuntis/WebUntisRoom;", "getSchoolyears", "getSemesterLectures", "getSemesters", "Lde/oth/othappserver/webuntis/WebUntisSemester;", "getTeachers", "Lde/oth/othappserver/webuntis/WebUntisTeacher;", "getTimetable", "type", "Lde/oth/othappserver/webuntis/WebUnitsResourceType;", "getTimetableLecture", "Lde/oth/othappserver/model/TimetableLecture;", "semesterId", "(ILjava/lang/Integer;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lde/oth/othappserver/model/TimetableLecture;", "oth-app-server"})
public abstract interface IWebUntisService {
    
    /**
     * Retrieves a list of semesters from webuntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisSemester> getSemesters();
    
    /**
     * Retrieves a list of lectures from webuntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisLecture> getLectures();
    
    /**
     * Retrieves a list of rooms from webuntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisRoom> getRooms();
    
    /**
     * Retrieves a list of faculties from webuntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisFaculty> getFaculties();
    
    /**
     * Retrieves a list of holidays from webuntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisHoliday> getHolidays();
    
    /**
     * Retrieves the current schoolyear from WebUntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.webuntis.WebUntisSchoolyear getCurrentSchoolyear();
    
    /**
     * Retrieves a list of schoolyears from WebUntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisSchoolyear> getSchoolyears();
    
    /**
     * Retrieves a list of teachers from WebUntis.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisTeacher> getTeachers();
    
    /**
     * Retrieves a semesters lectures in a given time window.
     *
     * @param id Id of the semester
     * @param startDate Start of the time period
     * @param endDate End of the time period
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.model.Lecture> getSemesterLectures(int id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate);
    
    /**
     * Retrieves a list of semesters that offer a given lecture in a given time window.
     *
     * @param id The id of the lecture
     * @param startDate Start of the time period
     * @param endDate End of the time period
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.model.Semester> getLectureSemesters(int id, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisTimetable> getTimetable(int id, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUnitsResourceType type, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate);
    
    /**
     * Retrieves a lecture with timetable information by id.
     *
     * @param id The id of the lecture
     * @param startDate Start of the time period
     * @param endDate End of the time period
     */
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.model.TimetableLecture getTimetableLecture(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer semesterId, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate endDate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.webuntis.WebUntisTimetable> getRoomTimetable(int id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date);
    
    /**
     * Retrieves Lectures for a Faculty in a given time window.
     *
     * @param facultyId The WebUntis faculty Id
     * @param startDate Start date of the time window
     * @param endDate End date of the time window
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.model.Lecture> getFacultyLectures(int facultyId, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.benmanes.caffeine.cache.Cache<java.lang.Object, java.lang.Object> getRoomCache();
}