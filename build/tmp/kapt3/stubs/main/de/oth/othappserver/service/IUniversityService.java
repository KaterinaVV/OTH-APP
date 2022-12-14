package de.oth.othappserver.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lde/oth/othappserver/service/IUniversityService;", "", "getInformation", "Lde/oth/othappserver/model/UniversityInfo;", "oth-app-server"})
public abstract interface IUniversityService {
    
    /**
     * Retrieves basic information needed for a timetable.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract de.oth.othappserver.model.UniversityInfo getInformation();
}