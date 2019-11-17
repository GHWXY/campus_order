package com.campus.order.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SettlementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettlementExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Long value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Long value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Long value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Long value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Long value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Long value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Long> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Long> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Long value1, Long value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Long value1, Long value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSCheckboxIsNull() {
            addCriterion("s_checkbox is null");
            return (Criteria) this;
        }

        public Criteria andSCheckboxIsNotNull() {
            addCriterion("s_checkbox is not null");
            return (Criteria) this;
        }

        public Criteria andSCheckboxEqualTo(String value) {
            addCriterion("s_checkbox =", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxNotEqualTo(String value) {
            addCriterion("s_checkbox <>", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxGreaterThan(String value) {
            addCriterion("s_checkbox >", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxGreaterThanOrEqualTo(String value) {
            addCriterion("s_checkbox >=", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxLessThan(String value) {
            addCriterion("s_checkbox <", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxLessThanOrEqualTo(String value) {
            addCriterion("s_checkbox <=", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxLike(String value) {
            addCriterion("s_checkbox like", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxNotLike(String value) {
            addCriterion("s_checkbox not like", value, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxIn(List<String> values) {
            addCriterion("s_checkbox in", values, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxNotIn(List<String> values) {
            addCriterion("s_checkbox not in", values, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxBetween(String value1, String value2) {
            addCriterion("s_checkbox between", value1, value2, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSCheckboxNotBetween(String value1, String value2) {
            addCriterion("s_checkbox not between", value1, value2, "sCheckbox");
            return (Criteria) this;
        }

        public Criteria andSPiocnIsNull() {
            addCriterion("s_piocn is null");
            return (Criteria) this;
        }

        public Criteria andSPiocnIsNotNull() {
            addCriterion("s_piocn is not null");
            return (Criteria) this;
        }

        public Criteria andSPiocnEqualTo(String value) {
            addCriterion("s_piocn =", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnNotEqualTo(String value) {
            addCriterion("s_piocn <>", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnGreaterThan(String value) {
            addCriterion("s_piocn >", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnGreaterThanOrEqualTo(String value) {
            addCriterion("s_piocn >=", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnLessThan(String value) {
            addCriterion("s_piocn <", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnLessThanOrEqualTo(String value) {
            addCriterion("s_piocn <=", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnLike(String value) {
            addCriterion("s_piocn like", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnNotLike(String value) {
            addCriterion("s_piocn not like", value, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnIn(List<String> values) {
            addCriterion("s_piocn in", values, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnNotIn(List<String> values) {
            addCriterion("s_piocn not in", values, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnBetween(String value1, String value2) {
            addCriterion("s_piocn between", value1, value2, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSPiocnNotBetween(String value1, String value2) {
            addCriterion("s_piocn not between", value1, value2, "sPiocn");
            return (Criteria) this;
        }

        public Criteria andSCnameIsNull() {
            addCriterion("s_cname is null");
            return (Criteria) this;
        }

        public Criteria andSCnameIsNotNull() {
            addCriterion("s_cname is not null");
            return (Criteria) this;
        }

        public Criteria andSCnameEqualTo(String value) {
            addCriterion("s_cname =", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameNotEqualTo(String value) {
            addCriterion("s_cname <>", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameGreaterThan(String value) {
            addCriterion("s_cname >", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameGreaterThanOrEqualTo(String value) {
            addCriterion("s_cname >=", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameLessThan(String value) {
            addCriterion("s_cname <", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameLessThanOrEqualTo(String value) {
            addCriterion("s_cname <=", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameLike(String value) {
            addCriterion("s_cname like", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameNotLike(String value) {
            addCriterion("s_cname not like", value, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameIn(List<String> values) {
            addCriterion("s_cname in", values, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameNotIn(List<String> values) {
            addCriterion("s_cname not in", values, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameBetween(String value1, String value2) {
            addCriterion("s_cname between", value1, value2, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCnameNotBetween(String value1, String value2) {
            addCriterion("s_cname not between", value1, value2, "sCname");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoIsNull() {
            addCriterion("s_cuxiao is null");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoIsNotNull() {
            addCriterion("s_cuxiao is not null");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoEqualTo(BigDecimal value) {
            addCriterion("s_cuxiao =", value, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoNotEqualTo(BigDecimal value) {
            addCriterion("s_cuxiao <>", value, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoGreaterThan(BigDecimal value) {
            addCriterion("s_cuxiao >", value, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("s_cuxiao >=", value, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoLessThan(BigDecimal value) {
            addCriterion("s_cuxiao <", value, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("s_cuxiao <=", value, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoIn(List<BigDecimal> values) {
            addCriterion("s_cuxiao in", values, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoNotIn(List<BigDecimal> values) {
            addCriterion("s_cuxiao not in", values, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_cuxiao between", value1, value2, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCuxiaoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_cuxiao not between", value1, value2, "sCuxiao");
            return (Criteria) this;
        }

        public Criteria andSCountIsNull() {
            addCriterion("s_count is null");
            return (Criteria) this;
        }

        public Criteria andSCountIsNotNull() {
            addCriterion("s_count is not null");
            return (Criteria) this;
        }

        public Criteria andSCountEqualTo(Long value) {
            addCriterion("s_count =", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotEqualTo(Long value) {
            addCriterion("s_count <>", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThan(Long value) {
            addCriterion("s_count >", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThanOrEqualTo(Long value) {
            addCriterion("s_count >=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThan(Long value) {
            addCriterion("s_count <", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThanOrEqualTo(Long value) {
            addCriterion("s_count <=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountIn(List<Long> values) {
            addCriterion("s_count in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotIn(List<Long> values) {
            addCriterion("s_count not in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountBetween(Long value1, Long value2) {
            addCriterion("s_count between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotBetween(Long value1, Long value2) {
            addCriterion("s_count not between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNull() {
            addCriterion("s_price is null");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNotNull() {
            addCriterion("s_price is not null");
            return (Criteria) this;
        }

        public Criteria andSPriceEqualTo(BigDecimal value) {
            addCriterion("s_price =", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotEqualTo(BigDecimal value) {
            addCriterion("s_price <>", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThan(BigDecimal value) {
            addCriterion("s_price >", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("s_price >=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThan(BigDecimal value) {
            addCriterion("s_price <", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("s_price <=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceIn(List<BigDecimal> values) {
            addCriterion("s_price in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotIn(List<BigDecimal> values) {
            addCriterion("s_price not in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_price between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_price not between", value1, value2, "sPrice");
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

        public Criteria andSNumberwIsNull() {
            addCriterion("s_numberw is null");
            return (Criteria) this;
        }

        public Criteria andSNumberwIsNotNull() {
            addCriterion("s_numberw is not null");
            return (Criteria) this;
        }

        public Criteria andSNumberwEqualTo(Long value) {
            addCriterion("s_numberw =", value, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwNotEqualTo(Long value) {
            addCriterion("s_numberw <>", value, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwGreaterThan(Long value) {
            addCriterion("s_numberw >", value, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwGreaterThanOrEqualTo(Long value) {
            addCriterion("s_numberw >=", value, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwLessThan(Long value) {
            addCriterion("s_numberw <", value, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwLessThanOrEqualTo(Long value) {
            addCriterion("s_numberw <=", value, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwIn(List<Long> values) {
            addCriterion("s_numberw in", values, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwNotIn(List<Long> values) {
            addCriterion("s_numberw not in", values, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwBetween(Long value1, Long value2) {
            addCriterion("s_numberw between", value1, value2, "sNumberw");
            return (Criteria) this;
        }

        public Criteria andSNumberwNotBetween(Long value1, Long value2) {
            addCriterion("s_numberw not between", value1, value2, "sNumberw");
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