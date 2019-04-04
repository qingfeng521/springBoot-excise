package com.excise.excise.config;


import com.excise.excise.entity.ConnectionPoolEntity;
import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.excise.excise.entity")
public class SimpleConfig {

    @Autowired
    private ConnectionPoolEntity connectionPoolEntity;

    // 配置 bonecpdDataSource 连接池
    @Bean(destroyMethod = "close")
    public BoneCPDataSource boneCPDataSource(){
        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
        boneCPDataSource.setDriverClass(connectionPoolEntity.getDriverClassName());
        boneCPDataSource.setJdbcUrl(connectionPoolEntity.getUrl());
        boneCPDataSource.setUsername(connectionPoolEntity.getUserName());
        boneCPDataSource.setPassword(connectionPoolEntity.getPassWord());
        boneCPDataSource.setIdleConnectionTestPeriodInSeconds(Long.valueOf(connectionPoolEntity.getIdleConnectionTestPeriod()));
        boneCPDataSource.setIdleMaxAgeInSeconds(Long.valueOf(connectionPoolEntity.getIdleMaxAge()));
        boneCPDataSource.setMaxConnectionAgeInSeconds(Long.valueOf(connectionPoolEntity.getMaxConnectionsPerPartition()));
        boneCPDataSource.setMinConnectionsPerPartition(Integer.valueOf(connectionPoolEntity.getMinConnectionsPerPartition()));
        return boneCPDataSource;
    }


}
