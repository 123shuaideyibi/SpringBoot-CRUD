package com.ev.loudishi.dao;

import com.ev.loudishi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    /*=====================================ssm实现流程======================================================*/
    //通过用户名查询密码
    String getPwd(@Param("username") String username);
    /*==================================测试类用于实现============================================*/
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
}
