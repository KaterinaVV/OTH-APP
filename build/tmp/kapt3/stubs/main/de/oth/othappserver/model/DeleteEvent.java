package de.oth.othappserver.model;

import java.lang.System;

/**
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lde/oth/othappserver/model/DeleteEvent;", "Lde/oth/othappserver/model/Event;", "eventId", "", "eventType", "Lde/oth/othappserver/model/EventType;", "(Ljava/lang/String;Lde/oth/othappserver/model/EventType;)V", "getEventId", "()Ljava/lang/String;", "getEventType", "()Lde/oth/othappserver/model/EventType;", "oth-app-server"})
public final class DeleteEvent implements de.oth.othappserver.model.Event {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "eventId", required = true)
    private final java.lang.String eventId = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "eventType", required = true)
    @javax.validation.Valid()
    private final de.oth.othappserver.model.EventType eventType = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getEventId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.oth.othappserver.model.EventType getEventType() {
        return null;
    }
    
    public DeleteEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventId, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.EventType eventType) {
        super();
    }
}