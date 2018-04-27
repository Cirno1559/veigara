package com.hxzy.entity.aftersales;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Repairinfo implements Serializable {
    /**
     * 修理编号
     */
    private Integer repairinfoId;

    /**
     * 送修时间
     */
    private Date repairinfoTime;

    /**
     * 外键 车牌号
     */
    private Integer carId;

    /**
     * 维修原因
     */
    private String repairinfoRaccount;

    /**
     * 外键 
     */
    private Integer adminId;

    private Integer state;

    private String repairinfoOda;

    private static final long serialVersionUID = 1L;

    public Integer getRepairinfoId() {
        return repairinfoId;
    }

    public void setRepairinfoId(Integer repairinfoId) {
        this.repairinfoId = repairinfoId;
    }

    public Date getRepairinfoTime() {
        return repairinfoTime;
    }

    public void setRepairinfoTime(Date repairinfoTime) {
        this.repairinfoTime = repairinfoTime;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getRepairinfoRaccount() {
        return repairinfoRaccount;
    }

    public void setRepairinfoRaccount(String repairinfoRaccount) {
        this.repairinfoRaccount = repairinfoRaccount;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRepairinfoOda() {
        return repairinfoOda;
    }

    public void setRepairinfoOda(String repairinfoOda) {
        this.repairinfoOda = repairinfoOda;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Repairinfo other = (Repairinfo) that;
        return (this.getRepairinfoId() == null ? other.getRepairinfoId() == null : this.getRepairinfoId().equals(other.getRepairinfoId()))
            && (this.getRepairinfoTime() == null ? other.getRepairinfoTime() == null : this.getRepairinfoTime().equals(other.getRepairinfoTime()))
            && (this.getCarId() == null ? other.getCarId() == null : this.getCarId().equals(other.getCarId()))
            && (this.getRepairinfoRaccount() == null ? other.getRepairinfoRaccount() == null : this.getRepairinfoRaccount().equals(other.getRepairinfoRaccount()))
            && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRepairinfoOda() == null ? other.getRepairinfoOda() == null : this.getRepairinfoOda().equals(other.getRepairinfoOda()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRepairinfoId() == null) ? 0 : getRepairinfoId().hashCode());
        result = prime * result + ((getRepairinfoTime() == null) ? 0 : getRepairinfoTime().hashCode());
        result = prime * result + ((getCarId() == null) ? 0 : getCarId().hashCode());
        result = prime * result + ((getRepairinfoRaccount() == null) ? 0 : getRepairinfoRaccount().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRepairinfoOda() == null) ? 0 : getRepairinfoOda().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repairinfoId=").append(repairinfoId);
        sb.append(", repairinfoTime=").append(repairinfoTime);
        sb.append(", carId=").append(carId);
        sb.append(", repairinfoRaccount=").append(repairinfoRaccount);
        sb.append(", adminId=").append(adminId);
        sb.append(", state=").append(state);
        sb.append(", repairinfoOda=").append(repairinfoOda);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}