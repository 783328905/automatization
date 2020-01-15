package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

/**
 * Created by xiezongyu on 2017/11/10.
 */
public enum AtuiThreadStatus implements HasDefaultInterface<AtuiThreadStatus> {
    unknown(-1),
    stopped(1),
    running(2);

    private Integer value;

    AtuiThreadStatus(Integer value) {
        this.value = value;
    }

    @Override
    public AtuiThreadStatus getDefault() {
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public static AtuiThreadStatus valueOf(Integer value){
        for(AtuiThreadStatus atuiThreadStatus : AtuiThreadStatus.values()) {
            if(atuiThreadStatus.getValue().equals(value)) {
                return atuiThreadStatus;
            }
        }
        throw new IllegalArgumentException("unknown DeviceStatus value:" + value);
    }

}
