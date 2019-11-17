package com.campus.order.domain;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCpiconIsNull() {
            addCriterion("cpicon is null");
            return (Criteria) this;
        }

        public Criteria andCpiconIsNotNull() {
            addCriterion("cpicon is not null");
            return (Criteria) this;
        }

        public Criteria andCpiconEqualTo(String value) {
            addCriterion("cpicon =", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconNotEqualTo(String value) {
            addCriterion("cpicon <>", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconGreaterThan(String value) {
            addCriterion("cpicon >", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconGreaterThanOrEqualTo(String value) {
            addCriterion("cpicon >=", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconLessThan(String value) {
            addCriterion("cpicon <", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconLessThanOrEqualTo(String value) {
            addCriterion("cpicon <=", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconLike(String value) {
            addCriterion("cpicon like", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconNotLike(String value) {
            addCriterion("cpicon not like", value, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconIn(List<String> values) {
            addCriterion("cpicon in", values, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconNotIn(List<String> values) {
            addCriterion("cpicon not in", values, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconBetween(String value1, String value2) {
            addCriterion("cpicon between", value1, value2, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpiconNotBetween(String value1, String value2) {
            addCriterion("cpicon not between", value1, value2, "cpicon");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNull() {
            addCriterion("cprice is null");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNotNull() {
            addCriterion("cprice is not null");
            return (Criteria) this;
        }

        public Criteria andCpriceEqualTo(Double value) {
            addCriterion("cprice =", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotEqualTo(Double value) {
            addCriterion("cprice <>", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThan(Double value) {
            addCriterion("cprice >", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cprice >=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThan(Double value) {
            addCriterion("cprice <", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThanOrEqualTo(Double value) {
            addCriterion("cprice <=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceIn(List<Double> values) {
            addCriterion("cprice in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotIn(List<Double> values) {
            addCriterion("cprice not in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceBetween(Double value1, Double value2) {
            addCriterion("cprice between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotBetween(Double value1, Double value2) {
            addCriterion("cprice not between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNull() {
            addCriterion("cnumber is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("cnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(Long value) {
            addCriterion("cnumber =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(Long value) {
            addCriterion("cnumber <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(Long value) {
            addCriterion("cnumber >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("cnumber >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(Long value) {
            addCriterion("cnumber <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(Long value) {
            addCriterion("cnumber <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<Long> values) {
            addCriterion("cnumber in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<Long> values) {
            addCriterion("cnumber not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(Long value1, Long value2) {
            addCriterion("cnumber between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(Long value1, Long value2) {
            addCriterion("cnumber not between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCupriceIsNull() {
            addCriterion("cuprice is null");
            return (Criteria) this;
        }

        public Criteria andCupriceIsNotNull() {
            addCriterion("cuprice is not null");
            return (Criteria) this;
        }

        public Criteria andCupriceEqualTo(Double value) {
            addCriterion("cuprice =", value, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceNotEqualTo(Double value) {
            addCriterion("cuprice <>", value, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceGreaterThan(Double value) {
            addCriterion("cuprice >", value, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cuprice >=", value, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceLessThan(Double value) {
            addCriterion("cuprice <", value, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceLessThanOrEqualTo(Double value) {
            addCriterion("cuprice <=", value, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceIn(List<Double> values) {
            addCriterion("cuprice in", values, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceNotIn(List<Double> values) {
            addCriterion("cuprice not in", values, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceBetween(Double value1, Double value2) {
            addCriterion("cuprice between", value1, value2, "cuprice");
            return (Criteria) this;
        }

        public Criteria andCupriceNotBetween(Double value1, Double value2) {
            addCriterion("cuprice not between", value1, value2, "cuprice");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andCinfoIsNull() {
            addCriterion("cinfo is null");
            return (Criteria) this;
        }

        public Criteria andCinfoIsNotNull() {
            addCriterion("cinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCinfoEqualTo(String value) {
            addCriterion("cinfo =", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotEqualTo(String value) {
            addCriterion("cinfo <>", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoGreaterThan(String value) {
            addCriterion("cinfo >", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoGreaterThanOrEqualTo(String value) {
            addCriterion("cinfo >=", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoLessThan(String value) {
            addCriterion("cinfo <", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoLessThanOrEqualTo(String value) {
            addCriterion("cinfo <=", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoLike(String value) {
            addCriterion("cinfo like", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotLike(String value) {
            addCriterion("cinfo not like", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoIn(List<String> values) {
            addCriterion("cinfo in", values, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotIn(List<String> values) {
            addCriterion("cinfo not in", values, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoBetween(String value1, String value2) {
            addCriterion("cinfo between", value1, value2, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotBetween(String value1, String value2) {
            addCriterion("cinfo not between", value1, value2, "cinfo");
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

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
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