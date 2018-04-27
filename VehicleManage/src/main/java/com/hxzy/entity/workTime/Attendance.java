package com.hxzy.entity.workTime;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Attendance implements Serializable {
    /**
     * 出勤表 主键
     */
    private Integer attendanceId;

    /**
     * 用户ID
     */
    private Integer adminId;

    /**
     * 上班时间
     */
    private Date beginTime;

    /**
     * 下班时间
     */
    private Date endTime;

    /**
     * 0: 缺勤 1：出勤  2：迟到
     */
    private Integer unAttendance;

    private static final long serialVersionUID = 1L;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getUnAttendance() {
        return unAttendance;
    }

    public void setUnAttendance(Integer unAttendance) {
        this.unAttendance = unAttendance;
    }
}