package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0013\u0018\u0000 \'2\u00020\u0001:\u0001\'B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017J \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J4\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\b\u0010 \u001a\u0004\u0018\u00010\u00142\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0018H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lde/oth/othappserver/service/EventCalendarService;", "Lde/oth/othappserver/service/IEventCalendarService;", "dsl", "Lorg/jooq/DSLContext;", "exchangeEventsService", "Lde/oth/othappserver/exchange/IExchangeEventsService;", "organizerService", "Lde/oth/othappserver/service/IOrganizerService;", "eventTagsParser", "Lde/oth/othappserver/service/tags/EventTagsParser;", "(Lorg/jooq/DSLContext;Lde/oth/othappserver/exchange/IExchangeEventsService;Lde/oth/othappserver/service/IOrganizerService;Lde/oth/othappserver/service/tags/EventTagsParser;)V", "getCategories", "", "Lde/oth/othappserver/tables/pojos/TEventcategory;", "getOrganizer", "Lde/oth/othappserver/model/Organizer;", "data", "Lde/oth/othappserver/exchange/EventData;", "tag", "Ljava/util/Optional;", "", "getOrganizers", "Lde/oth/othappserver/tables/pojos/TEventorganizer;", "isValidEvent", "", "event", "Lde/oth/othappserver/exchange/IExchangeEvent;", "queryEvents", "Lde/oth/othappserver/model/EventQueryResult;", "minStartDate", "maxStartDate", "deltaToken", "skipToken", "paged", "sanitizeDateString", "dateString", "start", "toEvent", "Lde/oth/othappserver/model/Event;", "Companion", "oth-app-server"})
@org.springframework.cache.annotation.CacheConfig(cacheNames = {"lifetimeCache"}, keyGenerator = "customKeyGenerator")
@org.springframework.stereotype.Service()
class EventCalendarService implements de.oth.othappserver.service.IEventCalendarService {
    private final org.jooq.DSLContext dsl = null;
    private final de.oth.othappserver.exchange.IExchangeEventsService exchangeEventsService = null;
    private final de.oth.othappserver.service.IOrganizerService organizerService = null;
    private final de.oth.othappserver.service.tags.EventTagsParser eventTagsParser = null;
    private static final java.lang.String ILLEGAL_DATEFORMAT_ERROR = "Could not parse %s as date. Valid formats are \"YYYY-MM-DD\" or \"YYYY-MM-DDTHH:MM:SS\u00b1HH:MM\"";
    private static final java.lang.String TITLE_REQUIRED_ERROR = "An Event must have a title";
    private static final java.lang.String EUROPE_BERLIN_TZ = "Europe/Berlin";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.service.EventCalendarService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.cache.annotation.Cacheable()
    public java.util.List<de.oth.othappserver.tables.pojos.TEventcategory> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<de.oth.othappserver.tables.pojos.TEventorganizer> getOrganizers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.oth.othappserver.model.EventQueryResult queryEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String minStartDate, @org.jetbrains.annotations.NotNull()
    java.lang.String maxStartDate, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    java.lang.String skipToken, boolean paged) {
        return null;
    }
    
    private final java.lang.String sanitizeDateString(java.lang.String dateString, boolean start) {
        return null;
    }
    
    private final de.oth.othappserver.model.Event toEvent(de.oth.othappserver.exchange.IExchangeEvent event) {
        return null;
    }
    
    /**
     * Finds a Organizer by name or creates a default with the given name.
     */
    private final de.oth.othappserver.model.Organizer getOrganizer(de.oth.othappserver.exchange.EventData data, java.util.Optional<java.lang.String> tag) {
        return null;
    }
    
    private final boolean isValidEvent(de.oth.othappserver.exchange.IExchangeEvent event) {
        return false;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public EventCalendarService(@org.jetbrains.annotations.NotNull()
    org.jooq.DSLContext dsl, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.exchange.IExchangeEventsService exchangeEventsService, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IOrganizerService organizerService, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.tags.EventTagsParser eventTagsParser) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lde/oth/othappserver/service/EventCalendarService$Companion;", "", "()V", "EUROPE_BERLIN_TZ", "", "ILLEGAL_DATEFORMAT_ERROR", "TITLE_REQUIRED_ERROR", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}