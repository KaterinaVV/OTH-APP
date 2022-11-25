package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lde/oth/othappserver/config/DelegatingApiRequestsLogger;", "Lorg/springframework/web/filter/GenericFilterBean;", "()V", "loggingFilter", "Lorg/springframework/web/filter/CommonsRequestLoggingFilter;", "doFilter", "", "request", "Ljavax/servlet/ServletRequest;", "response", "Ljavax/servlet/ServletResponse;", "chain", "Ljavax/servlet/FilterChain;", "oth-app-server"})
final class DelegatingApiRequestsLogger extends org.springframework.web.filter.GenericFilterBean {
    private final org.springframework.web.filter.CommonsRequestLoggingFilter loggingFilter = null;
    
    @java.lang.Override()
    public void doFilter(@org.jetbrains.annotations.Nullable()
    javax.servlet.ServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.ServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain chain) {
    }
    
    public DelegatingApiRequestsLogger() {
        super();
    }
}