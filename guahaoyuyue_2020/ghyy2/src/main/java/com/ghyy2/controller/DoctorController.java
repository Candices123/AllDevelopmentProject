package com.ghyy2.controller;

import com.ghyy2.bean.Doctor;
import com.ghyy2.bean.Msg;
import com.ghyy2.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    //获取医生信息表
    @RequestMapping(value = "/getDoctorListAll", method = RequestMethod.GET)
    public Msg findUser(){
        List<Doctor> list = doctorService.findAll();
        return Msg.success().add("doctorList",list);
    }
}
