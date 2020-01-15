package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

/**
 * Created by lichao01 on 2018/9/13.
 */
public enum  TaskStatus implements HasDefaultInterface<TaskStatus> {
    //1: init 2: received 3: running 4:done
    unknown(-1),
    init(1),
    received(2),
    running(3),
    done(4),
    exception(5);
    private Integer value;

    TaskStatus(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public TaskStatus getDefault() {
        return unknown;
    }

    @Override
    public Integer getValue() {
        return value;
    }
    public static TaskStatus valueOf(Integer value){
        for(TaskStatus taskStatus : TaskStatus.values()) {
            if(taskStatus.getValue().equals(value)) {
                return taskStatus;
            }
        }
        throw new IllegalArgumentException("unknown TaskStatus value:" + value);
    }


}
