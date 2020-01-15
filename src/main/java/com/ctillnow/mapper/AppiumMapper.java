package com.ctillnow.mapper;


import com.ctillnow.bean.Appium;
import com.ctillnow.enums.AtuiThreadStatus;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface AppiumMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Appium record);

    int insertSelective(Appium record);

    Appium selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Appium record);

    int updateByPrimaryKey(Appium record);


    Integer maxPort();

    void updateStatus(@Param("id") Integer id,
                      @Param("atuiThreadStatus") AtuiThreadStatus atuiThreadStatus);

    void updateStatusAndLastRunTime(@Param("id") Integer id,
                                    @Param("atuiThreadStatus") AtuiThreadStatus atuiThreadStatus,
                                    @Param("date") Date date);
}