/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver;


import de.oth.othappserver.tables.Building;
import de.oth.othappserver.tables.BuildingFaculties;
import de.oth.othappserver.tables.BuildingFloors;
import de.oth.othappserver.tables.ElectionCandidate;
import de.oth.othappserver.tables.ElectionInfo;
import de.oth.othappserver.tables.Equipment;
import de.oth.othappserver.tables.Eventcategory;
import de.oth.othappserver.tables.Eventorganizer;
import de.oth.othappserver.tables.Faculty;
import de.oth.othappserver.tables.Feed;
import de.oth.othappserver.tables.Room;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.building</code>.
     */
    public final Building BUILDING = Building.BUILDING;

    /**
     * The table <code>public.building_faculties</code>.
     */
    public final BuildingFaculties BUILDING_FACULTIES = BuildingFaculties.BUILDING_FACULTIES;

    /**
     * The table <code>public.building_floors</code>.
     */
    public final BuildingFloors BUILDING_FLOORS = BuildingFloors.BUILDING_FLOORS;

    /**
     * The table <code>public.election_candidate</code>.
     */
    public final ElectionCandidate ELECTION_CANDIDATE = ElectionCandidate.ELECTION_CANDIDATE;

    /**
     * The table <code>public.election_info</code>.
     */
    public final ElectionInfo ELECTION_INFO = ElectionInfo.ELECTION_INFO;

    /**
     * The table <code>public.equipment</code>.
     */
    public final Equipment EQUIPMENT = Equipment.EQUIPMENT;

    /**
     * The table <code>public.eventcategory</code>.
     */
    public final Eventcategory EVENTCATEGORY = Eventcategory.EVENTCATEGORY;

    /**
     * The table <code>public.eventorganizer</code>.
     */
    public final Eventorganizer EVENTORGANIZER = Eventorganizer.EVENTORGANIZER;

    /**
     * The table <code>public.faculty</code>.
     */
    public final Faculty FACULTY = Faculty.FACULTY;

    /**
     * The table <code>public.feed</code>.
     */
    public final Feed FEED = Feed.FEED;

    /**
     * The table <code>public.room</code>.
     */
    public final Room ROOM = Room.ROOM;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ELECTION_CANDIDATE_ID_SEQ,
            Sequences.ELECTION_INFO_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Building.BUILDING,
            BuildingFaculties.BUILDING_FACULTIES,
            BuildingFloors.BUILDING_FLOORS,
            ElectionCandidate.ELECTION_CANDIDATE,
            ElectionInfo.ELECTION_INFO,
            Equipment.EQUIPMENT,
            Eventcategory.EVENTCATEGORY,
            Eventorganizer.EVENTORGANIZER,
            Faculty.FACULTY,
            Feed.FEED,
            Room.ROOM);
    }
}