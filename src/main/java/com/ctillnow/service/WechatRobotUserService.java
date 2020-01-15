package com.ctillnow.service;



import com.ctillnow.bean.WechatRobotUser;
import com.ctillnow.enums.AccountStatus;

import java.util.List;

/**
 * Created by xiezongyu on 2018/9/12.
 */
public interface WechatRobotUserService {

    WechatRobotUser findByAliasId(String aliasId);

    void insert(WechatRobotUser account);

    void updateStatus(Integer deviceId, String folderName, AccountStatus accountStatus);

    WechatRobotUser findByDeviceIdAndFolderName(Integer deviceId, String folderName);

    void updateByPrimaryKeySelective(WechatRobotUser account);

    void removeDevice(Integer id);

    List<WechatRobotUser> findByDeviceId(Integer id);

    WechatRobotUser findByUserId(Long userId);

    WechatRobotUser findByWechatNick(String receiver);
}
