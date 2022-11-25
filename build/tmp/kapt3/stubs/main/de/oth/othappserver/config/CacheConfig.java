package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0017J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\u0006H\u0017\u00a8\u0006\r"}, d2 = {"Lde/oth/othappserver/config/CacheConfig;", "", "()V", "customKeyGenerator", "Lde/oth/othappserver/config/CustomKeyGenerator;", "dayCache", "Lorg/springframework/cache/caffeine/CaffeineCache;", "lifetimeCache", "roomCache", "webUntisService", "Lde/oth/othappserver/service/IWebUntisService;", "shortCache", "Companion", "oth-app-server"})
@org.springframework.context.annotation.Configuration()
@org.springframework.cache.annotation.EnableCaching()
public class CacheConfig {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHORT_CACHE = "shortCache";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DAY_CACHE = "dayCache";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIFETIME_CACHE = "lifetimeCache";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_TIMETABLE_CACHE = "roomsTimetableCache";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.config.CacheConfig.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.cache.caffeine.CaffeineCache shortCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.cache.caffeine.CaffeineCache dayCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.cache.caffeine.CaffeineCache lifetimeCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
    @org.springframework.context.annotation.Bean()
    public org.springframework.cache.caffeine.CaffeineCache roomCache(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IWebUntisService webUntisService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public de.oth.othappserver.config.CustomKeyGenerator customKeyGenerator() {
        return null;
    }
    
    public CacheConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lde/oth/othappserver/config/CacheConfig$Companion;", "", "()V", "DAY_CACHE", "", "LIFETIME_CACHE", "ROOM_TIMETABLE_CACHE", "SHORT_CACHE", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}