package com.ctillnow.mapper;


import com.ctillnow.bean.CommonConfig;
import org.apache.ibatis.annotations.Param;

public interface CommonConfigMapper {

    CommonConfig selectByPrimaryKey(Integer id);

    CommonConfig findByConfigKey(@Param("configKey") String id);

}