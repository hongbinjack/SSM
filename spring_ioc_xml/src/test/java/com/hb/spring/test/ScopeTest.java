package com.hb.spring.test;

import com.hb.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    @Test
    public void testScope(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student studentOne = ioc.getBean(Student.class);
        Student studentTwo = ioc.getBean(Student.class);
        System.out.println(studentOne==studentTwo);
    }
}
