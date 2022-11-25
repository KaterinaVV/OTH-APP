package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0002\u0010\u000bJ6\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u0017\u00a8\u0006\u000f"}, d2 = {"Lde/oth/othappserver/api/TimetableApi;", "", "timetableLecture", "Lorg/springframework/http/ResponseEntity;", "Lde/oth/othappserver/model/TimetableLecture;", "id", "", "semesterId", "startDate", "Ljava/time/LocalDate;", "endDate", "(ILjava/lang/Integer;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lorg/springframework/http/ResponseEntity;", "timetableLectureSemesters", "", "Lde/oth/othappserver/model/Semester;", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface TimetableApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/timetable/lectures/{id}"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.TimetableLecture> timetableLecture(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "semesterId", required = false)
    java.lang.Integer semesterId, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
    java.time.LocalDate endDate);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/timetable/lectures/{id}/semesters"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Semester>> timetableLectureSemesters(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
    java.time.LocalDate endDate);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/timetable/lectures/{id}"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.TimetableLecture> timetableLecture(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.TimetableApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "id")
        int id, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "semesterId", required = false)
        java.lang.Integer semesterId, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
        java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
        java.time.LocalDate endDate) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/timetable/lectures/{id}/semesters"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Semester>> timetableLectureSemesters(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.TimetableApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "id")
        int id, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
        java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
        java.time.LocalDate endDate) {
            return null;
        }
    }
}