package com.geographic.service;

import com.geographic.entity.TbUser;

import java.util.List;

/**
 * Created by zhoudachao on 2018/7/30.
 */
public interface TbUserService {
    List<TbUser> queryUser();
    TbUser queryUserById(int id);
    TbUser queryUserByName(String username);
    int insertUser(TbUser tbUser);
    int updateUser(TbUser tbUser);
    int deleteUser(int id);
    TbUser findById(int id);
}
