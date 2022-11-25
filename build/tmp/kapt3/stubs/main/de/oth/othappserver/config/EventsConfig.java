package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lde/oth/othappserver/config/EventsConfig;", "", "()V", "activeProfiles", "", "environment", "Lorg/springframework/core/env/Environment;", "exchangeHost", "Lorg/apache/http/HttpHost;", "exchangeClient", "Lde/oth/othappserver/exchange/ExchangeClient;", "exchangeHttpClient", "Lorg/apache/http/client/HttpClient;", "exchangeProperties", "Lde/oth/othappserver/exchange/ExchangeProperties;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "oth-app-server"})
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {de.oth.othappserver.exchange.ExchangeProperties.class})
@org.springframework.context.annotation.Configuration()
public class EventsConfig {
    private final org.apache.http.HttpHost exchangeHost = null;
    @org.springframework.beans.factory.annotation.Value(value = "${spring.profiles.active:}")
    private java.lang.String activeProfiles;
    @org.springframework.beans.factory.annotation.Autowired()
    private org.springframework.core.env.Environment environment;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public de.oth.othappserver.exchange.ExchangeClient exchangeClient(@org.jetbrains.annotations.NotNull()
    org.apache.http.client.HttpClient exchangeHttpClient, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.exchange.ExchangeProperties exchangeProperties, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        return null;
    }
    
    public EventsConfig() {
        super();
    }
}