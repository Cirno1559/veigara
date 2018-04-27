package com.hxzy.biz.sales;

import java.util.Map;

import com.hxzy.entity.sales.Vehicleinfo;
import com.hxzy.util.PageUtil;

public interface VehicleinfoBiz {
	 /**
     * 分页查询车辆信息
     * @param example
     * @return
     */
    void selectByExample(PageUtil<Vehicleinfo>paging,Map<String,Object>map);
    /**
     * 根据条件插入车辆信息
     * @param record
     * @return
     */
    int insertSelective(Vehicleinfo record);
	 /**
     * 根据主键修改车辆信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Vehicleinfo record);
    /**
     * 根据主键删除车辆信息
     * @param record
     * @return
     */
    int deleteByPrimaryKey(Vehicleinfo record);

}

