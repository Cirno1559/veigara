package com.hxzy.entity.workTime;

import java.util.Date;

public class OverTimePojo  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer overTimeId;

    /**
     * 外键 用户ID
     */
    private Integer adminId;

    /**
     * 加班开始时间
     */
    private Date overTimeBegin;

    /**
     * 加班结束时间
     */
    private Date overTimeEnd;

    /**
     * 加班时长统计
     */
    private Integer overTimeTotal;

	
	private Overtimetype overTimeType;
	
	public Integer getOverTimeId() {
		return overTimeId;
	}

	public void setOverTimeId(Integer overTimeId) {
		this.overTimeId = overTimeId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Date getOverTimeBegin() {
		return overTimeBegin;
	}

	public void setOverTimeBegin(Date overTimeBegin) {
		this.overTimeBegin = overTimeBegin;
	}

	public Date getOverTimeEnd() {
		return overTimeEnd;
	}

	public void setOverTimeEnd(Date overTimeEnd) {
		this.overTimeEnd = overTimeEnd;
	}

	public Integer getOverTimeTotal() {
		return overTimeTotal;
	}

	public void setOverTimeTotal(Integer overTimeTotal) {
		this.overTimeTotal = overTimeTotal;
	}

	public Overtimetype getOverTimeType() {
		return overTimeType;
	}

	public void setOverTimeType(Overtimetype overTimeType) {
		this.overTimeType = overTimeType;
	}
	
}
