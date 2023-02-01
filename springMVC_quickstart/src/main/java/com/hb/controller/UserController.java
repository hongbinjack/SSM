package com.hb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//2.定义Controller
//2.1使用@Controller定义bean
@Controller
public class UserController {
    //2.2设置当前操作的访问路径
    @RequestMapping("/save")
    //2.3设置当前操作的返回值类型
    @ResponseBody
   public String save(){
       System.out.println("user save...");
       return "{'module':'springmvc'}" ;
   }

}
