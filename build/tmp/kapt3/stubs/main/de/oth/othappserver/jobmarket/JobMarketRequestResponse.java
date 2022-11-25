package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004B\u000f\b\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&\u00a2\u0006\u0002\u0010\u000fR\u0013\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketRequestResponse;", "T", "Lde/oth/othappserver/jobmarket/JobMarketCall;", "R", "", "call", "(Lde/oth/othappserver/jobmarket/JobMarketCall;)V", "getCall", "()Lde/oth/othappserver/jobmarket/JobMarketCall;", "Lde/oth/othappserver/jobmarket/JobMarketCall;", "parse", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "parser", "Lcom/fasterxml/jackson/core/JsonParser;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;", "Lde/oth/othappserver/jobmarket/ObjectJobMarketRequestResponse;", "Lde/oth/othappserver/jobmarket/ListJobMarketRequestResponse;", "oth-app-server"})
public abstract class JobMarketRequestResponse<T extends de.oth.othappserver.jobmarket.JobMarketCall, R extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final T call = null;
    
    public abstract R parse(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.core.JsonParser parser);
    
    @org.jetbrains.annotations.NotNull()
    public final T getCall() {
        return null;
    }
    
    private JobMarketRequestResponse(T call) {
        super();
    }
}