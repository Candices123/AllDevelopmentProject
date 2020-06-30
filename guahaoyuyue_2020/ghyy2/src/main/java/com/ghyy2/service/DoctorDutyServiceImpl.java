package com.ghyy2.service;

import com.ghyy2.bean.DoctorDuty;
import com.ghyy2.bean.DoctorDutyExample;

import com.ghyy2.dao.DoctorDutyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorDutyServiceImpl implements DoctorDutyService {

    @Autowired
    DoctorDutyMapper doctorDutyMapper;
    public List<DoctorDuty> findAll(){
        DoctorDutyExample doctorDutyExample = new DoctorDutyExample();
        return doctorDutyMapper.selectByExample(doctorDutyExample);
    }
}
