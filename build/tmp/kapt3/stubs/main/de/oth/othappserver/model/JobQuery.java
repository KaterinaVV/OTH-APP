package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param faculty Identifier of a Faculty. Filters for Jobs of that faculty.
 * @param type Type of a Job. Filters for Jobs of that type. Multiple types are allowed.
 * @param industry Industry of a Job. Filters for Jobs of that industry. Multiple industries are allowed.
 * @param text Additional text to search in Job Offers.
 * @param country Country where the Job is located at.
 * @param company Company providing a Job Offer.
 * @param location 
 * @param since Filter for Jobs after this date (inclusive).
 * @param max Maximum number of Job results.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0006H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016\u00a8\u00060"}, d2 = {"Lde/oth/othappserver/model/JobQuery;", "", "faculty", "", "type", "", "", "industry", "text", "country", "company", "location", "Lde/oth/othappserver/model/JobQueryLocation;", "since", "Ljava/time/LocalDate;", "max", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/oth/othappserver/model/JobQueryLocation;Ljava/time/LocalDate;Ljava/lang/Integer;)V", "getCompany", "()Ljava/lang/String;", "getCountry", "getFaculty", "getIndustry", "()Ljava/util/List;", "getLocation", "()Lde/oth/othappserver/model/JobQueryLocation;", "getMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSince", "()Ljava/time/LocalDate;", "getText", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/oth/othappserver/model/JobQueryLocation;Ljava/time/LocalDate;Ljava/lang/Integer;)Lde/oth/othappserver/model/JobQuery;", "equals", "", "other", "hashCode", "toString", "oth-app-server"})
public final class JobQuery {
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "faculty")
    private final java.lang.String faculty = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type")
    private final java.util.List<java.lang.Integer> type = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "industry")
    private final java.util.List<java.lang.Integer> industry = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "text")
    private final java.lang.String text = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "country")
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "company")
    private final java.lang.String company = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "location")
    @javax.validation.Valid()
    private final de.oth.othappserver.model.JobQueryLocation location = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "since")
    @javax.validation.Valid()
    private final java.time.LocalDate since = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "max")
    private final java.lang.Integer max = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFaculty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getIndustry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.oth.othappserver.model.JobQueryLocation getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDate getSince() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Min(value = 1L)
    public final java.lang.Integer getMax() {
        return null;
    }
    
    public JobQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String faculty, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> type, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> industry, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    de.oth.othappserver.model.JobQueryLocation location, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate since, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max) {
        super();
    }
    
    public JobQuery() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final de.oth.othappserver.model.JobQueryLocation component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDate component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    /**
     * @param faculty Identifier of a Faculty. Filters for Jobs of that faculty.
     * @param type Type of a Job. Filters for Jobs of that type. Multiple types are allowed.
     * @param industry Industry of a Job. Filters for Jobs of that industry. Multiple industries are allowed.
     * @param text Additional text to search in Job Offers.
     * @param country Country where the Job is located at.
     * @param company Company providing a Job Offer.
     * @param location 
     * @param since Filter for Jobs after this date (inclusive).
     * @param max Maximum number of Job results.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.JobQuery copy(@org.jetbrains.annotations.Nullable()
    java.lang.String faculty, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> type, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> industry, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    de.oth.othappserver.model.JobQueryLocation location, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate since, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max) {
        return null;
    }
    
    /**
     * @param faculty Identifier of a Faculty. Filters for Jobs of that faculty.
     * @param type Type of a Job. Filters for Jobs of that type. Multiple types are allowed.
     * @param industry Industry of a Job. Filters for Jobs of that industry. Multiple industries are allowed.
     * @param text Additional text to search in Job Offers.
     * @param country Country where the Job is located at.
     * @param company Company providing a Job Offer.
     * @param location 
     * @param since Filter for Jobs after this date (inclusive).
     * @param max Maximum number of Job results.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param faculty Identifier of a Faculty. Filters for Jobs of that faculty.
     * @param type Type of a Job. Filters for Jobs of that type. Multiple types are allowed.
     * @param industry Industry of a Job. Filters for Jobs of that industry. Multiple industries are allowed.
     * @param text Additional text to search in Job Offers.
     * @param country Country where the Job is located at.
     * @param company Company providing a Job Offer.
     * @param location 
     * @param since Filter for Jobs after this date (inclusive).
     * @param max Maximum number of Job results.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param faculty Identifier of a Faculty. Filters for Jobs of that faculty.
     * @param type Type of a Job. Filters for Jobs of that type. Multiple types are allowed.
     * @param industry Industry of a Job. Filters for Jobs of that industry. Multiple industries are allowed.
     * @param text Additional text to search in Job Offers.
     * @param country Country where the Job is located at.
     * @param company Company providing a Job Offer.
     * @param location 
     * @param since Filter for Jobs after this date (inclusive).
     * @param max Maximum number of Job results.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}