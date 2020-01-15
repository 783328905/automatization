package com.ctillnow.service;


import com.ctillnow.bean.CommonConfig;

/**
 * Created by xiezongyu on 2019/8/20.
 */
public interface CommonConfigService {

    CommonConfig findByConfigKey(String configKey);

}
