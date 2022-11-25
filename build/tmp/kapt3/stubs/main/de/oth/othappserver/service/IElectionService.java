package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J!\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH&\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\nH&J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH&\u00a8\u0006\u0019"}, d2 = {"Lde/oth/othappserver/service/IElectionService;", "", "deleteCandidate", "", "id", "", "(Ljava/lang/Integer;)V", "getCandidate", "Lde/oth/othappserver/model/Candidate;", "getCandidateImage", "Lorg/springframework/core/io/Resource;", "getCandidates", "", "getInfo", "Lde/oth/othappserver/model/ElectionInfo;", "insertCandidate", "candidate", "candidateImage", "(Lde/oth/othappserver/model/Candidate;Lorg/springframework/core/io/Resource;)Ljava/lang/Integer;", "updateCandidate", "(Ljava/lang/Integer;Lde/oth/othappserver/model/Candidate;)V", "updateCandidateImage", "resource", "updateInfo", "electionInfo", "oth-app-server"})
public abstract interface IElectionService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.model.Candidate> getCandidates();
    
    @org.jetbrains.annotations.Nullable()
    public abstract de.oth.othappserver.model.Candidate getCandidate(int id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer insertCandidate(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Candidate candidate, @org.jetbrains.annotations.Nullable()
    org.springframework.core.io.Resource candidateImage);
    
    public abstract void updateCandidate(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Candidate candidate);
    
    public abstract void deleteCandidate(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.springframework.core.io.Resource getCandidateImage(int id);
    
    public abstract void updateCandidateImage(int id, @org.jetbrains.annotations.NotNull()
    org.springframework.core.io.Resource resource);
    
    @org.jetbrains.annotations.Nullable()
    public abstract de.oth.othappserver.model.ElectionInfo getInfo();
    
    public abstract void updateInfo(@org.jetbrains.annotations.Nullable()
    de.oth.othappserver.model.ElectionInfo electionInfo);
}