package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H\u0017\u00a8\u0006\b"}, d2 = {"Lde/oth/othappserver/api/UniversityApi;", "", "info", "Lorg/springframework/http/ResponseEntity;", "Lde/oth/othappserver/model/UniversityInfo;", "rooms", "", "Lde/oth/othappserver/model/Room;", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface UniversityApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/university/info"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.UniversityInfo> info();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/university/room"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Room>> rooms();
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/university/info"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.UniversityInfo> info(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.UniversityApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/university/room"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Room>> rooms(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.UniversityApi $this) {
            return null;
        }
    }
}