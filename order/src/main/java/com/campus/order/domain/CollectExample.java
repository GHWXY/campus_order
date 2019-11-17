package com.campus.order.domain;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSPhotoIsNull() {
            addCriterion("s_photo is null");
            return (Criteria) this;
        }

        public Criteria andSPhotoIsNotNull() {
            addCriterion("s_photo is not null");
            return (Criteria) this;
        }

        public Criteria andSPhotoEqualTo(String value) {
            addCriterion("s_photo =", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotEqualTo(String value) {
            addCriterion("s_photo <>", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoGreaterThan(String value) {
            addCriterion("s_photo >", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("s_photo >=", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoLessThan(String value) {
            addCriterion("s_photo <", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoLessThanOrEqualTo(String value) {
            addCriterion("s_photo <=", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoLike(String value) {
            addCriterion("s_photo like", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotLike(String value) {
            addCriterion("s_photo not like", value, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoIn(List<String> values) {
            addCriterion("s_photo in", values, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotIn(List<String> values) {
            addCriterion("s_photo not in", values, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoBetween(String value1, String value2) {
            addCriterion("s_photo between", value1, value2, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSPhotoNotBetween(String value1, String value2) {
            addCriterion("s_photo not between", value1, value2, "sPhoto");
            return (Criteria) this;
        }

        public Criteria andSMidIsNull() {
            addCriterion("s_mid is null");
            return (Criteria) this;
        }

        public Criteria andSMidIsNotNull() {
            addCriterion("s_mid is not null");
            return (Criteria) this;
        }

        public Criteria andSMidEqualTo(Long value) {
            addCriterion("s_mid =", value, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidNotEqualTo(Long value) {
            addCriterion("s_mid <>", value, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidGreaterThan(Long value) {
            addCriterion("s_mid >", value, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidGreaterThanOrEqualTo(Long value) {
            addCriterion("s_mid >=", value, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidLessThan(Long value) {
            addCriterion("s_mid <", value, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidLessThanOrEqualTo(Long value) {
            addCriterion("s_mid <=", value, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidIn(List<Long> values) {
            addCriterion("s_mid in", values, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidNotIn(List<Long> values) {
            addCriterion("s_mid not in", values, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidBetween(Long value1, Long value2) {
            addCriterion("s_mid between", value1, value2, "sMid");
            return (Criteria) this;
        }

        public Criteria andSMidNotBetween(Long value1, Long value2) {
            addCriterion("s_mid not between", value1, value2, "sMid");
            return (Criteria) this;
        }

        public Criteria andSUidIsNull() {
            addCriterion("s_uid is null");
            return (Criteria) this;
        }

        public Criteria andSUidIsNotNull() {
            addCriterion("s_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSUidEqualTo(Long value) {
            addCriterion("s_uid =", value, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidNotEqualTo(Long value) {
            addCriterion("s_uid <>", value, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidGreaterThan(Long value) {
            addCriterion("s_uid >", value, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidGreaterThanOrEqualTo(Long value) {
            addCriterion("s_uid >=", value, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidLessThan(Long value) {
            addCriterion("s_uid <", value, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidLessThanOrEqualTo(Long value) {
            addCriterion("s_uid <=", value, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidIn(List<Long> values) {
            addCriterion("s_uid in", values, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidNotIn(List<Long> values) {
            addCriterion("s_uid not in", values, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidBetween(Long value1, Long value2) {
            addCriterion("s_uid between", value1, value2, "sUid");
            return (Criteria) this;
        }

        public Criteria andSUidNotBetween(Long value1, Long value2) {
            addCriterion("s_uid not between", value1, value2, "sUid");
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