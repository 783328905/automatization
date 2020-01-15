package com.ctillnow.mapper;

import com.ctillnow.bean.MobileDevice;
import com.ctillnow.enums.DeviceStatus;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface MobileDeviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MobileDevice record);

    int insertSelective(MobileDevice record);

    MobileDevice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MobileDevice record);

    int updateByPrimaryKey(MobileDevice record);


    List<MobileDevice> findByStatus(@Param("deviceStatus") DeviceStatus deviceStatus);

    MobileDevice findByUdid(@Param("udid") String udid);

    void updateAfterCheck(@Param("id") Integer id,
                          @Param("date") Date date,
                          @Param("deviceStatus") DeviceStatus deviceStatus);

    void updateStatus(@Param("id") Integer id,
                      @Param("deviceStatus") DeviceStatus deviceStatus);
}