/*
 * This file is generated by jOOQ.
 */
package com.egnyte.generated.tables;


import com.egnyte.generated.Keys;
import com.egnyte.generated.Public;
import com.egnyte.generated.tables.records.CountriesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class Countries extends TableImpl<CountriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC.COUNTRIES</code>
     */
    public static final Countries COUNTRIES = new Countries();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountriesRecord> getRecordType() {
        return CountriesRecord.class;
    }

    /**
     * The column <code>PUBLIC.COUNTRIES.ID</code>.
     */
    public final TableField<CountriesRecord, String> ID = createField(DSL.name("ID"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.COUNTRIES.NAME</code>.
     */
    public final TableField<CountriesRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    private Countries(Name alias, Table<CountriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Countries(Name alias, Table<CountriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PUBLIC.COUNTRIES</code> table reference
     */
    public Countries(String alias) {
        this(DSL.name(alias), COUNTRIES);
    }

    /**
     * Create an aliased <code>PUBLIC.COUNTRIES</code> table reference
     */
    public Countries(Name alias) {
        this(alias, COUNTRIES);
    }

    /**
     * Create a <code>PUBLIC.COUNTRIES</code> table reference
     */
    public Countries() {
        this(DSL.name("COUNTRIES"), null);
    }

    public <O extends Record> Countries(Table<O> child, ForeignKey<O, CountriesRecord> key) {
        super(child, key, COUNTRIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CountriesRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_F;
    }

    @Override
    public Countries as(String alias) {
        return new Countries(DSL.name(alias), this);
    }

    @Override
    public Countries as(Name alias) {
        return new Countries(alias, this);
    }

    @Override
    public Countries as(Table<?> alias) {
        return new Countries(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Countries rename(String name) {
        return new Countries(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Countries rename(Name name) {
        return new Countries(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Countries rename(Table<?> name) {
        return new Countries(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}