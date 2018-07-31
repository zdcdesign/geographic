package com.geographic.entity;

import java.io.Serializable;

public class RolePowerKey implements Serializable {
    private Long roleId;

    private Long powerId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
    }
}