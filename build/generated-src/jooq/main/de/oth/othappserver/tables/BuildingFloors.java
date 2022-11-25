/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables;


import de.oth.othappserver.Keys;
import de.oth.othappserver.Public;
import de.oth.othappserver.tables.records.BuildingFloorsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuildingFloors extends TableImpl<BuildingFloorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.building_floors</code>
     */
    public static final BuildingFloors BUILDING_FLOORS = new BuildingFloors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BuildingFloorsRecord> getRecordType() {
        return BuildingFloorsRecord.class;
    }

    /**
     * The column <code>public.building_floors.floor</code>.
     */
    public final TableField<BuildingFloorsRecord, Integer> FLOOR = createField(DSL.name("floor"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.building_floors.building</code>.
     */
    public final TableField<BuildingFloorsRecord, Integer> BUILDING = createField(DSL.name("building"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.building_floors.plan</code>.
     */
    public final TableField<BuildingFloorsRecord, String> PLAN = createField(DSL.name("plan"), SQLDataType.VARCHAR(500), this, "");

    private BuildingFloors(Name alias, Table<BuildingFloorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BuildingFloors(Name alias, Table<BuildingFloorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.building_floors</code> table reference
     */
    public BuildingFloors(String alias) {
        this(DSL.name(alias), BUILDING_FLOORS);
    }

    /**
     * Create an aliased <code>public.building_floors</code> table reference
     */
    public BuildingFloors(Name alias) {
        this(alias, BUILDING_FLOORS);
    }

    /**
     * Create a <code>public.building_floors</code> table reference
     */
    public BuildingFloors() {
        this(DSL.name("building_floors"), null);
    }

    public <O extends Record> BuildingFloors(Table<O> child, ForeignKey<O, BuildingFloorsRecord> key) {
        super(child, key, BUILDING_FLOORS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<ForeignKey<BuildingFloorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BuildingFloorsRecord, ?>>asList(Keys.BUILDING_FLOORS__FK_BFLOOR_BUILDING);
    }

    public Building building() {
        return new Building(this, Keys.BUILDING_FLOORS__FK_BFLOOR_BUILDING);
    }

    @Override
    public BuildingFloors as(String alias) {
        return new BuildingFloors(DSL.name(alias), this);
    }

    @Override
    public BuildingFloors as(Name alias) {
        return new BuildingFloors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BuildingFloors rename(String name) {
        return new BuildingFloors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BuildingFloors rename(Name name) {
        return new BuildingFloors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}