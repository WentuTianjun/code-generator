package org.liuchen.code.db;

import org.liuchen.code.db.config.DbConfig;
import org.liuchen.code.db.config.SimpleConfigurator;
import org.liuchen.code.db.transaction.IDbManager;
import org.liuchen.code.db.transaction.SingleManager;

/**
 * Created by liuchen25 on 2018/3/22.
 */
public class Constants {

    public static IDbManager getSqliteConnection() {
        SimpleConfigurator.addConfigurator(new DbConfig("org.sqlite.JDBC", "jdbc:sqlite:data.db", "", "", "sqlite"));
        return new SingleManager("sqlite");
    }
}
