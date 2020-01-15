package com.ctillnow.service;


import com.ctillnow.bean.task.GroupMessageBean;

/**
 * Created by caiping on 2019/12/17.
 */
public interface GroupMsgService {
    GroupMessageBean save(GroupMessageBean groupMessageBean);
    GroupMessageBean findOne(String groupName);

}
