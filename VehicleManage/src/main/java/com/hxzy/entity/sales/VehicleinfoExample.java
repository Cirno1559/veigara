package com.hxzy.entity.sales;

import java.util.ArrayList;
import java.util.List;

public class VehicleinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public VehicleinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVehicleInforIdIsNull() {
            addCriterion("vehicleInforId is null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdIsNotNull() {
            addCriterion("vehicleInforId is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdEqualTo(Integer value) {
            addCriterion("vehicleInforId =", value, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdNotEqualTo(Integer value) {
            addCriterion("vehicleInforId <>", value, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdGreaterThan(Integer value) {
            addCriterion("vehicleInforId >", value, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicleInforId >=", value, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdLessThan(Integer value) {
            addCriterion("vehicleInforId <", value, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicleInforId <=", value, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdIn(List<Integer> values) {
            addCriterion("vehicleInforId in", values, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdNotIn(List<Integer> values) {
            addCriterion("vehicleInforId not in", values, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicleInforId between", value1, value2, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicleInforId not between", value1, value2, "vehicleInforId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionIsNull() {
            addCriterion("vehicleInforVersion is null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionIsNotNull() {
            addCriterion("vehicleInforVersion is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionEqualTo(String value) {
            addCriterion("vehicleInforVersion =", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionNotEqualTo(String value) {
            addCriterion("vehicleInforVersion <>", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionGreaterThan(String value) {
            addCriterion("vehicleInforVersion >", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleInforVersion >=", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionLessThan(String value) {
            addCriterion("vehicleInforVersion <", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionLessThanOrEqualTo(String value) {
            addCriterion("vehicleInforVersion <=", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionLike(String value) {
            addCriterion("vehicleInforVersion like", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionNotLike(String value) {
            addCriterion("vehicleInforVersion not like", value, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionIn(List<String> values) {
            addCriterion("vehicleInforVersion in", values, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionNotIn(List<String> values) {
            addCriterion("vehicleInforVersion not in", values, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionBetween(String value1, String value2) {
            addCriterion("vehicleInforVersion between", value1, value2, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforVersionNotBetween(String value1, String value2) {
            addCriterion("vehicleInforVersion not between", value1, value2, "vehicleInforVersion");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameIsNull() {
            addCriterion("vehicleInforName is null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameIsNotNull() {
            addCriterion("vehicleInforName is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameEqualTo(String value) {
            addCriterion("vehicleInforName =", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameNotEqualTo(String value) {
            addCriterion("vehicleInforName <>", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameGreaterThan(String value) {
            addCriterion("vehicleInforName >", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleInforName >=", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameLessThan(String value) {
            addCriterion("vehicleInforName <", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameLessThanOrEqualTo(String value) {
            addCriterion("vehicleInforName <=", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameLike(String value) {
            addCriterion("vehicleInforName like", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameNotLike(String value) {
            addCriterion("vehicleInforName not like", value, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameIn(List<String> values) {
            addCriterion("vehicleInforName in", values, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameNotIn(List<String> values) {
            addCriterion("vehicleInforName not in", values, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameBetween(String value1, String value2) {
            addCriterion("vehicleInforName between", value1, value2, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andVehicleInforNameNotBetween(String value1, String value2) {
            addCriterion("vehicleInforName not between", value1, value2, "vehicleInforName");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNull() {
            addCriterion("manufacturerId is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNotNull() {
            addCriterion("manufacturerId is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdEqualTo(Integer value) {
            addCriterion("manufacturerId =", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotEqualTo(Integer value) {
            addCriterion("manufacturerId <>", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThan(Integer value) {
            addCriterion("manufacturerId >", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacturerId >=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThan(Integer value) {
            addCriterion("manufacturerId <", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manufacturerId <=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIn(List<Integer> values) {
            addCriterion("manufacturerId in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotIn(List<Integer> values) {
            addCriterion("manufacturerId not in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdBetween(Integer value1, Integer value2) {
            addCriterion("manufacturerId between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacturerId not between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceIsNull() {
            addCriterion("vehicleInforPrice is null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceIsNotNull() {
            addCriterion("vehicleInforPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceEqualTo(Integer value) {
            addCriterion("vehicleInforPrice =", value, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceNotEqualTo(Integer value) {
            addCriterion("vehicleInforPrice <>", value, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceGreaterThan(Integer value) {
            addCriterion("vehicleInforPrice >", value, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicleInforPrice >=", value, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceLessThan(Integer value) {
            addCriterion("vehicleInforPrice <", value, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceLessThanOrEqualTo(Integer value) {
            addCriterion("vehicleInforPrice <=", value, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceIn(List<Integer> values) {
            addCriterion("vehicleInforPrice in", values, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceNotIn(List<Integer> values) {
            addCriterion("vehicleInforPrice not in", values, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceBetween(Integer value1, Integer value2) {
            addCriterion("vehicleInforPrice between", value1, value2, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicleInforPrice not between", value1, value2, "vehicleInforPrice");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateIsNull() {
            addCriterion("vehicleInforState is null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateIsNotNull() {
            addCriterion("vehicleInforState is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateEqualTo(String value) {
            addCriterion("vehicleInforState =", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateNotEqualTo(String value) {
            addCriterion("vehicleInforState <>", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateGreaterThan(String value) {
            addCriterion("vehicleInforState >", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleInforState >=", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateLessThan(String value) {
            addCriterion("vehicleInforState <", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateLessThanOrEqualTo(String value) {
            addCriterion("vehicleInforState <=", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateLike(String value) {
            addCriterion("vehicleInforState like", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateNotLike(String value) {
            addCriterion("vehicleInforState not like", value, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateIn(List<String> values) {
            addCriterion("vehicleInforState in", values, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateNotIn(List<String> values) {
            addCriterion("vehicleInforState not in", values, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateBetween(String value1, String value2) {
            addCriterion("vehicleInforState between", value1, value2, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforStateNotBetween(String value1, String value2) {
            addCriterion("vehicleInforState not between", value1, value2, "vehicleInforState");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageIsNull() {
            addCriterion("vehicleInforImage is null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageIsNotNull() {
            addCriterion("vehicleInforImage is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageEqualTo(String value) {
            addCriterion("vehicleInforImage =", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageNotEqualTo(String value) {
            addCriterion("vehicleInforImage <>", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageGreaterThan(String value) {
            addCriterion("vehicleInforImage >", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleInforImage >=", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageLessThan(String value) {
            addCriterion("vehicleInforImage <", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageLessThanOrEqualTo(String value) {
            addCriterion("vehicleInforImage <=", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageLike(String value) {
            addCriterion("vehicleInforImage like", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageNotLike(String value) {
            addCriterion("vehicleInforImage not like", value, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageIn(List<String> values) {
            addCriterion("vehicleInforImage in", values, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageNotIn(List<String> values) {
            addCriterion("vehicleInforImage not in", values, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageBetween(String value1, String value2) {
            addCriterion("vehicleInforImage between", value1, value2, "vehicleInforImage");
            return (Criteria) this;
        }

        public Criteria andVehicleInforImageNotBetween(String value1, String value2) {
            addCriterion("vehicleInforImage not between", value1, value2, "vehicleInforImage");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}