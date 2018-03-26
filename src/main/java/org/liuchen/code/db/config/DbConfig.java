package org.liuchen.code.db.config;

/**
 * Created by liuchen25 on 2018/3/25.
 */
public class DbConfig {
    private String driver;
    private String url;
    private String username;
    private String password;
    private final String configName;

    public DbConfig(String driver, String url, String username, String password, String configName) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        this.configName = configName;
    }

    public String getConfigName() {
        return this.configName;
    }
}
