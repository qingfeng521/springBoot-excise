package com.excise.excise.controller;
import com.excise.excise.entity.UserEntity;
import com.excise.excise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    public UserEntity getUser(){
        return userService.getUser();
    }




}
