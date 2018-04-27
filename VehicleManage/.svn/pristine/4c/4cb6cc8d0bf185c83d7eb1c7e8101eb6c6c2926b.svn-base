package com.hxzy.controller.sales;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.sales.ManufacturerBizImpl;
import com.hxzy.biz.impl.sales.VehicleinfoBizImpl;
import com.hxzy.entity.sales.Manufacturer;
import com.hxzy.entity.sales.Vehicleinfo;
import com.hxzy.util.PageUtil;

@Controller
@RequestMapping(value="sales/")
public class VehicleinfoController {
	@Resource(name="vehicleinfoBizImpl")
	VehicleinfoBizImpl vehiBiz;
	/**
	 * 发送查询厂商的数据
	 * @param m
	 * @return
	 */
	@RequestMapping(value="VehicleinfoQuery")//sales/VehicleinfoQuery.do
	public ModelAndView SellcarQuery(ModelAndView m,String vehicleInforVersion,String vehicleInforName) {
		PageUtil<Vehicleinfo> paging = new PageUtil<>();
		Map<String, Object> map = new HashMap<String, Object>();
		if(vehicleInforVersion!=null) {//厂商名称
			map.put("vehicleInforVersion", "%"+vehicleInforVersion+"%");
		}
		if(vehicleInforName!=null) {//厂商地址
			map.put("vehicleInforName","%"+ vehicleInforName+"%");
		}
		vehiBiz.selectByExample(paging, map);
		m.addObject("paging", paging);
		m.setViewName("VehicleinfoQuery");//sales/sellCarQuery.jsp，展示查询数据
		return m;		
	}
	/**
	 * 根据主键修改车辆信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="VehicleinfoUpdate")
	public ModelAndView factoryUpdate(ModelAndView m,Vehicleinfo record) {
		//record 需要id,名称，地址和备注参数
		int result = vehiBiz.updateByPrimaryKeySelective(record);
		if(result>0) {
			m.setViewName("redirect:VehicleinfoQuery");
			return m;
		}
		m.setViewName("VehicleinfoUpdate");//sales/update.jsp
		return m;
		
	}
	/**
	 * 添加车辆信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="vehicleinfoAdd")//sales/vehicleinfoAdd.do
	public ModelAndView manufacturerAdd(ModelAndView m,Vehicleinfo record) {
		int insertSelective = vehiBiz.insertSelective(record);
		if(insertSelective>0) {
			m.setViewName("redirect:VehicleinfoQuery");
			return m;
		}
		m.setViewName("vehicleinfoAdd");//sales/manufacturerAdd.jsp
		return m;
	}
	/**
	 * 删除厂商信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="vehicleinfoDelete")//sales/factoryDelete.do
	public ModelAndView vehicleinfoDelete(ModelAndView m,Vehicleinfo record) {
		//record里需要一个主键
		record.setVehicleInforState("0");//将状态改为0，不显示
		int result = vehiBiz.updateByPrimaryKeySelective(record);
		if(result>0) {
			m.setViewName("redirect:VehicleinfoQuery");
			return m;
		}
		m.setViewName("vehicleinfoDelete");//sales/factoryDelete.jsp
		return m;
		
	}
}
