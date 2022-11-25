package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ9\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\r*\u00020\u000e\"\u0004\b\u0001\u0010\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\f0\u00102\u0006\u0010\u0011\u001a\u0002H\u000f\u00a2\u0006\u0002\u0010\u0012J\u00a7\u0001\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00170\u0014\"\b\b\u0000\u0010\u0018*\u00020\u000e\"\u0004\b\u0001\u0010\u0015\"\u0014\b\u0002\u0010\u0019*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00150\u0010\"\b\b\u0003\u0010\u001a*\u00020\u000e\"\u0004\b\u0004\u0010\u0016\"\u0014\b\u0005\u0010\u001b*\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u00160\u0010\"\b\b\u0006\u0010\u001c*\u00020\u000e\"\u0004\b\u0007\u0010\u0017\"\u0014\b\b\u0010\u001d*\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u00170\u00102\u0006\u0010\u0011\u001a\u0002H\u00192\u0006\u0010\u001e\u001a\u0002H\u001b2\u0006\u0010\u001f\u001a\u0002H\u001d\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020&H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketClient;", "", "httpClient", "Lorg/apache/http/client/HttpClient;", "properties", "Lde/oth/othappserver/jobmarket/JobmarketProperties;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lorg/apache/http/client/HttpClient;Lde/oth/othappserver/jobmarket/JobmarketProperties;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "credentials", "Lde/oth/othappserver/jobmarket/JobMarketCredentials;", "execute", "R", "T", "Lde/oth/othappserver/jobmarket/JobMarketCall;", "I", "Lde/oth/othappserver/jobmarket/JobMarketRequestResponse;", "requestResponse", "(Lde/oth/othappserver/jobmarket/JobMarketRequestResponse;)Ljava/lang/Object;", "executeBatch", "Lkotlin/Triple;", "R1", "R2", "R3", "T1", "I1", "T2", "I2", "T3", "I3", "requestResponse2", "requestResponse3", "(Lde/oth/othappserver/jobmarket/JobMarketRequestResponse;Lde/oth/othappserver/jobmarket/JobMarketRequestResponse;Lde/oth/othappserver/jobmarket/JobMarketRequestResponse;)Lkotlin/Triple;", "executeRequest", "Lorg/apache/http/HttpResponse;", "request", "Lde/oth/othappserver/jobmarket/JobMarketRequest;", "handleError", "", "buffer", "", "exception", "Companion", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.jobmarket.enabled"})
@org.springframework.stereotype.Component()
public final class JobMarketClient {
    private final de.oth.othappserver.jobmarket.JobMarketCredentials credentials = null;
    private final org.apache.http.client.HttpClient httpClient = null;
    private final de.oth.othappserver.jobmarket.JobmarketProperties properties = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_RESPONSE = "[\"ERROR\"]";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOT_FOUND_RESONSE = "[\"not found\"]";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.jobmarket.JobMarketClient.Companion Companion = null;
    
    public final <T extends de.oth.othappserver.jobmarket.JobMarketCall, R extends java.lang.Object, I extends de.oth.othappserver.jobmarket.JobMarketRequestResponse<T, R>>R execute(@org.jetbrains.annotations.NotNull()
    I requestResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T1 extends de.oth.othappserver.jobmarket.JobMarketCall, R1 extends java.lang.Object, I1 extends de.oth.othappserver.jobmarket.JobMarketRequestResponse<T1, R1>, T2 extends de.oth.othappserver.jobmarket.JobMarketCall, R2 extends java.lang.Object, I2 extends de.oth.othappserver.jobmarket.JobMarketRequestResponse<T2, R2>, T3 extends de.oth.othappserver.jobmarket.JobMarketCall, R3 extends java.lang.Object, I3 extends de.oth.othappserver.jobmarket.JobMarketRequestResponse<T3, R3>>kotlin.Triple<R1, R2, R3> executeBatch(@org.jetbrains.annotations.NotNull()
    I1 requestResponse, @org.jetbrains.annotations.NotNull()
    I2 requestResponse2, @org.jetbrains.annotations.NotNull()
    I3 requestResponse3) {
        return null;
    }
    
    private final java.lang.Throwable handleError(de.oth.othappserver.jobmarket.JobMarketRequest request, byte[] buffer, java.lang.Throwable exception) {
        return null;
    }
    
    private final org.apache.http.HttpResponse executeRequest(de.oth.othappserver.jobmarket.JobMarketRequest request) {
        return null;
    }
    
    public JobMarketClient(@org.jetbrains.annotations.NotNull()
    org.apache.http.client.HttpClient httpClient, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.jobmarket.JobmarketProperties properties, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketClient$Companion;", "", "()V", "ERROR_RESPONSE", "", "NOT_FOUND_RESONSE", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}