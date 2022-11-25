/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables.records;


import de.oth.othappserver.tables.ElectionInfo;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElectionInfoRecord extends UpdatableRecordImpl<ElectionInfoRecord> implements Record2<Integer, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.election_info.id</code>.
     */
    public ElectionInfoRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.election_info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.election_info.info</code>.
     */
    public ElectionInfoRecord setInfo(JSON value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.election_info.info</code>.
     */
    public JSON getInfo() {
        return (JSON) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, JSON> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, JSON> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ElectionInfo.ELECTION_INFO.ID;
    }

    @Override
    public Field<JSON> field2() {
        return ElectionInfo.ELECTION_INFO.INFO;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public JSON component2() {
        return getInfo();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public JSON value2() {
        return getInfo();
    }

    @Override
    public ElectionInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ElectionInfoRecord value2(JSON value) {
        setInfo(value);
        return this;
    }

    @Override
    public ElectionInfoRecord values(Integer value1, JSON value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ElectionInfoRecord
     */
    public ElectionInfoRecord() {
        super(ElectionInfo.ELECTION_INFO);
    }

    /**
     * Create a detached, initialised ElectionInfoRecord
     */
    public ElectionInfoRecord(Integer id, JSON info) {
        super(ElectionInfo.ELECTION_INFO);

        setId(id);
        setInfo(info);
    }
}
