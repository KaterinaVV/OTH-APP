package de.oth.othappserver.exchange;

import java.lang.System;

/**
 * Properties to configure an exchange HTTP client.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\tH\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006%"}, d2 = {"Lde/oth/othappserver/exchange/ExchangeProperties;", "", "username", "", "password", "uri", "feedbackMailAddress", "mailUri", "pageSize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFeedbackMailAddress", "()Ljava/lang/String;", "setFeedbackMailAddress", "(Ljava/lang/String;)V", "getMailUri", "getPageSize", "()I", "getPassword", "setPassword", "getUri", "setUri", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "oth-app-server"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "app.exchange")
@org.springframework.boot.context.properties.ConstructorBinding()
public final class ExchangeProperties {
    
    /**
     * Username for the exchange server connection.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String username;
    
    /**
     * Password for the exchange server connection.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password;
    
    /**
     * URI for the events API exchange calendar.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uri;
    
    /**
     * Address to send feedback emails to
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String feedbackMailAddress;
    
    /**
     * URI for the mail API. Has a default
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mailUri = null;
    
    /**
     * Size of a page for paginated requests to exchange.
     */
    private final int pageSize = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NO_PASS = "nopasswordprovided";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.exchange.ExchangeProperties.Companion Companion = null;
    
    /**
     * Username for the exchange server connection.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    /**
     * Username for the exchange server connection.
     */
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Password for the exchange server connection.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    /**
     * Password for the exchange server connection.
     */
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * URI for the events API exchange calendar.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * URI for the events API exchange calendar.
     */
    public final void setUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Address to send feedback emails to
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeedbackMailAddress() {
        return null;
    }
    
    /**
     * Address to send feedback emails to
     */
    public final void setFeedbackMailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * URI for the mail API. Has a default
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMailUri() {
        return null;
    }
    
    /**
     * Size of a page for paginated requests to exchange.
     */
    public final int getPageSize() {
        return 0;
    }
    
    public ExchangeProperties(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {"nopasswordprovided"})
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String feedbackMailAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String mailUri, int pageSize) {
        super();
    }
    
    /**
     * Username for the exchange server connection.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Password for the exchange server connection.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * URI for the events API exchange calendar.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * Address to send feedback emails to
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * URI for the mail API. Has a default
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * Size of a page for paginated requests to exchange.
     */
    public final int component6() {
        return 0;
    }
    
    /**
     * Properties to configure an exchange HTTP client.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.exchange.ExchangeProperties copy(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.bind.DefaultValue(value = {"nopasswordprovided"})
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String feedbackMailAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String mailUri, int pageSize) {
        return null;
    }
    
    /**
     * Properties to configure an exchange HTTP client.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Properties to configure an exchange HTTP client.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Properties to configure an exchange HTTP client.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lde/oth/othappserver/exchange/ExchangeProperties$Companion;", "", "()V", "NO_PASS", "", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}