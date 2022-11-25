package de.oth.othappserver.actuator.health;

import java.lang.System;

/**
 * Simple implementation of a {@link HealthIndicator} returning status information for
 * an WebUntis API.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/oth/othappserver/actuator/health/WebUntisHealthIndicator;", "Lorg/springframework/boot/actuate/health/AbstractHealthIndicator;", "webUntisClient", "Lde/oth/othappserver/webuntis/WebUntisClient;", "(Lde/oth/othappserver/webuntis/WebUntisClient;)V", "doHealthCheck", "", "builder", "Lorg/springframework/boot/actuate/health/Health$Builder;", "oth-app-server"})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = {"app.webuntis.enabled"})
@org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator(value = "webuntis")
@org.springframework.stereotype.Component()
public final class WebUntisHealthIndicator extends org.springframework.boot.actuate.health.AbstractHealthIndicator {
    private final de.oth.othappserver.webuntis.WebUntisClient webUntisClient = null;
    
    @java.lang.Override()
    protected void doHealthCheck(@org.jetbrains.annotations.NotNull()
    org.springframework.boot.actuate.health.Health.Builder builder) {
    }
    
    public WebUntisHealthIndicator(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.webuntis.WebUntisClient webUntisClient) {
        super();
    }
}