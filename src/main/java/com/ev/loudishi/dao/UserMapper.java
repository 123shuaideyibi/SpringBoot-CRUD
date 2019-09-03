package com.ev.loudishi.dao;

import com.ev.loudishi.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getUser(int id);
}
