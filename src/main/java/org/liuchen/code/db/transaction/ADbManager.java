package org.liuchen.code.db.transaction;

import org.liuchen.code.db.config.DbConfig;
import org.liuchen.code.db.config.IConfigurator;
import org.liuchen.code.db.config.SimpleConfigurator;

import java.sql.Connection;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DbManager的抽象类
 * Created by liuchen25 on 2018/3/25.
 */
public abstract class ADbManager implements IDbManager {
    protected Logger log = LoggerFactory.getLogger(ADbManager.class);
    /**数据库连接*/
    protected Connection connection;
    protected String defaultConfig = "default";
    protected IConfigurator configurator;
    protected DbConfig defaultDbConfig;

    /**
     * 构造方法
     */
    public ADbManager(String defaultConfig) {
        this.configurator = SimpleConfigurator.INSTANCE;
        this.defaultConfig = defaultConfig;
        this.defaultDbConfig = this.configurator.getDbConfig(defaultConfig);
    }

    /**
     * 提交事务
     */
    public void commit() throws SQLException {
        if(this.connection!=null && this.configurator.transaction()){
            this.connection.commit();
            this.log.debug("commit");
        }
    }
}
