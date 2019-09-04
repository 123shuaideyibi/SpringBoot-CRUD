package com.ev.loudishi.controller;

import com.ev.loudishi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 登录
     * 注意：return返回的是页面，需要跟template下定义的页面名称一致
     *      其次，名称的后面不需要添加.html
     * 输入：http://localhost:9090/user/login显示页面
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public String login(User user) {
        System.out.println(user);
        return "login";
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String rgist(User user) {
        System.out.println(user);
        return "register";
    }


}
