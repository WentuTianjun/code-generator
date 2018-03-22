package org.liuchen.code.plugin;

import org.liuchen.code.db.Constants;
import org.liuchen.code.domain.TableInfo;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public CustomCellEditor(JComboBox comboBox) {
        super(comboBox);
    }

    @Override
    public Object getCellEditorValue() {
        return label;
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.value = value == null ? null : value.toString();
        oldValue = this.value;
        this.row = row;
        this.column = column;
        label.setText(this.value);
        model = table.getModel();
        return label;
    }

    @Override
    public boolean stopCellEditing() {
        model.setValueAt(label.getText(), row, column);
        if (label.getText()!=null&&oldValue!=null&&!oldValue.trim().equals(label.getText())) {
            try {
                saveTableInfo();
            } catch (SQLException ex) {
//                SwingLogUtil.showError(ex);
                Logger.getLogger(CellEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    private void saveTableInfo() throws SQLException {
        String tableName = model.getValueAt(row, 1).toString();
        String EntyName = model.getValueAt(row, 2).toString();
        String Comment = model.getValueAt(row, 3).toString();
        TableInfo tableInfo = new TableInfo();
        tableInfo.setEntyname(EntyName);
        tableInfo.setTablecomment(Comment);
        tableInfo.setTablename(tableName);
        DbUtils.saveOrUpdateTableInfo(tableInfo, Constants.getSqliteConnection());
        ((CustomTableListModel) model).getTableList().set(row, tableInfo);
        oldValue = value;
    }

}
