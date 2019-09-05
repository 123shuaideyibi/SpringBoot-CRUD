package com.ev.loudishi.controller;

import com.ev.loudishi.entity.User;
import com.ev.loudishi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登录
     * 注意：return返回的是页面，需要跟template下定义的页面名称一致
     * 其次，名称的后面不需要添加.html
     * 输入：http://localhost:9090/user/login显示页面
     *
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, ModelMap map) {
        System.out.println("用户名：" + user.getUsername() + " " + "密码：" + user.getPassword());
        if (user.getUsername() != null||user.getPassword()!=null) {
            boolean loginStatus = userService.checkLogin(user.getUsername(),user.getPassword());
            map.addAttribute("loginStatus", loginStatus);
        }
        return "login";
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String register(User user) {
        System.out.println(user);
        return "register";
    }


}
