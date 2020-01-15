package com.ctillnow.bean;

import java.util.Date;

public class MobileDeviceAppiumBind {
    private Integer id;

    private Integer deviceId;

    private Integer appiumId;

    private Boolean isDeleted;

    private Date createTime;

    private Date lastUpdateTime;
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getAppiumId() {
        return appiumId;
    }

    public void setAppiumId(Integer appiumId) {
        this.appiumId = appiumId;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}