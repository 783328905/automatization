package com.ctillnow.bean.task;

import java.util.Date;

/**
 * Created by caiping on 2019/12/17.
 */
public class GroupMessageBean {
    private Long id;
    private String groupName;
    private Long taskId;
    private Long qrcodeId;
    private String textMsg;
    private Boolean textTop;
    private String url;
    private Boolean isAtAll;
    private String sendMsgTime;
    private Boolean isDeleted;
    private Date createTime;
    private Date lastUpdateTime;

    public Boolean getTextTop() {
        return textTop;
    }

    public void setTextTop(Boolean textTop) {
        this.textTop = textTop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTextMsg() {
        return textMsg;
    }

    public void setTextMsg(String textMsg) {
        this.textMsg = textMsg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSendMsgTime() {
        return sendMsgTime;
    }

    public void setSendMsgTime(String sendMsgTime) {
        this.sendMsgTime = sendMsgTime;
    }

    public Boolean getAtAll() {
        return isAtAll;
    }

    public void setAtAll(Boolean atAll) {
        isAtAll = atAll;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
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

    public Long getQrcodeId() {
        return qrcodeId;
    }

    public void setQrcodeId(Long qrcodeId) {
        this.qrcodeId = qrcodeId;
    }
}
