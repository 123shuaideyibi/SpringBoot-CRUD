package com.ev.loudishi.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ev.loudishi.dao.UserMapper;
import com.ev.loudishi.entity.User;
import com.ev.loudishi.service.UserService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean checkLogin(String username, String password) {
        //第一步，获取用户名
        String pwd  = userMapper.getPwd(username);

        //第二步，密码是否正确
        return pwd.equals(password);
    }
}
