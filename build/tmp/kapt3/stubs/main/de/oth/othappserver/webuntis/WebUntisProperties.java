package de.oth.othappserver.webuntis;

import java.lang.System;

/**
 * Configuration container for WebUntis.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisProperties;", "", "username", "", "password", "uri", "enabled", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEnabled", "()Z", "getPassword", "()Ljava/lang/String;", "getUri", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "oth-app-server"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "app.webuntis")
@org.springframework.boot.context.properties.ConstructorBinding()
public final class WebUntisProperties {
    
    /**
     * Username used for WebUntis authentication.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    
    /**
     * Password used for WebUntis authentication.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    
    /**
     * URI pointing at a valid WebUntis service.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uri = null;
    
    /**
     * Flag enabling WebUntis feature.
     */
    private final boolean enabled = false;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String prefix = "app.webuntis";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENABLED = "app.webuntis.enabled";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.webuntis.WebUntisProperties.Companion Companion = null;
    
    /**
     * Username used for WebUntis authentication.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    /**
     * Password used for WebUntis authentication.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    /**
     * URI pointing at a valid WebUntis service.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * Flag enabling WebUntis feature.
     */
    public final boolean getEnabled() {
        return false;
    }
    
    public WebUntisProperties(@org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {""})
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {""})
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {"https://kephiso.webuntis.com/WebUntis/jsonrpc.do?school=OTH-Regensburg"})
    java.lang.String uri, @org.springframework.boot.context.properties.bind.DefaultValue(value = {"false"})
    boolean enabled) {
        super();
    }
    
    /**
     * Username used for WebUntis authentication.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Password used for WebUntis authentication.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * URI pointing at a valid WebUntis service.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * Flag enabling WebUntis feature.
     */
    public final boolean component4() {
        return false;
    }
    
    /**
     * Configuration container for WebUntis.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.webuntis.WebUntisProperties copy(@org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {""})
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {""})
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {"https://kephiso.webuntis.com/WebUntis/jsonrpc.do?school=OTH-Regensburg"})
    java.lang.String uri, @org.springframework.boot.context.properties.bind.DefaultValue(value = {"false"})
    boolean enabled) {
        return null;
    }
    
    /**
     * Configuration container for WebUntis.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Configuration container for WebUntis.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Configuration container for WebUntis.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisProperties$Companion;", "", "()V", "ENABLED", "", "prefix", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}