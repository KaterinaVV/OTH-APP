package de.oth.othappserver.jobmarket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketRequests;", "", "()V", "Companion", "oth-app-server"})
public final class JobMarketRequests {
    @org.jetbrains.annotations.NotNull()
    public static final de.oth.othappserver.jobmarket.JobMarketRequests.Companion Companion = null;
    
    public JobMarketRequests() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0004J\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0010\u001a\u00020\fJi\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0004\u00a8\u0006\u001e"}, d2 = {"Lde/oth/othappserver/jobmarket/JobMarketRequests$Companion;", "", "()V", "industry", "Lde/oth/othappserver/jobmarket/ListJobMarketRequestResponse;", "Lde/oth/othappserver/jobmarket/IndustryCategoryCall;", "Lde/oth/othappserver/jobmarket/JobMarketIndustry;", "jobOffer", "Lde/oth/othappserver/jobmarket/ObjectJobMarketRequestResponse;", "Lde/oth/othappserver/jobmarket/JobOfferCall;", "Lde/oth/othappserver/jobmarket/JobMarketJobDetails;", "id", "", "jobOffers", "Lde/oth/othappserver/jobmarket/JobOffersCall;", "Lde/oth/othappserver/jobmarket/JobMarketJob;", "top", "type", "", "faculty", "Lde/oth/othappserver/tables/records/FacultyRecord;", "text", "", "locationFilter", "Lde/oth/othappserver/model/JobQueryLocation;", "country", "(Ljava/util/List;Lde/oth/othappserver/tables/records/FacultyRecord;Ljava/util/List;Ljava/lang/String;Lde/oth/othappserver/model/JobQueryLocation;Ljava/lang/String;Ljava/lang/Integer;)Lde/oth/othappserver/jobmarket/ListJobMarketRequestResponse;", "types", "Lde/oth/othappserver/jobmarket/JobTypesCall;", "Lde/oth/othappserver/jobmarket/JobMarketJobType;", "oth-app-server"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final de.oth.othappserver.jobmarket.ObjectJobMarketRequestResponse<de.oth.othappserver.jobmarket.JobOfferCall, de.oth.othappserver.jobmarket.JobMarketJobDetails> jobOffer(int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.oth.othappserver.jobmarket.ListJobMarketRequestResponse<de.oth.othappserver.jobmarket.JobOffersCall, de.oth.othappserver.jobmarket.JobMarketJob> jobOffers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.oth.othappserver.jobmarket.ListJobMarketRequestResponse<de.oth.othappserver.jobmarket.JobOffersCall, de.oth.othappserver.jobmarket.JobMarketJob> jobOffers(int top) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.oth.othappserver.jobmarket.ListJobMarketRequestResponse<de.oth.othappserver.jobmarket.JobOffersCall, de.oth.othappserver.jobmarket.JobMarketJob> jobOffers(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.Integer> type, @org.jetbrains.annotations.Nullable()
        de.oth.othappserver.tables.records.FacultyRecord faculty, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.Integer> industry, @org.jetbrains.annotations.Nullable()
        java.lang.String text, @org.jetbrains.annotations.Nullable()
        de.oth.othappserver.model.JobQueryLocation locationFilter, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.Integer top) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.oth.othappserver.jobmarket.ListJobMarketRequestResponse<de.oth.othappserver.jobmarket.IndustryCategoryCall, de.oth.othappserver.jobmarket.JobMarketIndustry> industry() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.oth.othappserver.jobmarket.ListJobMarketRequestResponse<de.oth.othappserver.jobmarket.JobTypesCall, de.oth.othappserver.jobmarket.JobMarketJobType> types() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}