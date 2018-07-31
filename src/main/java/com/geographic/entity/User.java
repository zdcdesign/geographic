package com.geographic.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhoudachao on 2018/7/22.
 */
public class User implements Serializable {
    private Integer userId;
    private String  userName;
    private String  userPassword;
    private Integer userPriority;
    private Date createTime;
    private Date lastEditTime;
    private String perms;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserPriority() {
        return userPriority;
    }

    public void setUserPriority(Integer userPriority) {
        this.userPriority = userPriority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }
}
