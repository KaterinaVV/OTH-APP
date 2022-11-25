package de.oth.othappserver.exchange.data;

import java.lang.System;

/**
 * Deserializer for ExchangeEvents.
 *
 * First checks for a occurrence of a "Type" field. If a Type is given the event is mapped into
 * SingleInstanceEvent, SeriesOccurrenceEvent or SeriesMasterEvent.
 * If Type is not found it checks for a "Reason" field. If available this event is mapped into DeletedEvent.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u001c\u0010\r\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u001c\u0010\u000e\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u001c\u0010\u000f\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u001c\u0010\u0010\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J,\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lde/oth/othappserver/exchange/data/ExchangeEventDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "", "Lde/oth/othappserver/exchange/data/ExchangeEvent;", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "createEvent", "fields", "", "", "", "createException", "createMaster", "createOccurrence", "createSingleInstance", "deserialize", "jp", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "getChildStringValue", "field", "getExchangeDateTime", "", "fieldkey", "readBody", "Lde/oth/othappserver/exchange/data/Body;", "readEvent", "Companion", "oth-app-server"})
public final class ExchangeEventDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<java.util.List<? extends de.oth.othappserver.exchange.data.ExchangeEvent>> {
    private final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_SERIES_MASTER_ID = "seriesmasterid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_SUBJECT = "subject";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_CATEGORIES = "categories";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_START = "start";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_END = "end";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_IS_ALL_DAY = "isallday";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_ORGANIZER = "organizer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_LOCATION = "location";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_BODY = "body";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_TYPE = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_REASON = "reason";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_EMAIL_ADDRESS = "emailaddress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_ADDRESS = "address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_DISPLAY_NAME = "displayname";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_CONTENT = "content";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_DATE_TIME = "datetime";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.exchange.data.ExchangeEventDeserializer.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<de.oth.othappserver.exchange.data.ExchangeEvent> deserialize(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.core.JsonParser jp, @org.jetbrains.annotations.Nullable()
    com.fasterxml.jackson.databind.DeserializationContext ctxt) {
        return null;
    }
    
    /**
     * Reads a event from a JsonParser.
     *
     * After calling this method the application can call nextToken to point to the next available token, if any.
     *
     * @param jp JsonParser to read from
     */
    private final de.oth.othappserver.exchange.data.ExchangeEvent readEvent(com.fasterxml.jackson.core.JsonParser jp) {
        return null;
    }
    
    /**
     * Creates a event from a map of fields and values.
     *
     * The fields map has to contain the correct values (+type) for a given field.
     *
     * @param fields Fields for the event
     * @return A exchange event or null if no valid "Type" key is found in the fields map
     */
    private final de.oth.othappserver.exchange.data.ExchangeEvent createEvent(java.util.Map<java.lang.String, java.lang.Object> fields) {
        return null;
    }
    
    private final de.oth.othappserver.exchange.data.ExchangeEvent createMaster(java.util.Map<java.lang.String, java.lang.Object> fields) {
        return null;
    }
    
    private final de.oth.othappserver.exchange.data.ExchangeEvent createException(java.util.Map<java.lang.String, java.lang.Object> fields) {
        return null;
    }
    
    private final de.oth.othappserver.exchange.data.ExchangeEvent createOccurrence(java.util.Map<java.lang.String, java.lang.Object> fields) {
        return null;
    }
    
    private final de.oth.othappserver.exchange.data.ExchangeEvent createSingleInstance(java.util.Map<java.lang.String, java.lang.Object> fields) {
        return null;
    }
    
    /**
     * Retrieves a datatime from the JsonParser stream and puts it into the fields map.
     *
     * @param jp JsonParser to read from
     * @param fieldkey lowerCase Name of the key used for the fields map
     * @param fields Fields for the event
     */
    private final void getExchangeDateTime(com.fasterxml.jackson.core.JsonParser jp, java.lang.String fieldkey, java.util.Map<java.lang.String, java.lang.Object> fields) {
    }
    
    /**
     * Retrieves a single value from a object token.
     *
     * After the value has been read the stream skips to the end of the object.
     *
     * @param jp JsonParser to read from
     * @param field lowerCase Name of the field to search for
     */
    private final java.lang.String getChildStringValue(com.fasterxml.jackson.core.JsonParser jp, java.lang.String field) {
        return null;
    }
    
    private final de.oth.othappserver.exchange.data.Body readBody(com.fasterxml.jackson.core.JsonParser jp) {
        return null;
    }
    
    public ExchangeEventDeserializer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lde/oth/othappserver/exchange/data/ExchangeEventDeserializer$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_BODY", "FIELD_CATEGORIES", "FIELD_CONTENT", "FIELD_DATE_TIME", "FIELD_DISPLAY_NAME", "FIELD_EMAIL_ADDRESS", "FIELD_END", "FIELD_ID", "FIELD_IS_ALL_DAY", "FIELD_LOCATION", "FIELD_ORGANIZER", "FIELD_REASON", "FIELD_SERIES_MASTER_ID", "FIELD_START", "FIELD_SUBJECT", "FIELD_TYPE", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}