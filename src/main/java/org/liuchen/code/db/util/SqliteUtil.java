package org.liuchen.code.db.util;

import org.liuchen.code.db.crud.DatabaseAccess;
import org.liuchen.code.db.transaction.IDbManager;
import org.liuchen.code.db.transaction.SingleManager;

import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理sql的工具类
 */
public class SqliteUtil {
    private static final Map<String,Object> propertiesMap = Collections.synchronizedMap(new HashMap<>());

    public static String getProperty(String key){
        String str = (String)propertiesMap.get(key);
        if(str!=null && !"".equals(str)){
            String sql = "select value from properties where key = '" + key+ "'";
            DatabaseAccess access = new DatabaseAccess(getManager(new boolean[0]));
        }
        return null;
    }

    private static IDbManager getManager(final boolean... commit) {
        SingleManager singleManager = new SingleManager("sqlite"){
            public synchronized void commit() throws SQLException{
                if(commit.length<=0 || commit[0]){
                    super.commit();
                }
            }
        };
        return null;
    }
}
