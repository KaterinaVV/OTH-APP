package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0089\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017\u00a2\u0006\u0002\u0010\u0012Jr\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u00162\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0017J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010 \u001a\u00020\tH\u0017J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\u0017J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010 \u001a\u00020\tH\u0017J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\u0003H\u0017J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0003H\u0017J\u0018\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010 \u001a\u00020\tH\u0017J\u0087\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0017\u00a2\u0006\u0002\u0010)J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017\u00a8\u0006+"}, d2 = {"Lde/oth/othappserver/api/ElectionApi;", "", "createCandidate", "Lorg/springframework/http/ResponseEntity;", "", "firstName", "lastName", "course", "term", "", "offices", "", "goals", "faculty", "id", "motto", "file", "Lorg/springframework/core/io/Resource;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/springframework/core/io/Resource;)Lorg/springframework/http/ResponseEntity;", "createElectionInfo", "", "electionStart", "Ljava/time/LocalDate;", "electionEnd", "startShowElectionInfo", "endShowElectionInfo", "howToVoteShort", "howToVoteLong", "whatToVoteSenat", "whatToVoteKonvent", "whatToVoteFaculty", "deleteCandidate", "candidateId", "deleteElectionInfo", "getCandidateById", "Lde/oth/othappserver/model/Candidate;", "getCandidates", "getElectionInfo", "Lde/oth/othappserver/model/ElectionInfo;", "getImageOfCandidate", "updateCandidate", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lorg/springframework/http/ResponseEntity;", "uploadPictureOfCandidate", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface ElectionApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(produces = {"text/plain", "application/json"}, consumes = {"multipart/form-data"}, value = {"/v1/candidates"})
    public abstract org.springframework.http.ResponseEntity<java.lang.String> createCandidate(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "firstName", required = true)
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "lastName", required = true)
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "course", required = true)
    java.lang.String course, @org.springframework.web.bind.annotation.RequestParam(value = "term", required = true)
    int term, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "offices", required = true)
    java.util.List<java.lang.String> offices, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "goals", required = true)
    java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "faculty", required = true)
    java.lang.String faculty, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "id", required = false)
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "motto", required = false)
    java.lang.String motto, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestPart(value = "file")
    @javax.validation.Valid()
    org.springframework.core.io.Resource file);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(produces = {"application/json"}, consumes = {"multipart/form-data"}, value = {"/v1/election"})
    public abstract org.springframework.http.ResponseEntity<kotlin.Unit> createElectionInfo(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "electionStart", required = true)
    java.time.LocalDate electionStart, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "electionEnd", required = true)
    java.time.LocalDate electionEnd, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "startShowElectionInfo", required = true)
    java.time.LocalDate startShowElectionInfo, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "endShowElectionInfo", required = true)
    java.time.LocalDate endShowElectionInfo, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "howToVoteShort", required = false)
    java.lang.Object howToVoteShort, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "howToVoteLong", required = false)
    java.lang.Object howToVoteLong, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "whatToVoteSenat", required = false)
    java.lang.Object whatToVoteSenat, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "whatToVoteKonvent", required = false)
    java.lang.Object whatToVoteKonvent, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "whatToVoteFaculty", required = false)
    java.lang.Object whatToVoteFaculty);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.DeleteMapping(produces = {"application/json"}, value = {"/v1/candidates/{candidateId}"})
    public abstract org.springframework.http.ResponseEntity<kotlin.Unit> deleteCandidate(@org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
    int candidateId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.DeleteMapping(produces = {"application/json"}, value = {"/v1/election"})
    public abstract org.springframework.http.ResponseEntity<kotlin.Unit> deleteElectionInfo();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/candidates/{candidateId}"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.Candidate> getCandidateById(@org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
    int candidateId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/candidates"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Candidate>> getCandidates();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/election"})
    public abstract org.springframework.http.ResponseEntity<de.oth.othappserver.model.ElectionInfo> getElectionInfo();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(produces = {"image/_*", "application/json"}, value = {"/v1/candidates/{candidateId}/image"})
    public abstract org.springframework.http.ResponseEntity<org.springframework.core.io.Resource> getImageOfCandidate(@org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
    int candidateId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping(produces = {"application/json"}, consumes = {"application/x-www-form-urlencoded"}, value = {"/v1/candidates/{candidateId}"})
    public abstract org.springframework.http.ResponseEntity<kotlin.Unit> updateCandidate(@org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
    int candidateId, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "firstName", required = true)
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "lastName", required = true)
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "course", required = true)
    java.lang.String course, @org.springframework.web.bind.annotation.RequestParam(value = "term", required = true)
    int term, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "offices", required = true)
    java.util.List<java.lang.String> offices, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "goals", required = true)
    java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "faculty", required = true)
    java.lang.String faculty, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "id", required = false)
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam(value = "motto", required = false)
    java.lang.String motto);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(produces = {"application/json"}, consumes = {"multipart/form-data"}, value = {"/v1/candidates/{candidateId}/image"})
    public abstract org.springframework.http.ResponseEntity<kotlin.Unit> uploadPictureOfCandidate(@org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
    int candidateId, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestPart(value = "file")
    @javax.validation.Valid()
    org.springframework.core.io.Resource file);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PostMapping(produces = {"text/plain", "application/json"}, consumes = {"multipart/form-data"}, value = {"/v1/candidates"})
        public static org.springframework.http.ResponseEntity<java.lang.String> createCandidate(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "firstName", required = true)
        java.lang.String firstName, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "lastName", required = true)
        java.lang.String lastName, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "course", required = true)
        java.lang.String course, @org.springframework.web.bind.annotation.RequestParam(value = "term", required = true)
        int term, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "offices", required = true)
        java.util.List<java.lang.String> offices, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "goals", required = true)
        java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "faculty", required = true)
        java.lang.String faculty, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "id", required = false)
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "motto", required = false)
        java.lang.String motto, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestPart(value = "file")
        @javax.validation.Valid()
        org.springframework.core.io.Resource file) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PostMapping(produces = {"application/json"}, consumes = {"multipart/form-data"}, value = {"/v1/election"})
        public static org.springframework.http.ResponseEntity<kotlin.Unit> createElectionInfo(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "electionStart", required = true)
        java.time.LocalDate electionStart, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "electionEnd", required = true)
        java.time.LocalDate electionEnd, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "startShowElectionInfo", required = true)
        java.time.LocalDate startShowElectionInfo, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "endShowElectionInfo", required = true)
        java.time.LocalDate endShowElectionInfo, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "howToVoteShort", required = false)
        java.lang.Object howToVoteShort, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "howToVoteLong", required = false)
        java.lang.Object howToVoteLong, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "whatToVoteSenat", required = false)
        java.lang.Object whatToVoteSenat, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "whatToVoteKonvent", required = false)
        java.lang.Object whatToVoteKonvent, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "whatToVoteFaculty", required = false)
        java.lang.Object whatToVoteFaculty) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.DeleteMapping(produces = {"application/json"}, value = {"/v1/candidates/{candidateId}"})
        public static org.springframework.http.ResponseEntity<kotlin.Unit> deleteCandidate(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
        int candidateId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.DeleteMapping(produces = {"application/json"}, value = {"/v1/election"})
        public static org.springframework.http.ResponseEntity<kotlin.Unit> deleteElectionInfo(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/candidates/{candidateId}"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.Candidate> getCandidateById(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
        int candidateId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/candidates"})
        public static org.springframework.http.ResponseEntity<java.util.List<de.oth.othappserver.model.Candidate>> getCandidates(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"application/json"}, value = {"/v1/election"})
        public static org.springframework.http.ResponseEntity<de.oth.othappserver.model.ElectionInfo> getElectionInfo(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.GetMapping(produces = {"image/_*", "application/json"}, value = {"/v1/candidates/{candidateId}/image"})
        public static org.springframework.http.ResponseEntity<org.springframework.core.io.Resource> getImageOfCandidate(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
        int candidateId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PutMapping(produces = {"application/json"}, consumes = {"application/x-www-form-urlencoded"}, value = {"/v1/candidates/{candidateId}"})
        public static org.springframework.http.ResponseEntity<kotlin.Unit> updateCandidate(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
        int candidateId, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "firstName", required = true)
        java.lang.String firstName, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "lastName", required = true)
        java.lang.String lastName, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "course", required = true)
        java.lang.String course, @org.springframework.web.bind.annotation.RequestParam(value = "term", required = true)
        int term, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "offices", required = true)
        java.util.List<java.lang.String> offices, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "goals", required = true)
        java.util.List<java.lang.String> goals, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestParam(value = "faculty", required = true)
        java.lang.String faculty, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "id", required = false)
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestParam(value = "motto", required = false)
        java.lang.String motto) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PostMapping(produces = {"application/json"}, consumes = {"multipart/form-data"}, value = {"/v1/candidates/{candidateId}/image"})
        public static org.springframework.http.ResponseEntity<kotlin.Unit> uploadPictureOfCandidate(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.ElectionApi $this, @org.springframework.web.bind.annotation.PathVariable(value = "candidateId")
        int candidateId, @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.RequestPart(value = "file")
        @javax.validation.Valid()
        org.springframework.core.io.Resource file) {
            return null;
        }
    }
}