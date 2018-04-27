package com.hxzy.entity.authority;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menuId is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menuId is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menuId =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menuId <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menuId >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuId >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menuId <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menuId <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menuId in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menuId not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menuId between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menuId not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menuName =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menuName <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menuName like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menuName not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menuName in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuStateIsNull() {
            addCriterion("menuState is null");
            return (Criteria) this;
        }

        public Criteria andMenuStateIsNotNull() {
            addCriterion("menuState is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStateEqualTo(Integer value) {
            addCriterion("menuState =", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateNotEqualTo(Integer value) {
            addCriterion("menuState <>", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateGreaterThan(Integer value) {
            addCriterion("menuState >", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuState >=", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateLessThan(Integer value) {
            addCriterion("menuState <", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateLessThanOrEqualTo(Integer value) {
            addCriterion("menuState <=", value, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateIn(List<Integer> values) {
            addCriterion("menuState in", values, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateNotIn(List<Integer> values) {
            addCriterion("menuState not in", values, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateBetween(Integer value1, Integer value2) {
            addCriterion("menuState between", value1, value2, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuStateNotBetween(Integer value1, Integer value2) {
            addCriterion("menuState not between", value1, value2, "menuState");
            return (Criteria) this;
        }

        public Criteria andMenuAdressIsNull() {
            addCriterion("menuAdress is null");
            return (Criteria) this;
        }

        public Criteria andMenuAdressIsNotNull() {
            addCriterion("menuAdress is not null");
            return (Criteria) this;
        }

        public Criteria andMenuAdressEqualTo(String value) {
            addCriterion("menuAdress =", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressNotEqualTo(String value) {
            addCriterion("menuAdress <>", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressGreaterThan(String value) {
            addCriterion("menuAdress >", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressGreaterThanOrEqualTo(String value) {
            addCriterion("menuAdress >=", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressLessThan(String value) {
            addCriterion("menuAdress <", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressLessThanOrEqualTo(String value) {
            addCriterion("menuAdress <=", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressLike(String value) {
            addCriterion("menuAdress like", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressNotLike(String value) {
            addCriterion("menuAdress not like", value, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressIn(List<String> values) {
            addCriterion("menuAdress in", values, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressNotIn(List<String> values) {
            addCriterion("menuAdress not in", values, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressBetween(String value1, String value2) {
            addCriterion("menuAdress between", value1, value2, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andMenuAdressNotBetween(String value1, String value2) {
            addCriterion("menuAdress not between", value1, value2, "menuAdress");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parentId <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andMenuTierIsNull() {
            addCriterion("menuTier is null");
            return (Criteria) this;
        }

        public Criteria andMenuTierIsNotNull() {
            addCriterion("menuTier is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTierEqualTo(Integer value) {
            addCriterion("menuTier =", value, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierNotEqualTo(Integer value) {
            addCriterion("menuTier <>", value, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierGreaterThan(Integer value) {
            addCriterion("menuTier >", value, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuTier >=", value, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierLessThan(Integer value) {
            addCriterion("menuTier <", value, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierLessThanOrEqualTo(Integer value) {
            addCriterion("menuTier <=", value, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierIn(List<Integer> values) {
            addCriterion("menuTier in", values, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierNotIn(List<Integer> values) {
            addCriterion("menuTier not in", values, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierBetween(Integer value1, Integer value2) {
            addCriterion("menuTier between", value1, value2, "menuTier");
            return (Criteria) this;
        }

        public Criteria andMenuTierNotBetween(Integer value1, Integer value2) {
            addCriterion("menuTier not between", value1, value2, "menuTier");
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