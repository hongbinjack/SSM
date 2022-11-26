package com.mg.mybatis.test;

import com.mg.mybatis.mapper.UserMapper;
import com.mg.mybatis.pojo.User;
import com.mg.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import static org.apache.ibatis.io.Resources.getResourceAsFile;

public class MybatisTest {
    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);

        //获取sql的会话对象SqlSession(不会自动提交事务)，时Mybatis提供的操作数据库的对象
        //  SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取sql的会话对象SqlSession(设置openSession括号中的值为true，自动提交事务，不需要后面的sqlSession.commit();了)，时Mybatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        /*调用mapper接口中的方法，实现添加用户信息的的功能
         下面那个result与这个等同，但这个方式用的更多
         */
        int result = mapper.insertUser();

        //提供sql语句唯一标识找到sql并执行，唯一标识是namespace.sqlID
        // int result = sqlSession.insert("com.mg.mybatis.mapper.UserMapper.insertUser");

        System.out.println("结果：" +result);
        //提交事务
//        sqlSession.commit();
        //关闭SqlSession对象
        sqlSession.close();
    }

    @Test
    public void testUpdate(){

        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }


    @Test
    public void testDelete(){

        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }


    @Test
    public void testGetUserById() {
/*
        <!-- resultType:设置结果类型，即查询的数据要转换为java类型
        resultMap:自定义映射，处理多对一或一对多的映射关系
        -->*/
      SqlSession sqlSession=SqlSessionUtil.getSqlSession();
      UserMapper mapper=sqlSession.getMapper(UserMapper.class);
      User user=mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void testGetAllUserById() {

        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> list=mapper.getAllUser();
        list.forEach(System.out::println);//forEach方法把集合中的数据循环输出

    //查询功能要多设置一个属性resultTpe 或 resultMap
    }
}