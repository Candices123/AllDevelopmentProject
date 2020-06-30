package com.ghyy2.service;

import com.ghyy2.bean.Doctor;
import com.ghyy2.bean.DoctorExample;
import com.ghyy2.dao.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorMapper doctorMapper;

    public List<Doctor> findAll(){
        DoctorExample doctorExample = new DoctorExample();
        return doctorMapper.selectByExample(doctorExample);
    }


    @Override
    public Doctor selectByPrimaryKey(Integer doctorId){
        return doctorMapper.selectByPrimaryKey(doctorId);
    }

    @Override
    public void updateDoctorCount(Integer doctorId,Integer doctorCount){
        doctorMapper.updateDoctorCount(doctorId,doctorCount);
    }
}
