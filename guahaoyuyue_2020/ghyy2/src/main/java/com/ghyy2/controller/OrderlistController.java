package com.ghyy2.controller;


import com.ghyy2.bean.Msg;
import com.ghyy2.bean.Orderlist;
import com.ghyy2.service.DoctorService;
import com.ghyy2.service.OrderlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderlistController {
    @Autowired
    OrderlistService orderlistService;

    @Autowired
    DoctorService doctorService;

    //获取预约记录
    @RequestMapping(value = "/getOrderlist",method = RequestMethod.POST)
    public Msg getOrderList(String userTel){
       List<Orderlist> list = orderlistService.selectOrederListByUserTel(userTel);
        return Msg.success().add("orderlist",list);
    }

    //添加预约
    @RequestMapping(value = "/insertOrderlist",method = RequestMethod.POST)
    public boolean insertOrderlist(@RequestBody Orderlist orderlist){
//         System.out.println(orderlist.getDoctorId());
        //获取医生每日就诊数量doctorCount，并加1
        if(orderlist!=null){
            Integer doctorCount= doctorService.selectByPrimaryKey(orderlist.getDoctorId()).getDoctorCount();
           if(doctorCount!=null){
               doctorCount = doctorCount - 1;

               //更新医生就诊数量
               doctorService.updateDoctorCount(orderlist.getDoctorId(),doctorCount);

               //插入预约记录
               orderlistService.insertOrderlist(orderlist);
               return true;
           }
        }
        return false;

    }



    //取消预约
    @RequestMapping(value = "/deleteOrderlist",method = RequestMethod.POST)
    public String deleteOrderlist(@RequestBody Integer orderId){
        System.out.println(orderId);
        //获取医生doctorId
        Integer doctorId = orderlistService.selectByPrimaryKey(orderId).getDoctorId();

        //获取医生每日就诊数量doctorCount，并加1
        Integer doctorCount= doctorService.selectByPrimaryKey(doctorId).getDoctorCount();
        doctorCount = doctorCount + 1;

        //更新医生就诊数量
        doctorService.updateDoctorCount(doctorId,doctorCount);

        //根据预约订单id号删除订单记录
        orderlistService.deleteByPrimaryKey(orderId);
        return "success";
    }

}
