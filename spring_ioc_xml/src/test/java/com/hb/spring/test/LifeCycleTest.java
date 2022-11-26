package com.hb.spring.test;

import com.hb.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1、实例化
 * 2、依赖注入
 * 3、后置处理器的postProcessBeforeInitialization
 * 4、初始化，需要通过bean的init-method属性指定初始化的方法
 * 5、后置处理器的postProcessAfterInitialization
 * 6、IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
 *
 * bean的后置处理器会在生命周期的初始化前后添加额外的操作
 * 需要实现BeanPostProcessor接口且配置到IOC容器中
  *
 * 注意：
 * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器时执行
 * 若bean的作用域为多例时，生命周期的前三个步骤会在获取bean时执行
 */

public class LifeCycleTest {
    @Test
    public void test(){
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
      User user = ioc.getBean(User.class);
      System.out.println(user);
      ioc.close();
    }
}
