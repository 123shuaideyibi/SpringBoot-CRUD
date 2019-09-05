package com.ev.loudishi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Resource
    private UserService userService;

    /**
     * 测试用户名和密码是否正确
     */
    @Test
    public void checkLogin() {
        String username = "zhangsan";
        String password = "123";
        System.out.println("登录状态:"+userService.checkLogin(username,password));
    }

}
