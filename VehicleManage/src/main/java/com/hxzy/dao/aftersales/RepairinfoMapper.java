package com.hxzy.dao.aftersales;

import com.hxzy.entity.aftersales.Repairinfo;
import com.hxzy.entity.aftersales.RepairinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairinfoMapper {
    long countByExample(RepairinfoExample example);

    int deleteByExample(RepairinfoExample example);

    int deleteByPrimaryKey(Integer repairinfoId);

    int insert(Repairinfo record);

    int insertSelective(Repairinfo record);

    List<Repairinfo> selectByExample(RepairinfoExample example);

    Repairinfo selectByPrimaryKey(Integer repairinfoId);

    int updateByExampleSelective(@Param("record") Repairinfo record, @Param("example") RepairinfoExample example);

    int updateByExample(@Param("record") Repairinfo record, @Param("example") RepairinfoExample example);

    int updateByPrimaryKeySelective(Repairinfo record);

    int updateByPrimaryKey(Repairinfo record);
}