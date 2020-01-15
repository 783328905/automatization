package com.ctillnow.mapper;


import com.ctillnow.bean.task.GroupMessageBean;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * Created by caiping on 2019/12/17.
 */
public interface GroupMsgMapper {
    int save(GroupMessageBean groupMessageBean);
    List<GroupMessageBean> findGroup(String groupName);

}
