package com.hxzy.entity.sales;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ManufacturerExample() {
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

        public Criteria andManufacturerNameIsNull() {
            addCriterion("manufacturerName is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameIsNotNull() {
            addCriterion("manufacturerName is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameEqualTo(String value) {
            addCriterion("manufacturerName =", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotEqualTo(String value) {
            addCriterion("manufacturerName <>", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameGreaterThan(String value) {
            addCriterion("manufacturerName >", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturerName >=", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameLessThan(String value) {
            addCriterion("manufacturerName <", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameLessThanOrEqualTo(String value) {
            addCriterion("manufacturerName <=", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameLike(String value) {
            addCriterion("manufacturerName like", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotLike(String value) {
            addCriterion("manufacturerName not like", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameIn(List<String> values) {
            addCriterion("manufacturerName in", values, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotIn(List<String> values) {
            addCriterion("manufacturerName not in", values, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameBetween(String value1, String value2) {
            addCriterion("manufacturerName between", value1, value2, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotBetween(String value1, String value2) {
            addCriterion("manufacturerName not between", value1, value2, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressIsNull() {
            addCriterion("manufacturerAddress is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressIsNotNull() {
            addCriterion("manufacturerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressEqualTo(String value) {
            addCriterion("manufacturerAddress =", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotEqualTo(String value) {
            addCriterion("manufacturerAddress <>", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressGreaterThan(String value) {
            addCriterion("manufacturerAddress >", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturerAddress >=", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressLessThan(String value) {
            addCriterion("manufacturerAddress <", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressLessThanOrEqualTo(String value) {
            addCriterion("manufacturerAddress <=", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressLike(String value) {
            addCriterion("manufacturerAddress like", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotLike(String value) {
            addCriterion("manufacturerAddress not like", value, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressIn(List<String> values) {
            addCriterion("manufacturerAddress in", values, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotIn(List<String> values) {
            addCriterion("manufacturerAddress not in", values, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressBetween(String value1, String value2) {
            addCriterion("manufacturerAddress between", value1, value2, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerAddressNotBetween(String value1, String value2) {
            addCriterion("manufacturerAddress not between", value1, value2, "manufacturerAddress");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateIsNull() {
            addCriterion("manufacturerState is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateIsNotNull() {
            addCriterion("manufacturerState is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateEqualTo(String value) {
            addCriterion("manufacturerState =", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateNotEqualTo(String value) {
            addCriterion("manufacturerState <>", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateGreaterThan(String value) {
            addCriterion("manufacturerState >", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturerState >=", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateLessThan(String value) {
            addCriterion("manufacturerState <", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateLessThanOrEqualTo(String value) {
            addCriterion("manufacturerState <=", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateLike(String value) {
            addCriterion("manufacturerState like", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateNotLike(String value) {
            addCriterion("manufacturerState not like", value, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateIn(List<String> values) {
            addCriterion("manufacturerState in", values, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateNotIn(List<String> values) {
            addCriterion("manufacturerState not in", values, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateBetween(String value1, String value2) {
            addCriterion("manufacturerState between", value1, value2, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerStateNotBetween(String value1, String value2) {
            addCriterion("manufacturerState not between", value1, value2, "manufacturerState");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentIsNull() {
            addCriterion("manufacturerContent is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentIsNotNull() {
            addCriterion("manufacturerContent is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentEqualTo(String value) {
            addCriterion("manufacturerContent =", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentNotEqualTo(String value) {
            addCriterion("manufacturerContent <>", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentGreaterThan(String value) {
            addCriterion("manufacturerContent >", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturerContent >=", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentLessThan(String value) {
            addCriterion("manufacturerContent <", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentLessThanOrEqualTo(String value) {
            addCriterion("manufacturerContent <=", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentLike(String value) {
            addCriterion("manufacturerContent like", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentNotLike(String value) {
            addCriterion("manufacturerContent not like", value, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentIn(List<String> values) {
            addCriterion("manufacturerContent in", values, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentNotIn(List<String> values) {
            addCriterion("manufacturerContent not in", values, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentBetween(String value1, String value2) {
            addCriterion("manufacturerContent between", value1, value2, "manufacturerContent");
            return (Criteria) this;
        }

        public Criteria andManufacturerContentNotBetween(String value1, String value2) {
            addCriterion("manufacturerContent not between", value1, value2, "manufacturerContent");
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