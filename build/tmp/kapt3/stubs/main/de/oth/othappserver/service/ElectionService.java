package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00070\r\u00a2\u0006\u0002\b\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J!\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u001f\u0010\u001e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0012\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lde/oth/othappserver/service/ElectionService;", "Lde/oth/othappserver/service/IElectionService;", "dsl", "Lorg/jooq/DSLContext;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lorg/jooq/DSLContext;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "deleteCandidate", "", "id", "", "(Ljava/lang/Integer;)V", "fetchOneCandidateRecord", "Lde/oth/othappserver/tables/records/ElectionCandidateRecord;", "Lorg/jetbrains/annotations/Nullable;", "(Ljava/lang/Integer;)Lde/oth/othappserver/tables/records/ElectionCandidateRecord;", "getCandidate", "Lde/oth/othappserver/model/Candidate;", "getCandidateImage", "Lorg/springframework/core/io/Resource;", "getCandidates", "", "getInfo", "Lde/oth/othappserver/model/ElectionInfo;", "insertCandidate", "candidate", "candidateImage", "(Lde/oth/othappserver/model/Candidate;Lorg/springframework/core/io/Resource;)Ljava/lang/Integer;", "mapEntityToDto", "record", "updateCandidate", "(Ljava/lang/Integer;Lde/oth/othappserver/model/Candidate;)V", "updateCandidateImage", "resource", "updateInfo", "electionInfo", "oth-app-server"})
@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
@org.springframework.stereotype.Service()
public class ElectionService implements de.oth.othappserver.service.IElectionService {
    private final org.jooq.DSLContext dsl = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    private final de.oth.othappserver.tables.records.ElectionCandidateRecord fetchOneCandidateRecord(java.lang.Integer id) {
        return null;
    }
    
    private final de.oth.othappserver.model.Candidate mapEntityToDto(de.oth.othappserver.tables.records.ElectionCandidateRecord record) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer insertCandidate(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Candidate candidate, @org.jetbrains.annotations.Nullable()
    org.springframework.core.io.Resource candidateImage) {
        return null;
    }
    
    @java.lang.Override()
    public void updateCandidate(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.Candidate candidate) {
    }
    
    @java.lang.Override()
    public void deleteCandidate(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.core.io.Resource getCandidateImage(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void updateCandidateImage(int id, @org.jetbrains.annotations.NotNull()
    org.springframework.core.io.Resource resource) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<de.oth.othappserver.model.Candidate> getCandidates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.oth.othappserver.model.Candidate getCandidate(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public de.oth.othappserver.model.ElectionInfo getInfo() {
        return null;
    }
    
    @java.lang.Override()
    public void updateInfo(@org.jetbrains.annotations.Nullable()
    de.oth.othappserver.model.ElectionInfo electionInfo) {
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public ElectionService(@org.jetbrains.annotations.NotNull()
    org.jooq.DSLContext dsl, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
}