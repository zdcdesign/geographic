package com.geographic.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户实体类
 * 用户角色查询sql语句
 * SELECT a.username,b.name FROM tb_user a,tb_role b, user_role c
   WHERE a.id=c.user_id AND c.role_id=b.id AND a.id=#{id}
 *
 */
public class TbUser implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String telephone;

    private Date created;

    private Date updated;

    private String updateUser;

    private String remark;

    private List<UserRoleKey> userRoleKeyList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public List<UserRoleKey> getUserRoleKeyList() {
        return userRoleKeyList;
    }

    public void setUserRoleKeyList(List<UserRoleKey> userRoleKeyList) {
        this.userRoleKeyList = userRoleKeyList;
    }
}