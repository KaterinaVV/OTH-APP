package de.oth.othappserver.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lde/oth/othappserver/config/WebConfig;", "Lorg/springframework/web/servlet/config/annotation/WebMvcConfigurer;", "baseUrl", "", "(Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "addFormatters", "", "registry", "Lorg/springframework/format/FormatterRegistry;", "addViewControllers", "Lorg/springframework/web/servlet/config/annotation/ViewControllerRegistry;", "oth-app-server"})
@org.springframework.context.annotation.Configuration()
public class WebConfig implements org.springframework.web.servlet.config.annotation.WebMvcConfigurer {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseUrl = null;
    
    @java.lang.Override()
    public void addFormatters(@org.jetbrains.annotations.NotNull()
    org.springframework.format.FormatterRegistry registry) {
    }
    
    @java.lang.Override()
    public void addViewControllers(@org.jetbrains.annotations.NotNull()
    org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    public WebConfig(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${springfox.documentation.swagger-ui.base-url:}")
    java.lang.String baseUrl) {
        super();
    }
}