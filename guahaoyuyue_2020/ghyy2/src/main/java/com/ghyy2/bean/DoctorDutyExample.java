package com.ghyy2.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorDutyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorDutyExample() {
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

        public Criteria andDoctorDutyIdIsNull() {
            addCriterion("doctorDutyId is null");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdIsNotNull() {
            addCriterion("doctorDutyId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdEqualTo(Integer value) {
            addCriterion("doctorDutyId =", value, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdNotEqualTo(Integer value) {
            addCriterion("doctorDutyId <>", value, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdGreaterThan(Integer value) {
            addCriterion("doctorDutyId >", value, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorDutyId >=", value, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdLessThan(Integer value) {
            addCriterion("doctorDutyId <", value, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctorDutyId <=", value, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdIn(List<Integer> values) {
            addCriterion("doctorDutyId in", values, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdNotIn(List<Integer> values) {
            addCriterion("doctorDutyId not in", values, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdBetween(Integer value1, Integer value2) {
            addCriterion("doctorDutyId between", value1, value2, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorDutyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorDutyId not between", value1, value2, "doctorDutyId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctorId =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctorId <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctorId >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorId >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctorId <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctorId <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctorId in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctorId not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctorId between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorId not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorDateIsNull() {
            addCriterion("doctorDate is null");
            return (Criteria) this;
        }

        public Criteria andDoctorDateIsNotNull() {
            addCriterion("doctorDate is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorDateEqualTo(Date value) {
            addCriterion("doctorDate =", value, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateNotEqualTo(Date value) {
            addCriterion("doctorDate <>", value, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateGreaterThan(Date value) {
            addCriterion("doctorDate >", value, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateGreaterThanOrEqualTo(Date value) {
            addCriterion("doctorDate >=", value, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateLessThan(Date value) {
            addCriterion("doctorDate <", value, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateLessThanOrEqualTo(Date value) {
            addCriterion("doctorDate <=", value, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateIn(List<Date> values) {
            addCriterion("doctorDate in", values, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateNotIn(List<Date> values) {
            addCriterion("doctorDate not in", values, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateBetween(Date value1, Date value2) {
            addCriterion("doctorDate between", value1, value2, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andDoctorDateNotBetween(Date value1, Date value2) {
            addCriterion("doctorDate not between", value1, value2, "doctorDate");
            return (Criteria) this;
        }

        public Criteria andTimeFlagIsNull() {
            addCriterion("timeFlag is null");
            return (Criteria) this;
        }

        public Criteria andTimeFlagIsNotNull() {
            addCriterion("timeFlag is not null");
            return (Criteria) this;
        }

        public Criteria andTimeFlagEqualTo(Boolean value) {
            addCriterion("timeFlag =", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagNotEqualTo(Boolean value) {
            addCriterion("timeFlag <>", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagGreaterThan(Boolean value) {
            addCriterion("timeFlag >", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("timeFlag >=", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagLessThan(Boolean value) {
            addCriterion("timeFlag <", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("timeFlag <=", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagIn(List<Boolean> values) {
            addCriterion("timeFlag in", values, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagNotIn(List<Boolean> values) {
            addCriterion("timeFlag not in", values, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("timeFlag between", value1, value2, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("timeFlag not between", value1, value2, "timeFlag");
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