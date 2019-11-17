package com.campus.order.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Long value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Long value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Long value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Long value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Long value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Long> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Long> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Long value1, Long value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Long value1, Long value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPPriceIsNull() {
            addCriterion("p_price is null");
            return (Criteria) this;
        }

        public Criteria andPPriceIsNotNull() {
            addCriterion("p_price is not null");
            return (Criteria) this;
        }

        public Criteria andPPriceEqualTo(Double value) {
            addCriterion("p_price =", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotEqualTo(Double value) {
            addCriterion("p_price <>", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceGreaterThan(Double value) {
            addCriterion("p_price >", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("p_price >=", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceLessThan(Double value) {
            addCriterion("p_price <", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceLessThanOrEqualTo(Double value) {
            addCriterion("p_price <=", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceIn(List<Double> values) {
            addCriterion("p_price in", values, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotIn(List<Double> values) {
            addCriterion("p_price not in", values, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceBetween(Double value1, Double value2) {
            addCriterion("p_price between", value1, value2, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotBetween(Double value1, Double value2) {
            addCriterion("p_price not between", value1, value2, "pPrice");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Long value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Long value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Long value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Long value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Long value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Long value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Long> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Long> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Long value1, Long value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Long value1, Long value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andPPiconIsNull() {
            addCriterion("p_picon is null");
            return (Criteria) this;
        }

        public Criteria andPPiconIsNotNull() {
            addCriterion("p_picon is not null");
            return (Criteria) this;
        }

        public Criteria andPPiconEqualTo(String value) {
            addCriterion("p_picon =", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconNotEqualTo(String value) {
            addCriterion("p_picon <>", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconGreaterThan(String value) {
            addCriterion("p_picon >", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconGreaterThanOrEqualTo(String value) {
            addCriterion("p_picon >=", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconLessThan(String value) {
            addCriterion("p_picon <", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconLessThanOrEqualTo(String value) {
            addCriterion("p_picon <=", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconLike(String value) {
            addCriterion("p_picon like", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconNotLike(String value) {
            addCriterion("p_picon not like", value, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconIn(List<String> values) {
            addCriterion("p_picon in", values, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconNotIn(List<String> values) {
            addCriterion("p_picon not in", values, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconBetween(String value1, String value2) {
            addCriterion("p_picon between", value1, value2, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPiconNotBetween(String value1, String value2) {
            addCriterion("p_picon not between", value1, value2, "pPicon");
            return (Criteria) this;
        }

        public Criteria andPPromotionIsNull() {
            addCriterion("p_promotion is null");
            return (Criteria) this;
        }

        public Criteria andPPromotionIsNotNull() {
            addCriterion("p_promotion is not null");
            return (Criteria) this;
        }

        public Criteria andPPromotionEqualTo(Double value) {
            addCriterion("p_promotion =", value, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionNotEqualTo(Double value) {
            addCriterion("p_promotion <>", value, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionGreaterThan(Double value) {
            addCriterion("p_promotion >", value, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionGreaterThanOrEqualTo(Double value) {
            addCriterion("p_promotion >=", value, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionLessThan(Double value) {
            addCriterion("p_promotion <", value, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionLessThanOrEqualTo(Double value) {
            addCriterion("p_promotion <=", value, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionIn(List<Double> values) {
            addCriterion("p_promotion in", values, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionNotIn(List<Double> values) {
            addCriterion("p_promotion not in", values, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionBetween(Double value1, Double value2) {
            addCriterion("p_promotion between", value1, value2, "pPromotion");
            return (Criteria) this;
        }

        public Criteria andPPromotionNotBetween(Double value1, Double value2) {
            addCriterion("p_promotion not between", value1, value2, "pPromotion");
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