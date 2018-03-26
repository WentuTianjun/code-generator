package org.liuchen.code.db.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuchen25 on 2018/3/25.
 */
public class SimpleConfigurator {

    private static final Map<String, DbConfig> DBCONFIGS = Collections.synchronizedMap(new HashMap());

    public static void addConfigurator(DbConfig config){
        DBCONFIGS.put(config.getConfigName(),config);
    }
}
