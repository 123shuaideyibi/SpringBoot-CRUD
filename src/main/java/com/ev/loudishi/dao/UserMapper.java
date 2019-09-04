package com.ev.loudishi.dao;

import com.ev.loudishi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {






    /*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓service测试↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/

    //通过用户名查询密码
    String getPwd(@Param("username") String username);

    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑service测试↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/





    /*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓dao测试↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/
    //    增
    boolean insertUser(@Param("username") String username, @Param("password") String password);


    //    删

    boolean deleteUserById(int id);

    boolean deleteUserByName(String username);

    //    改

    boolean updataPwdByName(@Param("username") String username,@Param("password") String password);

    boolean updateUserById(@Param("id") int id,@Param("username") String username,@Param("password") String password);

    //    查

    List<User> getUser(int id);

    String selectPwdByName(String username);
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑dao增删改查测试↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
}
