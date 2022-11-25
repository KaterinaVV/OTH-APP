package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0017J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017\u00a8\u0006\u0011"}, d2 = {"Lde/oth/othappserver/api/JobMarketApi;", "", "jobById", "Lorg/springframework/http/ResponseEntity;", "Lde/oth/othappserver/model/JobDetails;", "id", "", "jobmarket", "Lde/oth/othappserver/model/JobMarket;", "jobs", "", "Lde/oth/othappserver/model/Job;", "jobQuery", "Lde/oth/othappserver/model/JobQuery;", "newJobs", "since", "Ljava/time/LocalDate;", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface JobMarketApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/jobmarket/job/{id}"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.JobDetails> jobById(@org.springframework.web.bind.annotation.PathVariable(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/jobmarket"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.JobMarket> jobmarket();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(produces = {"application/json"}, consumes = {"application/json"}, value = {"/v1/jobmarket/job"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Job>> jobs(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    @javax.validation.Valid()
    de.oth.othappserver.model.JobQuery jobQuery);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/jobmarket/new"})
    public abstract org.springframework.http.ResponseEntity<java.lang.Integer> newJobs(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "since", required = true)
    @javax.validation.constraints.NotNull()
    java.time.LocalDate since);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/jobmarket/job/{id}"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.JobDetails> jobById(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.JobMarketApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "id")
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/jobmarket"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.JobMarket> jobmarket(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.JobMarketApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PostMapping(produces = {"application/json"}, consumes = {"application/json"}, value = {"/v1/jobmarket/job"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Job>> jobs(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.JobMarketApi $this, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestBody()
        @javax.validation.Valid()
        de.oth.othappserver.model.JobQuery jobQuery) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/jobmarket/new"})
        public static org.springframework.http.ResponseEntity<java.lang.Integer> newJobs(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.JobMarketApi $this, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "since", required = true)
        @javax.validation.constraints.NotNull()
        java.time.LocalDate since) {
            return null;
        }
    }
}