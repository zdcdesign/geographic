package com.geographic.entity;

import java.io.Serializable;
import java.util.Date;

public class TbTopic implements Serializable {
    private Long id;

    private String topicname;

    private Date created;

    private Date updated;

    private String remark;

    private Integer powervalue;

    private String powercode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getPowervalue() {
        return powervalue;
    }

    public void setPowervalue(Integer powervalue) {
        this.powervalue = powervalue;
    }

    public String getPowercode() {
        return powercode;
    }

    public void setPowercode(String powercode) {
        this.powercode = powercode == null ? null : powercode.trim();
    }
}