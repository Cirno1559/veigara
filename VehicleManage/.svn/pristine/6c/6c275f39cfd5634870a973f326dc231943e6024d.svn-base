package com.hxzy.entity.sales;

import java.io.Serializable;

/**厂商表
 * @author 
 */
public class Manufacturer implements Serializable {
    /**
     * 厂商号
     */
    private Integer manufacturerId;

    /**
     * 厂商名
     */
    private String manufacturerName;

    /**
     * 地址
     */
    private String manufacturerAddress;

    /**
     * 厂商状态,0表示删除,1表示显示
     */
    private String manufacturerState;

    /**
     * 备注
     */
    private String manufacturerContent;

    private static final long serialVersionUID = 1L;

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    public String getManufacturerState() {
        return manufacturerState;
    }

    public void setManufacturerState(String manufacturerState) {
        this.manufacturerState = manufacturerState;
    }

    public String getManufacturerContent() {
        return manufacturerContent;
    }

    public void setManufacturerContent(String manufacturerContent) {
        this.manufacturerContent = manufacturerContent;
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
        Manufacturer other = (Manufacturer) that;
        return (this.getManufacturerId() == null ? other.getManufacturerId() == null : this.getManufacturerId().equals(other.getManufacturerId()))
            && (this.getManufacturerName() == null ? other.getManufacturerName() == null : this.getManufacturerName().equals(other.getManufacturerName()))
            && (this.getManufacturerAddress() == null ? other.getManufacturerAddress() == null : this.getManufacturerAddress().equals(other.getManufacturerAddress()))
            && (this.getManufacturerState() == null ? other.getManufacturerState() == null : this.getManufacturerState().equals(other.getManufacturerState()))
            && (this.getManufacturerContent() == null ? other.getManufacturerContent() == null : this.getManufacturerContent().equals(other.getManufacturerContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getManufacturerId() == null) ? 0 : getManufacturerId().hashCode());
        result = prime * result + ((getManufacturerName() == null) ? 0 : getManufacturerName().hashCode());
        result = prime * result + ((getManufacturerAddress() == null) ? 0 : getManufacturerAddress().hashCode());
        result = prime * result + ((getManufacturerState() == null) ? 0 : getManufacturerState().hashCode());
        result = prime * result + ((getManufacturerContent() == null) ? 0 : getManufacturerContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", manufacturerId=").append(manufacturerId);
        sb.append(", manufacturerName=").append(manufacturerName);
        sb.append(", manufacturerAddress=").append(manufacturerAddress);
        sb.append(", manufacturerState=").append(manufacturerState);
        sb.append(", manufacturerContent=").append(manufacturerContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}