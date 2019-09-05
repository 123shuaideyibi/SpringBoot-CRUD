package com.ev.loudishi.service.impl;


import com.ev.loudishi.dao.UserMapper;
import com.ev.loudishi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    /*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓实战↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/

    @Override
    public boolean checkLogin(String username, String password) {
        //第一步，获取用户名
        String p = userMapper.queryPassword(username);
        //第二步，密码是否正确
        System.out.println(password.equals(p));
        return password.equals(p);
    }
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑实战↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/

}
