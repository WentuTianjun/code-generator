package org.liuchen.code.domain;

/**
 * 表信息的bean
 * Created by liuchen25 on 2018/3/22.
 */
public class TableInfo {
    /**表名*/
    private String tableName;
    /***/
    private String entyName;
    /***/
    private String tableComment;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getEntyName() {
        return entyName;
    }

    public void setEntyName(String entyName) {
        this.entyName = entyName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TableInfo{");
        sb.append("tableName='").append(tableName).append('\'');
        sb.append(", entyName='").append(entyName).append('\'');
        sb.append(", tableComment='").append(tableComment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
