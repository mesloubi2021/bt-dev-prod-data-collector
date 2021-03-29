/*
 * This file is generated by jOOQ.
 */
package org.gradle.devprod.enterprise.export.generated.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.gradle.devprod.enterprise.export.generated.jooq.Keys;
import org.gradle.devprod.enterprise.export.generated.jooq.Public;
import org.gradle.devprod.enterprise.export.generated.jooq.tables.records.TimeToFirstTaskRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeToFirstTask extends TableImpl<TimeToFirstTaskRecord> {

    private static final long serialVersionUID = -1111745585;

    /**
     * The reference instance of <code>public.time_to_first_task</code>
     */
    public static final TimeToFirstTask TIME_TO_FIRST_TASK = new TimeToFirstTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimeToFirstTaskRecord> getRecordType() {
        return TimeToFirstTaskRecord.class;
    }

    /**
     * The column <code>public.time_to_first_task.build_id</code>.
     */
    public final TableField<TimeToFirstTaskRecord, String> BUILD_ID = createField(DSL.name("build_id"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.time_to_first_task.project</code>.
     */
    public final TableField<TimeToFirstTaskRecord, String> PROJECT = createField(DSL.name("project"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.time_to_first_task.path_to_test_task</code>.
     */
    public final TableField<TimeToFirstTaskRecord, String> PATH_TO_TEST_TASK = createField(DSL.name("path_to_test_task"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.time_to_first_task.time_to_first_task</code>.
     */
    public final TableField<TimeToFirstTaskRecord, Long> TIME_TO_FIRST_TASK_ = createField(DSL.name("time_to_first_task"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.time_to_first_task.build_start</code>.
     */
    public final TableField<TimeToFirstTaskRecord, LocalDateTime> BUILD_START = createField(DSL.name("build_start"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.time_to_first_task</code> table reference
     */
    public TimeToFirstTask() {
        this(DSL.name("time_to_first_task"), null);
    }

    /**
     * Create an aliased <code>public.time_to_first_task</code> table reference
     */
    public TimeToFirstTask(String alias) {
        this(DSL.name(alias), TIME_TO_FIRST_TASK);
    }

    /**
     * Create an aliased <code>public.time_to_first_task</code> table reference
     */
    public TimeToFirstTask(Name alias) {
        this(alias, TIME_TO_FIRST_TASK);
    }

    private TimeToFirstTask(Name alias, Table<TimeToFirstTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimeToFirstTask(Name alias, Table<TimeToFirstTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TimeToFirstTask(Table<O> child, ForeignKey<O, TimeToFirstTaskRecord> key) {
        super(child, key, TIME_TO_FIRST_TASK);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<TimeToFirstTaskRecord> getPrimaryKey() {
        return Keys.TIME_TO_FIRST_TASK_PK;
    }

    @Override
    public List<UniqueKey<TimeToFirstTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TimeToFirstTaskRecord>>asList(Keys.TIME_TO_FIRST_TASK_PK);
    }

    @Override
    public TimeToFirstTask as(String alias) {
        return new TimeToFirstTask(DSL.name(alias), this);
    }

    @Override
    public TimeToFirstTask as(Name alias) {
        return new TimeToFirstTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeToFirstTask rename(String name) {
        return new TimeToFirstTask(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeToFirstTask rename(Name name) {
        return new TimeToFirstTask(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Long, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}