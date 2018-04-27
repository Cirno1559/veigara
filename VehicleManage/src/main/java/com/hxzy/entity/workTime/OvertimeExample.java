package com.hxzy.entity.workTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OvertimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OvertimeExample() {
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

        public Criteria andOverTimeIdIsNull() {
            addCriterion("overTimeId is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdIsNotNull() {
            addCriterion("overTimeId is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdEqualTo(Integer value) {
            addCriterion("overTimeId =", value, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdNotEqualTo(Integer value) {
            addCriterion("overTimeId <>", value, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdGreaterThan(Integer value) {
            addCriterion("overTimeId >", value, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("overTimeId >=", value, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdLessThan(Integer value) {
            addCriterion("overTimeId <", value, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("overTimeId <=", value, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdIn(List<Integer> values) {
            addCriterion("overTimeId in", values, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdNotIn(List<Integer> values) {
            addCriterion("overTimeId not in", values, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("overTimeId between", value1, value2, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andOverTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("overTimeId not between", value1, value2, "overTimeId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("adminId <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adminId not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginIsNull() {
            addCriterion("overTimeBegin is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginIsNotNull() {
            addCriterion("overTimeBegin is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginEqualTo(Date value) {
            addCriterion("overTimeBegin =", value, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginNotEqualTo(Date value) {
            addCriterion("overTimeBegin <>", value, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginGreaterThan(Date value) {
            addCriterion("overTimeBegin >", value, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("overTimeBegin >=", value, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginLessThan(Date value) {
            addCriterion("overTimeBegin <", value, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginLessThanOrEqualTo(Date value) {
            addCriterion("overTimeBegin <=", value, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginIn(List<Date> values) {
            addCriterion("overTimeBegin in", values, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginNotIn(List<Date> values) {
            addCriterion("overTimeBegin not in", values, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginBetween(Date value1, Date value2) {
            addCriterion("overTimeBegin between", value1, value2, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeBeginNotBetween(Date value1, Date value2) {
            addCriterion("overTimeBegin not between", value1, value2, "overTimeBegin");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndIsNull() {
            addCriterion("overTimeEnd is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndIsNotNull() {
            addCriterion("overTimeEnd is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndEqualTo(Date value) {
            addCriterion("overTimeEnd =", value, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndNotEqualTo(Date value) {
            addCriterion("overTimeEnd <>", value, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndGreaterThan(Date value) {
            addCriterion("overTimeEnd >", value, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("overTimeEnd >=", value, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndLessThan(Date value) {
            addCriterion("overTimeEnd <", value, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("overTimeEnd <=", value, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndIn(List<Date> values) {
            addCriterion("overTimeEnd in", values, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndNotIn(List<Date> values) {
            addCriterion("overTimeEnd not in", values, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndBetween(Date value1, Date value2) {
            addCriterion("overTimeEnd between", value1, value2, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("overTimeEnd not between", value1, value2, "overTimeEnd");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalIsNull() {
            addCriterion("overTimeTotal is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalIsNotNull() {
            addCriterion("overTimeTotal is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalEqualTo(Integer value) {
            addCriterion("overTimeTotal =", value, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalNotEqualTo(Integer value) {
            addCriterion("overTimeTotal <>", value, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalGreaterThan(Integer value) {
            addCriterion("overTimeTotal >", value, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("overTimeTotal >=", value, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalLessThan(Integer value) {
            addCriterion("overTimeTotal <", value, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalLessThanOrEqualTo(Integer value) {
            addCriterion("overTimeTotal <=", value, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalIn(List<Integer> values) {
            addCriterion("overTimeTotal in", values, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalNotIn(List<Integer> values) {
            addCriterion("overTimeTotal not in", values, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalBetween(Integer value1, Integer value2) {
            addCriterion("overTimeTotal between", value1, value2, "overTimeTotal");
            return (Criteria) this;
        }

        public Criteria andOverTimeTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("overTimeTotal not between", value1, value2, "overTimeTotal");
            return (Criteria) this;
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