package de.oth.othappserver.exceptions;

import java.lang.System;

/**
 * Generic problem with a third party dependency service.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lde/oth/othappserver/exceptions/ThirdPartyProblem;", "Lorg/zalando/problem/AbstractThrowableProblem;", "type", "Ljava/net/URI;", "title", "", "detail", "(Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "Lorg/zalando/problem/Exceptional;", "oth-app-server"})
public abstract class ThirdPartyProblem extends org.zalando.problem.AbstractThrowableProblem {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.zalando.problem.Exceptional getCause() {
        return null;
    }
    
    public ThirdPartyProblem(@org.jetbrains.annotations.NotNull()
    java.net.URI type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String detail) {
        super();
    }
}