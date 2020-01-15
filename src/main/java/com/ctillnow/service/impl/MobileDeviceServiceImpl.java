package com.ctillnow.service.impl;

import com.ctillnow.bean.MobileDevice;
import com.ctillnow.enums.DeviceStatus;
import com.ctillnow.mapper.MobileDeviceMapper;
import com.ctillnow.service.MobileDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by xiezongyu on 2018/9/11.
 */
@Component
public class MobileDeviceServiceImpl implements MobileDeviceService {

    @Autowired
    private MobileDeviceMapper mobileDeviceMapper;


    @Override
    public List<MobileDevice> findByStatus(DeviceStatus deviceStatus) {
        return mobileDeviceMapper.findByStatus(deviceStatus);
    }

    @Override
    public MobileDevice findById(Integer deviceId) {
        return mobileDeviceMapper.selectByPrimaryKey(deviceId);
    }

    @Override
    public MobileDevice findByUdid(String udid) {
        return mobileDeviceMapper.findByUdid(udid);
    }

    @Override
    public void insert(MobileDevice device) {
        mobileDeviceMapper.insert(device);
    }

    @Override
    public void updateAfterCheck(Integer id, Date date, DeviceStatus deviceStatus) {
        mobileDeviceMapper.updateAfterCheck(id, date, deviceStatus);
    }

    @Override
    public void updateStatus(Integer id, DeviceStatus deviceStatus) {
        mobileDeviceMapper.updateStatus(id, deviceStatus);
    }
}
