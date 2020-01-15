package com.ctillnow.service.impl;


import com.ctillnow.bean.task.GroupMessageBean;
import com.ctillnow.mapper.GroupMsgMapper;
import com.ctillnow.service.GroupMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caiping on 2019/12/17.
 */
@Service
public class GroupMsgServiceImpl implements GroupMsgService {
    @Autowired
    private GroupMsgMapper groupMsgMapper;
    @Override
    public GroupMessageBean save(GroupMessageBean groupMessageBean) {
        if(groupMsgMapper.save(groupMessageBean)>0)
            return groupMessageBean;
        else
            return null;
    }

    @Override
    public GroupMessageBean findOne(String groupName) {
        List<GroupMessageBean> groups = groupMsgMapper.findGroup(groupName);
        return (groups == null || groups.size() == 0 )? null : groups.get(0);
    }
}
