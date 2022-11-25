package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0017J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketService;", "Lde/oth/othappserver/service/IJobMarketService;", "jobMarketClient", "Lde/oth/othappserver/jobmarket/JobMarketClient;", "facultyService", "Lde/oth/othappserver/service/IFacultyService;", "(Lde/oth/othappserver/jobmarket/JobMarketClient;Lde/oth/othappserver/service/IFacultyService;)V", "jobCountCache", "Lcom/github/benmanes/caffeine/cache/LoadingCache;", "", "", "getJobById", "Lde/oth/othappserver/model/JobDetails;", "id", "jobCount", "since", "Ljava/time/LocalDate;", "jobmarket", "Lde/oth/othappserver/model/JobMarket;", "jobs", "", "Lde/oth/othappserver/jobmarket/JobMarketJob;", "query", "Lde/oth/othappserver/model/JobQuery;", "Companion", "oth-app-server"})
@org.springframework.cache.annotation.CacheConfig(cacheNames = {"dayCache"}, keyGenerator = "customKeyGenerator")
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.jobmarket.enabled"})
@org.springframework.stereotype.Service()
public class JobMarketService implements de.oth.othappserver.service.IJobMarketService {
    
    /**
     * A cache with a date string as key and the jobs count as value.
     */
    private final com.github.benmanes.caffeine.cache.LoadingCache<java.lang.String, java.lang.Integer> jobCountCache = null;
    private final de.oth.othappserver.jobmarket.JobMarketClient jobMarketClient = null;
    private final de.oth.othappserver.service.IFacultyService facultyService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.time.format.DateTimeFormatter JobCountCacheKeyFormatter = null;
    public static final int MAX_JOB_COUNT = 100;
    public static final int DEFAULT_MAX_VALUE = 100;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.jobmarket.JobMarketService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable(value = {"shortCache"})
    public de.oth.othappserver.model.JobDetails getJobById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<de.oth.othappserver.jobmarket.JobMarketJob> jobs(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.JobQuery query) {
        return null;
    }
    
    @java.lang.Override()
    public int jobCount(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate since) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable(value = {"dayCache"})
    public de.oth.othappserver.model.JobMarket jobmarket() {
        return null;
    }
    
    public JobMarketService(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.jobmarket.JobMarketClient jobMarketClient, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IFacultyService facultyService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketService$Companion;", "", "()V", "DEFAULT_MAX_VALUE", "", "JobCountCacheKeyFormatter", "Ljava/time/format/DateTimeFormatter;", "getJobCountCacheKeyFormatter", "()Ljava/time/format/DateTimeFormatter;", "MAX_JOB_COUNT", "oth-app-server"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.format.DateTimeFormatter getJobCountCacheKeyFormatter() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}