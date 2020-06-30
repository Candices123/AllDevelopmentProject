package com.ghyy2.service;

import com.ghyy2.bean.Orderlist;

import java.util.List;

public interface OrderlistService {
     List<Orderlist> findAll();

     void insertOrderlist(Orderlist orderlist);

    void deleteByPrimaryKey(Integer orderid);

    //根据orderid获取订单
    Orderlist selectByPrimaryKey(Integer orderId);

    List<Orderlist> selectOrederListByUserTel(String userTel);
}
