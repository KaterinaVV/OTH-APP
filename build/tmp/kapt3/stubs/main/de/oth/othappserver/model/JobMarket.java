package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param industries A list of available Industries in the Job Market.
 * @param jobtypes A list of available Job Types.
 * @param countries A list of available countries to filter for.
 * @param companies A list of available companies to filter for.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003JI\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lde/oth/othappserver/model/JobMarket;", "", "industries", "", "Lde/oth/othappserver/model/Industry;", "jobtypes", "Lde/oth/othappserver/model/JobType;", "countries", "", "companies", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCompanies", "()Ljava/util/List;", "getCountries", "getIndustries", "getJobtypes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "oth-app-server"})
public final class JobMarket {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "industries", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.Industry> industries = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "jobtypes", required = true)
    @javax.validation.Valid()
    private final java.util.List<de.oth.othappserver.model.JobType> jobtypes = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "countries", required = true)
    private final java.util.List<java.lang.String> countries = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "companies", required = true)
    private final java.util.List<java.lang.String> companies = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Industry> getIndustries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.JobType> getJobtypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCompanies() {
        return null;
    }
    
    public JobMarket(@org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Industry> industries, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.JobType> jobtypes, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> companies) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Industry> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.JobType> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    /**
     * @param industries A list of available Industries in the Job Market.
     * @param jobtypes A list of available Job Types.
     * @param countries A list of available countries to filter for.
     * @param companies A list of available companies to filter for.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.JobMarket copy(@org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.Industry> industries, @org.jetbrains.annotations.NotNull()
    java.util.List<de.oth.othappserver.model.JobType> jobtypes, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> companies) {
        return null;
    }
    
    /**
     * @param industries A list of available Industries in the Job Market.
     * @param jobtypes A list of available Job Types.
     * @param countries A list of available countries to filter for.
     * @param companies A list of available companies to filter for.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param industries A list of available Industries in the Job Market.
     * @param jobtypes A list of available Job Types.
     * @param countries A list of available countries to filter for.
     * @param companies A list of available companies to filter for.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param industries A list of available Industries in the Job Market.
     * @param jobtypes A list of available Job Types.
     * @param countries A list of available countries to filter for.
     * @param companies A list of available companies to filter for.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}