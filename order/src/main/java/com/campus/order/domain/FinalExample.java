package com.campus.order.domain;

import java.util.ArrayList;
import java.util.List;

public class FinalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinalExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Long value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Long value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Long value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Long value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Long value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Long value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Long> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Long> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Long value1, Long value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Long value1, Long value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFAddressIsNull() {
            addCriterion("f_address is null");
            return (Criteria) this;
        }

        public Criteria andFAddressIsNotNull() {
            addCriterion("f_address is not null");
            return (Criteria) this;
        }

        public Criteria andFAddressEqualTo(String value) {
            addCriterion("f_address =", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotEqualTo(String value) {
            addCriterion("f_address <>", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressGreaterThan(String value) {
            addCriterion("f_address >", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressGreaterThanOrEqualTo(String value) {
            addCriterion("f_address >=", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLessThan(String value) {
            addCriterion("f_address <", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLessThanOrEqualTo(String value) {
            addCriterion("f_address <=", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLike(String value) {
            addCriterion("f_address like", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotLike(String value) {
            addCriterion("f_address not like", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressIn(List<String> values) {
            addCriterion("f_address in", values, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotIn(List<String> values) {
            addCriterion("f_address not in", values, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressBetween(String value1, String value2) {
            addCriterion("f_address between", value1, value2, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotBetween(String value1, String value2) {
            addCriterion("f_address not between", value1, value2, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("f_type is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("f_type is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("f_type =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("f_type <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("f_type >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("f_type >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("f_type <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("f_type <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("f_type like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("f_type not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("f_type in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("f_type not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("f_type between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("f_type not between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(String value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(String value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(String value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(String value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(String value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(String value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLike(String value) {
            addCriterion("pay like", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotLike(String value) {
            addCriterion("pay not like", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<String> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<String> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(String value1, String value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(String value1, String value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andFTextIsNull() {
            addCriterion("f_text is null");
            return (Criteria) this;
        }

        public Criteria andFTextIsNotNull() {
            addCriterion("f_text is not null");
            return (Criteria) this;
        }

        public Criteria andFTextEqualTo(String value) {
            addCriterion("f_text =", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotEqualTo(String value) {
            addCriterion("f_text <>", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextGreaterThan(String value) {
            addCriterion("f_text >", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextGreaterThanOrEqualTo(String value) {
            addCriterion("f_text >=", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextLessThan(String value) {
            addCriterion("f_text <", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextLessThanOrEqualTo(String value) {
            addCriterion("f_text <=", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextLike(String value) {
            addCriterion("f_text like", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotLike(String value) {
            addCriterion("f_text not like", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextIn(List<String> values) {
            addCriterion("f_text in", values, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotIn(List<String> values) {
            addCriterion("f_text not in", values, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextBetween(String value1, String value2) {
            addCriterion("f_text between", value1, value2, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotBetween(String value1, String value2) {
            addCriterion("f_text not between", value1, value2, "fText");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andFSumIsNull() {
            addCriterion("f_sum is null");
            return (Criteria) this;
        }

        public Criteria andFSumIsNotNull() {
            addCriterion("f_sum is not null");
            return (Criteria) this;
        }

        public Criteria andFSumEqualTo(Double value) {
            addCriterion("f_sum =", value, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumNotEqualTo(Double value) {
            addCriterion("f_sum <>", value, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumGreaterThan(Double value) {
            addCriterion("f_sum >", value, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumGreaterThanOrEqualTo(Double value) {
            addCriterion("f_sum >=", value, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumLessThan(Double value) {
            addCriterion("f_sum <", value, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumLessThanOrEqualTo(Double value) {
            addCriterion("f_sum <=", value, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumIn(List<Double> values) {
            addCriterion("f_sum in", values, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumNotIn(List<Double> values) {
            addCriterion("f_sum not in", values, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumBetween(Double value1, Double value2) {
            addCriterion("f_sum between", value1, value2, "fSum");
            return (Criteria) this;
        }

        public Criteria andFSumNotBetween(Double value1, Double value2) {
            addCriterion("f_sum not between", value1, value2, "fSum");
            return (Criteria) this;
        }

        public Criteria andRdcolorIsNull() {
            addCriterion("rdColor is null");
            return (Criteria) this;
        }

        public Criteria andRdcolorIsNotNull() {
            addCriterion("rdColor is not null");
            return (Criteria) this;
        }

        public Criteria andRdcolorEqualTo(String value) {
            addCriterion("rdColor =", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorNotEqualTo(String value) {
            addCriterion("rdColor <>", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorGreaterThan(String value) {
            addCriterion("rdColor >", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorGreaterThanOrEqualTo(String value) {
            addCriterion("rdColor >=", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorLessThan(String value) {
            addCriterion("rdColor <", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorLessThanOrEqualTo(String value) {
            addCriterion("rdColor <=", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorLike(String value) {
            addCriterion("rdColor like", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorNotLike(String value) {
            addCriterion("rdColor not like", value, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorIn(List<String> values) {
            addCriterion("rdColor in", values, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorNotIn(List<String> values) {
            addCriterion("rdColor not in", values, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorBetween(String value1, String value2) {
            addCriterion("rdColor between", value1, value2, "rdcolor");
            return (Criteria) this;
        }

        public Criteria andRdcolorNotBetween(String value1, String value2) {
            addCriterion("rdColor not between", value1, value2, "rdcolor");
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