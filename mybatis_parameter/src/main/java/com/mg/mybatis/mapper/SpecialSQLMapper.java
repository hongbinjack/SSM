package com.mg.mybatis.mapper;

import com.mg.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {
    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);


    /**
     * 批量删除
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);



    /**
     *动态设置表名，查询用户信息
     */
   List<User> getUserList(@Param("tableName")String tableName);


    /**
     * 添加用户信息并获取自增型的主键
     * @param user
     */
   void insertUser(User user);
}


















