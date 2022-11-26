package com.mg.mybatis.test;

import com.mg.mybatis.mapper.EmpMapper;
import com.mg.mybatis.pojo.Emp;
import com.mg.mybatis.pojo.EmpExample;
import com.mg.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MBGTest {
    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据主键查询
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);

        System.out.println("------------------------------------");

        //根据条件查询,由于设置的null(无条件),所以查询的是所有
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);

        System.out.println("-------------------------------------");

        //根据条件查询，有条件的情况下
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andGenderEqualTo("女");
        empExample.or().andAgeBetween(19, 30);//此处的条件与上一行代码组成的条件合并，查询出结果
        List<Emp> list2 = mapper.selectByExample(empExample);
        list2.forEach(System.out::println);

        System.out.println("------------");

        //1.测试普通修改功能
         Emp emp_ = new Emp(1,"李可",23,"女");
        /**
         * 如果是第一种方式，那么是覆盖性修改，将表中的数据改成与传入的对象一摸一样
         * 如果是第二种方法：选择性修改,如果传入的对象的某个属性是null就不修改数据库中的那个属性
         */
        //2.mapper.updateByPrimaryKey(emp_);
         //测试选择性修改
         mapper.updateByPrimaryKeySelective(emp);


    }
}
