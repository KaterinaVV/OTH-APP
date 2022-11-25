package de.oth.othappserver.model;

import java.lang.System;

/**
 * The type of a calendar event.
 * Values: DELETE,UPDATE,OCCURRENCE,EXCEPTION,SERIES_MASTER
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lde/oth/othappserver/model/EventType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DELETE", "UPDATE", "OCCURRENCE", "EXCEPTION", "SERIES_MASTER", "oth-app-server"})
public enum EventType {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "delete")
    /*public static final*/ DELETE /* = new DELETE(null) */,
    @com.fasterxml.jackson.annotation.JsonProperty(value = "update")
    /*public static final*/ UPDATE /* = new UPDATE(null) */,
    @com.fasterxml.jackson.annotation.JsonProperty(value = "occurrence")
    /*public static final*/ OCCURRENCE /* = new OCCURRENCE(null) */,
    @com.fasterxml.jackson.annotation.JsonProperty(value = "exception")
    /*public static final*/ EXCEPTION /* = new EXCEPTION(null) */,
    @com.fasterxml.jackson.annotation.JsonProperty(value = "seriesMaster")
    /*public static final*/ SERIES_MASTER /* = new SERIES_MASTER(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    EventType(java.lang.String value) {
    }
}