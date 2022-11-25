package de.oth.othappserver.service

import de.oth.othappserver.Tables.*
import de.oth.othappserver.config.CacheConfig.Companion.LIFETIME_CACHE
import de.oth.othappserver.tables.Building.BUILDING
import de.oth.othappserver.tables.BuildingFloors.BUILDING_FLOORS
import de.oth.othappserver.tables.Faculty.FACULTY
import de.oth.othappserver.tables.pojos.*
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.util.function.Function.identity
import java.util.stream.Collectors

@Service
@CacheConfig(cacheNames = [LIFETIME_CACHE], keyGenerator = "customKeyGenerator")
private open class RoomFinderService @Autowired constructor(private val dsl: DSLContext) : IRoomFinderService {

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun getEquipment(): Map<String, List<TEquipment>> {
        return dsl.select(ROOM.asterisk(), EQUIPMENT.asterisk())
            .from(
                ROOM.rightJoin(EQUIPMENT).on(ROOM.EQUIPMENT.eq(EQUIPMENT.ID))
            )
            .fetchGroups(
                { r -> r.into(ROOM).into(TRoom::class.java).name },
                { r -> r.into(EQUIPMENT).into(TEquipment::class.java) }
            )
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun getFilterEquipment(): List<TEquipment> {
        return dsl.select(EQUIPMENT.asterisk())
            .from(EQUIPMENT)
            .fetch { r -> r.into(EQUIPMENT).into(TEquipment::class.java) }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Cacheable
    override fun getBuildings(): Map<String, OTHBuilding> {
        return dsl.select(BUILDING.asterisk(), BUILDING_FLOORS.asterisk(), FACULTY.asterisk())
            .from(BUILDING)
            .leftJoin(BUILDING_FACULTIES).on(BUILDING.ID.eq(BUILDING_FACULTIES.BUILDING))
            .leftJoin(FACULTY).on(BUILDING_FACULTIES.FACULTY.eq(FACULTY.ID))
            .leftJoin(BUILDING_FLOORS).on(BUILDING.ID.eq(BUILDING_FLOORS.BUILDING))
            .fetch {
                val building = it.into(BUILDING).into(TBuilding::class.java)
                val floor = it.into(BUILDING_FLOORS).into(TBuildingFloors::class.java)
                val faculty = it.into(FACULTY).into(TFaculty::class.java)

                val floors = when {
                    floor.building != null -> setOf(floor)
                    else -> setOf()
                }

                val faculties = when {
                    faculty.id != null -> setOf(faculty)
                    else -> setOf()
                }

                OTHBuilding(building, floors, faculties)
            }
            .stream()
            .collect(Collectors.toMap(OTHBuilding::key, identity(), OTHBuilding::merge))
            .toMap()
    }
}

data class OTHBuilding(val building: TBuilding, val floors: Set<TBuildingFloors>, val faculties: Set<TFaculty>) {
    fun merge(other: OTHBuilding): OTHBuilding = OTHBuilding(building, floors + other.floors, faculties + other.faculties)
    fun key(): String = building.identifier
}
