package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lde/oth/othappserver/config/HttpProperties;", "", "connectTimout", "", "connectionTimout", "socketTimout", "(III)V", "getConnectTimout", "()I", "getConnectionTimout", "getSocketTimout", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "oth-app-server"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "app.http")
@org.springframework.boot.context.properties.ConstructorBinding()
public final class HttpProperties {
    
    /**
     * Timeout until a HTTP connection has to be established with the remote host.
     */
    private final int connectTimout = 0;
    
    /**
     * Timeout until a HTTP connection has to be finished sending.
     */
    private final int connectionTimout = 0;
    
    /**
     * Defines the socket timeout in milliseconds, which is the timeout for waiting for data or, put differently,
     * a maximum period inactivity between two consecutive data packets).
     */
    private final int socketTimout = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String prefix = "app.http";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.config.HttpProperties.Companion Companion = null;
    
    /**
     * Timeout until a HTTP connection has to be established with the remote host.
     */
    public final int getConnectTimout() {
        return 0;
    }
    
    /**
     * Timeout until a HTTP connection has to be finished sending.
     */
    public final int getConnectionTimout() {
        return 0;
    }
    
    /**
     * Defines the socket timeout in milliseconds, which is the timeout for waiting for data or, put differently,
     * a maximum period inactivity between two consecutive data packets).
     */
    public final int getSocketTimout() {
        return 0;
    }
    
    public HttpProperties(@org.springframework.boot.context.properties.bind.DefaultValue(value = {"-1"})
    int connectTimout, @org.springframework.boot.context.properties.bind.DefaultValue(value = {"-1"})
    int connectionTimout, @org.springframework.boot.context.properties.bind.DefaultValue(value = {"-1"})
    int socketTimout) {
        super();
    }
    
    /**
     * Timeout until a HTTP connection has to be established with the remote host.
     */
    public final int component1() {
        return 0;
    }
    
    /**
     * Timeout until a HTTP connection has to be finished sending.
     */
    public final int component2() {
        return 0;
    }
    
    /**
     * Defines the socket timeout in milliseconds, which is the timeout for waiting for data or, put differently,
     * a maximum period inactivity between two consecutive data packets).
     */
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.config.HttpProperties copy(@org.springframework.boot.context.properties.bind.DefaultValue(value = {"-1"})
    int connectTimout, @org.springframework.boot.context.properties.bind.DefaultValue(value = {"-1"})
    int connectionTimout, @org.springframework.boot.context.properties.bind.DefaultValue(value = {"-1"})
    int socketTimout) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lde/oth/othappserver/config/HttpProperties$Companion;", "", "()V", "prefix", "", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}