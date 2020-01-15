package com.ctillnow.service.impl;


import com.ctillnow.bean.MobileDeviceAppiumBind;
import com.ctillnow.mapper.MobileDeviceAppiumBindMapper;
import com.ctillnow.service.MobileDeviceAppiumBindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiezongyu on 2018/9/11.
 */
@Component
public class MobileDeviceAppiumBindServiceImpl implements MobileDeviceAppiumBindService {

    @Autowired
    private MobileDeviceAppiumBindMapper mobileDeviceAppiumBindMapper;

    @Override
    public void insert(MobileDeviceAppiumBind bind) {
        mobileDeviceAppiumBindMapper.insert(bind);
    }

    @Override
    public MobileDeviceAppiumBind findByDeviceId(Integer deviceId) {
        return mobileDeviceAppiumBindMapper.findByDeviceId(deviceId);
    }

}
