package com.ctillnow.service.impl;


import com.ctillnow.bean.RobotTask;
import com.ctillnow.enums.TaskStatus;
import com.ctillnow.mapper.RobotTaskMapper;
import com.ctillnow.service.RobotTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lichao01 on 2018/9/13.
 */
@Service

public class RobotTaskServiceImpl implements RobotTaskService {

    @Autowired
    private RobotTaskMapper robotTaskMapper;



    @Override
    public void updateTaskInfo(TaskStatus taskStatus, String errorMsg, Integer errorCode, Long id) {
        robotTaskMapper.updateTaskInfo(taskStatus,errorMsg,errorCode,id);
    }



    @Override
    public void insert(RobotTask robotMsg) {
        robotTaskMapper.insert(robotMsg);
    }

    @Override
    public RobotTask findById(Long id) {
        return robotTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateTaskStatus(TaskStatus taskStatus, Long id) {
        robotTaskMapper.updateTaskStatus(taskStatus,id);
    }
}
