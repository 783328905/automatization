package com.ctillnow.service;


import com.ctillnow.bean.MobileDeviceAppiumBind;

/**
 * Created by xiezongyu on 2018/9/11.
 */
public interface MobileDeviceAppiumBindService {

    void insert(MobileDeviceAppiumBind bind);

    MobileDeviceAppiumBind findByDeviceId(Integer deviceId);
}
