package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0013\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0017J\u001a\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006H\u0017J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lde/oth/othappserver/service/RoomFinderService;", "Lde/oth/othappserver/service/IRoomFinderService;", "dsl", "Lorg/jooq/DSLContext;", "(Lorg/jooq/DSLContext;)V", "getBuildings", "", "", "Lde/oth/othappserver/service/OTHBuilding;", "getEquipment", "", "Lde/oth/othappserver/tables/pojos/TEquipment;", "getFilterEquipment", "oth-app-server"})
@org.springframework.cache.annotation.CacheConfig(cacheNames = {"lifetimeCache"}, keyGenerator = "customKeyGenerator")
@org.springframework.stereotype.Service()
class RoomFinderService implements de.oth.othappserver.service.IRoomFinderService {
    private final org.jooq.DSLContext dsl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public java.util.Map<java.lang.String, java.util.List<de.oth.othappserver.tables.pojos.TEquipment>> getEquipment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public java.util.List<de.oth.othappserver.tables.pojos.TEquipment> getFilterEquipment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    @org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
    public java.util.Map<java.lang.String, de.oth.othappserver.service.OTHBuilding> getBuildings() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public RoomFinderService(@org.jetbrains.annotations.NotNull()
    org.jooq.DSLContext dsl) {
        super();
    }
}