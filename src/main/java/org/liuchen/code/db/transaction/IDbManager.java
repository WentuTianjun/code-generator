package org.liuchen.code.db.transaction;

import org.liuchen.code.db.config.DbConfig;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDbManager {
    Connection getConnection();

    void commit() throws SQLException;

    DbConfig getDefaultDbConfig();

    void closeConnection() throws SQLException;
}
