package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lde/oth/othappserver/config/WebSecurityConfig;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "PROTECTED_URLS", "Lorg/springframework/security/web/util/matcher/OrRequestMatcher;", "PUBLIC_URLS", "Lorg/springframework/security/web/util/matcher/NegatedRequestMatcher;", "principalRequestHeader", "", "principalRequestValue", "configure", "", "httpSecurity", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "web", "Lorg/springframework/security/config/annotation/web/builders/WebSecurity;", "unauthorized", "Lorg/springframework/security/web/AuthenticationEntryPoint;", "oth-app-server"})
@org.springframework.core.annotation.Order(value = 1)
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@org.springframework.context.annotation.Configuration()
public class WebSecurityConfig extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    private final java.lang.String principalRequestHeader = "X-API-Key";
    @org.springframework.beans.factory.annotation.Value(value = "${app.auth.token:random.uuid}")
    private java.lang.String principalRequestValue;
    private final org.springframework.security.web.util.matcher.OrRequestMatcher PROTECTED_URLS = null;
    private final org.springframework.security.web.util.matcher.NegatedRequestMatcher PUBLIC_URLS = null;
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.WebSecurity web) {
    }
    
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity) throws java.lang.Exception {
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.web.AuthenticationEntryPoint unauthorized() {
        return null;
    }
    
    public WebSecurityConfig() {
        super();
    }
}