package com.hxzy.entity.workTime;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Travel implements Serializable {
    /**
     * 出差编号
     */
    private Integer travelId;

    /**
     * 外键 用户ID
     */
    private Integer adminId;

    /**
     * 出差开始时间
     */
    private Date travelBegin;

    /**
     * 出差结束时间
     */
    private Date travelEnd;

    /**
     * 出差天数
     */
    private Integer travelTotal;

    private static final long serialVersionUID = 1L;

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getTravelBegin() {
        return travelBegin;
    }

    public void setTravelBegin(Date travelBegin) {
        this.travelBegin = travelBegin;
    }

    public Date getTravelEnd() {
        return travelEnd;
    }

    public void setTravelEnd(Date travelEnd) {
        this.travelEnd = travelEnd;
    }

    public Integer getTravelTotal() {
        return travelTotal;
    }

    public void setTravelTotal(Integer travelTotal) {
        this.travelTotal = travelTotal;
    }
}