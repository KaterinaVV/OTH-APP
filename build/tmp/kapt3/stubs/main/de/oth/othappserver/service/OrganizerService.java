package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0013\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0017J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lde/oth/othappserver/service/OrganizerService;", "Lde/oth/othappserver/service/IOrganizerService;", "dsl", "Lorg/jooq/DSLContext;", "(Lorg/jooq/DSLContext;)V", "getOrganizerByEmail", "Ljava/util/Optional;", "Lde/oth/othappserver/tables/pojos/TEventorganizer;", "email", "", "getOrganizerByName", "name", "getOrganizers", "", "oth-app-server"})
@org.springframework.cache.annotation.CacheConfig(cacheNames = {"dayCache"}, keyGenerator = "customKeyGenerator")
@org.springframework.stereotype.Service()
class OrganizerService implements de.oth.othappserver.service.IOrganizerService {
    private final org.jooq.DSLContext dsl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public java.util.Optional<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizerByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public java.util.Optional<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizerByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizers() {
        return null;
    }
    
    public OrganizerService(@org.jetbrains.annotations.NotNull()
    org.jooq.DSLContext dsl) {
        super();
    }
}