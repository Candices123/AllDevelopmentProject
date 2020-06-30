package com.ghyy2.bean;

import java.util.Date;

public class Orderlist {
    private Integer orderId;

    private String userTel;

    private String departmentName;

    private String doctorName;

    private String diseaseDescription;

    private Date appointmentTime;

    private Byte timeFlag;

    private Date orderTime;

    private Byte visitingState;

    private String callNumberState;

    private Integer doctorId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription == null ? null : diseaseDescription.trim();
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Byte getTimeFlag() {
        return timeFlag;
    }

    public void setTimeFlag(Byte timeFlag) {
        this.timeFlag = timeFlag;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Byte getVisitingState() {
        return visitingState;
    }

    public void setVisitingState(Byte visitingState) {
        this.visitingState = visitingState;
    }

    public String getCallNumberState() {
        return callNumberState;
    }

    public void setCallNumberState(String callNumberState) {
        this.callNumberState = callNumberState == null ? null : callNumberState.trim();
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
}