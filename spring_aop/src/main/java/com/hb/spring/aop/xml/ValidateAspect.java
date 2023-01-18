package com.hb.spring.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
public class ValidateAspect {

    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }

}
