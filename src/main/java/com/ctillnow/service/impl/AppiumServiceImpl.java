package com.ctillnow.service.impl;

import com.ctillnow.bean.Appium;
import com.ctillnow.enums.AtuiThreadStatus;
import com.ctillnow.mapper.AppiumMapper;
import com.ctillnow.service.AppiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by xiezongyu on 2018/9/11.
 */
@Component
public class AppiumServiceImpl implements AppiumService {

    @Autowired
    private AppiumMapper appiumMapper;

    @Override
    public Integer maxPort() {
        return appiumMapper.maxPort();
    }

    @Override
    public void insert(Appium appium) {
        appiumMapper.insert(appium);
    }

    @Override
    public Appium findById(Integer appiumId) {
        return appiumMapper.selectByPrimaryKey(appiumId);
    }

    @Override
    public void updateStatus(Integer id, AtuiThreadStatus atuiThreadStatus) {
        appiumMapper.updateStatus(id, atuiThreadStatus);
    }

    @Override
    public void updateStatusAndLastRunTime(Integer id, AtuiThreadStatus atuiThreadStatus, Date date) {
        appiumMapper.updateStatusAndLastRunTime(id, atuiThreadStatus, date);
    }
}
