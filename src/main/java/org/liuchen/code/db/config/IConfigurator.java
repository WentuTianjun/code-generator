package org.liuchen.code.db.config;

public interface IConfigurator {

    DbConfig getDefaultConfig();

    DbConfig getDbConfig(String var1);

    boolean sqlOut();

    boolean prepare();

    boolean tranceaction();
}
