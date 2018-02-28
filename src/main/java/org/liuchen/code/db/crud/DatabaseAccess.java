package org.liuchen.code.db.crud;

import org.liuchen.code.db.transaction.IDbManager;

import java.sql.SQLException;

public class DatabaseAccess extends BaseDbTool {

    public DatabaseAccess(IDbManager tx) {
        super(tx);
    }

    public Object queryUnique(String sql) throws SQLException {
        Object findUnique = this.adapter.findUnique(this.getConnection(), sql);
        this.tx.closeConnection();
        return findUnique;
    }
}
