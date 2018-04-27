package com.hxzy.controller.aftersales;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.aftersales.CarBizImpl;
import com.hxzy.entity.aftersales.Car;
import com.hxzy.util.PageUtil;

@Controller
@RequestMapping(value="aftersales/")
public class CarController {
	@Resource(name="carBizImpl")
	CarBizImpl carBiz;
	@RequestMapping(value="carQuery")
	public ModelAndView carQuery(ModelAndView m,Integer carId,String carVersion,Integer page){
		PageUtil<Car> paging = new PageUtil<Car>();
		Map<String, Object> map = new HashMap<String,Object>();
		if(carId != null){
			map.put("carId", carId);
			m.addObject("carId", carId);
		}
		if(carVersion != null){
			map.put("carVersion", carVersion);
			m.addObject("carVersion",carVersion);
		}
		if(page!=null) {
			paging.setCurrentPage(page);
		}
		carBiz.pagingQuery(paging, map);
		m.addObject("paging", paging);
		m.addObject("carVersion", carVersion);
		m.setViewName("carQuery");//aftersales/carQuery.jsp，展示查询数据
		return m;
	}
	
	/**
	 * 删除汽车信息，把state从1改变为0，不可显示
	 * @param car
	 * @return
	 */
	@RequestMapping(value="carRemove")
	@ResponseBody
	public int carRemove(Car car) {
		car.setCarState(0);//将状态改为0，不显示
		int result = 0;
		result = carBiz.updateByPrimaryKeySelective(car);
			return result;
		
	}
	@RequestMapping(value="carAdd")
	@ResponseBody
	public String carAdd(ModelAndView m,Car car) {
		car.setCarState(1);
		int result = carBiz.carAdd(car);
		return result > 0? "success":"fild";
	}
	@RequestMapping(value="carUpdate")
	@ResponseBody
	public String carUpdate(Car car){
		int result = 0;
		result = carBiz.updateByPrimaryKeySelective(car);
		if(result !=0){
			return "success";
		}else{
			return "fail";
		}
	}
	@RequestMapping(value="carUpdateByGet")
	public ModelAndView carUpdateByGet(ModelAndView m,Car car){
		m.addObject("carId", car.getCarId());
		m.addObject("carName", car.getCarName());
		m.addObject("carOdo", car.getCarOdo());
		m.addObject("carVersion", car.getCarVersion());
		m.setViewName("carUpdate");//aftersales/carUpdate.jsp
		return m;
	}
}
