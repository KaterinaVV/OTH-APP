package de.oth.othappserver.exceptions;

import java.lang.System;

/**
 * Defines exception handlers for our custom exceptions.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lde/oth/othappserver/exceptions/ProblemHandlingAdvice;", "Lorg/zalando/problem/spring/web/advice/AdviceTrait;", "Lorg/zalando/problem/spring/web/advice/ProblemHandling;", "environment", "Lorg/springframework/core/env/Environment;", "(Lorg/springframework/core/env/Environment;)V", "handleThirdPartyProblem", "Lorg/springframework/http/ResponseEntity;", "Lorg/zalando/problem/Problem;", "problem", "Lde/oth/othappserver/exceptions/ThirdPartyProblem;", "request", "Lorg/springframework/web/context/request/NativeWebRequest;", "isCausalChainsEnabled", "", "Companion", "oth-app-server"})
@org.springframework.web.bind.annotation.ControllerAdvice()
public class ProblemHandlingAdvice implements org.zalando.problem.spring.web.advice.AdviceTrait, org.zalando.problem.spring.web.advice.ProblemHandling {
    private final org.springframework.core.env.Environment environment = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.net.URI TYPE = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.exceptions.ProblemHandlingAdvice.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ExceptionHandler()
    public final org.springframework.http.ResponseEntity<org.zalando.problem.Problem> handleThirdPartyProblem(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.exceptions.ThirdPartyProblem problem, @org.jetbrains.annotations.NotNull()
    org.springframework.web.context.request.NativeWebRequest request) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isCausalChainsEnabled() {
        return false;
    }
    
    public ProblemHandlingAdvice(@org.jetbrains.annotations.NotNull()
    org.springframework.core.env.Environment environment) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lde/oth/othappserver/exceptions/ProblemHandlingAdvice$Companion;", "", "()V", "TYPE", "Ljava/net/URI;", "getTYPE", "()Ljava/net/URI;", "oth-app-server"})
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