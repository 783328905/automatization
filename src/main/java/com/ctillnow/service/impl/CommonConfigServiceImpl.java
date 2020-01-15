package com.ctillnow.service.impl;


import com.ctillnow.bean.CommonConfig;
import com.ctillnow.mapper.CommonConfigMapper;
import com.ctillnow.service.CommonConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiezongyu on 2019/8/20.
 */
@Component
public class CommonConfigServiceImpl implements CommonConfigService {

    @Autowired
    private CommonConfigMapper commonConfigMapper;


    @Override
    public CommonConfig findByConfigKey(String configKey) {
        return commonConfigMapper.findByConfigKey(configKey);
    }
}
