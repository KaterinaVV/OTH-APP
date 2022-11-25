package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param id Id of the Job
 * @param title Title of the Job Offer
 * @param logo URL pointing at a logo
 * @param url Job market URL
 * @param creationDate Date time when this Job Offer has been created.
 * @param text Additional text describing the Job Offer.
 * @param websiteUrl Job market URL
 * @param expiryDate Date time when this Job Offer expires.
 * @param faculties List of faculties this Job applies to.
 * @param industries List of industries this Job applies to.
 * @param company Company behind this Job Offer
 * @param lat Geographical latitute
 * @param lng Geographical longitude
 * @param contactTitle Title of the person to contact.
 * @param contactForname Forname of the person to contact.
 * @param contactSurname Surname of the person to contact.
 * @param contactEmail Email of the person to contact.
 * @param country Country where the Job is located at.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00d1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH\u00c6\u0003J\u00e1\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001J\t\u0010H\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001b\u00a8\u0006I"}, d2 = {"Lde/oth/othappserver/model/JobDetails;", "", "id", "", "title", "", "logo", "url", "creationDate", "Ljava/time/OffsetDateTime;", "text", "websiteUrl", "expiryDate", "faculties", "", "industries", "company", "lat", "Ljava/math/BigDecimal;", "lng", "contactTitle", "contactForname", "contactSurname", "contactEmail", "country", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompany", "()Ljava/lang/String;", "getContactEmail", "getContactForname", "getContactSurname", "getContactTitle", "getCountry", "getCreationDate", "()Ljava/time/OffsetDateTime;", "getExpiryDate", "getFaculties", "()Ljava/util/List;", "getId", "()I", "getIndustries", "getLat", "()Ljava/math/BigDecimal;", "getLng", "getLogo", "getText", "getTitle", "getUrl", "getWebsiteUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "oth-app-server"})
public final class JobDetails {
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id", required = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "title", required = true)
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "logo", required = true)
    private final java.lang.String logo = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "url", required = true)
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "creationDate", required = true)
    private final java.time.OffsetDateTime creationDate = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "text", required = true)
    private final java.lang.String text = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "websiteUrl")
    private final java.lang.String websiteUrl = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "expiryDate")
    private final java.time.OffsetDateTime expiryDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "faculties")
    private final java.util.List<java.lang.String> faculties = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "industries")
    private final java.util.List<java.lang.Integer> industries = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "company")
    private final java.lang.String company = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lat")
    private final java.math.BigDecimal lat = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lng")
    private final java.math.BigDecimal lng = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "contactTitle")
    private final java.lang.String contactTitle = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "contactForname")
    private final java.lang.String contactForname = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "contactSurname")
    private final java.lang.String contactSurname = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "contactEmail")
    private final java.lang.String contactEmail = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "country")
    private final java.lang.String country = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getCreationDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebsiteUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getExpiryDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getFaculties() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getIndustries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getLng() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContactTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContactForname() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContactSurname() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContactEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public JobDetails(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String logo, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String websiteUrl, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime expiryDate, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> faculties, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> industries, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal lat, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal lng, @org.jetbrains.annotations.Nullable()
    java.lang.String contactTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String contactForname, @org.jetbrains.annotations.Nullable()
    java.lang.String contactSurname, @org.jetbrains.annotations.Nullable()
    java.lang.String contactEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String country) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    /**
     * @param id Id of the Job
     * @param title Title of the Job Offer
     * @param logo URL pointing at a logo
     * @param url Job market URL
     * @param creationDate Date time when this Job Offer has been created.
     * @param text Additional text describing the Job Offer.
     * @param websiteUrl Job market URL
     * @param expiryDate Date time when this Job Offer expires.
     * @param faculties List of faculties this Job applies to.
     * @param industries List of industries this Job applies to.
     * @param company Company behind this Job Offer
     * @param lat Geographical latitute
     * @param lng Geographical longitude
     * @param contactTitle Title of the person to contact.
     * @param contactForname Forname of the person to contact.
     * @param contactSurname Surname of the person to contact.
     * @param contactEmail Email of the person to contact.
     * @param country Country where the Job is located at.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.JobDetails copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String logo, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String websiteUrl, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime expiryDate, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> faculties, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> industries, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal lat, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal lng, @org.jetbrains.annotations.Nullable()
    java.lang.String contactTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String contactForname, @org.jetbrains.annotations.Nullable()
    java.lang.String contactSurname, @org.jetbrains.annotations.Nullable()
    java.lang.String contactEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String country) {
        return null;
    }
    
    /**
     * @param id Id of the Job
     * @param title Title of the Job Offer
     * @param logo URL pointing at a logo
     * @param url Job market URL
     * @param creationDate Date time when this Job Offer has been created.
     * @param text Additional text describing the Job Offer.
     * @param websiteUrl Job market URL
     * @param expiryDate Date time when this Job Offer expires.
     * @param faculties List of faculties this Job applies to.
     * @param industries List of industries this Job applies to.
     * @param company Company behind this Job Offer
     * @param lat Geographical latitute
     * @param lng Geographical longitude
     * @param contactTitle Title of the person to contact.
     * @param contactForname Forname of the person to contact.
     * @param contactSurname Surname of the person to contact.
     * @param contactEmail Email of the person to contact.
     * @param country Country where the Job is located at.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param id Id of the Job
     * @param title Title of the Job Offer
     * @param logo URL pointing at a logo
     * @param url Job market URL
     * @param creationDate Date time when this Job Offer has been created.
     * @param text Additional text describing the Job Offer.
     * @param websiteUrl Job market URL
     * @param expiryDate Date time when this Job Offer expires.
     * @param faculties List of faculties this Job applies to.
     * @param industries List of industries this Job applies to.
     * @param company Company behind this Job Offer
     * @param lat Geographical latitute
     * @param lng Geographical longitude
     * @param contactTitle Title of the person to contact.
     * @param contactForname Forname of the person to contact.
     * @param contactSurname Surname of the person to contact.
     * @param contactEmail Email of the person to contact.
     * @param country Country where the Job is located at.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param id Id of the Job
     * @param title Title of the Job Offer
     * @param logo URL pointing at a logo
     * @param url Job market URL
     * @param creationDate Date time when this Job Offer has been created.
     * @param text Additional text describing the Job Offer.
     * @param websiteUrl Job market URL
     * @param expiryDate Date time when this Job Offer expires.
     * @param faculties List of faculties this Job applies to.
     * @param industries List of industries this Job applies to.
     * @param company Company behind this Job Offer
     * @param lat Geographical latitute
     * @param lng Geographical longitude
     * @param contactTitle Title of the person to contact.
     * @param contactForname Forname of the person to contact.
     * @param contactSurname Surname of the person to contact.
     * @param contactEmail Email of the person to contact.
     * @param country Country where the Job is located at.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}