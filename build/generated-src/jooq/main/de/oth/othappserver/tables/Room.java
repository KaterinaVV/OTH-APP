/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables;


import de.oth.othappserver.Keys;
import de.oth.othappserver.Public;
import de.oth.othappserver.tables.records.RoomRecord;

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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Room extends TableImpl<RoomRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.room</code>
     */
    public static final Room ROOM = new Room();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoomRecord> getRecordType() {
        return RoomRecord.class;
    }

    /**
     * The column <code>public.room.id</code>.
     */
    public final TableField<RoomRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.room.name</code>.
     */
    public final TableField<RoomRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>public.room.equipment</code>.
     */
    public final TableField<RoomRecord, Integer> EQUIPMENT = createField(DSL.name("equipment"), SQLDataType.INTEGER.nullable(false), this, "");

    private Room(Name alias, Table<RoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private Room(Name alias, Table<RoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.room</code> table reference
     */
    public Room(String alias) {
        this(DSL.name(alias), ROOM);
    }

    /**
     * Create an aliased <code>public.room</code> table reference
     */
    public Room(Name alias) {
        this(alias, ROOM);
    }

    /**
     * Create a <code>public.room</code> table reference
     */
    public Room() {
        this(DSL.name("room"), null);
    }

    public <O extends Record> Room(Table<O> child, ForeignKey<O, RoomRecord> key) {
        super(child, key, ROOM);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<RoomRecord> getPrimaryKey() {
        return Keys.ROOM_PKEY;
    }

    @Override
    public List<UniqueKey<RoomRecord>> getKeys() {
        return Arrays.<UniqueKey<RoomRecord>>asList(Keys.ROOM_PKEY);
    }

    @Override
    public List<ForeignKey<RoomRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RoomRecord, ?>>asList(Keys.ROOM__FK_EQUIPMENT);
    }

    public Equipment equipment() {
        return new Equipment(this, Keys.ROOM__FK_EQUIPMENT);
    }

    @Override
    public Room as(String alias) {
        return new Room(DSL.name(alias), this);
    }

    @Override
    public Room as(Name alias) {
        return new Room(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Room rename(String name) {
        return new Room(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Room rename(Name name) {
        return new Room(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}