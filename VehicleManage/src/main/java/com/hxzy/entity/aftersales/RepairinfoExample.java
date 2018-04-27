package com.hxzy.entity.aftersales;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepairinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RepairinfoExample() {
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

        public Criteria andRepairinfoIdIsNull() {
            addCriterion("repairinfoId is null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdIsNotNull() {
            addCriterion("repairinfoId is not null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdEqualTo(Integer value) {
            addCriterion("repairinfoId =", value, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdNotEqualTo(Integer value) {
            addCriterion("repairinfoId <>", value, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdGreaterThan(Integer value) {
            addCriterion("repairinfoId >", value, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairinfoId >=", value, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdLessThan(Integer value) {
            addCriterion("repairinfoId <", value, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("repairinfoId <=", value, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdIn(List<Integer> values) {
            addCriterion("repairinfoId in", values, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdNotIn(List<Integer> values) {
            addCriterion("repairinfoId not in", values, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("repairinfoId between", value1, value2, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repairinfoId not between", value1, value2, "repairinfoId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeIsNull() {
            addCriterion("repairinfoTime is null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeIsNotNull() {
            addCriterion("repairinfoTime is not null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeEqualTo(Date value) {
            addCriterionForJDBCDate("repairinfoTime =", value, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("repairinfoTime <>", value, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("repairinfoTime >", value, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repairinfoTime >=", value, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeLessThan(Date value) {
            addCriterionForJDBCDate("repairinfoTime <", value, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repairinfoTime <=", value, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeIn(List<Date> values) {
            addCriterionForJDBCDate("repairinfoTime in", values, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("repairinfoTime not in", values, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repairinfoTime between", value1, value2, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andRepairinfoTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repairinfoTime not between", value1, value2, "repairinfoTime");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("carId is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("carId is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("carId =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("carId <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("carId >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carId >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("carId <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("carId <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("carId in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("carId not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("carId between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carId not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountIsNull() {
            addCriterion("repairinfoRaccount is null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountIsNotNull() {
            addCriterion("repairinfoRaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountEqualTo(String value) {
            addCriterion("repairinfoRaccount =", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountNotEqualTo(String value) {
            addCriterion("repairinfoRaccount <>", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountGreaterThan(String value) {
            addCriterion("repairinfoRaccount >", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountGreaterThanOrEqualTo(String value) {
            addCriterion("repairinfoRaccount >=", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountLessThan(String value) {
            addCriterion("repairinfoRaccount <", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountLessThanOrEqualTo(String value) {
            addCriterion("repairinfoRaccount <=", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountLike(String value) {
            addCriterion("repairinfoRaccount like", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountNotLike(String value) {
            addCriterion("repairinfoRaccount not like", value, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountIn(List<String> values) {
            addCriterion("repairinfoRaccount in", values, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountNotIn(List<String> values) {
            addCriterion("repairinfoRaccount not in", values, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountBetween(String value1, String value2) {
            addCriterion("repairinfoRaccount between", value1, value2, "repairinfoRaccount");
            return (Criteria) this;
        }

        public Criteria andRepairinfoRaccountNotBetween(String value1, String value2) {
            addCriterion("repairinfoRaccount not between", value1, value2, "repairinfoRaccount");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaIsNull() {
            addCriterion("repairinfoOda is null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaIsNotNull() {
            addCriterion("repairinfoOda is not null");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaEqualTo(String value) {
            addCriterion("repairinfoOda =", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaNotEqualTo(String value) {
            addCriterion("repairinfoOda <>", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaGreaterThan(String value) {
            addCriterion("repairinfoOda >", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaGreaterThanOrEqualTo(String value) {
            addCriterion("repairinfoOda >=", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaLessThan(String value) {
            addCriterion("repairinfoOda <", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaLessThanOrEqualTo(String value) {
            addCriterion("repairinfoOda <=", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaLike(String value) {
            addCriterion("repairinfoOda like", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaNotLike(String value) {
            addCriterion("repairinfoOda not like", value, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaIn(List<String> values) {
            addCriterion("repairinfoOda in", values, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaNotIn(List<String> values) {
            addCriterion("repairinfoOda not in", values, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaBetween(String value1, String value2) {
            addCriterion("repairinfoOda between", value1, value2, "repairinfoOda");
            return (Criteria) this;
        }

        public Criteria andRepairinfoOdaNotBetween(String value1, String value2) {
            addCriterion("repairinfoOda not between", value1, value2, "repairinfoOda");
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