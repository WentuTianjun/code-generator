package org.liuchen.code.db;

import org.liuchen.code.domain.TableInfo;

import java.util.List;

/**
 * 对数据库表的操作的接口
 * Created by liuchen25 on 2018/3/22.
 */
public interface IDatabaseInfo {
    /**
     * 默认获取数据库的前20张表
     * @return 表信息列表
     */
    List getTableList();

    /**
     * 按照表名模糊搜索表
     * @param keyWord
     * @return
     */
    List<TableInfo> getTableList(String keyWord);
}
