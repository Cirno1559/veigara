package com.hxzy.biz.workTime;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hxzy.entity.workTime.Attendance;
import com.hxzy.entity.workTime.Travel;

public interface TravelBiz {

	List<Travel> findTravelRoleList(@Param("adminId") Integer adminId,@Param("offset") Integer offset);
    
    Integer findTravelRoleCount(@Param("adminId") Integer adminId);
    
    List<Integer> findAllAdminId();
    
    int insert(Travel record);
	
    Travel selectByPrimaryKey(Integer travelId);
    
    int updateByPrimaryKey(Travel record);
    
    int deleteByPrimaryKey(Integer travelId);
    
}
