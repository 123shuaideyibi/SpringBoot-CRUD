package com.ev.loudishi.service;

import org.apache.ibatis.annotations.Param;

public interface UserService {
    /*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓实战↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/
    boolean checkLogin(@Param("username") String username, @Param("password") String password);
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑实战↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/

}
