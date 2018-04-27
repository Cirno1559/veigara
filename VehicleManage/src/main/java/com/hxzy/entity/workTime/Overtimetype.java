package com.hxzy.entity.workTime;

import java.io.Serializable;

/**
 * @author 
 */
public class Overtimetype implements Serializable {
    /**
     * 加班类型编号
     */
    private Integer overTimeTypeId;

    /**
     * 加班类型名称
     */
    private String overTimeTypeName;

    /**
     * 加班薪酬
     */
    private Integer overTimePay;

    private static final long serialVersionUID = 1L;

    public Integer getOverTimeTypeId() {
        return overTimeTypeId;
    }

    public void setOverTimeTypeId(Integer overTimeTypeId) {
        this.overTimeTypeId = overTimeTypeId;
    }

    public String getOverTimeTypeName() {
        return overTimeTypeName;
    }

    public void setOverTimeTypeName(String overTimeTypeName) {
        this.overTimeTypeName = overTimeTypeName;
    }

    public Integer getOverTimePay() {
        return overTimePay;
    }

    public void setOverTimePay(Integer overTimePay) {
        this.overTimePay = overTimePay;
    }
}