package com.excise.excise.controller;


import com.excise.excise.entity.ConnectionPoolEntity;
import com.excise.excise.entity.UserEntity;
import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private ConnectionPoolEntity connectionPoolEntity;

    @Autowired
    private BoneCPDataSource boneCPDataSource;


    @GetMapping("/getUser")
    public UserEntity getUserEntity(){
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(19);
        userEntity.setDate(new Date());
        userEntity.setName("hehe");
        return userEntity;
    }

    @GetMapping("/getConnection")
    public ConnectionPoolEntity getConnectionPool(){
        System.out.println(boneCPDataSource.getPool());
        System.out.println(connectionPoolEntity.getDriverClassName());
        System.out.println(connectionPoolEntity.getIdleConnectionTestPeriod());
        System.out.println(connectionPoolEntity.getIdleMaxAge());
        System.out.println(connectionPoolEntity.getMaxConnectionsPerPartition());
        System.out.println(connectionPoolEntity.getMinConnectionsPerPartition());
        return connectionPoolEntity;
    }



}
