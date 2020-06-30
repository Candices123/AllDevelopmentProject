package com.ghyy2.dao;

import com.ghyy2.bean.DoctorDuty;
import com.ghyy2.bean.DoctorDutyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DoctorDutyMapper {
    long countByExample(DoctorDutyExample example);

    int deleteByExample(DoctorDutyExample example);

    int deleteByPrimaryKey(Integer doctordutyid);

    int insert(DoctorDuty record);

    int insertSelective(DoctorDuty record);

    List<DoctorDuty> selectByExample(DoctorDutyExample example);

    DoctorDuty selectByPrimaryKey(Integer doctordutyid);

    int updateByExampleSelective(@Param("record") DoctorDuty record, @Param("example") DoctorDutyExample example);

    int updateByExample(@Param("record") DoctorDuty record, @Param("example") DoctorDutyExample example);

    int updateByPrimaryKeySelective(DoctorDuty record);

    int updateByPrimaryKey(DoctorDuty record);
}