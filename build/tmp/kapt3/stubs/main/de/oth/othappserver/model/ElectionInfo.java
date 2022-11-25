package de.oth.othappserver.model;

import java.lang.System;

/**
 * @param electionStart Date of the start of the election.
 * @param electionEnd Date of the end of the election.
 * @param startShowElectionInfo Date when to show the election info in the app.
 * @param endShowElectionInfo Date when to stop showing the election info.
 * @param howToVoteShort Short description of how to vote.
 * @param howToVoteLong Detailed description of how to vote.
 * @param whatToVoteSenat Description of voting for the senate.
 * @param whatToVoteKonvent Description of voting for the Studentischen Konvent.
 * @param whatToVoteFaculty Description of voting for the Fakultätsrat.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00c6\u0003Jm\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012\u00a8\u0006)"}, d2 = {"Lde/oth/othappserver/model/ElectionInfo;", "", "electionStart", "Ljava/time/LocalDate;", "electionEnd", "startShowElectionInfo", "endShowElectionInfo", "howToVoteShort", "howToVoteLong", "whatToVoteSenat", "whatToVoteKonvent", "whatToVoteFaculty", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getElectionEnd", "()Ljava/time/LocalDate;", "getElectionStart", "getEndShowElectionInfo", "getHowToVoteLong", "()Ljava/lang/Object;", "getHowToVoteShort", "getStartShowElectionInfo", "getWhatToVoteFaculty", "getWhatToVoteKonvent", "getWhatToVoteSenat", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oth-app-server"})
public final class ElectionInfo {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "electionStart", required = true)
    @javax.validation.Valid()
    private final java.time.LocalDate electionStart = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "electionEnd", required = true)
    @javax.validation.Valid()
    private final java.time.LocalDate electionEnd = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "startShowElectionInfo", required = true)
    @javax.validation.Valid()
    private final java.time.LocalDate startShowElectionInfo = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "endShowElectionInfo", required = true)
    @javax.validation.Valid()
    private final java.time.LocalDate endShowElectionInfo = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "howToVoteShort")
    @javax.validation.Valid()
    private final java.lang.Object howToVoteShort = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "howToVoteLong")
    @javax.validation.Valid()
    private final java.lang.Object howToVoteLong = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "whatToVoteSenat")
    @javax.validation.Valid()
    private final java.lang.Object whatToVoteSenat = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "whatToVoteKonvent")
    @javax.validation.Valid()
    private final java.lang.Object whatToVoteKonvent = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "whatToVoteFaculty")
    @javax.validation.Valid()
    private final java.lang.Object whatToVoteFaculty = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getElectionStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getElectionEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getStartShowElectionInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getEndShowElectionInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHowToVoteShort() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHowToVoteLong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWhatToVoteSenat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWhatToVoteKonvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWhatToVoteFaculty() {
        return null;
    }
    
    public ElectionInfo(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate electionStart, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate electionEnd, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate startShowElectionInfo, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endShowElectionInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Object howToVoteShort, @org.jetbrains.annotations.Nullable()
    java.lang.Object howToVoteLong, @org.jetbrains.annotations.Nullable()
    java.lang.Object whatToVoteSenat, @org.jetbrains.annotations.Nullable()
    java.lang.Object whatToVoteKonvent, @org.jetbrains.annotations.Nullable()
    java.lang.Object whatToVoteFaculty) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component9() {
        return null;
    }
    
    /**
     * @param electionStart Date of the start of the election.
     * @param electionEnd Date of the end of the election.
     * @param startShowElectionInfo Date when to show the election info in the app.
     * @param endShowElectionInfo Date when to stop showing the election info.
     * @param howToVoteShort Short description of how to vote.
     * @param howToVoteLong Detailed description of how to vote.
     * @param whatToVoteSenat Description of voting for the senate.
     * @param whatToVoteKonvent Description of voting for the Studentischen Konvent.
     * @param whatToVoteFaculty Description of voting for the Fakultätsrat.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.model.ElectionInfo copy(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate electionStart, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate electionEnd, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate startShowElectionInfo, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endShowElectionInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Object howToVoteShort, @org.jetbrains.annotations.Nullable()
    java.lang.Object howToVoteLong, @org.jetbrains.annotations.Nullable()
    java.lang.Object whatToVoteSenat, @org.jetbrains.annotations.Nullable()
    java.lang.Object whatToVoteKonvent, @org.jetbrains.annotations.Nullable()
    java.lang.Object whatToVoteFaculty) {
        return null;
    }
    
    /**
     * @param electionStart Date of the start of the election.
     * @param electionEnd Date of the end of the election.
     * @param startShowElectionInfo Date when to show the election info in the app.
     * @param endShowElectionInfo Date when to stop showing the election info.
     * @param howToVoteShort Short description of how to vote.
     * @param howToVoteLong Detailed description of how to vote.
     * @param whatToVoteSenat Description of voting for the senate.
     * @param whatToVoteKonvent Description of voting for the Studentischen Konvent.
     * @param whatToVoteFaculty Description of voting for the Fakultätsrat.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @param electionStart Date of the start of the election.
     * @param electionEnd Date of the end of the election.
     * @param startShowElectionInfo Date when to show the election info in the app.
     * @param endShowElectionInfo Date when to stop showing the election info.
     * @param howToVoteShort Short description of how to vote.
     * @param howToVoteLong Detailed description of how to vote.
     * @param whatToVoteSenat Description of voting for the senate.
     * @param whatToVoteKonvent Description of voting for the Studentischen Konvent.
     * @param whatToVoteFaculty Description of voting for the Fakultätsrat.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param electionStart Date of the start of the election.
     * @param electionEnd Date of the end of the election.
     * @param startShowElectionInfo Date when to show the election info in the app.
     * @param endShowElectionInfo Date when to stop showing the election info.
     * @param howToVoteShort Short description of how to vote.
     * @param howToVoteLong Detailed description of how to vote.
     * @param whatToVoteSenat Description of voting for the senate.
     * @param whatToVoteKonvent Description of voting for the Studentischen Konvent.
     * @param whatToVoteFaculty Description of voting for the Fakultätsrat.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}