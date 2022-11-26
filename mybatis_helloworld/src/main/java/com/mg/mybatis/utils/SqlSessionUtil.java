package com.mg.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

    public static SqlSession getSqlSession() {
        SqlSession sqlSession=null;

        try {
            //获取核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            //获取SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取SQLSession
            sqlSession= sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

return sqlSession;
    }
}
