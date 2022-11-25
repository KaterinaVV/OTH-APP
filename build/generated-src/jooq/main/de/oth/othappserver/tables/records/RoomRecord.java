/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables.records;


import de.oth.othappserver.tables.Room;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoomRecord extends UpdatableRecordImpl<RoomRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.room.id</code>.
     */
    public RoomRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.room.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.room.name</code>.
     */
    public RoomRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.room.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.room.equipment</code>.
     */
    public RoomRecord setEquipment(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.room.equipment</code>.
     */
    public Integer getEquipment() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Room.ROOM.ID;
    }

    @Override
    public Field<String> field2() {
        return Room.ROOM.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Room.ROOM.EQUIPMENT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getEquipment();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getEquipment();
    }

    @Override
    public RoomRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RoomRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public RoomRecord value3(Integer value) {
        setEquipment(value);
        return this;
    }

    @Override
    public RoomRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoomRecord
     */
    public RoomRecord() {
        super(Room.ROOM);
    }

    /**
     * Create a detached, initialised RoomRecord
     */
    public RoomRecord(Integer id, String name, Integer equipment) {
        super(Room.ROOM);

        setId(id);
        setName(name);
        setEquipment(equipment);
    }
}