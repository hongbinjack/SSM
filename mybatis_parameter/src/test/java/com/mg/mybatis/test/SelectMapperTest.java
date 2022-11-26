package com.mg.mybatis.test;

import com.mg.mybatis.mapper.SelectMapper;
import com.mg.mybatis.pojo.User;
import com.mg.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {
@Test
    public void testGetUserById(){
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
    User user = mapper.getUserById(1);
    System.out.println(user);
}

    @Test
    public void testGetAllUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String,Object> map = mapper.getUserByIdToMap(1);
        System.out.println(map);
    }

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String,Object>> list = (List<Map<String, Object>>) mapper.getAllUserToMap();
//        System.out.println(list);


        Map<String,Object> map = mapper.getAllUserToMap();
        System.out.println(map);
        /*
      {
        1={password=hongbin1123, gender=男, id=1, age=26, email=9656487482@qq.com, username=liu},
        2={password=lisi4852444, gender=男, id=2, age=36, email=4564655544@qq.com, username=li},
        3={password=zhangsan569, gender=女, id=3, age=13, email=6456454514@qq.com, username=zhang},
        10={password=MarkOfPassword, gender=男, id=10, age=36, email=4564655544@qq.com, username=Mark}
         }
         */

    }
}
