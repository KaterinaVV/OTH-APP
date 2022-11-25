package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lde/oth/othappserver/jobmarket/ObjectJobMarketRequestResponse;", "T", "Lde/oth/othappserver/jobmarket/JobMarketCall;", "R", "Lde/oth/othappserver/jobmarket/JobMarketRequestResponse;", "call", "responseType", "Ljava/lang/Class;", "(Lde/oth/othappserver/jobmarket/JobMarketCall;Ljava/lang/Class;)V", "parse", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "parser", "Lcom/fasterxml/jackson/core/JsonParser;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;", "oth-app-server"})
public final class ObjectJobMarketRequestResponse<T extends de.oth.othappserver.jobmarket.JobMarketCall, R extends java.lang.Object> extends de.oth.othappserver.jobmarket.JobMarketRequestResponse<T, R> {
    private final java.lang.Class<R> responseType = null;
    
    @java.lang.Override()
    public R parse(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.core.JsonParser parser) {
        return null;
    }
    
    public ObjectJobMarketRequestResponse(@org.jetbrains.annotations.NotNull()
    T call, @org.jetbrains.annotations.NotNull()
    java.lang.Class<R> responseType) {
    }
}