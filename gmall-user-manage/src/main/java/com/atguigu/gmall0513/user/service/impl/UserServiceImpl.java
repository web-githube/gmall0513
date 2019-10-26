package com.atguigu.gmall0513.user.service.impl;


import com.atguigu.gmall0513.bean.UserAddress;
import com.atguigu.gmall0513.bean.UserInfo;
import com.atguigu.gmall0513.service.UserService;
import com.atguigu.gmall0513.user.mapper.UserMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service  //表示是一个服务层被调用的；
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public List<UserAddress> getUserAddressByUserId(String userId) {
        return null;
    }

    @Override
    public List<UserInfo> fingAllUsers() {
        return null;
    }

    @Override
    public UserInfo findUser() {
        return null;
    }

    @Override
    public List<UserInfo> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<UserInfo> findByUserInfoProperty(UserInfo userInfo) {
        return null;
    }

    @Override
    public List<UserInfo> findByUserInfoNickName(UserInfo userInfo) {
        return null;
    }

    @Override
    public void addUser(UserInfo userInfo) {

    }

    @Override
    public void delUser(UserInfo userInfo) {

    }

    @Override
    public void updUser(UserInfo userInfo) {

    }
}
