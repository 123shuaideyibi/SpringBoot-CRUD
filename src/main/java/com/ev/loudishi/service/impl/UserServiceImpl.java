package com.ev.loudishi.service.impl;


import com.ev.loudishi.dao.UserMapper;
import com.ev.loudishi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;





    /*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓service测试↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/
    @Override
    public boolean checkService(String u, String p) {
        //第一步，获取用户名
        String password = userMapper.getPwd(u);

        //第二步，密码是否正确
        return password.equals(p);
    }
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑service测试↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
}
