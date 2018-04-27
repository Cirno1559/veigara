package com.hxzy.biz.aftersales;

import java.util.Map;

import com.hxzy.entity.aftersales.Car;
import com.hxzy.entity.aftersales.Repairinfo;
import com.hxzy.util.PageUtil;

public interface RepairinfoBiz {
	/**
	 * 添加维修列表
	 * @return
	 */
	Integer repirinfoAdd(Repairinfo repairinfo);
	/**
	 * 分页查询
	 * @param paging
	 * @param map
	 */
	public void pagingQuery(PageUtil<Repairinfo> paging,Map<String,Object> map);
	
	/**
	 * 根据汽车牌照查询
	 * @param carId
	 * @return
	 */
	Car carIdQuary(Repairinfo repairinfo);
	/**
	 * 删除汽车信息
	 * @param carId
	 * @return
	 */
	Integer repairinfoRemove(Repairinfo repairinfo);
	/**
	 * 根据主键修改
	 * @param repairinfo
	 * @return
	 */
	public int updateByPrimaryKeySelective(Repairinfo repairinfo);
	
}
