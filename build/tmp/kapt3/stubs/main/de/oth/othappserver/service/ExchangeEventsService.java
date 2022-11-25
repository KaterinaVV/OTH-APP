package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lde/oth/othappserver/service/ExchangeEventsService;", "Lde/oth/othappserver/exchange/IExchangeEventsService;", "client", "Lde/oth/othappserver/exchange/ExchangeClient;", "(Lde/oth/othappserver/exchange/ExchangeClient;)V", "query", "Lde/oth/othappserver/exchange/ExchangeResult;", "startDateTime", "", "endDateTime", "deltaToken", "skipToken", "paged", "", "oth-app-server"})
@org.springframework.stereotype.Service()
public final class ExchangeEventsService implements de.oth.othappserver.exchange.IExchangeEventsService {
    private final de.oth.othappserver.exchange.ExchangeClient client = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public de.oth.othappserver.exchange.ExchangeResult query(@org.jetbrains.annotations.NotNull()
    java.lang.String startDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endDateTime, @org.jetbrains.annotations.Nullable()
    java.lang.String deltaToken, @org.jetbrains.annotations.Nullable()
    java.lang.String skipToken, boolean paged) {
        return null;
    }
    
    public ExchangeEventsService(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.exchange.ExchangeClient client) {
        super();
    }
}