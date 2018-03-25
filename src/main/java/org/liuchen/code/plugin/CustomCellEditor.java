package org.liuchen.code.plugin;

import org.liuchen.code.db.Constants;
import org.liuchen.code.db.util.DbUtils;
import org.liuchen.code.domain.TableInfo;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.sql.SQLException;

/**
 * Created by liuchen25 on 2018/3/22.
 */
public class CustomCellEditor extends DefaultCellEditor {
    private String oldValue;
    private String value;
    private final JTextField label;
    private int row;
    private int column;
    private TableModel model;

    public CustomCellEditor(JTextField textField) {
        super(textField);
        label = textField;
    }

    private void saveTableInfo() throws SQLException {
        String tableName = model.getValueAt(row, 1).toString();
        String entyName = model.getValueAt(row, 2).toString();
        String comment = model.getValueAt(row, 3).toString();
        TableInfo tableInfo = new TableInfo();
        tableInfo.setEntyName(entyName);
        tableInfo.setTableComment(comment);
        tableInfo.setTableName(tableName);
        DbUtils.saveOrUpdateTableInfo(tableInfo, Constants.getSqliteConnection());
        ((CustomTableListModel) model).getTableList().set(row, tableInfo);
        oldValue = value;
    }

}
