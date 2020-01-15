package com.ctillnow.mapper;

import com.ctillnow.bean.WechatRobotUser;
import com.ctillnow.enums.AccountStatus;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatRobotUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(WechatRobotUser record);

    int insertSelective(WechatRobotUser record);

    WechatRobotUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WechatRobotUser record);

    int updateByPrimaryKey(WechatRobotUser record);


    WechatRobotUser findByAliasId(@Param("aliasId") String aliasId);

    void updateStatus(@Param("deviceId") Integer deviceId,
                      @Param("wechatFolderName") String wechatFolderName,
                      @Param("accountStatus") AccountStatus accountStatus);

    WechatRobotUser findByDeviceIdAndFolderName(@Param("deviceId") Integer deviceId,
                                                @Param("wechatFolderName") String wechatFolderName);

    void removeDevice(@Param("id") Integer id);

    List<WechatRobotUser> findByDeviceId(@Param("deviceId") Integer deviceId);

    WechatRobotUser findByUserId(@Param("userId") Long userId);

    WechatRobotUser findByWechatNick(@Param("wechatNick") String wechatNick);
}