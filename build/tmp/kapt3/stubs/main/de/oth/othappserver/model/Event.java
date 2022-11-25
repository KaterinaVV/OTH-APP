package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param eventId Unique event ID.
 * @param eventType
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lde/oth/othappserver/model/Event;", "", "eventId", "", "getEventId", "()Ljava/lang/String;", "eventType", "Lde/oth/othappserver/model/EventType;", "getEventType", "()Lde/oth/othappserver/model/EventType;", "oth-app-server"})
@com.fasterxml.jackson.annotation.JsonSubTypes(value = {@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.model.DeleteEvent.class, name = "delete"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.model.ExceptionEvent.class, name = "exception"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.model.OccurrenceEvent.class, name = "occurrence"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.model.SeriesMaster.class, name = "seriesMaster"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.model.UpdateEvent.class, name = "update")})
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property = "eventType", visible = true)
public abstract interface Event {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getEventId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.model.EventType getEventType();
}