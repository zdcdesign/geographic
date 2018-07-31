package com.geographic.service;

import com.geographic.entity.TbPower;
import com.geographic.entity.TbUser;

import java.util.List;

/**
 * Created by zhoudachao on 2018/7/30.
 */
public interface TbUserService {
    List<TbUser> queryUser();
    TbUser queryUserById(Long id);
    TbUser queryUserByName(String username);
    int insertUser(TbUser tbUser);
    int updateUser(TbUser tbUser);
    int deleteUser(Long id);
    TbUser findById(Long id);
    List<TbPower> findUserPower(Long id);
}
