package de.oth.othappserver.webuntis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ;\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002H\f0\u0012H\u0002\u00a2\u0006\u0002\u0010\u0014J4\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00170\u0016\"\b\b\u0000\u0010\f*\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0002J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\f0\u0016\"\b\b\u0000\u0010\f*\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0002J#\u0010\u001a\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010\u00a2\u0006\u0002\u0010\u001bJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\f0\u0017\"\b\b\u0000\u0010\f*\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010J/\u0010\u001d\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00160 H\u0002\u00a2\u0006\u0002\u0010!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisClient;", "", "httpClient", "Lorg/apache/http/client/HttpClient;", "authenticator", "Lde/oth/othappserver/webuntis/WebUntisAuthenticator;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "props", "Lde/oth/othappserver/webuntis/WebUntisProperties;", "(Lorg/apache/http/client/HttpClient;Lde/oth/othappserver/webuntis/WebUntisAuthenticator;Lcom/fasterxml/jackson/databind/ObjectMapper;Lde/oth/othappserver/webuntis/WebUntisProperties;)V", "execute", "T", "httpPost", "Lorg/apache/http/client/methods/HttpPost;", "request", "Lde/oth/othappserver/webuntis/WebUntisRequest;", "block", "Lkotlin/Function1;", "Ljava/io/InputStream;", "(Lorg/apache/http/client/methods/HttpPost;Lde/oth/othappserver/webuntis/WebUntisRequest;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "executeWithArrayResult", "Lde/oth/othappserver/webuntis/WebUntisResponse;", "", "Lde/oth/othappserver/webuntis/WebUntisResource;", "executeWithSingleResult", "get", "(Lde/oth/othappserver/webuntis/WebUntisRequest;)Lde/oth/othappserver/webuntis/WebUntisResource;", "getAll", "handleError", "error", "Lde/oth/othappserver/webuntis/Error;", "Lkotlin/Function0;", "(Lde/oth/othappserver/webuntis/Error;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.stereotype.Service()
public final class WebUntisClient {
    private final org.apache.http.client.HttpClient httpClient = null;
    private final de.oth.othappserver.webuntis.WebUntisAuthenticator authenticator = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private final de.oth.othappserver.webuntis.WebUntisProperties props = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.webuntis.WebUntisClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends de.oth.othappserver.webuntis.WebUntisResource>T get(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUntisRequest<T> request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends de.oth.othappserver.webuntis.WebUntisResource>java.util.List<T> getAll(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUntisRequest<T> request) {
        return null;
    }
    
    private final <T extends java.lang.Object>T handleError(de.oth.othappserver.webuntis.Error error, kotlin.jvm.functions.Function0<de.oth.othappserver.webuntis.WebUntisResponse<T>> request) {
        return null;
    }
    
    private final <T extends de.oth.othappserver.webuntis.WebUntisResource>de.oth.othappserver.webuntis.WebUntisResponse<T> executeWithSingleResult(org.apache.http.client.methods.HttpPost httpPost, de.oth.othappserver.webuntis.WebUntisRequest<T> request) {
        return null;
    }
    
    private final <T extends de.oth.othappserver.webuntis.WebUntisResource>de.oth.othappserver.webuntis.WebUntisResponse<java.util.List<T>> executeWithArrayResult(org.apache.http.client.methods.HttpPost httpPost, de.oth.othappserver.webuntis.WebUntisRequest<T> request) {
        return null;
    }
    
    private final <T extends java.lang.Object>T execute(org.apache.http.client.methods.HttpPost httpPost, de.oth.othappserver.webuntis.WebUntisRequest<?> request, kotlin.jvm.functions.Function1<? super java.io.InputStream, ? extends T> block) {
        return null;
    }
    
    public WebUntisClient(@org.jetbrains.annotations.NotNull()
    org.apache.http.client.HttpClient httpClient, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUntisAuthenticator authenticator, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUntisProperties props) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lde/oth/othappserver/webuntis/WebUntisClient$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}