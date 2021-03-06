package com.liu.mall.pojo;

import java.util.ArrayList;
import java.util.List;

public class StoreinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreinfoExample() {
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

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("stid not between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStnameIsNull() {
            addCriterion("stname is null");
            return (Criteria) this;
        }

        public Criteria andStnameIsNotNull() {
            addCriterion("stname is not null");
            return (Criteria) this;
        }

        public Criteria andStnameEqualTo(String value) {
            addCriterion("stname =", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotEqualTo(String value) {
            addCriterion("stname <>", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameGreaterThan(String value) {
            addCriterion("stname >", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameGreaterThanOrEqualTo(String value) {
            addCriterion("stname >=", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLessThan(String value) {
            addCriterion("stname <", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLessThanOrEqualTo(String value) {
            addCriterion("stname <=", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLike(String value) {
            addCriterion("stname like", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotLike(String value) {
            addCriterion("stname not like", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameIn(List<String> values) {
            addCriterion("stname in", values, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotIn(List<String> values) {
            addCriterion("stname not in", values, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameBetween(String value1, String value2) {
            addCriterion("stname between", value1, value2, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotBetween(String value1, String value2) {
            addCriterion("stname not between", value1, value2, "stname");
            return (Criteria) this;
        }

        public Criteria andStnumIsNull() {
            addCriterion("stnum is null");
            return (Criteria) this;
        }

        public Criteria andStnumIsNotNull() {
            addCriterion("stnum is not null");
            return (Criteria) this;
        }

        public Criteria andStnumEqualTo(String value) {
            addCriterion("stnum =", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumNotEqualTo(String value) {
            addCriterion("stnum <>", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumGreaterThan(String value) {
            addCriterion("stnum >", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumGreaterThanOrEqualTo(String value) {
            addCriterion("stnum >=", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumLessThan(String value) {
            addCriterion("stnum <", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumLessThanOrEqualTo(String value) {
            addCriterion("stnum <=", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumLike(String value) {
            addCriterion("stnum like", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumNotLike(String value) {
            addCriterion("stnum not like", value, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumIn(List<String> values) {
            addCriterion("stnum in", values, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumNotIn(List<String> values) {
            addCriterion("stnum not in", values, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumBetween(String value1, String value2) {
            addCriterion("stnum between", value1, value2, "stnum");
            return (Criteria) this;
        }

        public Criteria andStnumNotBetween(String value1, String value2) {
            addCriterion("stnum not between", value1, value2, "stnum");
            return (Criteria) this;
        }

        public Criteria andStaddressIsNull() {
            addCriterion("staddress is null");
            return (Criteria) this;
        }

        public Criteria andStaddressIsNotNull() {
            addCriterion("staddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaddressEqualTo(String value) {
            addCriterion("staddress =", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressNotEqualTo(String value) {
            addCriterion("staddress <>", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressGreaterThan(String value) {
            addCriterion("staddress >", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staddress >=", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressLessThan(String value) {
            addCriterion("staddress <", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressLessThanOrEqualTo(String value) {
            addCriterion("staddress <=", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressLike(String value) {
            addCriterion("staddress like", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressNotLike(String value) {
            addCriterion("staddress not like", value, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressIn(List<String> values) {
            addCriterion("staddress in", values, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressNotIn(List<String> values) {
            addCriterion("staddress not in", values, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressBetween(String value1, String value2) {
            addCriterion("staddress between", value1, value2, "staddress");
            return (Criteria) this;
        }

        public Criteria andStaddressNotBetween(String value1, String value2) {
            addCriterion("staddress not between", value1, value2, "staddress");
            return (Criteria) this;
        }

        public Criteria andStareaidIsNull() {
            addCriterion("stareaid is null");
            return (Criteria) this;
        }

        public Criteria andStareaidIsNotNull() {
            addCriterion("stareaid is not null");
            return (Criteria) this;
        }

        public Criteria andStareaidEqualTo(Integer value) {
            addCriterion("stareaid =", value, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidNotEqualTo(Integer value) {
            addCriterion("stareaid <>", value, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidGreaterThan(Integer value) {
            addCriterion("stareaid >", value, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stareaid >=", value, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidLessThan(Integer value) {
            addCriterion("stareaid <", value, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidLessThanOrEqualTo(Integer value) {
            addCriterion("stareaid <=", value, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidIn(List<Integer> values) {
            addCriterion("stareaid in", values, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidNotIn(List<Integer> values) {
            addCriterion("stareaid not in", values, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidBetween(Integer value1, Integer value2) {
            addCriterion("stareaid between", value1, value2, "stareaid");
            return (Criteria) this;
        }

        public Criteria andStareaidNotBetween(Integer value1, Integer value2) {
            addCriterion("stareaid not between", value1, value2, "stareaid");
            return (Criteria) this;
        }
    }

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