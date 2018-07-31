package com.geographic.service.impl;

import com.geographic.dao.TbUserMapper;
import com.geographic.entity.TbPower;
import com.geographic.entity.TbUser;
import com.geographic.entity.TbUserExample;
import com.geographic.service.TbUserService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by zhoudachao on 2018/7/30.
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;



    @Override
    public List<TbUser> queryUser() {
        return tbUserMapper.queryUser();
    }

    @Override
    public TbUser queryUserById(Long id) {
        return null;
    }


    @Override
    public TbUser queryUserByName(String username) {
        return tbUserMapper.queryUserByName(username);
    }

    @Override
    public int insertUser(TbUser tbUser) {
        //密码加密加盐
        Md5Hash md5Hash = new Md5Hash(tbUser.getPassword(),tbUser.getUsername());
		System.out.println("用户密码加密后结果："+md5Hash.toString());
        //设置加密后的密码到数据库
        tbUser.setPassword(md5Hash.toString());
        //设置用户注册时间
        tbUser.setCreated(new Date());
        //设置用户修改时间
        tbUser.setUpdated(new Date());

        return tbUserMapper.insertUser(tbUser);
    }

    @Override
    public int updateUser(TbUser tbUser) {
        return tbUserMapper.updateUser(tbUser);
    }

    @Override
    public int deleteUser(Long id) {
        return 0;
    }

    @Override
    public TbUser findById(Long id) {
        return null;
    }

    @Override
    public List<TbPower> findUserPower(Long id) {
        return tbUserMapper.findUserPower(id);
    }


}
