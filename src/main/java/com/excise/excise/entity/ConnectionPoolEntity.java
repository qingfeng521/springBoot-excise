package com.excise.excise.entity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:properties/connectionPool.properties")
@ConfigurationProperties(prefix="jdbc")
public class ConnectionPoolEntity {

    private String driverClassName;
    private String url;
    private String userName;
    private String passWord;
    private String idleConnectionTestPeriod;
    private String idleMaxAge;
    private String maxConnectionsPerPartition;
    private String minConnectionsPerPartition;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getIdleConnectionTestPeriod() {
        return idleConnectionTestPeriod;
    }

    public void setIdleConnectionTestPeriod(String idleConnectionTestPeriod) {
        this.idleConnectionTestPeriod = idleConnectionTestPeriod;
    }

    public String getIdleMaxAge() {
        return idleMaxAge;
    }

    public void setIdleMaxAge(String idleMaxAge) {
        this.idleMaxAge = idleMaxAge;
    }

    public String getMaxConnectionsPerPartition() {
        return maxConnectionsPerPartition;
    }

    public void setMaxConnectionsPerPartition(String maxConnectionsPerPartition) {
        this.maxConnectionsPerPartition = maxConnectionsPerPartition;
    }

    public String getMinConnectionsPerPartition() {
        return minConnectionsPerPartition;
    }

    public void setMinConnectionsPerPartition(String minConnectionsPerPartition) {
        this.minConnectionsPerPartition = minConnectionsPerPartition;
    }
}
