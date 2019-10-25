package com.atguigu.gmall.service;


import com.atguigu.gmall0513.bean.UserInfo;

import java.util.List;

//接口的UserService
public interface UserService {


    //输出一个方法-泛型是List的
    public List<UserInfo>  fingAllUsers();


    //根据条件查出一个对象
    public  UserInfo findUser();
}
