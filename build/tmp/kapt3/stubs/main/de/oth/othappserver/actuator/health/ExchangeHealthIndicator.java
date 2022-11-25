package de.oth.othappserver.actuator.health;

import java.lang.System;

/**
 * Simple implementation of a {@link HealthIndicator} returning status information for
 * an exchange REST API.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lde/oth/othappserver/actuator/health/ExchangeHealthIndicator;", "Lorg/springframework/boot/actuate/health/AbstractHealthIndicator;", "exchangeClient", "Lde/oth/othappserver/exchange/ExchangeClient;", "(Lde/oth/othappserver/exchange/ExchangeClient;)V", "from", "Ljava/time/ZonedDateTime;", "to", "doHealthCheck", "", "builder", "Lorg/springframework/boot/actuate/health/Health$Builder;", "oth-app-server"})
@org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator(value = "exchange")
@org.springframework.stereotype.Component()
public final class ExchangeHealthIndicator extends org.springframework.boot.actuate.health.AbstractHealthIndicator {
    private final java.time.ZonedDateTime from = null;
    private final java.time.ZonedDateTime to = null;
    private final de.oth.othappserver.exchange.ExchangeClient exchangeClient = null;
    
    @java.lang.Override()
    protected void doHealthCheck(@org.jetbrains.annotations.NotNull()
    org.springframework.boot.actuate.health.Health.Builder builder) {
    }
    
    public ExchangeHealthIndicator(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.exchange.ExchangeClient exchangeClient) {
        super();
    }
}