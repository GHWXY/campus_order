package com.campus.order.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantExample() {
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

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMPhotoIsNull() {
            addCriterion("m_photo is null");
            return (Criteria) this;
        }

        public Criteria andMPhotoIsNotNull() {
            addCriterion("m_photo is not null");
            return (Criteria) this;
        }

        public Criteria andMPhotoEqualTo(String value) {
            addCriterion("m_photo =", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoNotEqualTo(String value) {
            addCriterion("m_photo <>", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoGreaterThan(String value) {
            addCriterion("m_photo >", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("m_photo >=", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoLessThan(String value) {
            addCriterion("m_photo <", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoLessThanOrEqualTo(String value) {
            addCriterion("m_photo <=", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoLike(String value) {
            addCriterion("m_photo like", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoNotLike(String value) {
            addCriterion("m_photo not like", value, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoIn(List<String> values) {
            addCriterion("m_photo in", values, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoNotIn(List<String> values) {
            addCriterion("m_photo not in", values, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoBetween(String value1, String value2) {
            addCriterion("m_photo between", value1, value2, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMPhotoNotBetween(String value1, String value2) {
            addCriterion("m_photo not between", value1, value2, "mPhoto");
            return (Criteria) this;
        }

        public Criteria andMAddressIsNull() {
            addCriterion("m_address is null");
            return (Criteria) this;
        }

        public Criteria andMAddressIsNotNull() {
            addCriterion("m_address is not null");
            return (Criteria) this;
        }

        public Criteria andMAddressEqualTo(String value) {
            addCriterion("m_address =", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotEqualTo(String value) {
            addCriterion("m_address <>", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressGreaterThan(String value) {
            addCriterion("m_address >", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressGreaterThanOrEqualTo(String value) {
            addCriterion("m_address >=", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLessThan(String value) {
            addCriterion("m_address <", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLessThanOrEqualTo(String value) {
            addCriterion("m_address <=", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLike(String value) {
            addCriterion("m_address like", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotLike(String value) {
            addCriterion("m_address not like", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressIn(List<String> values) {
            addCriterion("m_address in", values, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotIn(List<String> values) {
            addCriterion("m_address not in", values, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressBetween(String value1, String value2) {
            addCriterion("m_address between", value1, value2, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotBetween(String value1, String value2) {
            addCriterion("m_address not between", value1, value2, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMPhoneIsNull() {
            addCriterion("m_phone is null");
            return (Criteria) this;
        }

        public Criteria andMPhoneIsNotNull() {
            addCriterion("m_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMPhoneEqualTo(Long value) {
            addCriterion("m_phone =", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotEqualTo(Long value) {
            addCriterion("m_phone <>", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneGreaterThan(Long value) {
            addCriterion("m_phone >", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("m_phone >=", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLessThan(Long value) {
            addCriterion("m_phone <", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLessThanOrEqualTo(Long value) {
            addCriterion("m_phone <=", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneIn(List<Long> values) {
            addCriterion("m_phone in", values, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotIn(List<Long> values) {
            addCriterion("m_phone not in", values, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneBetween(Long value1, Long value2) {
            addCriterion("m_phone between", value1, value2, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotBetween(Long value1, Long value2) {
            addCriterion("m_phone not between", value1, value2, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMSpecialIsNull() {
            addCriterion("m_special is null");
            return (Criteria) this;
        }

        public Criteria andMSpecialIsNotNull() {
            addCriterion("m_special is not null");
            return (Criteria) this;
        }

        public Criteria andMSpecialEqualTo(String value) {
            addCriterion("m_special =", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialNotEqualTo(String value) {
            addCriterion("m_special <>", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialGreaterThan(String value) {
            addCriterion("m_special >", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("m_special >=", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialLessThan(String value) {
            addCriterion("m_special <", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialLessThanOrEqualTo(String value) {
            addCriterion("m_special <=", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialLike(String value) {
            addCriterion("m_special like", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialNotLike(String value) {
            addCriterion("m_special not like", value, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialIn(List<String> values) {
            addCriterion("m_special in", values, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialNotIn(List<String> values) {
            addCriterion("m_special not in", values, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialBetween(String value1, String value2) {
            addCriterion("m_special between", value1, value2, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMSpecialNotBetween(String value1, String value2) {
            addCriterion("m_special not between", value1, value2, "mSpecial");
            return (Criteria) this;
        }

        public Criteria andMActiveIsNull() {
            addCriterion("m_active is null");
            return (Criteria) this;
        }

        public Criteria andMActiveIsNotNull() {
            addCriterion("m_active is not null");
            return (Criteria) this;
        }

        public Criteria andMActiveEqualTo(String value) {
            addCriterion("m_active =", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveNotEqualTo(String value) {
            addCriterion("m_active <>", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveGreaterThan(String value) {
            addCriterion("m_active >", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveGreaterThanOrEqualTo(String value) {
            addCriterion("m_active >=", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveLessThan(String value) {
            addCriterion("m_active <", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveLessThanOrEqualTo(String value) {
            addCriterion("m_active <=", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveLike(String value) {
            addCriterion("m_active like", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveNotLike(String value) {
            addCriterion("m_active not like", value, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveIn(List<String> values) {
            addCriterion("m_active in", values, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveNotIn(List<String> values) {
            addCriterion("m_active not in", values, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveBetween(String value1, String value2) {
            addCriterion("m_active between", value1, value2, "mActive");
            return (Criteria) this;
        }

        public Criteria andMActiveNotBetween(String value1, String value2) {
            addCriterion("m_active not between", value1, value2, "mActive");
            return (Criteria) this;
        }

        public Criteria andMDateIsNull() {
            addCriterion("m_date is null");
            return (Criteria) this;
        }

        public Criteria andMDateIsNotNull() {
            addCriterion("m_date is not null");
            return (Criteria) this;
        }

        public Criteria andMDateEqualTo(Date value) {
            addCriterion("m_date =", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotEqualTo(Date value) {
            addCriterion("m_date <>", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThan(Date value) {
            addCriterion("m_date >", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThanOrEqualTo(Date value) {
            addCriterion("m_date >=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThan(Date value) {
            addCriterion("m_date <", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThanOrEqualTo(Date value) {
            addCriterion("m_date <=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateIn(List<Date> values) {
            addCriterion("m_date in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotIn(List<Date> values) {
            addCriterion("m_date not in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateBetween(Date value1, Date value2) {
            addCriterion("m_date between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotBetween(Date value1, Date value2) {
            addCriterion("m_date not between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMPriceIsNull() {
            addCriterion("m_price is null");
            return (Criteria) this;
        }

        public Criteria andMPriceIsNotNull() {
            addCriterion("m_price is not null");
            return (Criteria) this;
        }

        public Criteria andMPriceEqualTo(BigDecimal value) {
            addCriterion("m_price =", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotEqualTo(BigDecimal value) {
            addCriterion("m_price <>", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceGreaterThan(BigDecimal value) {
            addCriterion("m_price >", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_price >=", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceLessThan(BigDecimal value) {
            addCriterion("m_price <", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_price <=", value, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceIn(List<BigDecimal> values) {
            addCriterion("m_price in", values, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotIn(List<BigDecimal> values) {
            addCriterion("m_price not in", values, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_price between", value1, value2, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_price not between", value1, value2, "mPrice");
            return (Criteria) this;
        }

        public Criteria andMPidIsNull() {
            addCriterion("m_pid is null");
            return (Criteria) this;
        }

        public Criteria andMPidIsNotNull() {
            addCriterion("m_pid is not null");
            return (Criteria) this;
        }

        public Criteria andMPidEqualTo(Long value) {
            addCriterion("m_pid =", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotEqualTo(Long value) {
            addCriterion("m_pid <>", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidGreaterThan(Long value) {
            addCriterion("m_pid >", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidGreaterThanOrEqualTo(Long value) {
            addCriterion("m_pid >=", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidLessThan(Long value) {
            addCriterion("m_pid <", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidLessThanOrEqualTo(Long value) {
            addCriterion("m_pid <=", value, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidIn(List<Long> values) {
            addCriterion("m_pid in", values, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotIn(List<Long> values) {
            addCriterion("m_pid not in", values, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidBetween(Long value1, Long value2) {
            addCriterion("m_pid between", value1, value2, "mPid");
            return (Criteria) this;
        }

        public Criteria andMPidNotBetween(Long value1, Long value2) {
            addCriterion("m_pid not between", value1, value2, "mPid");
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