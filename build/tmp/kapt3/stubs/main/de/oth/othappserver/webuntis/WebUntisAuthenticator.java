package de.oth.othappserver.webuntis;

import java.lang.System;

/**
 * Provides access to a authenticated HttpContext for a WebUntis session and functionality to execute authentication.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisAuthenticator;", "", "httpClient", "Lorg/apache/http/client/HttpClient;", "props", "Lde/oth/othappserver/webuntis/WebUntisProperties;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lorg/apache/http/client/HttpClient;Lde/oth/othappserver/webuntis/WebUntisProperties;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "authTime", "Ljava/time/LocalDateTime;", "kotlin.jvm.PlatformType", "cookieStore", "Lorg/apache/http/impl/client/BasicCookieStore;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "authenticate", "", "doGetContext", "Lorg/apache/http/client/protocol/HttpClientContext;", "doLogin", "Lde/oth/othappserver/webuntis/WebUntisResponse;", "Lde/oth/othappserver/webuntis/WebUntisUser;", "login", "Lorg/apache/http/client/methods/HttpPost;", "getContext", "Lorg/apache/http/protocol/HttpContext;", "Companion", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.stereotype.Component()
public final class WebUntisAuthenticator {
    private final org.apache.http.impl.client.BasicCookieStore cookieStore = null;
    private java.time.LocalDateTime authTime;
    private final java.util.concurrent.locks.ReentrantReadWriteLock lock = null;
    private final org.apache.http.client.HttpClient httpClient = null;
    private final de.oth.othappserver.webuntis.WebUntisProperties props = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.webuntis.WebUntisAuthenticator.Companion Companion = null;
    
    /**
     * A context containing cookies which enable access to WebUntis.
     */
    @org.jetbrains.annotations.NotNull()
    public final org.apache.http.protocol.HttpContext getContext() {
        return null;
    }
    
    /**
     * Returs a HttpContext for authentication.
     *
     * This context contains the internal cookieStore.
     */
    private final org.apache.http.client.protocol.HttpClientContext doGetContext() {
        return null;
    }
    
    /**
     * Authenticates with WebUntis.
     */
    public final void authenticate() {
    }
    
    private final de.oth.othappserver.webuntis.WebUntisResponse<de.oth.othappserver.webuntis.WebUntisUser> doLogin(org.apache.http.client.methods.HttpPost login) {
        return null;
    }
    
    public WebUntisAuthenticator(@org.jetbrains.annotations.NotNull()
    org.apache.http.client.HttpClient httpClient, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUntisProperties props, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisAuthenticator$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}