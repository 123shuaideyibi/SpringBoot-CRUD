package com.ev.loudishi.dao;

import com.ev.loudishi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
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
}
