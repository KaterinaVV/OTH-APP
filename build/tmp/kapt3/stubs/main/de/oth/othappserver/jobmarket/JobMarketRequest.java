package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketRequest;", "", "credentials", "Lde/oth/othappserver/jobmarket/JobMarketCredentials;", "calls", "", "Lde/oth/othappserver/jobmarket/JobMarketCall;", "(Lde/oth/othappserver/jobmarket/JobMarketCredentials;Ljava/util/List;)V", "getCalls", "()Ljava/util/List;", "getCredentials", "()Lde/oth/othappserver/jobmarket/JobMarketCredentials;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oth-app-server"})
@com.fasterxml.jackson.annotation.JsonInclude(value = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public final class JobMarketRequest {
    @org.jetbrains.annotations.NotNull()
    private final de.oth.othappserver.jobmarket.JobMarketCredentials credentials = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<de.oth.othappserver.jobmarket.JobMarketCall> calls = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.jobmarket.JobMarketCredentials getCredentials() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.jobmarket.JobMarketCall> getCalls() {
        return null;
    }
    
    public JobMarketRequest(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.jobmarket.JobMarketCredentials credentials, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.jobmarket.JobMarketCall> calls) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.jobmarket.JobMarketCredentials component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<de.oth.othappserver.jobmarket.JobMarketCall> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.oth.othappserver.jobmarket.JobMarketRequest copy(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.jobmarket.JobMarketCredentials credentials, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends de.oth.othappserver.jobmarket.JobMarketCall> calls) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}