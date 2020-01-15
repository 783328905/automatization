package com.ctillnow.bean;



import com.ctillnow.enums.ScanResultType;

import java.util.Date;

public class WechatRobotScanRecord {
    private Integer id;

    private Integer robotAccountId;

    private Date startScanTime;

    private Date endScanTime;

    private ScanResultType scanResultType;

    private String scanRefId;

    private String qrcodeSource;

    private Date scanDay;

    private Date createTime;

    private Date lastUpdateTime;

    private String wechatGroupName;

    private Integer groupPeopleNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRobotAccountId() {
        return robotAccountId;
    }

    public void setRobotAccountId(Integer robotAccountId) {
        this.robotAccountId = robotAccountId;
    }

    public Date getStartScanTime() {
        return startScanTime;
    }

    public void setStartScanTime(Date startScanTime) {
        this.startScanTime = startScanTime;
    }

    public Date getEndScanTime() {
        return endScanTime;
    }

    public void setEndScanTime(Date endScanTime) {
        this.endScanTime = endScanTime;
    }

    public ScanResultType getScanResultType() {
        return scanResultType;
    }

    public void setScanResultType(ScanResultType scanResultType) {
        this.scanResultType = scanResultType;
    }

    public String getScanRefId() {
        return scanRefId;
    }

    public void setScanRefId(String scanRefId) {
        this.scanRefId = scanRefId == null ? null : scanRefId.trim();
    }

    public String getQrcodeSource() {
        return qrcodeSource;
    }

    public void setQrcodeSource(String qrcodeSource) {
        this.qrcodeSource = qrcodeSource == null ? null : qrcodeSource.trim();
    }

    public Date getScanDay() {
        return scanDay;
    }

    public void setScanDay(Date scanDay) {
        this.scanDay = scanDay;
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

    public String getWechatGroupName() {
        return wechatGroupName;
    }

    public void setWechatGroupName(String wechatGroupName) {
        this.wechatGroupName = wechatGroupName;
    }

    public Integer getGroupPeopleNum() {
        return groupPeopleNum;
    }

    public void setGroupPeopleNum(Integer groupPeopleNum) {
        this.groupPeopleNum = groupPeopleNum;
    }
}