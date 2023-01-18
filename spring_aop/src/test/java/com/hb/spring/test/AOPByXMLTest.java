package com.hb.spring.test;

import com.hb.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPByXMLTest {
    @Test
public void testAOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,3);
    }
}
