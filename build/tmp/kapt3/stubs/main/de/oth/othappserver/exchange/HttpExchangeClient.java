package de.oth.othappserver.exchange;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ;\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J*\u0010\'\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020)H\u0016J \u0010*\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J \u00102\u001a\b\u0012\u0004\u0012\u0002H403\"\u0004\b\u0000\u00104*\n\u0012\u0006\u0012\u0004\u0018\u0001H403H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lde/oth/othappserver/exchange/HttpExchangeClient;", "Lde/oth/othappserver/exchange/ExchangeClient;", "client", "Lorg/apache/http/client/HttpClient;", "contextSupplier", "Lkotlin/Function0;", "Lorg/apache/http/client/protocol/HttpClientContext;", "calendarURI", "", "mailURI", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "exchangeProperties", "Lde/oth/othappserver/exchange/ExchangeProperties;", "(Lorg/apache/http/client/HttpClient;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/jackson/databind/ObjectMapper;Lde/oth/othappserver/exchange/ExchangeProperties;)V", "getContextSupplier", "()Lkotlin/jvm/functions/Function0;", "createRequest", "Lorg/apache/http/client/methods/HttpGet;", "startDateTime", "Ljava/time/ZonedDateTime;", "endDateTime", "deltaToken", "skipToken", "pageSize", "", "(Ljava/time/ZonedDateTime;Ljava/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lorg/apache/http/client/methods/HttpGet;", "executeRequest", "Lde/oth/othappserver/exchange/ExchangeResult;", "request", "getExchangeResult", "exchangeContainer", "Lde/oth/othappserver/exchange/data/ExchangeContainer;", "mapToIExchangeEvents", "", "Lde/oth/othappserver/exchange/IExchangeEvent;", "origEvents", "", "Lde/oth/othappserver/exchange/data/ExchangeEvent;", "queryEvents", "paged", "", "queryEventsPage", "readResponse", "response", "Lorg/apache/http/HttpResponse;", "sendFeedbackMail", "", "feedbackItem", "Lde/oth/othappserver/model/FeedbackItem;", "filterNull", "Ljava/util/stream/Stream;", "T", "Companion", "oth-app-server"})
public final class HttpExchangeClient implements de.oth.othappserver.exchange.ExchangeClient {
    private final org.apache.http.client.HttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<org.apache.http.client.protocol.HttpClientContext> contextSupplier = null;
    private final java.lang.String calendarURI = null;
    private final java.lang.String mailURI = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private final de.oth.othappserver.exchange.ExchangeProperties exchangeProperties = null;
    private static final java.lang.String DELTA_TOKEN_LITERAL = "deltatoken=";
    private static final java.lang.String SKIP_TOKEN_LITERAL = "skiptoken=";
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.exchange.HttpExchangeClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.oth.othappserver.exchange.ExchangeResult queryEvents(@org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime startDateTime, @org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime endDateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, boolean paged) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.oth.othappserver.exchange.ExchangeResult queryEventsPage(@org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime startDateTime, @org.jetbrains.annotations.NotNull()
    java.time.ZonedDateTime endDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String skipToken) {
        return null;
    }
    
    /**
     * https://docs.microsoft.com/en-us/previous-versions/office/office-365-api/api/version-2.0/mail-rest-operations#SendMessages
     */
    @java.lang.Override()
    public void sendFeedbackMail(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.FeedbackItem feedbackItem) {
    }
    
    private final de.oth.othappserver.exchange.ExchangeResult executeRequest(org.apache.http.client.methods.HttpGet request) {
        return null;
    }
    
    /**
     * Reads the JSON value of the content of a response
     *
     * The response entity will be closed afterwards.
     */
    private final de.oth.othappserver.exchange.data.ExchangeContainer readResponse(org.apache.http.HttpResponse response) {
        return null;
    }
    
    private final de.oth.othappserver.exchange.ExchangeResult getExchangeResult(de.oth.othappserver.exchange.data.ExchangeContainer exchangeContainer) {
        return null;
    }
    
    private final java.util.List<de.oth.othappserver.exchange.IExchangeEvent> mapToIExchangeEvents(java.util.Collection<? extends de.oth.othappserver.exchange.data.ExchangeEvent> origEvents) {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final <T extends java.lang.Object>java.util.stream.Stream<T> filterNull(java.util.stream.Stream<T> $this$filterNull) {
        return null;
    }
    
    private final org.apache.http.client.methods.HttpGet createRequest(java.time.ZonedDateTime startDateTime, java.time.ZonedDateTime endDateTime, java.lang.String deltaToken, java.lang.String skipToken, java.lang.Integer pageSize) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<org.apache.http.client.protocol.HttpClientContext> getContextSupplier() {
        return null;
    }
    
    public HttpExchangeClient(@org.jetbrains.annotations.NotNull()
    org.apache.http.client.HttpClient client, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends org.apache.http.client.protocol.HttpClientContext> contextSupplier, @org.jetbrains.annotations.NotNull()
    java.lang.String calendarURI, @org.jetbrains.annotations.NotNull()
    java.lang.String mailURI, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.exchange.ExchangeProperties exchangeProperties) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lde/oth/othappserver/exchange/HttpExchangeClient$Companion;", "", "()V", "DELTA_TOKEN_LITERAL", "", "SKIP_TOKEN_LITERAL", "logger", "Lorg/slf4j/Logger;", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}