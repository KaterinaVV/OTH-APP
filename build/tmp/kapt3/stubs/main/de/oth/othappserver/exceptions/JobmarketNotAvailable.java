package de.oth.othappserver.exceptions;

import java.lang.System;

/**
 * Problem thrown when Jobmarket does currently not resolve requests.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lde/oth/othappserver/exceptions/JobmarketNotAvailable;", "Lde/oth/othappserver/exceptions/ThirdPartyProblem;", "()V", "Companion", "oth-app-server"})
public final class JobmarketNotAvailable extends de.oth.othappserver.exceptions.ThirdPartyProblem {
    @org.jetbrains.annotations.NotNull()
    private static final java.net.URI TYPE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TITLE = "Jobmarket Unavailable";
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.exceptions.JobmarketNotAvailable.Companion Companion = null;
    
    public JobmarketNotAvailable() {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lde/oth/othappserver/exceptions/JobmarketNotAvailable$Companion;", "", "()V", "TITLE", "", "TYPE", "Ljava/net/URI;", "getTYPE", "()Ljava/net/URI;", "oth-app-server"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.net.URI getTYPE() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}