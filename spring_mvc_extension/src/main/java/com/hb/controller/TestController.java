package com.hb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test/hello")
    public String testHello(){

        return "success";
    }
}
