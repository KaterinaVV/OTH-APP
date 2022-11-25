/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables;


import de.oth.othappserver.Keys;
import de.oth.othappserver.Public;
import de.oth.othappserver.tables.records.BuildingFacultiesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuildingFaculties extends TableImpl<BuildingFacultiesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.building_faculties</code>
     */
    public static final BuildingFaculties BUILDING_FACULTIES = new BuildingFaculties();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BuildingFacultiesRecord> getRecordType() {
        return BuildingFacultiesRecord.class;
    }

    /**
     * The column <code>public.building_faculties.building</code>.
     */
    public final TableField<BuildingFacultiesRecord, Integer> BUILDING = createField(DSL.name("building"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.building_faculties.faculty</code>.
     */
    public final TableField<BuildingFacultiesRecord, Integer> FACULTY = createField(DSL.name("faculty"), SQLDataType.INTEGER.nullable(false), this, "");

    private BuildingFaculties(Name alias, Table<BuildingFacultiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private BuildingFaculties(Name alias, Table<BuildingFacultiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.building_faculties</code> table reference
     */
    public BuildingFaculties(String alias) {
        this(DSL.name(alias), BUILDING_FACULTIES);
    }

    /**
     * Create an aliased <code>public.building_faculties</code> table reference
     */
    public BuildingFaculties(Name alias) {
        this(alias, BUILDING_FACULTIES);
    }

    /**
     * Create a <code>public.building_faculties</code> table reference
     */
    public BuildingFaculties() {
        this(DSL.name("building_faculties"), null);
    }

    public <O extends Record> BuildingFaculties(Table<O> child, ForeignKey<O, BuildingFacultiesRecord> key) {
        super(child, key, BUILDING_FACULTIES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<BuildingFacultiesRecord> getPrimaryKey() {
        return Keys.PK_BUILDING_FACULTIES;
    }

    @Override
    public List<UniqueKey<BuildingFacultiesRecord>> getKeys() {
        return Arrays.<UniqueKey<BuildingFacultiesRecord>>asList(Keys.PK_BUILDING_FACULTIES);
    }

    @Override
    public List<ForeignKey<BuildingFacultiesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BuildingFacultiesRecord, ?>>asList(Keys.BUILDING_FACULTIES__FK_BFACULTIES_BUILDING, Keys.BUILDING_FACULTIES__FK_BFACULTIES_FACULTY);
    }

    public Building building() {
        return new Building(this, Keys.BUILDING_FACULTIES__FK_BFACULTIES_BUILDING);
    }

    public Faculty faculty() {
        return new Faculty(this, Keys.BUILDING_FACULTIES__FK_BFACULTIES_FACULTY);
    }

    @Override
    public BuildingFaculties as(String alias) {
        return new BuildingFaculties(DSL.name(alias), this);
    }

    @Override
    public BuildingFaculties as(Name alias) {
        return new BuildingFaculties(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BuildingFaculties rename(String name) {
        return new BuildingFaculties(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BuildingFaculties rename(Name name) {
        return new BuildingFaculties(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}