package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J6\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u0017\u00a8\u0006\r"}, d2 = {"Lde/oth/othappserver/api/SemesterApi;", "", "semesterLectures", "Lorg/springframework/http/ResponseEntity;", "", "Lde/oth/othappserver/model/Lecture;", "id", "", "startDate", "Ljava/time/LocalDate;", "endDate", "semesterTimetable", "Lde/oth/othappserver/model/TimetableItem;", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface SemesterApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/semester/{id}/lectures"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Lecture>> semesterLectures(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
    java.time.LocalDate endDate);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/semester/{id}/timetable"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.TimetableItem>> semesterTimetable(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
    java.time.LocalDate endDate);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/semester/{id}/lectures"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Lecture>> semesterLectures(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.SemesterApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "id")
        int id, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
        java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
        java.time.LocalDate endDate) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/semester/{id}/timetable"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.TimetableItem>> semesterTimetable(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.SemesterApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "id")
        int id, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
        java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
        java.time.LocalDate endDate) {
            return null;
        }
    }
}