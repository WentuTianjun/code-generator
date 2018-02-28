package org.liuchen.code.db.config;

import org.liuchen.code.db.adapter.IAdapter;
import org.liuchen.code.db.utils.ReflectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigCenter {
    private static final Logger log = LoggerFactory.getLogger(ConfigCenter.class);
    public static ConfigCenter INSTANCE = new ConfigCenter();

    private String sqlout;
    private String adapter;

    public IAdapter getDefaultAdapter() {
        return (IAdapter) ReflectionUtils.instance(this.adapter);
    }
}
