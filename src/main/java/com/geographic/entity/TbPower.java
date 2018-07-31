package com.geographic.entity;

import java.io.Serializable;

public class TbPower implements Serializable {
    private Long id;

    private String powername;

    private String code;

    private String description;

    private String powerurl;

    private Integer priority;

    private Long pid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPowername() {
        return powername;
    }

    public void setPowername(String powername) {
        this.powername = powername == null ? null : powername.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPowerurl() {
        return powerurl;
    }

    public void setPowerurl(String powerurl) {
        this.powerurl = powerurl == null ? null : powerurl.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}