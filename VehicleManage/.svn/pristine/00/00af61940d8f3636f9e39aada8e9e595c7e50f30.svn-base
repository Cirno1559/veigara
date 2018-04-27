package com.hxzy.dao.workTime;

import com.hxzy.entity.workTime.Travel;
import com.hxzy.entity.workTime.TravelExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TravelMapper {
    long countByExample(TravelExample example);

    int deleteByExample(TravelExample example);

    int deleteByPrimaryKey(Integer travelId);

    int insert(Travel record);

    int insertSelective(Travel record);

    List<Travel> selectByExample(TravelExample example);

    Travel selectByPrimaryKey(Integer travelId);

    int updateByExampleSelective(@Param("record") Travel record, @Param("example") TravelExample example);

    int updateByExample(@Param("record") Travel record, @Param("example") TravelExample example);

    int updateByPrimaryKeySelective(Travel record);

    int updateByPrimaryKey(Travel record);
    
    List<Travel> findTravelRoleList(@Param("adminId") Integer adminId,@Param("offset") Integer offset);
    
    Integer findTravelRoleCount(@Param("adminId") Integer adminId);
    
    List<Integer> findAllAdminId();
}