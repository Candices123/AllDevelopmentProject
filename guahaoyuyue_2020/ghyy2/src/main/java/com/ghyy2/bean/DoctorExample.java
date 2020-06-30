package com.ghyy2.bean;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDoctorTitleIsNull() {
            addCriterion("doctorTitle is null");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleIsNotNull() {
            addCriterion("doctorTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleEqualTo(String value) {
            addCriterion("doctorTitle =", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotEqualTo(String value) {
            addCriterion("doctorTitle <>", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleGreaterThan(String value) {
            addCriterion("doctorTitle >", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleGreaterThanOrEqualTo(String value) {
            addCriterion("doctorTitle >=", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleLessThan(String value) {
            addCriterion("doctorTitle <", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleLessThanOrEqualTo(String value) {
            addCriterion("doctorTitle <=", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleLike(String value) {
            addCriterion("doctorTitle like", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotLike(String value) {
            addCriterion("doctorTitle not like", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleIn(List<String> values) {
            addCriterion("doctorTitle in", values, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotIn(List<String> values) {
            addCriterion("doctorTitle not in", values, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleBetween(String value1, String value2) {
            addCriterion("doctorTitle between", value1, value2, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotBetween(String value1, String value2) {
            addCriterion("doctorTitle not between", value1, value2, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctorName is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctorName is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctorName =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctorName <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctorName >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorName >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctorName <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctorName <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctorName like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctorName not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctorName in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctorName not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctorName between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctorName not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileIsNull() {
            addCriterion("doctorProfile is null");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileIsNotNull() {
            addCriterion("doctorProfile is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileEqualTo(String value) {
            addCriterion("doctorProfile =", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileNotEqualTo(String value) {
            addCriterion("doctorProfile <>", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileGreaterThan(String value) {
            addCriterion("doctorProfile >", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileGreaterThanOrEqualTo(String value) {
            addCriterion("doctorProfile >=", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileLessThan(String value) {
            addCriterion("doctorProfile <", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileLessThanOrEqualTo(String value) {
            addCriterion("doctorProfile <=", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileLike(String value) {
            addCriterion("doctorProfile like", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileNotLike(String value) {
            addCriterion("doctorProfile not like", value, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileIn(List<String> values) {
            addCriterion("doctorProfile in", values, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileNotIn(List<String> values) {
            addCriterion("doctorProfile not in", values, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileBetween(String value1, String value2) {
            addCriterion("doctorProfile between", value1, value2, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDoctorProfileNotBetween(String value1, String value2) {
            addCriterion("doctorProfile not between", value1, value2, "doctorProfile");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("departmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("departmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("departmentName =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("departmentName <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("departmentName >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentName >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("departmentName <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("departmentName <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("departmentName like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("departmentName not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("departmentName in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("departmentName not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("departmentName between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("departmentName not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDoctorCountIsNull() {
            addCriterion("doctorCount is null");
            return (Criteria) this;
        }

        public Criteria andDoctorCountIsNotNull() {
            addCriterion("doctorCount is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorCountEqualTo(Integer value) {
            addCriterion("doctorCount =", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountNotEqualTo(Integer value) {
            addCriterion("doctorCount <>", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountGreaterThan(Integer value) {
            addCriterion("doctorCount >", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorCount >=", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountLessThan(Integer value) {
            addCriterion("doctorCount <", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountLessThanOrEqualTo(Integer value) {
            addCriterion("doctorCount <=", value, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountIn(List<Integer> values) {
            addCriterion("doctorCount in", values, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountNotIn(List<Integer> values) {
            addCriterion("doctorCount not in", values, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountBetween(Integer value1, Integer value2) {
            addCriterion("doctorCount between", value1, value2, "doctorCount");
            return (Criteria) this;
        }

        public Criteria andDoctorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorCount not between", value1, value2, "doctorCount");
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