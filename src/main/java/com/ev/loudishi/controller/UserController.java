package com.ev.loudishi.controller;

import com.ev.loudishi.entity.User;
import com.ev.loudishi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/user")
    public boolean check(String username, String password) {
        username = "zhangsan";
        password = "123";
        return userService.checkLogin(username,password);
    }
}
