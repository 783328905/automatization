package com.ctillnow.service;


import com.ctillnow.bean.Appium;
import com.ctillnow.enums.AtuiThreadStatus;

import java.util.Date;

/**
 * Created by xiezongyu on 2018/9/11.
 */
public interface AppiumService {

    Integer maxPort();

    void insert(Appium appium);

    Appium findById(Integer appiumId);

    void updateStatus(Integer id, AtuiThreadStatus atuiThreadStatus);

    void updateStatusAndLastRunTime(Integer id, AtuiThreadStatus atuiThreadStatus, Date date);
}
