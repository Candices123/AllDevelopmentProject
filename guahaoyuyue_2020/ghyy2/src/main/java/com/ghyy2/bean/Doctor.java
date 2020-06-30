package com.ghyy2.bean;

public class Doctor {
    private Integer doctorId;

    private String doctorTitle;

    private String doctorName;

    private String doctorProfile;

    private String departmentName;

    private Integer doctorCount;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorTitle() {
        return doctorTitle;
    }

    public void setDoctorTitle(String doctorTitle) {
        this.doctorTitle = doctorTitle == null ? null : doctorTitle.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getDoctorProfile() {
        return doctorProfile;
    }

    public void setDoctorProfile(String doctorProfile) {
        this.doctorProfile = doctorProfile == null ? null : doctorProfile.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(Integer doctorCount) {
        this.doctorCount = doctorCount;
    }
}