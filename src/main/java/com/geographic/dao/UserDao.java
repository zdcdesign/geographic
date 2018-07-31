package com.geographic.dao;

import com.geographic.entity.User;


import java.util.List;

/**
 * Created by zhoudachao on 2018/7/22.
 */
public interface UserDao {
    List<User> queryUser();
    User queryUserById(int userId);
    User queryUserByName(String userName);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int userId);
    User findById(int userId);

}
