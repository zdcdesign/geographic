package com.geographic.service.impl;

import com.geographic.dao.TbUserMapper;
import com.geographic.entity.TbUser;
import com.geographic.entity.TbUserExample;
import com.geographic.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhoudachao on 2018/7/30.
 */
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;



    @Override
    public List<TbUser> queryUser() {
        return tbUserMapper.queryUser();
    }

    @Override
    public TbUser queryUserById(int id) {
        return tbUserMapper.queryUserById(id);
    }

    @Override
    public TbUser queryUserByName(String username) {
        return tbUserMapper.queryUserByName(username);
    }

    @Override
    public int insertUser(TbUser tbUser) {
        return tbUserMapper.insertUser(tbUser);
    }

    @Override
    public int updateUser(TbUser tbUser) {
        return tbUserMapper.updateUser(tbUser);
    }

    @Override
    public int deleteUser(int id) {
        return tbUserMapper.deleteUser(id);
    }

    @Override
    public TbUser findById(int id) {
        return tbUserMapper.findById(id);
    }
}
