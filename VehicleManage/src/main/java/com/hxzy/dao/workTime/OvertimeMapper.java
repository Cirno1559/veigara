package com.hxzy.dao.workTime;

import com.hxzy.entity.workTime.OverTimePojo;
import com.hxzy.entity.workTime.Overtime;
import com.hxzy.entity.workTime.OvertimeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OvertimeMapper {
    long countByExample(OvertimeExample example);

    int deleteByExample(OvertimeExample example);

    int deleteByPrimaryKey(Integer overTimeId);

    int insert(Overtime record);

    int insertSelective(Overtime record);

    List<Overtime> selectByExample(OvertimeExample example);

    Overtime selectByPrimaryKey(Integer overTimeId);

    int updateByExampleSelective(@Param("record") Overtime record, @Param("example") OvertimeExample example);

    int updateByExample(@Param("record") Overtime record, @Param("example") OvertimeExample example);

    int updateByPrimaryKeySelective(Overtime record);

    int updateByPrimaryKey(Overtime record);
    
    List<OverTimePojo> findOverTimeInfo(@Param("adminId") Integer adminId,@Param("offset") Integer offset);
    
    Integer findOverTimeCount(@Param("adminId") Integer adminId);
    
    List<Integer> findAllAdminId();
    
    
    
    
    
    
}