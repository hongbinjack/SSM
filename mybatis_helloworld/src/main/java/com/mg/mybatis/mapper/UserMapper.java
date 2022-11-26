package com.mg.mybatis.mapper;

import com.mg.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /*
    添加用户信息
    @return
     */
    int insertUser();

    /*
    修改用户信息
     */
    void  updateUser();

    /*
    删除用户信息
     */
    void deleteUser();

    /*
    根据id查询用户信息
    @return
     */
    User getUserById();//返回值是User对象

    /*
    查询所有的用户信息
    @return
     */
    List<User> getAllUser();

}
