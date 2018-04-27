package com.hxzy.biz.impl.workTime;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.workTime.AttendanceBiz;
import com.hxzy.dao.workTime.AttendanceMapper;
import com.hxzy.entity.workTime.Attendance;


@Service
public class AttendanceBizImpl implements AttendanceBiz {
	 
	@Resource
	AttendanceMapper attendanceMapper;
	
	@Override
	public int updateByPrimaryKey(Attendance record) {
		
		
		return attendanceMapper.updateByPrimaryKey(record);
	}

	@Override
	public int insert(Attendance record) {
		return attendanceMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer attendanceId) {
		return attendanceMapper.deleteByPrimaryKey(attendanceId);
	}

	@Override
	public List<Attendance> findAttendRoleList(Integer adminId, Integer offset) {
		
		return attendanceMapper.findAttendRoleList(adminId, offset);
	
	}

	@Override
	public Integer findAttendRoleCount(Integer adminId) {
		
		return attendanceMapper.findAttendRoleCount(adminId);
	}

	@Override
	public Attendance selectByPrimaryKey(Integer attendanceId) {
		return attendanceMapper.selectByPrimaryKey(attendanceId);
	}

	@Override
	public List<Integer> findAllAdminId() {
		return attendanceMapper.findAllAdminId();
	}

}
