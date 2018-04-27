package com.hxzy.entity.workTime;

import java.util.ArrayList;
import java.util.List;

public class OvertimetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OvertimetypeExample() {
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

        public Criteria andOverTimeTypeIdIsNull() {
            addCriterion("overTimeTypeId is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdIsNotNull() {
            addCriterion("overTimeTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdEqualTo(Integer value) {
            addCriterion("overTimeTypeId =", value, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdNotEqualTo(Integer value) {
            addCriterion("overTimeTypeId <>", value, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdGreaterThan(Integer value) {
            addCriterion("overTimeTypeId >", value, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("overTimeTypeId >=", value, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdLessThan(Integer value) {
            addCriterion("overTimeTypeId <", value, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("overTimeTypeId <=", value, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdIn(List<Integer> values) {
            addCriterion("overTimeTypeId in", values, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdNotIn(List<Integer> values) {
            addCriterion("overTimeTypeId not in", values, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("overTimeTypeId between", value1, value2, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("overTimeTypeId not between", value1, value2, "overTimeTypeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameIsNull() {
            addCriterion("overTimeTypeName is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameIsNotNull() {
            addCriterion("overTimeTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameEqualTo(String value) {
            addCriterion("overTimeTypeName =", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameNotEqualTo(String value) {
            addCriterion("overTimeTypeName <>", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameGreaterThan(String value) {
            addCriterion("overTimeTypeName >", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("overTimeTypeName >=", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameLessThan(String value) {
            addCriterion("overTimeTypeName <", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameLessThanOrEqualTo(String value) {
            addCriterion("overTimeTypeName <=", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameLike(String value) {
            addCriterion("overTimeTypeName like", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameNotLike(String value) {
            addCriterion("overTimeTypeName not like", value, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameIn(List<String> values) {
            addCriterion("overTimeTypeName in", values, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameNotIn(List<String> values) {
            addCriterion("overTimeTypeName not in", values, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameBetween(String value1, String value2) {
            addCriterion("overTimeTypeName between", value1, value2, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimeTypeNameNotBetween(String value1, String value2) {
            addCriterion("overTimeTypeName not between", value1, value2, "overTimeTypeName");
            return (Criteria) this;
        }

        public Criteria andOverTimePayIsNull() {
            addCriterion("overTimePay is null");
            return (Criteria) this;
        }

        public Criteria andOverTimePayIsNotNull() {
            addCriterion("overTimePay is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimePayEqualTo(Integer value) {
            addCriterion("overTimePay =", value, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayNotEqualTo(Integer value) {
            addCriterion("overTimePay <>", value, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayGreaterThan(Integer value) {
            addCriterion("overTimePay >", value, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayGreaterThanOrEqualTo(Integer value) {
            addCriterion("overTimePay >=", value, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayLessThan(Integer value) {
            addCriterion("overTimePay <", value, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayLessThanOrEqualTo(Integer value) {
            addCriterion("overTimePay <=", value, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayIn(List<Integer> values) {
            addCriterion("overTimePay in", values, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayNotIn(List<Integer> values) {
            addCriterion("overTimePay not in", values, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayBetween(Integer value1, Integer value2) {
            addCriterion("overTimePay between", value1, value2, "overTimePay");
            return (Criteria) this;
        }

        public Criteria andOverTimePayNotBetween(Integer value1, Integer value2) {
            addCriterion("overTimePay not between", value1, value2, "overTimePay");
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