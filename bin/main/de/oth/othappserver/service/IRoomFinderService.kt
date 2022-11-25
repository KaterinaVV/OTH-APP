package de.oth.othappserver.service

import de.oth.othappserver.tables.pojos.TEquipment

/**
 * Service API declaration for roomfinder data access methods.
 */
interface IRoomFinderService {
    /**
     * Resolves a list of all room groups.
     */
    fun getEquipment(): Map<String, List<TEquipment>>

    fun getFilterEquipment(): List<TEquipment>

    fun getBuildings(): Map<String, OTHBuilding>
}
