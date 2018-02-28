package org.liuchen.code.db.utils;


import org.liuchen.code.db.crud.DatabaseAccess;
import org.liuchen.code.db.transaction.IDbManager;
import org.liuchen.code.db.transaction.SingleManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SqliteUtil {
    private static final Logger log = LoggerFactory.getLogger(SqliteUtil.class);
    private static final Map<String, String> propertiesMap = Collections.synchronizedMap(new HashMap());

    public static IDbManager getManager(final boolean... commit) {
        SingleManager manager = new SingleManager("sqlite") {
            public synchronized void commit() throws SQLException {
                if(commit.length <= 0 || commit[0]) {
                    super.commit();
                }
            }
        };
        return manager;
    }

    public static String getProperty(String key) {
        String pvalue = (String)propertiesMap.get(key);
        if(null==pvalue){
            String sql = "select value from properties where key =\'" + key + "\'";
            DatabaseAccess lite = new DatabaseAccess(getManager(new boolean[]{false}));

            try {
                Object ex = lite.queryUnique(sql);
                pvalue = ex == null?"":ex.toString();
            } catch (SQLException var5) {
                log.error("getProperty error key:{}", var5, key);
            }
        }

        propertiesMap.put(key, pvalue);
        return pvalue;
    }

}
