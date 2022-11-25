package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketCall;", "", "call", "", "(Ljava/lang/String;)V", "getCall", "()Ljava/lang/String;", "Lde/oth/othappserver/jobmarket/JobOfferCall;", "Lde/oth/othappserver/jobmarket/JobOffersCall;", "Lde/oth/othappserver/jobmarket/IndustryCategoryCall;", "Lde/oth/othappserver/jobmarket/JobTypesCall;", "oth-app-server"})
@com.fasterxml.jackson.annotation.JsonSubTypes(value = {@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.jobmarket.JobOffersCall.class, name = "joboffers"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.jobmarket.JobOfferCall.class, name = "joboffer"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.jobmarket.IndustryCategoryCall.class, name = "KT"), @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = de.oth.othappserver.jobmarket.JobTypesCall.class, name = "types")})
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property = "call", visible = true)
@com.fasterxml.jackson.annotation.JsonInclude(value = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public abstract class JobMarketCall {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String call = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCall() {
        return null;
    }
    
    private JobMarketCall(java.lang.String call) {
        super();
    }
}