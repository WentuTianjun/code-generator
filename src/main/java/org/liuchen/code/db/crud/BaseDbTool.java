package org.liuchen.code.db.crud;

import org.liuchen.code.db.adapter.IAdapter;
import org.liuchen.code.db.adapter.MysqlAdapter;
import org.liuchen.code.db.adapter.OracleAdapter;
import org.liuchen.code.db.config.ConfigCenter;
import org.liuchen.code.db.transaction.IDbManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

public abstract class BaseDbTool {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    protected IAdapter adapter;
    protected IDbManager tx;

    protected BaseDbTool(IDbManager tx) {
        this.tx = tx;
        String driver = tx.getDefaultDbConfig().getDriver();
        if(driver.contains("oracle")) {
            this.adapter = new OracleAdapter();
        } else if(driver.contains("mysql")) {
            this.adapter = new MysqlAdapter();
        } else if(driver.contains("sqlite")) {
            this.adapter = new MysqlAdapter();
        } else if(driver.contains("sqlserver")) {
//            this.adapter = new SqlserverAdapter();
        } else {
            this.adapter = ConfigCenter.INSTANCE.getDefaultAdapter();
        }

    }


    protected Connection getConnection() {
        return this.tx.getConnection();
    }
}
