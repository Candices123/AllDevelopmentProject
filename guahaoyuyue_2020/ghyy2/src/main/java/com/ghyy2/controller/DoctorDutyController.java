package com.ghyy2.controller;

import com.ghyy2.bean.DoctorDuty;
import com.ghyy2.bean.Msg;
import com.ghyy2.service.DoctorDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorDutyController {

    @Autowired
    DoctorDutyService doctorDutyService;

    //获取医生值班表所有信息
    @RequestMapping(value = "/getDoctorDutyListAll", method = RequestMethod.GET)
    public Msg findDoctorDuty(){
        List<DoctorDuty> list = doctorDutyService.findAll();
        return Msg.success().add("doctorDutyList",list);
    }
}
