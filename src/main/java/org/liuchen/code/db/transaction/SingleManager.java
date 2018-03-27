package org.liuchen.code.db.transaction;

import java.sql.SQLException;

/**
 * Created by liuchen25 on 2018/3/25.
 */
public class SingleManager extends ADbManager {

    public SingleManager(String defaultConfig) {
        super(defaultConfig);
    }

    public synchronized void commit() throws SQLException{
        super.commit();
    }
}
