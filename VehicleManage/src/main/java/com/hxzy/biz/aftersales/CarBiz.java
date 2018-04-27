package com.hxzy.biz.aftersales;

import java.util.Map;

import com.hxzy.entity.aftersales.Car;
import com.hxzy.util.PageUtil;

public interface CarBiz {
	
	/**
	 * 添加汽车信息
	 * @param car
	 * @return
	 */
	Integer carAdd(Car car);
	/**
	 * 分页查询汽车信息
	 * @param paging 分页工具类
	 * @param map 查询条件
	 * @return
	 */
	public void pagingQuery(PageUtil<Car> paging,Map<String,Object>map);
	
	/**
	 * 根据汽车牌照查询
	 * @param carId
	 * @return
	 */
	Car carIdQuaryAll(Integer carId);

	/**
	 * 删除汽车信息
	 * @param carId
	 * @return
	 */
	Integer carRemove(Car car);
	/**
	 * 根据汽车主键carId修过信息
	 * @param car
	 * @return
	 */
	public int updateByPrimaryKeySelective(Car car) ;
	
	
}
