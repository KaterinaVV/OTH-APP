package de.oth.othappserver.actuator;

import java.lang.System;

/**
 * Contains additional configuration for actuator endpoints.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0017\u00a8\u0006\b"}, d2 = {"Lde/oth/othappserver/actuator/ActuatorConfig;", "", "()V", "metricsCommonTags", "Lorg/springframework/boot/actuate/autoconfigure/metrics/MeterRegistryCustomizer;", "Lio/micrometer/core/instrument/MeterRegistry;", "applicationName", "", "oth-app-server"})
@org.springframework.context.annotation.Configuration()
public class ActuatorConfig {
    
    /**
     * Adds common tags for metrics like the applications name.
     */
    @org.jetbrains.annotations.Nullable()
    @org.springframework.context.annotation.Bean()
    public org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer<io.micrometer.core.instrument.MeterRegistry> metricsCommonTags(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${spring.application.name}")
    java.lang.String applicationName) {
        return null;
    }
    
    public ActuatorConfig() {
        super();
    }
}