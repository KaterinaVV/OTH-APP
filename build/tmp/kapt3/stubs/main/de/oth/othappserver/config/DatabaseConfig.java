package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lde/oth/othappserver/config/DatabaseConfig;", "", "()V", "logger", "Lorg/slf4j/Logger;", "dataSource", "Ljavax/sql/DataSource;", "oth-app-server"})
@ConditionalOnEnvironment(value = "DATABASE_URL")
@org.springframework.context.annotation.Configuration()
public class DatabaseConfig {
    private final org.slf4j.Logger logger = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public javax.sql.DataSource dataSource() throws java.net.URISyntaxException {
        return null;
    }
    
    public DatabaseConfig() {
        super();
    }
}