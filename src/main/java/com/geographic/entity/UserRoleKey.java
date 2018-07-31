package com.geographic.entity;

import java.io.Serializable;
import java.util.List;

public class UserRoleKey implements Serializable {
    private Long userId;

    private Long roleId;

    private List<TbUser> userListser;

    private List<TbRole> roleList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public List<TbUser> getUserListser() {
        return userListser;
    }

    public void setUserListser(List<TbUser> userListser) {
        this.userListser = userListser;
    }

    public List<TbRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<TbRole> roleList) {
        this.roleList = roleList;
    }
}