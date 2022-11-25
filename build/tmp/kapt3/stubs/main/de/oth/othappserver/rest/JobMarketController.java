package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lde/oth/othappserver/rest/JobMarketController;", "Lde/oth/othappserver/api/JobMarketApi;", "jobMarketService", "Lde/oth/othappserver/service/IJobMarketService;", "(Lde/oth/othappserver/service/IJobMarketService;)V", "jobById", "Lorg/springframework/http/ResponseEntity;", "Lde/oth/othappserver/model/JobDetails;", "id", "", "jobmarket", "Lde/oth/othappserver/model/JobMarket;", "jobs", "", "Lde/oth/othappserver/model/Job;", "jobQuery", "Lde/oth/othappserver/model/JobQuery;", "newJobs", "since", "Ljava/time/LocalDate;", "Companion", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.jobmarket.enabled"})
@org.springframework.web.bind.annotation.RestController()
public class JobMarketController implements de.oth.othappserver.api.JobMarketApi {
    private final de.oth.othappserver.service.IJobMarketService jobMarketService = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.rest.JobMarketController.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.JobDetails> jobById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Job>> jobs(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.JobQuery jobQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.JobMarket> jobmarket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.lang.Integer> newJobs(@org.jetbrains.annotations.NotNull()
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
    java.time.LocalDate since) {
        return null;
    }
    
    public JobMarketController(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IJobMarketService jobMarketService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lde/oth/othappserver/rest/JobMarketController$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}