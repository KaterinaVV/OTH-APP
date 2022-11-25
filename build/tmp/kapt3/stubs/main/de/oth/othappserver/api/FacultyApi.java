package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0017J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J6\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017\u00a8\u0006\u000f"}, d2 = {"Lde/oth/othappserver/api/FacultyApi;", "", "faculties", "Lorg/springframework/http/ResponseEntity;", "", "Lde/oth/othappserver/model/Faculty;", "faculty", "Lde/oth/othappserver/model/FacultyDetail;", "identifier", "", "facultyLectures", "Lde/oth/othappserver/model/Lecture;", "startDate", "Ljava/time/LocalDate;", "endDate", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface FacultyApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/faculty"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Faculty>> faculties();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/faculty/{identifier}"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.FacultyDetail> faculty(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable(value = "identifier")
    java.lang.String identifier);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/faculty/{identifier}/lectures"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Lecture>> facultyLectures(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable(value = "identifier")
    java.lang.String identifier, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
    java.time.LocalDate endDate);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/faculty"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Faculty>> faculties(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.FacultyApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/faculty/{identifier}"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.FacultyDetail> faculty(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.FacultyApi $this, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PathVariable(value = "identifier")
        java.lang.String identifier) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/faculty/{identifier}/lectures"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Lecture>> facultyLectures(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.FacultyApi $this, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PathVariable(value = "identifier")
        java.lang.String identifier, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "startDate", required = false)
        java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "endDate", required = false)
        java.time.LocalDate endDate) {
            return null;
        }
    }
}