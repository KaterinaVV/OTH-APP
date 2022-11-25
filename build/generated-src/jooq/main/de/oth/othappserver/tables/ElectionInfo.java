/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables;


import de.oth.othappserver.Keys;
import de.oth.othappserver.Public;
import de.oth.othappserver.tables.records.ElectionInfoRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.JSON;
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
public class ElectionInfo extends TableImpl<ElectionInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.election_info</code>
     */
    public static final ElectionInfo ELECTION_INFO = new ElectionInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ElectionInfoRecord> getRecordType() {
        return ElectionInfoRecord.class;
    }

    /**
     * The column <code>public.election_info.id</code>.
     */
    public final TableField<ElectionInfoRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.election_info.info</code>.
     */
    public final TableField<ElectionInfoRecord, JSON> INFO = createField(DSL.name("info"), SQLDataType.JSON.nullable(false), this, "");

    private ElectionInfo(Name alias, Table<ElectionInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ElectionInfo(Name alias, Table<ElectionInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.election_info</code> table reference
     */
    public ElectionInfo(String alias) {
        this(DSL.name(alias), ELECTION_INFO);
    }

    /**
     * Create an aliased <code>public.election_info</code> table reference
     */
    public ElectionInfo(Name alias) {
        this(alias, ELECTION_INFO);
    }

    /**
     * Create a <code>public.election_info</code> table reference
     */
    public ElectionInfo() {
        this(DSL.name("election_info"), null);
    }

    public <O extends Record> ElectionInfo(Table<O> child, ForeignKey<O, ElectionInfoRecord> key) {
        super(child, key, ELECTION_INFO);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<ElectionInfoRecord, Integer> getIdentity() {
        return (Identity<ElectionInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ElectionInfoRecord> getPrimaryKey() {
        return Keys.ELECTION_INFO_PKEY;
    }

    @Override
    public List<UniqueKey<ElectionInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ElectionInfoRecord>>asList(Keys.ELECTION_INFO_PKEY);
    }

    @Override
    public ElectionInfo as(String alias) {
        return new ElectionInfo(DSL.name(alias), this);
    }

    @Override
    public ElectionInfo as(Name alias) {
        return new ElectionInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ElectionInfo rename(String name) {
        return new ElectionInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ElectionInfo rename(Name name) {
        return new ElectionInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, JSON> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}