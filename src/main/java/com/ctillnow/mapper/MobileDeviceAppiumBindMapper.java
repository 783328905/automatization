package com.ctillnow.mapper;

import com.ctillnow.bean.MobileDeviceAppiumBind;
import org.apache.ibatis.annotations.Param;

public interface MobileDeviceAppiumBindMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MobileDeviceAppiumBind record);

    int insertSelective(MobileDeviceAppiumBind record);

    MobileDeviceAppiumBind selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MobileDeviceAppiumBind record);

    int updateByPrimaryKey(MobileDeviceAppiumBind record);


    MobileDeviceAppiumBind findByDeviceId(@Param("deviceId") Integer deviceId);
}