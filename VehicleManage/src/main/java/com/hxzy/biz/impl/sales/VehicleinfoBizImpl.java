package com.hxzy.biz.impl.sales;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.sales.VehicleinfoBiz;
import com.hxzy.dao.sales.VehicleinfoMapper;
import com.hxzy.entity.sales.Vehicleinfo;
import com.hxzy.entity.sales.VehicleinfoExample;
import com.hxzy.entity.sales.VehicleinfoExample.Criteria;
import com.hxzy.util.PageUtil;
@Service
public class VehicleinfoBizImpl implements VehicleinfoBiz{
	@Resource
	VehicleinfoMapper vehicleinfoDao;
	@Override
	/**
	 * 	分页查询车辆信息
	 */
	public void selectByExample(PageUtil<Vehicleinfo> paging, Map<String, Object> map) {
		VehicleinfoExample example=	new VehicleinfoExample();
		example.setOffset(paging.getExclude());
		example.setLimit(paging.getPageSize());
		Criteria c1 = example.createCriteria();
		if(map!=null) {
			for (String key : map.keySet()) {
				if(key.equals("vehicleInforName")) {//模糊查询
					c1.andVehicleInforNameLike(map.get(key).toString());
				}
				if(key.equals("vehicleInforVersion")) {//模糊查询
					c1.andVehicleInforVersionLike(map.get(key).toString());
				}			
			}
		}
		c1.andVehicleInforStateEqualTo("1");
		example.setOrderByClause("vehicleInforPrice");//根据价格排序
		paging.setData(vehicleinfoDao.selectByExample(example));
		paging.setTotalCount((int)vehicleinfoDao.countByExample(example));
	}
	@Override
	/**
	 * 添加车辆信息
	 */
	public int insertSelective(Vehicleinfo record) {
		//现根据车辆型号查询车辆信息，有结果，改变状态，否则添加  （型号唯一）
		Vehicleinfo selectByVersion = vehicleinfoDao.selectByVersion(record.getVehicleInforVersion());
				if(selectByVersion!=null) {
					selectByVersion.setVehicleInforState("1");
					selectByVersion.setVehicleInforName(record.getVehicleInforName());
					selectByVersion.setVehicleInforVersion(record.getVehicleInforVersion());
					selectByVersion.setVehicleInforPrice(record.getVehicleInforPrice());
					selectByVersion.setVehicleInforImage(record.getVehicleInforImage());
					selectByVersion.setManufacturer(record.getManufacturer());
					return vehicleinfoDao.updateByPrimaryKeySelective(selectByVersion);
				}
				return vehicleinfoDao.insertSelective(record);
	}
	@Override
	/**
	 *  修改车辆信息
	 */
	public int updateByPrimaryKeySelective(Vehicleinfo record) {
		return vehicleinfoDao.updateByPrimaryKeySelective(record);
	}
	@Override
	/**
	 * 删除车辆信息
	 */
	public int deleteByPrimaryKey(Vehicleinfo record) {
		record.setVehicleInforState("0");
		return vehicleinfoDao.updateByPrimaryKeySelective(record);
	}

}
