package de.oth.othappserver.log;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\n"}, d2 = {"Lde/oth/othappserver/log/LoggingRequestInterceptor;", "Lorg/apache/http/HttpRequestInterceptor;", "()V", "process", "", "request", "Lorg/apache/http/HttpRequest;", "context", "Lorg/apache/http/protocol/HttpContext;", "Companion", "oth-app-server"})
public final class LoggingRequestInterceptor implements org.apache.http.HttpRequestInterceptor {
    @org.jetbrains.annotations.NotNull()
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.log.LoggingRequestInterceptor.Companion Companion = null;
    
    @java.lang.Override()
    public void process(@org.jetbrains.annotations.NotNull()
    org.apache.http.HttpRequest request, @org.jetbrains.annotations.Nullable()
    org.apache.http.protocol.HttpContext context) {
    }
    
    public LoggingRequestInterceptor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/oth/othappserver/log/LoggingRequestInterceptor$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "oth-app-server"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.slf4j.Logger getLogger() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}