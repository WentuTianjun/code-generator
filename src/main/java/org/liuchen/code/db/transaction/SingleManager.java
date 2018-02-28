package org.liuchen.code.db.transaction;

import java.sql.SQLException;

public class SingleManager extends ADbManager {

    public SingleManager(String defaultConfig) {
        super(defaultConfig);
    }

    public synchronized void commit() throws SQLException {
        super.commit();
    }
}
