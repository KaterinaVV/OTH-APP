/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables;


import de.oth.othappserver.Keys;
import de.oth.othappserver.Public;
import de.oth.othappserver.tables.records.FeedRecord;

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
public class Feed extends TableImpl<FeedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.feed</code>
     */
    public static final Feed FEED = new Feed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeedRecord> getRecordType() {
        return FeedRecord.class;
    }

    /**
     * The column <code>public.feed.id</code>.
     */
    public final TableField<FeedRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.feed.rss</code>.
     */
    public final TableField<FeedRecord, String> RSS = createField(DSL.name("rss"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>public.feed.faculty</code>.
     */
    public final TableField<FeedRecord, Integer> FACULTY = createField(DSL.name("faculty"), SQLDataType.INTEGER.nullable(false), this, "");

    private Feed(Name alias, Table<FeedRecord> aliased) {
        this(alias, aliased, null);
    }

    private Feed(Name alias, Table<FeedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.feed</code> table reference
     */
    public Feed(String alias) {
        this(DSL.name(alias), FEED);
    }

    /**
     * Create an aliased <code>public.feed</code> table reference
     */
    public Feed(Name alias) {
        this(alias, FEED);
    }

    /**
     * Create a <code>public.feed</code> table reference
     */
    public Feed() {
        this(DSL.name("feed"), null);
    }

    public <O extends Record> Feed(Table<O> child, ForeignKey<O, FeedRecord> key) {
        super(child, key, FEED);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<FeedRecord> getPrimaryKey() {
        return Keys.FEED_PKEY;
    }

    @Override
    public List<UniqueKey<FeedRecord>> getKeys() {
        return Arrays.<UniqueKey<FeedRecord>>asList(Keys.FEED_PKEY);
    }

    @Override
    public List<ForeignKey<FeedRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FeedRecord, ?>>asList(Keys.FEED__FK_FEED_FACULTY);
    }

    public Faculty faculty() {
        return new Faculty(this, Keys.FEED__FK_FEED_FACULTY);
    }

    @Override
    public Feed as(String alias) {
        return new Feed(DSL.name(alias), this);
    }

    @Override
    public Feed as(Name alias) {
        return new Feed(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Feed rename(String name) {
        return new Feed(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Feed rename(Name name) {
        return new Feed(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
