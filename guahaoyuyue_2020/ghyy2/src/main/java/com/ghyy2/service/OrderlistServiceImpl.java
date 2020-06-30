package com.ghyy2.service;

import com.ghyy2.bean.Orderlist;
import com.ghyy2.bean.OrderlistExample;
import com.ghyy2.dao.OrderlistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderlistServiceImpl implements OrderlistService {
    @Autowired
    OrderlistMapper orderlistMapper;

    public List<Orderlist> findAll() {
        OrderlistExample orderlistExample = new OrderlistExample();
        return orderlistMapper.selectByExample(orderlistExample);
    }

    @Override
    public void insertOrderlist(Orderlist orderlist){
//        orderlistMapper.insert(orderlist);
        orderlistMapper.insertSelective(orderlist);
    }

    @Override
    public void deleteByPrimaryKey(Integer orderId) {
        orderlistMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public Orderlist selectByPrimaryKey(Integer orderId){
        return orderlistMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public List<Orderlist> selectOrederListByUserTel(String userTel){
        return orderlistMapper.selectOrederListByUserTel(userTel);
    }
}
