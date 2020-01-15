package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

/**
 * Created by xiezongyu on 2017/11/10.
 */
public enum DeviceStatus implements HasDefaultInterface<DeviceStatus> {
    unknown(-1),
    online(1),
    offline(2);

    private Integer value;

    DeviceStatus(Integer value) {
        this.value = value;
    }

    @Override
    public DeviceStatus getDefault() {
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public static DeviceStatus valueOf(Integer value){
        for(DeviceStatus deviceStatus : DeviceStatus.values()) {
            if(deviceStatus.getValue().equals(value)) {
                return deviceStatus;
            }
        }
        throw new IllegalArgumentException("unknown DeviceStatus value:" + value);
    }

}
