package com.mg.mybatis.test;

import com.mg.mybatis.mapper.UserMapper;
import com.mg.mybatis.pojo.User;
import com.mg.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ParameterTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("liu");
        System.out.println(user);
    }

    @Test
    public void testcheckLogin(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.checkLogin("liu","hongbin1123");
        System.out.println(user);
    }

    @Test
    public void checkLoginByMap(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("username","liu");
        map.put("password","hongbin1123");
        User user=mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"li","lisi4852444",36,"男","4564655544@qq.com");
        mapper.insertUser(user);
    }

    @Test
    public void testcheckLoginByParam(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("liu","hongbin1123");
        System.out.println(user);
}

    @Test
    public void updateUser(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
    }

}



