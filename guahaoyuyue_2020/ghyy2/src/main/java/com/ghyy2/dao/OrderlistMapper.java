package com.ghyy2.dao;

import com.ghyy2.bean.Orderlist;
import com.ghyy2.bean.OrderlistExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OrderlistMapper {
    long countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    void deleteByPrimaryKey(Integer orderId);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExample(OrderlistExample example);

    //根据预约订单主键获取订单信息
    Orderlist selectByPrimaryKey(Integer orderId);

    //根据手机号获取所有的订单信息
    List<Orderlist> selectOrederListByUserTel(String userTel);

    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByPrimaryKeySelective(Orderlist record);

    int updateByPrimaryKey(Orderlist record);
}