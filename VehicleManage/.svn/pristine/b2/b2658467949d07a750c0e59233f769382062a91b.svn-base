package com.hxzy.entity.workTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TravelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TravelExample() {
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

        public Criteria andTravelIdIsNull() {
            addCriterion("travelId is null");
            return (Criteria) this;
        }

        public Criteria andTravelIdIsNotNull() {
            addCriterion("travelId is not null");
            return (Criteria) this;
        }

        public Criteria andTravelIdEqualTo(Integer value) {
            addCriterion("travelId =", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotEqualTo(Integer value) {
            addCriterion("travelId <>", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThan(Integer value) {
            addCriterion("travelId >", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("travelId >=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThan(Integer value) {
            addCriterion("travelId <", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThanOrEqualTo(Integer value) {
            addCriterion("travelId <=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdIn(List<Integer> values) {
            addCriterion("travelId in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotIn(List<Integer> values) {
            addCriterion("travelId not in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdBetween(Integer value1, Integer value2) {
            addCriterion("travelId between", value1, value2, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("travelId not between", value1, value2, "travelId");
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

        public Criteria andTravelBeginIsNull() {
            addCriterion("travelBegin is null");
            return (Criteria) this;
        }

        public Criteria andTravelBeginIsNotNull() {
            addCriterion("travelBegin is not null");
            return (Criteria) this;
        }

        public Criteria andTravelBeginEqualTo(Date value) {
            addCriterionForJDBCDate("travelBegin =", value, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("travelBegin <>", value, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("travelBegin >", value, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelBegin >=", value, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginLessThan(Date value) {
            addCriterionForJDBCDate("travelBegin <", value, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelBegin <=", value, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginIn(List<Date> values) {
            addCriterionForJDBCDate("travelBegin in", values, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("travelBegin not in", values, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelBegin between", value1, value2, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelBegin not between", value1, value2, "travelBegin");
            return (Criteria) this;
        }

        public Criteria andTravelEndIsNull() {
            addCriterion("travelEnd is null");
            return (Criteria) this;
        }

        public Criteria andTravelEndIsNotNull() {
            addCriterion("travelEnd is not null");
            return (Criteria) this;
        }

        public Criteria andTravelEndEqualTo(Date value) {
            addCriterionForJDBCDate("travelEnd =", value, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("travelEnd <>", value, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndGreaterThan(Date value) {
            addCriterionForJDBCDate("travelEnd >", value, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelEnd >=", value, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndLessThan(Date value) {
            addCriterionForJDBCDate("travelEnd <", value, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("travelEnd <=", value, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndIn(List<Date> values) {
            addCriterionForJDBCDate("travelEnd in", values, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("travelEnd not in", values, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelEnd between", value1, value2, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("travelEnd not between", value1, value2, "travelEnd");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIsNull() {
            addCriterion("travelTotal is null");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIsNotNull() {
            addCriterion("travelTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTotalEqualTo(Integer value) {
            addCriterion("travelTotal =", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotEqualTo(Integer value) {
            addCriterion("travelTotal <>", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalGreaterThan(Integer value) {
            addCriterion("travelTotal >", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("travelTotal >=", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalLessThan(Integer value) {
            addCriterion("travelTotal <", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalLessThanOrEqualTo(Integer value) {
            addCriterion("travelTotal <=", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIn(List<Integer> values) {
            addCriterion("travelTotal in", values, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotIn(List<Integer> values) {
            addCriterion("travelTotal not in", values, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalBetween(Integer value1, Integer value2) {
            addCriterion("travelTotal between", value1, value2, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("travelTotal not between", value1, value2, "travelTotal");
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