package com.mg.mybatis.mapper;

import com.mg.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/*
           Mybatis获取参数值的两种方式：${}和#{}
           #{}的本质是占位符赋值，${}的本质是字符串的拼接
         1.若mapper接口方法的参数为单个的字面量类型
           此时可以通过#{}和${}以任意的内容获取参数值，一定要注意${}的单引号问题

         2.若mapper接口方法的参数为多个的字面量类型
         此时Mybatis会将参数放在map集合中，以两种方式存储数据
         a>以arg0，arg1...为键，以参数为值
         b>以param1，param2...为键，以参数为值
          因此，只需要通过#{}和${}访问map集合的键，就可以获取相应的值，一定要注意${}的单引号问题

         3.若mapper接口方法的参数为map集合类型的参数
         只需要通过#{}和${}访问map集合的键，就可以获取相应的值，一定要注意${}的单引号问题

         4.若mapper接口方法的参数为实体类类型的参数
         只需要通过#{}和${}访问实体类中的属性名，就可以获取相对应的属性值，一定要注意#{}的单引号问题

         5.可以在mapper接口方法的参数上设置@Param注解
         此时Mybatis会将这些参数方法map中，以两种方式进行存储
         a>以@Param1，Param2...为键，以参数为值
         b>只需要通过#{}和${}访问map集合的键，就可以获取相应的值，一定要注意${}的单引号问题
 */
public interface UserMapper {
    /*   1.
    根据用户名查询用户信息
    @param username
    @return
     */
    User getUserByUsername(String name);

    /** 2.
     *
     * @param name
     * @param password
     * @return
     */
    User checkLogin(String name,String password);

    /**  3.
     * 验证登陆(以map集合作为参数)
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);


    /**  4.
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**  5.
     * 验证登录(使用@Param)
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username")   String username, @Param("password") String password);

    /**
     * 6.修改
     */
    void updateUser();

}


















