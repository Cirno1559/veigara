package com.hxzy.biz.workTime;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hxzy.entity.workTime.OverTimePojo;
import com.hxzy.entity.workTime.Overtime;

public interface OverTimeBiz {

	 int updateByPrimaryKey(Overtime record);
	
	int deleteByPrimaryKey(Integer overTimeId);

    int insert(Overtime record);
	
	 List<OverTimePojo> findOverTimeInfo(@Param("adminId") Integer adminId,@Param("offset") Integer offset);
	    
	 Integer findOverTimeCount(@Param("adminId") Integer adminId);
	    
	 List<Integer> findAllAdminId();
	
}
