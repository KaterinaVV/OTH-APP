package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006H\u0016J:\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lde/oth/othappserver/rest/EventCalendarController;", "Lde/oth/othappserver/api/EventCalendarApi;", "eventCalendarService", "Lde/oth/othappserver/service/IEventCalendarService;", "(Lde/oth/othappserver/service/IEventCalendarService;)V", "categories", "Lorg/springframework/http/ResponseEntity;", "", "Lde/oth/othappserver/model/Category;", "organizers", "Lde/oth/othappserver/model/Organizer;", "queryEvents", "Lde/oth/othappserver/model/EventQueryResult;", "minStartDate", "", "maxStartDate", "deltaToken", "skipToken", "paged", "", "oth-app-server"})
@org.springframework.web.bind.annotation.RestController()
public class EventCalendarController implements de.oth.othappserver.api.EventCalendarApi {
    private final de.oth.othappserver.service.IEventCalendarService eventCalendarService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Category>> categories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.EventQueryResult> queryEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String minStartDate, @org.jetbrains.annotations.NotNull()
    java.lang.String maxStartDate, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    java.lang.String skipToken, boolean paged) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Organizer>> organizers() {
        return null;
    }
    
    public EventCalendarController(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IEventCalendarService eventCalendarService) {
        super();
    }
}