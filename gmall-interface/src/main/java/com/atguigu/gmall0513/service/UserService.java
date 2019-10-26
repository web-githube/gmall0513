package com.atguigu.gmall0513.service;




import com.atguigu.gmall0513.bean.UserAddress;
import com.atguigu.gmall0513.bean.UserInfo;

import java.util.List;

//接口的UserService
public interface UserService {


    /**
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressByUserId(String userId);



    //输出一个方法-泛型是List的
    public List<UserInfo>  fingAllUsers();


    //根据条件查出一个对象
    public  UserInfo findUser();

    // 查询所有用户信息
    List<UserInfo> findAll();

    // 根据用户的name或者是loginName 等字段查询数据如何处理？
    List<UserInfo> findByUserInfoProperty(UserInfo userInfo);

    // 做区间范围查询
    List<UserInfo> findByUserInfoNickName(UserInfo userInfo);

    // 添加 注册
    void addUser(UserInfo userInfo);

    // 删除
    void delUser(UserInfo userInfo);

    void updUser(UserInfo userInfo);




}
