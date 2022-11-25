package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\b\u0010\u0012\u001a\u00020\u0013H\u0017J\b\u0010\u0014\u001a\u00020\u0015H\u0017\u00a8\u0006\u0017"}, d2 = {"Lde/oth/othappserver/config/HttpConfig;", "", "()V", "connectionManager", "Lorg/apache/http/impl/conn/PoolingHttpClientConnectionManager;", "etagFilter", "Ljavax/servlet/Filter;", "getUrlWithoutParameters", "", "request", "Lorg/apache/http/HttpRequest;", "httpClient", "Lorg/apache/http/client/HttpClient;", "Lorg/apache/http/conn/HttpClientConnectionManager;", "registry", "Lio/micrometer/core/instrument/MeterRegistry;", "httpProps", "Lde/oth/othappserver/config/HttpProperties;", "springDocConfigProperties", "Lorg/springdoc/core/SpringDocConfigProperties;", "springDocConfiguration", "Lorg/springdoc/core/SpringDocConfiguration;", "ResourceUrlAdvice", "oth-app-server"})
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {de.oth.othappserver.config.HttpProperties.class})
@org.springframework.boot.autoconfigure.EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration.class})
@org.springframework.context.annotation.Configuration()
public class HttpConfig {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.apache.http.impl.conn.PoolingHttpClientConnectionManager connectionManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.apache.http.client.HttpClient httpClient(@org.jetbrains.annotations.NotNull()
    org.apache.http.conn.HttpClientConnectionManager connectionManager, @org.jetbrains.annotations.NotNull()
    io.micrometer.core.instrument.MeterRegistry registry, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.config.HttpProperties httpProps) {
        return null;
    }
    
    /**
     * Returns a uri without its query parameters for security reasons.
     */
    private final java.lang.String getUrlWithoutParameters(org.apache.http.HttpRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public javax.servlet.Filter etagFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springdoc.core.SpringDocConfiguration springDocConfiguration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springdoc.core.SpringDocConfigProperties springDocConfigProperties() {
        return null;
    }
    
    public HttpConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0003H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lde/oth/othappserver/config/HttpConfig$ResourceUrlAdvice;", "", "resourceUrlProvider", "Lorg/springframework/web/servlet/resource/ResourceUrlProvider;", "(Lorg/springframework/web/servlet/resource/ResourceUrlProvider;)V", "getResourceUrlProvider", "()Lorg/springframework/web/servlet/resource/ResourceUrlProvider;", "setResourceUrlProvider", "urls", "oth-app-server"})
    @org.springframework.web.bind.annotation.ControllerAdvice()
    public static class ResourceUrlAdvice {
        @org.jetbrains.annotations.NotNull()
        private org.springframework.web.servlet.resource.ResourceUrlProvider resourceUrlProvider;
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.ModelAttribute(value = "urls")
        public final org.springframework.web.servlet.resource.ResourceUrlProvider urls() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.springframework.web.servlet.resource.ResourceUrlProvider getResourceUrlProvider() {
            return null;
        }
        
        public final void setResourceUrlProvider(@org.jetbrains.annotations.NotNull()
        org.springframework.web.servlet.resource.ResourceUrlProvider p0) {
        }
        
        public ResourceUrlAdvice(@org.jetbrains.annotations.NotNull()
        org.springframework.web.servlet.resource.ResourceUrlProvider resourceUrlProvider) {
            super();
        }
    }
}