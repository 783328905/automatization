package com.ctillnow.bean;


import com.ctillnow.enums.AccountStatus;

import java.util.Date;

public class WechatRobotUser {
    private Integer id;

    private String aliasId;

    private AccountStatus accountStatus;

    private String wechatNick;

    private String wechatFolderName;

    private Integer deviceId;

    private Long userId;

    private Boolean isDeleted;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAliasId() {
        return aliasId;
    }

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId == null ? null : aliasId.trim();
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getWechatNick() {
        return wechatNick;
    }

    public void setWechatNick(String wechatNick) {
        this.wechatNick = wechatNick == null ? null : wechatNick.trim();
    }

    public String getWechatFolderName() {
        return wechatFolderName;
    }

    public void setWechatFolderName(String wechatFolderName) {
        this.wechatFolderName = wechatFolderName == null ? null : wechatFolderName.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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