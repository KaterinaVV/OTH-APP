package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0017J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\u0017JD\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017\u00a8\u0006\u0011"}, d2 = {"Lde/oth/othappserver/api/EventCalendarApi;", "", "categories", "Lorg/springframework/http/ResponseEntity;", "", "Lde/oth/othappserver/model/Category;", "organizers", "Lde/oth/othappserver/model/Organizer;", "queryEvents", "Lde/oth/othappserver/model/EventQueryResult;", "minStartDate", "", "maxStartDate", "deltaToken", "skipToken", "paged", "", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface EventCalendarApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/eventcalendar/category"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Category>> categories();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/eventcalendar/organizer"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Organizer>> organizers();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/eventcalendar/event"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.EventQueryResult> queryEvents(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "minStartDate", required = true)
    @javax.validation.constraints.NotNull()
    java.lang.String minStartDate, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "maxStartDate", required = true)
    @javax.validation.constraints.NotNull()
    java.lang.String maxStartDate, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "deltaToken", required = false)
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "skipToken", required = false)
    java.lang.String skipToken, @org.springframework.web.bind.annotation.RequestParam(value = "paged", required = false, defaultValue = "false")
    boolean paged);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/eventcalendar/category"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Category>> categories(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.EventCalendarApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/eventcalendar/organizer"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Organizer>> organizers(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.EventCalendarApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/eventcalendar/event"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.EventQueryResult> queryEvents(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.EventCalendarApi $this, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "minStartDate", required = true)
        @javax.validation.constraints.NotNull()
        java.lang.String minStartDate, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "maxStartDate", required = true)
        @javax.validation.constraints.NotNull()
        java.lang.String maxStartDate, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "deltaToken", required = false)
        java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "skipToken", required = false)
        java.lang.String skipToken, @org.springframework.web.bind.annotation.RequestParam(value = "paged", required = false, defaultValue = "false")
        boolean paged) {
            return null;
        }
    }
}