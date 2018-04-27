package com.hxzy.dao.authority;

import com.hxzy.entity.authority.Rolemenu;
import com.hxzy.entity.authority.RolemenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolemenuMapper {
    long countByExample(RolemenuExample example);

    int deleteByExample(RolemenuExample example);

    int deleteByPrimaryKey(Integer rolemenuId);

    int insert(Rolemenu record);

    int insertSelective(Rolemenu record);

    List<Rolemenu> selectByExample(RolemenuExample example);

    Rolemenu selectByPrimaryKey(Integer rolemenuId);

    int updateByExampleSelective(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByExample(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByPrimaryKeySelective(Rolemenu record);

    int updateByPrimaryKey(Rolemenu record);
}