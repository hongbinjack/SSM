package com.mg.mybatis.mapper;

import com.mg.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 若sql语句查询的结果为为多条时，一定不能以实体类类型作为方法的返回值
     * 否则会抛出异常TooManyResultsException
     * 若sql语句查询的结果为1条时，此时可以使用实体类类型或list集合类型作为方法的返回值
     * @param id
     * @return
     */

    //根据id查询用户信息
    User getUserById(@Param("id") Integer id);

    //查询所有的用户信息
    List<User> getAllUser();

    //查询用户的总数量
    Integer getCount();


    /**
     * 根据id查询用户信息为map集合
     * 多查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案：
     * 1.将mapper接口方法的返回值设置为泛型是map的List集合
     * List<Map<String,Object>> getAllUserToMap();
     * 最终的结果：[{password=hongbin1123, gender=男, id=1, age=26, email=9656487482@qq.com, username=liu}, {password=lisi4852444, gender=男, id=2, age=36, email=4564655544@qq.com, username=li}, {password=zhangsan569, gender=女, id=3, age=13, email=6456454514@qq.com, username=zhang}, {password=MarkOfPassword, gender=男, id=10, age=36, email=4564655544@qq.com, username=Mark}]
     * @MapKey("id")
     * Map<String,Object> getAllUserToMap();
     * 最终结果：
     * {1={password=hongbin1123, gender=男, id=1, age=26, email=9656487482@qq.com, username=liu},
     * 2={password=lisi4852444, gender=男, id=2, age=36, email=4564655544@qq.com, username=li},
     * 3={password=zhangsan569, gender=女, id=3, age=13, email=6456454514@qq.com, username=zhang},
     * 10={password=MarkOfPassword, gender=男, id=10, age=36, email=4564655544@qq.com, username=Mark}}
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);



    /**
     * 查询所有的用户信息为map集合
     * @return
     */
//   List<Map<String,Object>> getAllUserToMap();
     @MapKey("id")
    Map<String,Object> getAllUserToMap();
}
