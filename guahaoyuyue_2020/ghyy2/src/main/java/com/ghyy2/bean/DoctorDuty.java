package com.ghyy2.bean;

import java.util.Date;

public class DoctorDuty {
    private Integer doctorDutyId;

    private Integer doctorId;

    private Date doctorDate;

    private Boolean timeFlag;

    public Integer getDoctorDutyId() {
        return doctorDutyId;
    }

    public void setDoctorDutyId(Integer doctorDutyId) {
        this.doctorDutyId = doctorDutyId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDoctorDate() {
        return doctorDate;
    }

    public void setDoctorDate(Date doctorDate) {
        this.doctorDate = doctorDate;
    }

    public Boolean getTimeFlag() {
        return timeFlag;
    }

    public void setTimeFlag(Boolean timeFlag) {
        this.timeFlag = timeFlag;
    }
}