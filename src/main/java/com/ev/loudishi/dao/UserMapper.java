package com.ev.loudishi.dao;

import com.ev.loudishi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {


    /*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓实战↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/
    //通过用户名查询密码
    String queryPassword(@Param("username") String username);

    //判断用户名是否存在
    User isExist(String username);
    //用户名不存在，可以插入数据
    boolean insertUser(String username, String password);
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑实战↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/



    /*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓dao测试↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/

    //    增

    boolean insert(@Param("username") String username, @Param("password") String password);


    //    删

    boolean delete(int id);

    boolean delete2(String username);

    //    改

    boolean update(@Param("username") String username, @Param("password") String password);

    boolean update2(@Param("id") int id, @Param("username") String username, @Param("password") String password);

    //    查

    List<User> select(int id);

    String select2(String username);
    /*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑dao增删改查测试↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/
}
