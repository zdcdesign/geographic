package com.geographic.entity;

import java.io.Serializable;
import java.util.Date;

public class TbLayer implements Serializable {
    private Long id;

    private String layername;

    private String simplename;

    private Date belongYear;

    private String serviceUrl;

    private Long serviceTopic;

    private Integer layerSerial;

    private Boolean type;

    private String address;

    private Date created;

    private Date updated;

    private Boolean showFlag;

    private Integer permissionsValue;

    private String permissionsCode;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLayername() {
        return layername;
    }

    public void setLayername(String layername) {
        this.layername = layername == null ? null : layername.trim();
    }

    public String getSimplename() {
        return simplename;
    }

    public void setSimplename(String simplename) {
        this.simplename = simplename == null ? null : simplename.trim();
    }

    public Date getBelongYear() {
        return belongYear;
    }

    public void setBelongYear(Date belongYear) {
        this.belongYear = belongYear;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl == null ? null : serviceUrl.trim();
    }

    public Long getServiceTopic() {
        return serviceTopic;
    }

    public void setServiceTopic(Long serviceTopic) {
        this.serviceTopic = serviceTopic;
    }

    public Integer getLayerSerial() {
        return layerSerial;
    }

    public void setLayerSerial(Integer layerSerial) {
        this.layerSerial = layerSerial;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Boolean getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(Boolean showFlag) {
        this.showFlag = showFlag;
    }

    public Integer getPermissionsValue() {
        return permissionsValue;
    }

    public void setPermissionsValue(Integer permissionsValue) {
        this.permissionsValue = permissionsValue;
    }

    public String getPermissionsCode() {
        return permissionsCode;
    }

    public void setPermissionsCode(String permissionsCode) {
        this.permissionsCode = permissionsCode == null ? null : permissionsCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}