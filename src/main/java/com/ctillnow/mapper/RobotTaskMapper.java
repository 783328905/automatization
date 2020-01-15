package com.ctillnow.mapper;



import com.ctillnow.bean.RobotTask;
import com.ctillnow.enums.TaskStatus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RobotTaskMapper {

    int insert(RobotTask record);

    RobotTask selectByPrimaryKey(Long id);

    void updateTaskInfo(@Param("taskStatus") TaskStatus taskStatus, @Param("errorMsg") String errorMsg,
                        @Param("errorCode") Integer errorCode, @Param("id") Long id);

    void updateTaskStatus(@Param("taskStatus") TaskStatus taskStatus, @Param("id") Long id);
}