package com.hxzy.biz.workTime;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hxzy.entity.workTime.Attendance;

public interface AttendanceBiz {
	
	int updateByPrimaryKey(Attendance record);//根据主键删除信息
	Attendance selectByPrimaryKey(Integer attendanceId);
	
	int insert(Attendance record);//插入信息
	
	List<Integer> findAllAdminId();//查询所有用户id
	
	Integer findAttendRoleCount(@Param("adminId") Integer adminId);
	
	int deleteByPrimaryKey(Integer attendanceId);//根据主键删除信息
	
	List<Attendance> findAttendRoleList(@Param("adminId") Integer adminId,@Param("offset") Integer offset);
}
