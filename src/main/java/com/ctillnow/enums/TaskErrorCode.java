package com.ctillnow.enums;

/**
 * Created by lichao01 on 2018/9/13.
 */
public enum TaskErrorCode  {
    unknown(10001,"未知错误"),
    msg_send_fail(10002,"消息发送失败"),
    wx_log_out(10003,"微信登出"),
    alias_mismatching(10004,"微信号不符合"),
    group_mismatching(10005,"群名称不符合"),
    cannot_return_wx_main_view(10006,"无法返回发消息微信页面");
    ;
    private Integer errorCode;
    private String errorMsg;
    TaskErrorCode(Integer errorCode,String errorMsg){
        this.errorCode=errorCode;
        this.errorMsg=errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String toString() {
        return "TaskErrorCode{" +
                "errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
