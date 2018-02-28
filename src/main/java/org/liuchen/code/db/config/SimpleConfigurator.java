package org.liuchen.code.db.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleConfigurator implements IConfigurator {
    private static final Map<String, DbConfig> DBCONFIGS = Collections.synchronizedMap(new HashMap());
    public static final SimpleConfigurator INSTANCE = new SimpleConfigurator();

    public DbConfig getDbConfig(String name) {
        return (DbConfig)DBCONFIGS.get(name);
    }

    public DbConfig getDefaultConfig() {
        return null;
    }

    public boolean sqlOut() {
        return false;
    }

    public boolean prepare() {
        return false;
    }

    public boolean tranceaction() {
        return false;
    }
}
