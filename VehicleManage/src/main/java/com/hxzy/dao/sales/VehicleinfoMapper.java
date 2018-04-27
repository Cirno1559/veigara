package com.hxzy.dao.sales;

import com.hxzy.entity.sales.Vehicleinfo;
import com.hxzy.entity.sales.VehicleinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleinfoMapper {
    long countByExample(VehicleinfoExample example);

    int deleteByExample(VehicleinfoExample example);

    int deleteByPrimaryKey(Integer vehicleInforId);

    int insert(Vehicleinfo record);
    /**
     * 根据条件插入车辆信息
     * @param record
     * @return
     */
    int insertSelective(Vehicleinfo record);
    /**
     * 分页查询车辆信息
     * @param example
     * @return
     */
    List<Vehicleinfo> selectByExample(VehicleinfoExample example);

    Vehicleinfo selectByPrimaryKey(Integer vehicleInforId);

    int updateByExampleSelective(@Param("record") Vehicleinfo record, @Param("example") VehicleinfoExample example);

    int updateByExample(@Param("record") Vehicleinfo record, @Param("example") VehicleinfoExample example);
    /**
     * 根据主键修改车辆信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Vehicleinfo record);

    int updateByPrimaryKey(Vehicleinfo record);
    /**
     * 根据型号查询车辆信息
     * @param sellCarId
     * @return
     */
    Vehicleinfo selectByVersion(String vehicleInforVersion);
}