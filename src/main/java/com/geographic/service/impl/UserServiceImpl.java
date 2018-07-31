package com.geographic.service.impl;


import com.geographic.dao.UserDao;
import com.geographic.entity.User;
import com.geographic.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by zhoudachao on 2018/7/23.
 */
@Service
@SuppressWarnings("SpringJavaAutowiringInspection")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.queryUser();
    }

    @Override
    public User getUserById(int userId) {
        return userDao.queryUserById(userId);
    }

    @Transactional
    @Override
    public boolean addUser(User user) {
        if (user.getUserName()!=null&&!"".equals(user.getUserName())){
            user.setCreateTime(new Date());
            user.setLastEditTime(new Date());
            try {
                int effectedNum = userDao.insertUser(user);
                if(effectedNum>0){
                    return true;
                }else {
                    throw new RuntimeException("插入用户信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("插入用户信息失败:"+e.getMessage());
            }
        }else{
            throw new RuntimeException("用户信息不能为空！");
        }

    }

    @Override
    public boolean modifyUser(User user) {
        //空值判断，主要是userId不为空
        if (user.getUserId()!=null&&user.getUserId()>0){
            //设置默认值
            user.setLastEditTime(new Date());
            try {
                //更新用户信息
                int effectedNum = userDao.updateUser(user);
                if (effectedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("更新个人信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新个人信息失败！"+e.toString());
            }
        }else{
            throw new RuntimeException("用户信息不能为空！");
        }
    }

    @Override
    public boolean deleteUser(int userId) {
        if (userId>0){
            try {
                //删除用户信息
                int effectedNum = userDao.deleteUser(userId);
                if(effectedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("删除个人信息失败！");
                }

            } catch (Exception e) {
                throw new RuntimeException("删除个人信息失败！"+e.toString());
            }
        }else{
            throw new RuntimeException("用户ID不能为空！");
        }
    }

    @Override
    public User queryUserByName(String userName) {
        return userDao.queryUserByName(userName);
    }

    @Override
    public User findById(int userId) {
        return userDao.findById(userId);
    }


}
