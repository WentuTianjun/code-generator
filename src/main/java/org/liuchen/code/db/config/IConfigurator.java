package org.liuchen.code.db.config;

/**
 *
 */
public interface IConfigurator {

    DbConfig getDbConfig(String value);

    boolean transaction();
}
