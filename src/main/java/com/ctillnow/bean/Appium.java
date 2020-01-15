package com.ctillnow.bean;


import com.ctillnow.enums.AtuiThreadStatus;

import java.util.Date;

public class Appium {
    private Integer id;

    private Integer port;

    private AtuiThreadStatus atuiThreadStatus;

    private Boolean isDeleted;

    private Date createTime;

    private Date lastRunTime;

    private Date lastUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public AtuiThreadStatus getAtuiThreadStatus() {
        return atuiThreadStatus;
    }

    public void setAtuiThreadStatus(AtuiThreadStatus atuiThreadStatus) {
        this.atuiThreadStatus = atuiThreadStatus;
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

    public Date getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Date lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}