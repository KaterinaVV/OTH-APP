package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/oth/othappserver/service/UniversityService;", "Lde/oth/othappserver/service/IUniversityService;", "webUntisService", "Lde/oth/othappserver/service/IWebUntisService;", "roomFinderService", "Lde/oth/othappserver/service/IRoomFinderService;", "(Lde/oth/othappserver/service/IWebUntisService;Lde/oth/othappserver/service/IRoomFinderService;)V", "getInformation", "Lde/oth/othappserver/model/UniversityInfo;", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.cache.annotation.CacheConfig(cacheNames = {"shortCache"}, keyGenerator = "customKeyGenerator")
@org.springframework.stereotype.Service()
class UniversityService implements de.oth.othappserver.service.IUniversityService {
    private final de.oth.othappserver.service.IWebUntisService webUntisService = null;
    private final de.oth.othappserver.service.IRoomFinderService roomFinderService = null;
    
    /**
     * Retrieves basic information needed for a timetable.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public de.oth.othappserver.model.UniversityInfo getInformation() {
        return null;
    }
    
    public UniversityService(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IWebUntisService webUntisService, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IRoomFinderService roomFinderService) {
        super();
    }
}