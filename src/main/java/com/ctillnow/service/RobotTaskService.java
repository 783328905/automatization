package com.ctillnow.service;


import com.ctillnow.bean.RobotTask;
import com.ctillnow.enums.TaskStatus;

/**
 * Created by lichao01 on 2018/9/13.
 */
public interface RobotTaskService {

    void updateTaskInfo(TaskStatus taskStatus, String errorMsg, Integer errorCode, Long id);

    void insert(RobotTask robotMsg);

    RobotTask findById(Long id);

    void updateTaskStatus(TaskStatus taskStatus, Long id);
}
