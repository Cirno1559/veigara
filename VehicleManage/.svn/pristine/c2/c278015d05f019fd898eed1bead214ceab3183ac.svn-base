package com.hxzy.dao.workTime;

import com.hxzy.entity.workTime.Overtimetype;
import com.hxzy.entity.workTime.OvertimetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OvertimetypeMapper {
    long countByExample(OvertimetypeExample example);

    int deleteByExample(OvertimetypeExample example);

    int deleteByPrimaryKey(Integer overTimeTypeId);

    int insert(Overtimetype record);

    int insertSelective(Overtimetype record);

    List<Overtimetype> selectByExample(OvertimetypeExample example);

    Overtimetype selectByPrimaryKey(Integer overTimeTypeId);

    int updateByExampleSelective(@Param("record") Overtimetype record, @Param("example") OvertimetypeExample example);

    int updateByExample(@Param("record") Overtimetype record, @Param("example") OvertimetypeExample example);

    int updateByPrimaryKeySelective(Overtimetype record);

    int updateByPrimaryKey(Overtimetype record);
    
    List<Overtimetype> findAllOverTimeType();
    
}