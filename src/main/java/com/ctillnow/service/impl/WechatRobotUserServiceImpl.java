package com.ctillnow.service.impl;


import com.ctillnow.bean.WechatRobotUser;
import com.ctillnow.enums.AccountStatus;
import com.ctillnow.mapper.WechatRobotUserMapper;
import com.ctillnow.service.WechatRobotUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiezongyu on 2018/9/12.
 */
@Component
public class WechatRobotUserServiceImpl implements WechatRobotUserService {

    @Autowired
    private WechatRobotUserMapper wechatRobotUserMapper;

    @Override
    public WechatRobotUser findByAliasId(String aliasId) {
        return wechatRobotUserMapper.findByAliasId(aliasId);
    }

    @Override
    public void insert(WechatRobotUser account) {
        wechatRobotUserMapper.insert(account);
    }

    @Override
    public void updateStatus(Integer deviceId, String folderName, AccountStatus accountStatus) {
        wechatRobotUserMapper.updateStatus(deviceId, folderName, accountStatus);
    }

    @Override
    public WechatRobotUser findByDeviceIdAndFolderName(Integer deviceId, String folderName) {
        return wechatRobotUserMapper.findByDeviceIdAndFolderName(deviceId, folderName);
    }

    @Override
    public void updateByPrimaryKeySelective(WechatRobotUser account) {
        wechatRobotUserMapper.updateByPrimaryKeySelective(account);
    }

    @Override
    public void removeDevice(Integer id) {
        wechatRobotUserMapper.removeDevice(id);
    }

    @Override
    public List<WechatRobotUser> findByDeviceId(Integer id) {
        return wechatRobotUserMapper.findByDeviceId(id);
    }

    @Override
    public WechatRobotUser findByUserId(Long userId) {
        return wechatRobotUserMapper.findByUserId(userId);
    }

    @Override
    public WechatRobotUser findByWechatNick(String wechatNick) {
        return wechatRobotUserMapper.findByWechatNick(wechatNick);
    }
}
