package com.geographic.dao;

import com.geographic.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhoudachao on 2018/7/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    @Ignore
    public void queryUser() throws Exception {
        List<User> userList=userDao.queryUser();
        assertEquals(2,userList.size());
    }

    @Test
    public void queryUserById() throws Exception {
      User user = userDao.queryUserById(1);
      assertEquals("dachao",user.getUserName());
    }

    @Test
    @Ignore
    public void insertUser() throws Exception {
      User user = new User();
      user.setUserName("艺文");
      user.setUserPriority(1);
      int effectedNum = userDao.insertUser(user);
      assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void updateUser() throws Exception {
      User user = new User();
      user.setUserName("大超");
      user.setUserId(2);
      user.setLastEditTime(new Date());
      int effectedNum = userDao.updateUser(user);
      assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void deleteUser() throws Exception {
          int effectedNum = userDao.deleteUser(3);
          assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void queryUserByNam() throws Exception {
        User user =  userDao.queryUserByName("dachao");
        assertEquals("dachao",user.getUserName());
    }

    @Test
    @Ignore
    public void findById() throws Exception {
        User user = userDao.queryUserById(2);
        assertEquals("dongzhu",user.getUserName());
    }
}