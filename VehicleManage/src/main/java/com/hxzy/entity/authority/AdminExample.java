package com.hxzy.entity.authority;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminExample() {
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

        public Criteria andAdminLoginNameIsNull() {
            addCriterion("adminLoginName is null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameIsNotNull() {
            addCriterion("adminLoginName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameEqualTo(String value) {
            addCriterion("adminLoginName =", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotEqualTo(String value) {
            addCriterion("adminLoginName <>", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameGreaterThan(String value) {
            addCriterion("adminLoginName >", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("adminLoginName >=", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameLessThan(String value) {
            addCriterion("adminLoginName <", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameLessThanOrEqualTo(String value) {
            addCriterion("adminLoginName <=", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameLike(String value) {
            addCriterion("adminLoginName like", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotLike(String value) {
            addCriterion("adminLoginName not like", value, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameIn(List<String> values) {
            addCriterion("adminLoginName in", values, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotIn(List<String> values) {
            addCriterion("adminLoginName not in", values, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameBetween(String value1, String value2) {
            addCriterion("adminLoginName between", value1, value2, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNameNotBetween(String value1, String value2) {
            addCriterion("adminLoginName not between", value1, value2, "adminLoginName");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdIsNull() {
            addCriterion("adminLoginPwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdIsNotNull() {
            addCriterion("adminLoginPwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdEqualTo(String value) {
            addCriterion("adminLoginPwd =", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdNotEqualTo(String value) {
            addCriterion("adminLoginPwd <>", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdGreaterThan(String value) {
            addCriterion("adminLoginPwd >", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("adminLoginPwd >=", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdLessThan(String value) {
            addCriterion("adminLoginPwd <", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("adminLoginPwd <=", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdLike(String value) {
            addCriterion("adminLoginPwd like", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdNotLike(String value) {
            addCriterion("adminLoginPwd not like", value, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdIn(List<String> values) {
            addCriterion("adminLoginPwd in", values, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdNotIn(List<String> values) {
            addCriterion("adminLoginPwd not in", values, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdBetween(String value1, String value2) {
            addCriterion("adminLoginPwd between", value1, value2, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminLoginPwdNotBetween(String value1, String value2) {
            addCriterion("adminLoginPwd not between", value1, value2, "adminLoginPwd");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("adminState is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("adminState is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(Integer value) {
            addCriterion("adminState =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(Integer value) {
            addCriterion("adminState <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(Integer value) {
            addCriterion("adminState >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminState >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(Integer value) {
            addCriterion("adminState <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(Integer value) {
            addCriterion("adminState <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<Integer> values) {
            addCriterion("adminState in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<Integer> values) {
            addCriterion("adminState not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(Integer value1, Integer value2) {
            addCriterion("adminState between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(Integer value1, Integer value2) {
            addCriterion("adminState not between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("jobId =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("jobId <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("jobId >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobId >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("jobId <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("jobId <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("jobId in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("jobId not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("jobId between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jobId not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("roleId <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleId");
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