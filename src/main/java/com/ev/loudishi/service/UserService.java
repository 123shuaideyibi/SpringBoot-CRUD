package com.ev.loudishi.service;

import org.apache.ibatis.annotations.Param;

public interface UserService {

    boolean checkLogin(@Param("username") String username, @Param("password") String password);

}
