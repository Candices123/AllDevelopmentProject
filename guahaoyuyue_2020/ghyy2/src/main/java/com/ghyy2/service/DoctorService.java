package com.ghyy2.service;

import com.ghyy2.bean.Doctor;

import java.util.List;

public interface DoctorService {

    public List<Doctor> findAll();

    //根据Id 获取医生信息
    Doctor selectByPrimaryKey(Integer doctorid);

    //更新医生每日预约数量
    void updateDoctorCount(Integer doctorId,Integer doctorCount);
}
