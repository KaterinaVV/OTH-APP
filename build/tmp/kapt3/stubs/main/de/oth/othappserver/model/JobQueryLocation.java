package de.oth.othappserver.model;

import java.lang.System;

/**
 * Filters for jobs in a specific area.
 * @param lat Latitude
 * @param lng Longitude
 * @param radius Radius in km.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lde/oth/othappserver/model/JobQueryLocation;", "", "lat", "Ljava/math/BigDecimal;", "lng", "radius", "", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)V", "getLat", "()Ljava/math/BigDecimal;", "getLng", "getRadius", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "oth-app-server"})
public final class JobQueryLocation {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lat", required = true)
    private final java.math.BigDecimal lat = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lng", required = true)
    private final java.math.BigDecimal lng = null;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "radius", required = true)
    private final int radius = 0;
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.DecimalMin(value = "1")
    public final java.math.BigDecimal getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.DecimalMin(value = "1")
    public final java.math.BigDecimal getLng() {
        return null;
    }
    
    @javax.validation.constraints.Min(value = 1L)
    public final int getRadius() {
        return 0;
    }
    
    public JobQueryLocation(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal lat, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal lng, int radius) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    /**
     * Filters for jobs in a specific area.
     * @param lat Latitude
     * @param lng Longitude
     * @param radius Radius in km.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.JobQueryLocation copy(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal lat, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal lng, int radius) {
        return null;
    }
    
    /**
     * Filters for jobs in a specific area.
     * @param lat Latitude
     * @param lng Longitude
     * @param radius Radius in km.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Filters for jobs in a specific area.
     * @param lat Latitude
     * @param lng Longitude
     * @param radius Radius in km.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Filters for jobs in a specific area.
     * @param lat Latitude
     * @param lng Longitude
     * @param radius Radius in km.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}