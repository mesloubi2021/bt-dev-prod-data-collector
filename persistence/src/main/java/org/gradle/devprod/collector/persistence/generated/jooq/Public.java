/*
 * This file is generated by jOOQ.
 */
package org.gradle.devprod.collector.persistence.generated.jooq;


import java.util.Arrays;
import java.util.List;

import org.gradle.devprod.collector.persistence.generated.jooq.tables.Build;
import org.gradle.devprod.collector.persistence.generated.jooq.tables.TeamcityBuild;
import org.gradle.devprod.collector.persistence.generated.jooq.udt.KeyValue;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.build</code>.
     */
    public final Build BUILD = Build.BUILD;

    /**
     * The table <code>public.teamcity_build</code>.
     */
    public final TeamcityBuild TEAMCITY_BUILD = TeamcityBuild.TEAMCITY_BUILD;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Build.BUILD,
            TeamcityBuild.TEAMCITY_BUILD);
    }

    @Override
    public final List<UDT<?>> getUDTs() {
        return Arrays.<UDT<?>>asList(
            KeyValue.KEY_VALUE);
    }
}
