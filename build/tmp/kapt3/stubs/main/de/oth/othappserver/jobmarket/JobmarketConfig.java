package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lde/oth/othappserver/jobmarket/JobmarketConfig;", "", "()V", "oth-app-server"})
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {de.oth.othappserver.jobmarket.JobmarketProperties.class})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.jobmarket.enabled"})
@org.springframework.context.annotation.Configuration()
public class JobmarketConfig {
    
    public JobmarketConfig() {
        super();
    }
}