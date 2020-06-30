package com.ghyy2.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("orderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("userTel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("userTel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("userTel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("userTel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("userTel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("userTel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("userTel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("userTel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("userTel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("userTel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("userTel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("userTel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("userTel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("userTel not between", value1, value2, "userTel");
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

        public Criteria andDiseaseDescriptionIsNull() {
            addCriterion("diseaseDescription is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionIsNotNull() {
            addCriterion("diseaseDescription is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionEqualTo(String value) {
            addCriterion("diseaseDescription =", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotEqualTo(String value) {
            addCriterion("diseaseDescription <>", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionGreaterThan(String value) {
            addCriterion("diseaseDescription >", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("diseaseDescription >=", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionLessThan(String value) {
            addCriterion("diseaseDescription <", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionLessThanOrEqualTo(String value) {
            addCriterion("diseaseDescription <=", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionLike(String value) {
            addCriterion("diseaseDescription like", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotLike(String value) {
            addCriterion("diseaseDescription not like", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionIn(List<String> values) {
            addCriterion("diseaseDescription in", values, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotIn(List<String> values) {
            addCriterion("diseaseDescription not in", values, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionBetween(String value1, String value2) {
            addCriterion("diseaseDescription between", value1, value2, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotBetween(String value1, String value2) {
            addCriterion("diseaseDescription not between", value1, value2, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointmentTime is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointmentTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(Date value) {
            addCriterion("appointmentTime =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(Date value) {
            addCriterion("appointmentTime <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(Date value) {
            addCriterion("appointmentTime >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appointmentTime >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(Date value) {
            addCriterion("appointmentTime <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("appointmentTime <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<Date> values) {
            addCriterion("appointmentTime in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<Date> values) {
            addCriterion("appointmentTime not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(Date value1, Date value2) {
            addCriterion("appointmentTime between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("appointmentTime not between", value1, value2, "appointmentTime");
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

        public Criteria andTimeFlagEqualTo(Byte value) {
            addCriterion("timeFlag =", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagNotEqualTo(Byte value) {
            addCriterion("timeFlag <>", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagGreaterThan(Byte value) {
            addCriterion("timeFlag >", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("timeFlag >=", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagLessThan(Byte value) {
            addCriterion("timeFlag <", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagLessThanOrEqualTo(Byte value) {
            addCriterion("timeFlag <=", value, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagIn(List<Byte> values) {
            addCriterion("timeFlag in", values, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagNotIn(List<Byte> values) {
            addCriterion("timeFlag not in", values, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagBetween(Byte value1, Byte value2) {
            addCriterion("timeFlag between", value1, value2, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("timeFlag not between", value1, value2, "timeFlag");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("orderTime =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("orderTime <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("orderTime >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderTime >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("orderTime <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("orderTime <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("orderTime in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("orderTime not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("orderTime between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("orderTime not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andVisitingStateIsNull() {
            addCriterion("visitingState is null");
            return (Criteria) this;
        }

        public Criteria andVisitingStateIsNotNull() {
            addCriterion("visitingState is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingStateEqualTo(Byte value) {
            addCriterion("visitingState =", value, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateNotEqualTo(Byte value) {
            addCriterion("visitingState <>", value, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateGreaterThan(Byte value) {
            addCriterion("visitingState >", value, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("visitingState >=", value, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateLessThan(Byte value) {
            addCriterion("visitingState <", value, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateLessThanOrEqualTo(Byte value) {
            addCriterion("visitingState <=", value, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateIn(List<Byte> values) {
            addCriterion("visitingState in", values, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateNotIn(List<Byte> values) {
            addCriterion("visitingState not in", values, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateBetween(Byte value1, Byte value2) {
            addCriterion("visitingState between", value1, value2, "visitingState");
            return (Criteria) this;
        }

        public Criteria andVisitingStateNotBetween(Byte value1, Byte value2) {
            addCriterion("visitingState not between", value1, value2, "visitingState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateIsNull() {
            addCriterion("callNumberState is null");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateIsNotNull() {
            addCriterion("callNumberState is not null");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateEqualTo(String value) {
            addCriterion("callNumberState =", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateNotEqualTo(String value) {
            addCriterion("callNumberState <>", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateGreaterThan(String value) {
            addCriterion("callNumberState >", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateGreaterThanOrEqualTo(String value) {
            addCriterion("callNumberState >=", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateLessThan(String value) {
            addCriterion("callNumberState <", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateLessThanOrEqualTo(String value) {
            addCriterion("callNumberState <=", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateLike(String value) {
            addCriterion("callNumberState like", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateNotLike(String value) {
            addCriterion("callNumberState not like", value, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateIn(List<String> values) {
            addCriterion("callNumberState in", values, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateNotIn(List<String> values) {
            addCriterion("callNumberState not in", values, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateBetween(String value1, String value2) {
            addCriterion("callNumberState between", value1, value2, "callNumberState");
            return (Criteria) this;
        }

        public Criteria andCallNumberStateNotBetween(String value1, String value2) {
            addCriterion("callNumberState not between", value1, value2, "callNumberState");
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