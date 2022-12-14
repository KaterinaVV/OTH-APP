package de.oth.othappserver.service;

import java.lang.System;

/**
 * Service API declaration for faculty data access methods.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000b2\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\f"}, d2 = {"Lde/oth/othappserver/service/IFacultyService;", "", "faculties", "", "Lde/oth/othappserver/tables/records/FacultyRecord;", "", "Lde/oth/othappserver/tables/records/FeedRecord;", "faculty", "identifier", "", "facultyFeeds", "Lkotlin/Pair;", "oth-app-server"})
public abstract interface IFacultyService {
    
    /**
     * Resolves a list of all faculties.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<de.oth.othappserver.tables.records.FacultyRecord, java.util.List<de.oth.othappserver.tables.records.FeedRecord>> faculties();
    
    /**
     * Resolves one specific faculty and its feeds found by its identifier.
     * @param identifier The requested faculty's identifier
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<de.oth.othappserver.tables.records.FacultyRecord, java.util.List<de.oth.othappserver.tables.records.FeedRecord>> facultyFeeds(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier);
    
    /**
     * Resolves one specific faculty found by its identifier.
     * @param identifier The requested faculty's identifier
     */
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.tables.records.FacultyRecord faculty(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier);
}