package com.hxzy.entity.aftersales;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Customerpay implements Serializable {
    private Integer customerPayId;

    private Integer customerId;

    private String customerPayAccount;

    private Integer repairinfoId;

    private Integer customerPayCost;

    private Integer customerPayPrice;

    private Date customerPayTime;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerPayId() {
        return customerPayId;
    }

    public void setCustomerPayId(Integer customerPayId) {
        this.customerPayId = customerPayId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPayAccount() {
        return customerPayAccount;
    }

    public void setCustomerPayAccount(String customerPayAccount) {
        this.customerPayAccount = customerPayAccount;
    }

    public Integer getRepairinfoId() {
        return repairinfoId;
    }

    public void setRepairinfoId(Integer repairinfoId) {
        this.repairinfoId = repairinfoId;
    }

    public Integer getCustomerPayCost() {
        return customerPayCost;
    }

    public void setCustomerPayCost(Integer customerPayCost) {
        this.customerPayCost = customerPayCost;
    }

    public Integer getCustomerPayPrice() {
        return customerPayPrice;
    }

    public void setCustomerPayPrice(Integer customerPayPrice) {
        this.customerPayPrice = customerPayPrice;
    }

    public Date getCustomerPayTime() {
        return customerPayTime;
    }

    public void setCustomerPayTime(Date customerPayTime) {
        this.customerPayTime = customerPayTime;
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
        Customerpay other = (Customerpay) that;
        return (this.getCustomerPayId() == null ? other.getCustomerPayId() == null : this.getCustomerPayId().equals(other.getCustomerPayId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerPayAccount() == null ? other.getCustomerPayAccount() == null : this.getCustomerPayAccount().equals(other.getCustomerPayAccount()))
            && (this.getRepairinfoId() == null ? other.getRepairinfoId() == null : this.getRepairinfoId().equals(other.getRepairinfoId()))
            && (this.getCustomerPayCost() == null ? other.getCustomerPayCost() == null : this.getCustomerPayCost().equals(other.getCustomerPayCost()))
            && (this.getCustomerPayPrice() == null ? other.getCustomerPayPrice() == null : this.getCustomerPayPrice().equals(other.getCustomerPayPrice()))
            && (this.getCustomerPayTime() == null ? other.getCustomerPayTime() == null : this.getCustomerPayTime().equals(other.getCustomerPayTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerPayId() == null) ? 0 : getCustomerPayId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerPayAccount() == null) ? 0 : getCustomerPayAccount().hashCode());
        result = prime * result + ((getRepairinfoId() == null) ? 0 : getRepairinfoId().hashCode());
        result = prime * result + ((getCustomerPayCost() == null) ? 0 : getCustomerPayCost().hashCode());
        result = prime * result + ((getCustomerPayPrice() == null) ? 0 : getCustomerPayPrice().hashCode());
        result = prime * result + ((getCustomerPayTime() == null) ? 0 : getCustomerPayTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerPayId=").append(customerPayId);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerPayAccount=").append(customerPayAccount);
        sb.append(", repairinfoId=").append(repairinfoId);
        sb.append(", customerPayCost=").append(customerPayCost);
        sb.append(", customerPayPrice=").append(customerPayPrice);
        sb.append(", customerPayTime=").append(customerPayTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}