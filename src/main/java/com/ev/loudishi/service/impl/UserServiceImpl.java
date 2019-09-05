package com.ev.loudishi.service.impl;


import com.ev.loudishi.dao.UserMapper;
import com.ev.loudishi.entity.User;
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
        return password.equals(p);
    }

    @Override
    public boolean checkRegister(String username, String password) {
        //第一步，判断用户是否存在
        User user = userMapper.isExist(username);
        if (user==null){//可以注册
            //第二步，插入用户
            boolean flag = userMapper.insertUser(username,password);
            return flag;
        }
        return false;
    }

//    @Override
//    public boolean checkRegister(String username, String password) {
//        boolean flag = userMapper.insert(username,password);
//        return flag;
//    }
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑实战↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/

}
