package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0006"}, d2 = {"Lde/oth/othappserver/config/JacksonConfig;", "", "()V", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "Companion", "oth-app-server"})
@org.springframework.context.annotation.Configuration()
public class JacksonConfig {
    @org.jetbrains.annotations.NotNull()
    private static final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.config.JacksonConfig.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {
        return null;
    }
    
    public JacksonConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/oth/othappserver/config/JacksonConfig$Companion;", "", "()V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "getMapper", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "oth-app-server"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fasterxml.jackson.databind.ObjectMapper getMapper() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}