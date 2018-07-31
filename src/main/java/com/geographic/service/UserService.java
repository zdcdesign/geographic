package com.geographic.service;

import com.geographic.entity.User;

import java.util.List;

/**
 * Created by zhoudachao on 2018/7/23.
 */
public interface UserService {
    List<User> getUserList();
    User getUserById(int userId);
    boolean addUser(User user);
    boolean modifyUser(User user);
    boolean deleteUser(int userId);

    /**
     * 测试shiro框架使用
     * @param
     * @return
     */
    User queryUserByName(String userName);

    User findById(int userId);
}
