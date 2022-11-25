package de.oth.othappserver.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lde/oth/othappserver/rest/FeedbackController;", "Lde/oth/othappserver/api/FeedbackApi;", "exchangeClient", "Lde/oth/othappserver/exchange/ExchangeClient;", "(Lde/oth/othappserver/exchange/ExchangeClient;)V", "feedback", "Lorg/springframework/http/ResponseEntity;", "", "feedbackItem", "Lde/oth/othappserver/model/FeedbackItem;", "toStringWithoutImages", "", "Companion", "oth-app-server"})
@org.springframework.web.bind.annotation.RestController()
public class FeedbackController implements de.oth.othappserver.api.FeedbackApi {
    private final de.oth.othappserver.exchange.ExchangeClient exchangeClient = null;
    private static final java.util.List<java.lang.String> VALID_CATEGORIES = null;
    private static final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.rest.FeedbackController.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<kotlin.Unit> feedback(@org.jetbrains.annotations.Nullable()
    de.oth.othappserver.model.FeedbackItem feedbackItem) {
        return null;
    }
    
    private final java.lang.String toStringWithoutImages(de.oth.othappserver.model.FeedbackItem $this$toStringWithoutImages) {
        return null;
    }
    
    public FeedbackController(@org.jetbrains.annotations.Nullable()
    de.oth.othappserver.exchange.ExchangeClient exchangeClient) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lde/oth/othappserver/rest/FeedbackController$Companion;", "", "()V", "VALID_CATEGORIES", "", "", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "oth-app-server"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}