package com.atguigu.gmall0513.user.controller;


import com.atguigu.gmall0513.bean.UserInfo;
import com.atguigu.gmall0513.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController       //springmvc---sprinngboot --依赖于common-util
public class UserInfoController {


    @Autowired
    private UserService userService;

     @RequestMapping("findAll")
    public List<UserInfo> getFindAll(){

       return userService.findAll();
    }

}
