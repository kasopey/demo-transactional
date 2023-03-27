/*
 * This file is generated by jOOQ.
 */
package com.egnyte.generated.tables.records;


import com.egnyte.generated.tables.Countries;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountriesRecord extends UpdatableRecordImpl<CountriesRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.COUNTRIES.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.COUNTRIES.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.COUNTRIES.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.COUNTRIES.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Countries.COUNTRIES.ID;
    }

    @Override
    public Field<String> field2() {
        return Countries.COUNTRIES.NAME;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public CountriesRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public CountriesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CountriesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountriesRecord
     */
    public CountriesRecord() {
        super(Countries.COUNTRIES);
    }

    /**
     * Create a detached, initialised CountriesRecord
     */
    public CountriesRecord(String id, String name) {
        super(Countries.COUNTRIES);

        setId(id);
        setName(name);
    }
}