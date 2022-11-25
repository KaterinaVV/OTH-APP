package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0017J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0017J\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lde/oth/othappserver/service/FacultyService;", "Lde/oth/othappserver/service/IFacultyService;", "dsl", "Lorg/jooq/DSLContext;", "(Lorg/jooq/DSLContext;)V", "faculties", "", "Lde/oth/othappserver/tables/records/FacultyRecord;", "", "Lde/oth/othappserver/tables/records/FeedRecord;", "faculty", "identifier", "", "facultyFeeds", "Lkotlin/Pair;", "oth-app-server"})
@org.springframework.cache.annotation.CacheConfig(cacheNames = {"lifetimeCache"}, keyGenerator = "customKeyGenerator")
@org.springframework.stereotype.Service()
class FacultyService implements de.oth.othappserver.service.IFacultyService {
    private final org.jooq.DSLContext dsl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public java.util.Map<de.oth.othappserver.tables.records.FacultyRecord, java.util.List<de.oth.othappserver.tables.records.FeedRecord>> faculties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public de.oth.othappserver.tables.records.FacultyRecord faculty(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public kotlin.Pair<de.oth.othappserver.tables.records.FacultyRecord, java.util.List<de.oth.othappserver.tables.records.FeedRecord>> facultyFeeds(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public FacultyService(@org.jetbrains.annotations.NotNull()
    org.jooq.DSLContext dsl) {
        super();
    }
}