package org.liuchen.code.db.transaction;

import org.liuchen.code.db.config.DbConfig;
import org.liuchen.code.db.config.IConfigurator;
import org.liuchen.code.db.config.SimpleConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ADbManager implements IDbManager {
    protected Logger log = LoggerFactory.getLogger(this.getClass());
    protected Connection connection;
    protected String defaultConfig = "default";
    protected IConfigurator configurator;
    protected DbConfig defaultDbConfig;

    public ADbManager(String defaultConfig){
        this.configurator = SimpleConfigurator.INSTANCE;
        this.defaultConfig = defaultConfig;
        this.defaultDbConfig = this.configurator.getDbConfig(defaultConfig);
    }

    public void commit() throws SQLException {
        if(this.connection != null && this.configurator.tranceaction()) {
            this.connection.commit();
            this.log.debug("commit");
        }
    }

    public DbConfig getDefaultDbConfig() {
        return null;
    }

    public Connection getConnection() {
        return null;
    }

    public void closeConnection() throws SQLException {

    }
}
