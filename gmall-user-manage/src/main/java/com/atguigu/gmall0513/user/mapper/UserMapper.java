package com.atguigu.gmall0513.user.mapper;



import com.atguigu.gmall0513.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;


public interface UserMapper extends Mapper<UserInfo> {

 //使用mapper--直接实现类上添加的是扫描的mapper的注解；

}
