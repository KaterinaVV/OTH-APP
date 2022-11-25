package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lde/oth/othappserver/service/IJobMarketService;", "", "getJobById", "Lde/oth/othappserver/model/JobDetails;", "id", "", "jobCount", "since", "Ljava/time/LocalDate;", "jobmarket", "Lde/oth/othappserver/model/JobMarket;", "jobs", "", "Lde/oth/othappserver/jobmarket/JobMarketJob;", "query", "Lde/oth/othappserver/model/JobQuery;", "oth-app-server"})
public abstract interface IJobMarketService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.model.JobDetails getJobById(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.jobmarket.JobMarketJob> jobs(@org.jetbrains.annotations.NotNull()
    de.oth.othappserver.model.JobQuery query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.model.JobMarket jobmarket();
    
    public abstract int jobCount(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate since);
}