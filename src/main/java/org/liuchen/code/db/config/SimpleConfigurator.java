package org.liuchen.code.db.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 简单构造器
 * Created by liuchen25 on 2018/3/25.
 */
public class SimpleConfigurator implements IConfigurator{

    /**
     * 每次构造一个SimpleConfigurator对象
     */
    public static final SimpleConfigurator INSTANCE = new SimpleConfigurator();

    private static final Map<String, DbConfig> DBCONFIGS = Collections.synchronizedMap(new HashMap());

    public static void addConfigurator(DbConfig config){
        DBCONFIGS.put(config.getConfigName(),config);
    }

    private SimpleConfigurator() {

    }

    /**
     * 从map中获取key为var的DbConfig
     * @param var
     * @return
     */
    @Override
    public DbConfig getDbConfig(String var) {
        DbConfig config = DBCONFIGS.get(var);
        return config;
    }

    @Override
    public boolean transaction() {
        return true;
    }
}
