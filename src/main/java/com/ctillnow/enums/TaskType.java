package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

/**
 * Created by guxiaotian on 2017/10/19.
 */
public enum TaskType implements HasDefaultInterface<TaskType> {
    unknown(-1),
    check_wechat_account(1),
    send_group_msg(2),
    check_latch_status(3),
    latch_control(4),
    robot_chat(5),
    comments(6),
    moments(7),
    article_read(8),
    scan_qrcode_join_gorup(9),
    send_msg(10),
    spider_parse(11)
    ;

    private Integer value;

    TaskType(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public TaskType getDefault() {
        return unknown;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public static TaskType valueOf(Integer value) {
        for (TaskType taskType : TaskType.values()) {
            if (taskType.getValue().equals(value)) {
                return taskType;
            }
        }
        throw new IllegalArgumentException("unknown TaskType value:" + value);
    }
}
