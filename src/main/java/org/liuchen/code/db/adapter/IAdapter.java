package org.liuchen.code.db.adapter;

import java.sql.Connection;
import java.sql.SQLException;

public interface IAdapter {
    Object findUnique(Connection var1, String var2) throws SQLException;
}
