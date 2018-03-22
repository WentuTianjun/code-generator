package org.liuchen.code.db;

/**
 * Created by liuchen25 on 2018/3/22.
 */
public class Constants {

    public static IDbManager getSqliteConnection() {
        SimpleConfigurator.addConfigurator(new DbConfig("org.sqlite.JDBC", "jdbc:sqlite:data.db", "", "", "sqlite"));
        return new SingleManager("sqlite");
    }
}
