package com.excise.excise.service;

import com.excise.excise.entity.UserEntity;
import com.excise.excise.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserEntity getUser() {

        return userMapper.getUser();
    }
}
