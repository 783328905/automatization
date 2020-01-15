package com.ctillnow.service;



import com.ctillnow.bean.WechatRobotScanRecord;
import com.ctillnow.enums.ScanResultType;

import java.util.Date;
import java.util.List;

/**
 * Created by xiezongyu on 2019/8/15.
 */
public interface WechatRobotScanRecordService {

    void insert(WechatRobotScanRecord record);

    List<WechatRobotScanRecord> findByRobotAccountIdAndScanDayAndScanResultType(
            Integer robotAccountId, Date date, ScanResultType scanResultType);

    WechatRobotScanRecord findByScanRefId(String scanRefId);
}
