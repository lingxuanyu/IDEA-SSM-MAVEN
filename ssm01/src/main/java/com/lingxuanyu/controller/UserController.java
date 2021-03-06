package com.lingxuanyu.controller;

import com.lingxuanyu.entity.User;
import com.lingxuanyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("userController")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public User getAllUser(){
        User user = userService.getUser();
        return  user;
    }

    @RequestMapping("/seconed")
    public String getSecond(){
        System.out.println("seconed");
        return  "seconed";
    }
}
