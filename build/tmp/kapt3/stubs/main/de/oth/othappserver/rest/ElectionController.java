package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Ju\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016\u00a2\u0006\u0002\u0010\u0015J`\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010$\u001a\u00020\fH\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00062\u0006\u0010$\u001a\u00020\fH\u0016J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u000e0\u0006H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0006H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010$\u001a\u00020\fH\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002Js\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010$\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0002\u00101J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lde/oth/othappserver/rest/ElectionController;", "Lde/oth/othappserver/api/ElectionApi;", "electionService", "Lde/oth/othappserver/service/IElectionService;", "(Lde/oth/othappserver/service/IElectionService;)V", "createCandidate", "Lorg/springframework/http/ResponseEntity;", "", "firstName", "lastName", "course", "term", "", "offices", "", "goals", "faculty", "id", "motto", "file", "Lorg/springframework/core/io/Resource;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/springframework/core/io/Resource;)Lorg/springframework/http/ResponseEntity;", "createElectionInfo", "", "electionStart", "Ljava/time/LocalDate;", "electionEnd", "startShowElectionInfo", "endShowElectionInfo", "howToVoteShort", "", "howToVoteLong", "whatToVoteSenat", "whatToVoteKonvent", "whatToVoteFaculty", "deleteCandidate", "candidateId", "deleteElectionInfo", "getCandidateById", "Lde/oth/othappserver/model/Candidate;", "getCandidates", "getElectionInfo", "Lde/oth/othappserver/model/ElectionInfo;", "getImageOfCandidate", "mapFaculty", "Lde/oth/othappserver/model/Candidate$Faculty;", "mapOffices", "Lde/oth/othappserver/model/Candidate$Offices;", "updateCandidate", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lorg/springframework/http/ResponseEntity;", "uploadPictureOfCandidate", "oth-app-server"})
@org.springframework.web.bind.annotation.RestController()
public class ElectionController implements de.oth.othappserver.api.ElectionApi {
    private final de.oth.othappserver.service.IElectionService electionService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.lang.String> createCandidate(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String course, int term, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> offices, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
    java.lang.String faculty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String motto, @org.jetbrains.annotations.Nullable()
    org.springframework.core.io.Resource file) {
        return null;
    }
    
    private final de.oth.othappserver.model.Candidate.Faculty mapFaculty(java.lang.String faculty) {
        return null;
    }
    
    private final java.util.List<de.oth.othappserver.model.Candidate.Offices> mapOffices(java.util.List<java.lang.String> offices) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<kotlin.Unit> createElectionInfo(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<kotlin.Unit> deleteCandidate(int candidateId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<kotlin.Unit> deleteElectionInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.Candidate> getCandidateById(int candidateId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Candidate>> getCandidates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<de.oth.othappserver.model.ElectionInfo> getElectionInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<org.springframework.core.io.Resource> getImageOfCandidate(int candidateId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<kotlin.Unit> updateCandidate(int candidateId, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String course, int term, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> offices, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
    java.lang.String faculty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String motto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<kotlin.Unit> uploadPictureOfCandidate(int candidateId, @org.jetbrains.annotations.NotNull()
    org.springframework.core.io.Resource file) {
        return null;
    }
    
    public ElectionController(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.service.IElectionService electionService) {
        super();
    }
}