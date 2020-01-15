package com.ctillnow.service.impl;


import com.ctillnow.bean.WechatRobotScanRecord;
import com.ctillnow.enums.ScanResultType;
import com.ctillnow.mapper.WechatRobotScanRecordMapper;
import com.ctillnow.service.WechatRobotScanRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by xiezongyu on 2019/8/15.
 */
@Component
public class WechatRobotScanRecordServiceImpl implements WechatRobotScanRecordService {

    @Autowired
    private WechatRobotScanRecordMapper wechatRobotScanRecordMapper;

    @Override
    public void insert(WechatRobotScanRecord record) {
        wechatRobotScanRecordMapper.insert(record);
    }

    @Override
    public List<WechatRobotScanRecord> findByRobotAccountIdAndScanDayAndScanResultType(
            Integer robotAccountId, Date scanDay, ScanResultType scanResultType) {
        return wechatRobotScanRecordMapper.findByRobotAccountIdAndScanDayAndScanResultType(
                robotAccountId, scanDay, scanResultType);
    }

    @Override
    public WechatRobotScanRecord findByScanRefId(String scanRefId) {
        return wechatRobotScanRecordMapper.findByScanRefId(scanRefId);
    }

}
