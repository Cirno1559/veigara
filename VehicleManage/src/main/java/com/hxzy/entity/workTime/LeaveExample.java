package com.hxzy.entity.workTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LeaveExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andLeaveIdIsNull() {
            addCriterion("leaveId is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIsNotNull() {
            addCriterion("leaveId is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdEqualTo(Integer value) {
            addCriterion("leaveId =", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotEqualTo(Integer value) {
            addCriterion("leaveId <>", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThan(Integer value) {
            addCriterion("leaveId >", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveId >=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThan(Integer value) {
            addCriterion("leaveId <", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThanOrEqualTo(Integer value) {
            addCriterion("leaveId <=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIn(List<Integer> values) {
            addCriterion("leaveId in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotIn(List<Integer> values) {
            addCriterion("leaveId not in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdBetween(Integer value1, Integer value2) {
            addCriterion("leaveId between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveId not between", value1, value2, "leaveId");
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

        public Criteria andLeaveBeginIsNull() {
            addCriterion("leaveBegin is null");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginIsNotNull() {
            addCriterion("leaveBegin is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginEqualTo(Date value) {
            addCriterionForJDBCDate("leaveBegin =", value, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("leaveBegin <>", value, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("leaveBegin >", value, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveBegin >=", value, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginLessThan(Date value) {
            addCriterionForJDBCDate("leaveBegin <", value, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveBegin <=", value, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginIn(List<Date> values) {
            addCriterionForJDBCDate("leaveBegin in", values, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("leaveBegin not in", values, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveBegin between", value1, value2, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveBegin not between", value1, value2, "leaveBegin");
            return (Criteria) this;
        }

        public Criteria andLeaveEndIsNull() {
            addCriterion("leaveEnd is null");
            return (Criteria) this;
        }

        public Criteria andLeaveEndIsNotNull() {
            addCriterion("leaveEnd is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEndEqualTo(Date value) {
            addCriterionForJDBCDate("leaveEnd =", value, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("leaveEnd <>", value, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndGreaterThan(Date value) {
            addCriterionForJDBCDate("leaveEnd >", value, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveEnd >=", value, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndLessThan(Date value) {
            addCriterionForJDBCDate("leaveEnd <", value, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveEnd <=", value, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndIn(List<Date> values) {
            addCriterionForJDBCDate("leaveEnd in", values, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("leaveEnd not in", values, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveEnd between", value1, value2, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveEnd not between", value1, value2, "leaveEnd");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalIsNull() {
            addCriterion("leaveTotal is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalIsNotNull() {
            addCriterion("leaveTotal is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalEqualTo(Integer value) {
            addCriterion("leaveTotal =", value, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalNotEqualTo(Integer value) {
            addCriterion("leaveTotal <>", value, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalGreaterThan(Integer value) {
            addCriterion("leaveTotal >", value, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveTotal >=", value, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalLessThan(Integer value) {
            addCriterion("leaveTotal <", value, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalLessThanOrEqualTo(Integer value) {
            addCriterion("leaveTotal <=", value, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalIn(List<Integer> values) {
            addCriterion("leaveTotal in", values, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalNotIn(List<Integer> values) {
            addCriterion("leaveTotal not in", values, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalBetween(Integer value1, Integer value2) {
            addCriterion("leaveTotal between", value1, value2, "leaveTotal");
            return (Criteria) this;
        }

        public Criteria andLeaveTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveTotal not between", value1, value2, "leaveTotal");
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