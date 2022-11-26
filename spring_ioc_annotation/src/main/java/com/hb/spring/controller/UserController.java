package com.hb.spring.controller;

import com.hb.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
    public class UserController {
    @Autowired
private UserService userService;

public void saveUser(){
    userService.saveUser();
       }
}

