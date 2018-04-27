package com.hxzy.dao.workTime;

import com.hxzy.entity.workTime.Attendance;
import com.hxzy.entity.workTime.AttendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceMapper {
    long countByExample(AttendanceExample example);

    int deleteByExample(AttendanceExample example);

    int deleteByPrimaryKey(Integer attendanceId);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    List<Attendance> selectByExample(AttendanceExample example);

    Attendance selectByPrimaryKey(Integer attendanceId);

    int updateByExampleSelective(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByExample(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
    
    List<Attendance> findAttendRoleList(@Param("adminId") Integer adminId,@Param("offset") Integer offset);
    
    Integer findAttendRoleCount(@Param("adminId") Integer adminId);
    
    List<Integer> findAllAdminId();
    
}