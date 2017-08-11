package de.cofinpro.liquibase;

import liquibase.resource.ClassLoaderResourceAccessor;
import liquibase.resource.ResourceAccessor;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
public abstract class CDILiquibaseConfig {

    public abstract String getChangeLog();

    public abstract DataSource getDataSource();

    public ResourceAccessor getResourceAccessor() {
        return new ClassLoaderResourceAccessor(getClass().getClassLoader());
    }

    public String getDefaultSchema() {
        return null;
    }

    public Collection<String> getSchemas() {
        return Collections.emptyList();
    }

    public Map<String, String[]> getSchemaCredentials() {
        return Collections.emptyMap();
    }

    public Map<String, String> getParameters() {
        return Collections.emptyMap();
    }

    public String getLabels() {
        return null;
    }

    public Collection<String> getContexts() {
        return Collections.emptyList();
    }
}


