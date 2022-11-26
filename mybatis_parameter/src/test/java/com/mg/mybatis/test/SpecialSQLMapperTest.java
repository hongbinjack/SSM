package com.mg.mybatis.test;

import com.mg.mybatis.mapper.SpecialSQLMapper;
import com.mg.mybatis.pojo.User;
import com.mg.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class SpecialSQLMapperTest {
    @Test
    public void testSpecialSQLMapper(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }

    @Test
    public void testDeleteMoreUser(){
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
    mapper.deleteMoreUser("3,10");
}

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);
    }


    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"Mark","markSecret",43,"男","mark778899@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

    public void testJDBC() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("","","");

//            String sql = null;
//            sql = "select * from t_user where username like '%?%'";
//            PreparedStatement ps = connection.prepareStatement(sql);

            String sql = "Insert into t_user values()";
            PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS );
            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();
            resultSet.next();
            resultSet.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
