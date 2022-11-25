/*
 * This file is generated by jOOQ.
 */
package de.oth.othappserver.tables.records;


import de.oth.othappserver.tables.Faculty;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FacultyRecord extends UpdatableRecordImpl<FacultyRecord> implements Record6<Integer, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.faculty.id</code>.
     */
    public FacultyRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.faculty.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.faculty.identifier</code>.
     */
    public FacultyRecord setIdentifier(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.faculty.identifier</code>.
     */
    public String getIdentifier() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.faculty.name</code>.
     */
    public FacultyRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.faculty.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.faculty.color</code>.
     */
    public FacultyRecord setColor(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.faculty.color</code>.
     */
    public String getColor() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.faculty.webuntis_id</code>.
     */
    public FacultyRecord setWebuntisId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.faculty.webuntis_id</code>.
     */
    public Integer getWebuntisId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.faculty.jobmarket_id</code>.
     */
    public FacultyRecord setJobmarketId(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.faculty.jobmarket_id</code>.
     */
    public Integer getJobmarketId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Faculty.FACULTY.ID;
    }

    @Override
    public Field<String> field2() {
        return Faculty.FACULTY.IDENTIFIER;
    }

    @Override
    public Field<String> field3() {
        return Faculty.FACULTY.NAME;
    }

    @Override
    public Field<String> field4() {
        return Faculty.FACULTY.COLOR;
    }

    @Override
    public Field<Integer> field5() {
        return Faculty.FACULTY.WEBUNTIS_ID;
    }

    @Override
    public Field<Integer> field6() {
        return Faculty.FACULTY.JOBMARKET_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getIdentifier();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getColor();
    }

    @Override
    public Integer component5() {
        return getWebuntisId();
    }

    @Override
    public Integer component6() {
        return getJobmarketId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getIdentifier();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getColor();
    }

    @Override
    public Integer value5() {
        return getWebuntisId();
    }

    @Override
    public Integer value6() {
        return getJobmarketId();
    }

    @Override
    public FacultyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public FacultyRecord value2(String value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public FacultyRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public FacultyRecord value4(String value) {
        setColor(value);
        return this;
    }

    @Override
    public FacultyRecord value5(Integer value) {
        setWebuntisId(value);
        return this;
    }

    @Override
    public FacultyRecord value6(Integer value) {
        setJobmarketId(value);
        return this;
    }

    @Override
    public FacultyRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FacultyRecord
     */
    public FacultyRecord() {
        super(Faculty.FACULTY);
    }

    /**
     * Create a detached, initialised FacultyRecord
     */
    public FacultyRecord(Integer id, String identifier, String name, String color, Integer webuntisId, Integer jobmarketId) {
        super(Faculty.FACULTY);

        setId(id);
        setIdentifier(identifier);
        setName(name);
        setColor(color);
        setWebuntisId(webuntisId);
        setJobmarketId(jobmarketId);
    }
}
