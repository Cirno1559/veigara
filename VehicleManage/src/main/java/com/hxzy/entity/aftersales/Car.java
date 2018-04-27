package com.hxzy.entity.aftersales;

import java.io.Serializable;

/**
 * @author 
 */
public class Car implements Serializable {
    /**
     * 车辆编号
     */
    private Integer carId;

    /**
     * 行驶公里数
     */
    private Integer carOdo;

    /**
     * 车辆名称
     */
    private String carName;

    /**
     * 车辆类型
     */
    private String carVersion;

    /**
     * 0:不在编 1：在编
     */
    private Integer carState;

    private static final long serialVersionUID = 1L;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarOdo() {
        return carOdo;
    }

    public void setCarOdo(Integer carOdo) {
        this.carOdo = carOdo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarVersion() {
        return carVersion;
    }

    public void setCarVersion(String carVersion) {
        this.carVersion = carVersion;
    }

    public Integer getCarState() {
        return carState;
    }

    public void setCarState(Integer carState) {
        this.carState = carState;
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
        Car other = (Car) that;
        return (this.getCarId() == null ? other.getCarId() == null : this.getCarId().equals(other.getCarId()))
            && (this.getCarOdo() == null ? other.getCarOdo() == null : this.getCarOdo().equals(other.getCarOdo()))
            && (this.getCarName() == null ? other.getCarName() == null : this.getCarName().equals(other.getCarName()))
            && (this.getCarVersion() == null ? other.getCarVersion() == null : this.getCarVersion().equals(other.getCarVersion()))
            && (this.getCarState() == null ? other.getCarState() == null : this.getCarState().equals(other.getCarState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarId() == null) ? 0 : getCarId().hashCode());
        result = prime * result + ((getCarOdo() == null) ? 0 : getCarOdo().hashCode());
        result = prime * result + ((getCarName() == null) ? 0 : getCarName().hashCode());
        result = prime * result + ((getCarVersion() == null) ? 0 : getCarVersion().hashCode());
        result = prime * result + ((getCarState() == null) ? 0 : getCarState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carId=").append(carId);
        sb.append(", carOdo=").append(carOdo);
        sb.append(", carName=").append(carName);
        sb.append(", carVersion=").append(carVersion);
        sb.append(", carState=").append(carState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}