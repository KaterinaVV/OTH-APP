package de.oth.othappserver.exchange.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lde/oth/othappserver/exchange/data/ExchangeContainer;", "", "events", "", "Lde/oth/othappserver/exchange/data/ExchangeEvent;", "deltaLink", "", "nextLink", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDeltaLink", "()Ljava/lang/String;", "getEvents", "()Ljava/util/List;", "getNextLink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class ExchangeContainer {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<de.oth.othappserver.exchange.data.ExchangeEvent> events = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deltaLink = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nextLink = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.exchange.data.ExchangeEvent> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeltaLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNextLink() {
        return null;
    }
    
    public ExchangeContainer(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "value")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = de.oth.othappserver.exchange.data.ExchangeEventDeserializer.class)
    java.util.List<? extends de.oth.othappserver.exchange.data.ExchangeEvent> events, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "@odata.deltaLink", required = false)
    java.lang.String deltaLink, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "@odata.nextLink", required = false)
    java.lang.String nextLink) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.exchange.data.ExchangeEvent> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.exchange.data.ExchangeContainer copy(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "value")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = de.oth.othappserver.exchange.data.ExchangeEventDeserializer.class)
    java.util.List<? extends de.oth.othappserver.exchange.data.ExchangeEvent> events, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "@odata.deltaLink", required = false)
    java.lang.String deltaLink, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "@odata.nextLink", required = false)
    java.lang.String nextLink) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}