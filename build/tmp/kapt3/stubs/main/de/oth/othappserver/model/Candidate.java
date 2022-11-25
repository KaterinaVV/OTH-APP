package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param firstName First name of the candidate.
 * @param lastName Last name of the candidate.
 * @param course Course of studies the candidate applied to.
 * @param term The term the candidate is currently graduating.
 * @param offices A list of offices the candidate is running for.
 * @param goals The goals the candidate wants to achieve during his/her time in office.
 * @param faculty The faculty of the candidate and his course.
 * @param id Identification number of the candidate
 * @param motto The motto of the candidate.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u000201Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010&\u001a\u00020\rH\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jx\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00062"}, d2 = {"Lde/oth/othappserver/model/Candidate;", "", "firstName", "", "lastName", "course", "term", "", "offices", "", "Lde/oth/othappserver/model/Candidate$Offices;", "goals", "faculty", "Lde/oth/othappserver/model/Candidate$Faculty;", "id", "motto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lde/oth/othappserver/model/Candidate$Faculty;Ljava/lang/Integer;Ljava/lang/String;)V", "getCourse", "()Ljava/lang/String;", "getFaculty", "()Lde/oth/othappserver/model/Candidate$Faculty;", "getFirstName", "getGoals", "()Ljava/util/List;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastName", "getMotto", "getOffices", "getTerm", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lde/oth/othappserver/model/Candidate$Faculty;Ljava/lang/Integer;Ljava/lang/String;)Lde/oth/othappserver/model/Candidate;", "equals", "", "other", "hashCode", "toString", "Faculty", "Offices", "oth-app-server"})
public final class Candidate {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "firstName", required = true)
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lastName", required = true)
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "course", required = true)
    private final java.lang.String course = null;
    @com.fasterxml.jackson.annotation.JsonProperty(value = "term", required = true)
    private final int term = 0;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "offices", required = true)
    private final java.util.List<de.oth.othappserver.model.Candidate.Offices> offices = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "goals", required = true)
    private final java.util.List<java.lang.String> goals = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "faculty", required = true)
    private final de.oth.othappserver.model.Candidate.Faculty faculty = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "motto")
    private final java.lang.String motto = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCourse() {
        return null;
    }
    
    public final int getTerm() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 1)
    public final java.util.List<de.oth.othappserver.model.Candidate.Offices> getOffices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGoals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Candidate.Faculty getFaculty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMotto() {
        return null;
    }
    
    public Candidate(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String course, int term, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.model.Candidate.Offices> offices, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Candidate.Faculty faculty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String motto) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.model.Candidate.Offices> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Candidate.Faculty component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * @param firstName First name of the candidate.
     * @param lastName Last name of the candidate.
     * @param course Course of studies the candidate applied to.
     * @param term The term the candidate is currently graduating.
     * @param offices A list of offices the candidate is running for.
     * @param goals The goals the candidate wants to achieve during his/her time in office.
     * @param faculty The faculty of the candidate and his course.
     * @param id Identification number of the candidate
     * @param motto The motto of the candidate.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.Candidate copy(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String course, int term, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.model.Candidate.Offices> offices, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Candidate.Faculty faculty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String motto) {
        return null;
    }
    
    /**
     * @param firstName First name of the candidate.
     * @param lastName Last name of the candidate.
     * @param course Course of studies the candidate applied to.
     * @param term The term the candidate is currently graduating.
     * @param offices A list of offices the candidate is running for.
     * @param goals The goals the candidate wants to achieve during his/her time in office.
     * @param faculty The faculty of the candidate and his course.
     * @param id Identification number of the candidate
     * @param motto The motto of the candidate.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param firstName First name of the candidate.
     * @param lastName Last name of the candidate.
     * @param course Course of studies the candidate applied to.
     * @param term The term the candidate is currently graduating.
     * @param offices A list of offices the candidate is running for.
     * @param goals The goals the candidate wants to achieve during his/her time in office.
     * @param faculty The faculty of the candidate and his course.
     * @param id Identification number of the candidate
     * @param motto The motto of the candidate.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param firstName First name of the candidate.
     * @param lastName Last name of the candidate.
     * @param course Course of studies the candidate applied to.
     * @param term The term the candidate is currently graduating.
     * @param offices A list of offices the candidate is running for.
     * @param goals The goals the candidate wants to achieve during his/her time in office.
     * @param faculty The faculty of the candidate and his course.
     * @param id Identification number of the candidate
     * @param motto The motto of the candidate.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * A list of offices the candidate is running for.
     * Values: STUDENTISCHER_KONVENT,SENAT,FAKULTAETSRAT
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lde/oth/othappserver/model/Candidate$Offices;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STUDENTISCHER_KONVENT", "SENAT", "FAKULTAETSRAT", "oth-app-server"})
    public static enum Offices {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Studentischer Konvent")
        /*public static final*/ STUDENTISCHER_KONVENT /* = new STUDENTISCHER_KONVENT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Senat")
        /*public static final*/ SENAT /* = new SENAT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Fakultaetsrat")
        /*public static final*/ FAKULTAETSRAT /* = new FAKULTAETSRAT(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Offices(java.lang.String value) {
        }
    }
    
    /**
     * The faculty of the candidate and his course.
     * Values: ANK,ARC,ASG,BAU,BW,EI,IM,MB
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lde/oth/othappserver/model/Candidate$Faculty;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANK", "ARC", "ASG", "BAU", "BW", "EI", "IM", "MB", "oth-app-server"})
    public static enum Faculty {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "ANK")
        /*public static final*/ ANK /* = new ANK(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "ARC")
        /*public static final*/ ARC /* = new ARC(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "ASG")
        /*public static final*/ ASG /* = new ASG(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "BAU")
        /*public static final*/ BAU /* = new BAU(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "BW")
        /*public static final*/ BW /* = new BW(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "EI")
        /*public static final*/ EI /* = new EI(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "IM")
        /*public static final*/ IM /* = new IM(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "MB")
        /*public static final*/ MB /* = new MB(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Faculty(java.lang.String value) {
        }
    }
}