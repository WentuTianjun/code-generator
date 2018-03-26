package org.liuchen.code.db;

import org.liuchen.code.domain.TableInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by liuchen25 on 2018/3/22.
 */
public abstract class ADatabaseInfo implements IDatabaseInfo{
    protected Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public List getTableList() {
        return null;
    }

    @Override
    public List<TableInfo> getTableList(String keyWord) {
        return null;
    }
}
