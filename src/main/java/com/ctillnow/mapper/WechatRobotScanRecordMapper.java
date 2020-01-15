package com.ctillnow.mapper;

import com.ctillnow.bean.WechatRobotScanRecord;
import com.ctillnow.enums.ScanResultType;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WechatRobotScanRecordMapper {

    int insert(WechatRobotScanRecord record);

    List<WechatRobotScanRecord> findByRobotAccountIdAndScanDayAndScanResultType(
            @Param("robotAccountId") Integer robotAccountId,
            @Param("scanDay") Date scanDay,
            @Param("scanResultType") ScanResultType scanResultType);

    WechatRobotScanRecord findByScanRefId(@Param("scanRefId") String scanRefId);
}