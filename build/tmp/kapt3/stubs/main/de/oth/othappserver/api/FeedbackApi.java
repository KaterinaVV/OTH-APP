package de.oth.othappserver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lde/oth/othappserver/api/FeedbackApi;", "", "feedback", "Lorg/springframework/http/ResponseEntity;", "", "feedbackItem", "Lde/oth/othappserver/model/FeedbackItem;", "oth-app-server"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${api.base-path:}"})
@org.springframework.validation.annotation.Validated()
public abstract interface FeedbackApi {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(consumes = {"application/json"}, value = {"/v1/feedback"})
    public abstract org.springframework.http.ResponseEntity<kotlin.Unit> feedback(@org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestBody(required = false)
    @javax.validation.Valid()
    de.oth.othappserver.model.FeedbackItem feedbackItem);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.web.bind.annotation.PostMapping(consumes = {"application/json"}, value = {"/v1/feedback"})
        public static org.springframework.http.ResponseEntity<kotlin.Unit> feedback(@org.jetbrains.annotations.NotNull()
        de.oth.othappserver.api.FeedbackApi $this, @org.jetbrains.annotations.Nullable()
        @org.springframework.web.bind.annotation.RequestBody(required = false)
        @javax.validation.Valid()
        de.oth.othappserver.model.FeedbackItem feedbackItem) {
            return null;
        }
    }
}