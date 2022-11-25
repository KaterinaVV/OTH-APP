package de.oth.othappserver.service;

import java.lang.System;

/**
 * Service API declaration for roomfinder data access methods.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u001a\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a8\u0006\n"}, d2 = {"Lde/oth/othappserver/service/IRoomFinderService;", "", "getBuildings", "", "", "Lde/oth/othappserver/service/OTHBuilding;", "getEquipment", "", "Lde/oth/othappserver/tables/pojos/TEquipment;", "getFilterEquipment", "oth-app-server"})
public abstract interface IRoomFinderService {
    
    /**
     * Resolves a list of all room groups.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.util.List<de.oth.othappserver.tables.pojos.TEquipment>> getEquipment();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<de.oth.othappserver.tables.pojos.TEquipment> getFilterEquipment();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, de.oth.othappserver.service.OTHBuilding> getBuildings();
}