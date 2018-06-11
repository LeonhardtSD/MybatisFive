package com.gaozhaoxi.mapper;

import com.gaozhaoxi.entity.User;

import java.util.List;

/**
 * @author Leon
 */
//Sql语句
public interface UserMapper {
    public User getUserById(Long id);

    public List<User> getAllUser();


}
