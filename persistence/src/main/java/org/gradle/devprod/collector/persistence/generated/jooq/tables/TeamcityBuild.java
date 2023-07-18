/*
 * This file is generated by jOOQ.
 */
package org.gradle.devprod.collector.persistence.generated.jooq.tables;


import java.time.OffsetDateTime;
import java.util.function.Function;

import org.gradle.devprod.collector.persistence.generated.jooq.Keys;
import org.gradle.devprod.collector.persistence.generated.jooq.Public;
import org.gradle.devprod.collector.persistence.generated.jooq.tables.records.TeamcityBuildRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
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
public class TeamcityBuild extends TableImpl<TeamcityBuildRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.teamcity_build</code>
     */
    public static final TeamcityBuild TEAMCITY_BUILD = new TeamcityBuild();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeamcityBuildRecord> getRecordType() {
        return TeamcityBuildRecord.class;
    }

    /**
     * The column <code>public.teamcity_build.build_id</code>.
     */
    public final TableField<TeamcityBuildRecord, String> BUILD_ID = createField(DSL.name("build_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.configuration</code>.
     */
    public final TableField<TeamcityBuildRecord, String> CONFIGURATION = createField(DSL.name("configuration"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.queued</code>.
     */
    public final TableField<TeamcityBuildRecord, OffsetDateTime> QUEUED = createField(DSL.name("queued"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.started</code>.
     */
    public final TableField<TeamcityBuildRecord, OffsetDateTime> STARTED = createField(DSL.name("started"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public.teamcity_build.finished</code>.
     */
    public final TableField<TeamcityBuildRecord, OffsetDateTime> FINISHED = createField(DSL.name("finished"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public.teamcity_build.state</code>.
     */
    public final TableField<TeamcityBuildRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.status</code>.
     */
    public final TableField<TeamcityBuildRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.status_text</code>.
     */
    public final TableField<TeamcityBuildRecord, String> STATUS_TEXT = createField(DSL.name("status_text"), SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>public.teamcity_build.branch</code>.
     */
    public final TableField<TeamcityBuildRecord, String> BRANCH = createField(DSL.name("branch"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.git_commit_id</code>.
     */
    public final TableField<TeamcityBuildRecord, String> GIT_COMMIT_ID = createField(DSL.name("git_commit_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.buildscan_urls</code>.
     */
    public final TableField<TeamcityBuildRecord, String[]> BUILDSCAN_URLS = createField(DSL.name("buildscan_urls"), SQLDataType.VARCHAR(255).nullable(false).array(), this, "");

    /**
     * The column <code>public.teamcity_build.composite</code>.
     */
    public final TableField<TeamcityBuildRecord, Boolean> COMPOSITE = createField(DSL.name("composite"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.teamcity_build.build_host_name</code>.
     */
    public final TableField<TeamcityBuildRecord, String> BUILD_HOST_NAME = createField(DSL.name("build_host_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.teamcity_build.build_host_type</code>.
     */
    public final TableField<TeamcityBuildRecord, String> BUILD_HOST_TYPE = createField(DSL.name("build_host_type"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.teamcity_build.dependency_finished</code>.
     */
    public final TableField<TeamcityBuildRecord, OffsetDateTime> DEPENDENCY_FINISHED = createField(DSL.name("dependency_finished"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private TeamcityBuild(Name alias, Table<TeamcityBuildRecord> aliased) {
        this(alias, aliased, null);
    }

    private TeamcityBuild(Name alias, Table<TeamcityBuildRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.teamcity_build</code> table reference
     */
    public TeamcityBuild(String alias) {
        this(DSL.name(alias), TEAMCITY_BUILD);
    }

    /**
     * Create an aliased <code>public.teamcity_build</code> table reference
     */
    public TeamcityBuild(Name alias) {
        this(alias, TEAMCITY_BUILD);
    }

    /**
     * Create a <code>public.teamcity_build</code> table reference
     */
    public TeamcityBuild() {
        this(DSL.name("teamcity_build"), null);
    }

    public <O extends Record> TeamcityBuild(Table<O> child, ForeignKey<O, TeamcityBuildRecord> key) {
        super(child, key, TEAMCITY_BUILD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<TeamcityBuildRecord> getPrimaryKey() {
        return Keys.TEAMCITY_BUILD_PK;
    }

    @Override
    public TeamcityBuild as(String alias) {
        return new TeamcityBuild(DSL.name(alias), this);
    }

    @Override
    public TeamcityBuild as(Name alias) {
        return new TeamcityBuild(alias, this);
    }

    @Override
    public TeamcityBuild as(Table<?> alias) {
        return new TeamcityBuild(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamcityBuild rename(String name) {
        return new TeamcityBuild(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamcityBuild rename(Name name) {
        return new TeamcityBuild(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamcityBuild rename(Table<?> name) {
        return new TeamcityBuild(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, String, String, String, String[], Boolean, String, String, OffsetDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String[], ? super Boolean, ? super String, ? super String, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String[], ? super Boolean, ? super String, ? super String, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
