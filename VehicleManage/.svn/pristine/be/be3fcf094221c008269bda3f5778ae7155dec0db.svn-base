package com.hxzy.dao.sales;

import com.hxzy.entity.sales.Manufacturer;
import com.hxzy.entity.sales.ManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturerMapper {
    long countByExample(ManufacturerExample example);

    int deleteByExample(ManufacturerExample example);

    int deleteByPrimaryKey(Integer manufacturerId);
    
    int insert(Manufacturer record);
    /**
    * 根据条件添加厂商信息
    * @param record
    * @return
    */
    int insertSelective(Manufacturer record);
    /**
     * 分页查询厂商信息
     * @param example
     * @return
     */
    List<Manufacturer> selectByExample(ManufacturerExample example);

    Manufacturer selectByPrimaryKey(Integer manufacturerId);

    int updateByExampleSelective(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByExample(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);
    /**
     * 根据条件修改厂商信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Manufacturer record);

    int updateByPrimaryKey(Manufacturer record);
    /**
     * 根据名称查询厂商，厂商名称唯一
     * @param factoryName
     * @return
     */
    Manufacturer selectByName(String ManufacturerName);
}