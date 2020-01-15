package com.ctillnow.service;



import com.ctillnow.bean.MobileDevice;
import com.ctillnow.enums.DeviceStatus;

import java.util.Date;
import java.util.List;

/**
 * Created by xiezongyu on 2018/9/11.
 */
public interface MobileDeviceService  {

    List<MobileDevice> findByStatus(DeviceStatus deviceStatus);

    MobileDevice findById(Integer deviceId);

    MobileDevice findByUdid(String udid);

    void insert(MobileDevice device);

    void updateAfterCheck(Integer id, Date date, DeviceStatus deviceStatus);

    void updateStatus(Integer id, DeviceStatus deviceStatus);
}
