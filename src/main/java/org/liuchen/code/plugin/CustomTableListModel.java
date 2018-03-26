package org.liuchen.code.plugin;

import org.liuchen.code.domain.TableInfo;

import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * Created by liuchen25 on 2018/3/22.
 */
public class CustomTableListModel extends DefaultTableModel {
    /**
     * 常量配置区
     */
    private final String[] tableHeader = {"选择", "表名", "英文名", "说明"};
    private final Boolean[] isEditable = {true, false, true, true};
    private List<TableInfo> tableList;

    public List<TableInfo> getTableList() {
        return tableList;
    }

}
