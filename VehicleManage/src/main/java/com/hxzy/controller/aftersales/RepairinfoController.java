package com.hxzy.controller.aftersales;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.aftersales.RepairinfoBizImpl;
import com.hxzy.entity.aftersales.Repairinfo;
import com.hxzy.util.PageUtil;

@Controller
@RequestMapping(value="aftersales")
public class RepairinfoController {
@Resource(name="repairinfoBizImpl")
RepairinfoBizImpl repairinfoBizImpl;
@RequestMapping(value="repairinfoQuery")
public ModelAndView repairinfoQuery(ModelAndView m,Integer page,Repairinfo repairinfo){
	PageUtil<Repairinfo> paging = new PageUtil<>();
	Map<String, Object> map = new HashMap<String,Object>();
	if(repairinfo.getCarId() != null){
		map.put("carId", repairinfo.getCarId());
		m.addObject("carId", repairinfo.getCarId());
	}
	if(repairinfo.getAdminId() != null){
		map.put("adminId",repairinfo.getAdminId());
		m.addObject("adminId", repairinfo.getAdminId());
	}
	if(page != null){
		paging.setCurrentPage(page);
	}
	repairinfoBizImpl.pagingQuery(paging, map);
	m.addObject("paging", paging);
	m.setViewName("repairinfoQuery");//aftersales/repairinfoQuery.jsp
	return m;
}
@RequestMapping(value="repairinfoRemove")
@ResponseBody
public String repairinfoRemove(Repairinfo repairinfo){
	repairinfo.setState(0);
	return repairinfoBizImpl.repairinfoRemove(repairinfo)>0?"success":"fild";
}
@RequestMapping(value="repairinfoAdd")
@ResponseBody
public String repairinfoAdd(Repairinfo repairinfo){
	repairinfo.setState(1);
	int result = repairinfoBizImpl.repirinfoAdd(repairinfo);
	return result > 0? "success":"fild";
}

@RequestMapping(value="repairinfoUpdate")
@ResponseBody
public String repairinfoUpdate(Repairinfo repairinfo){
	int result = 0;
	result = repairinfoBizImpl.updateByPrimaryKeySelective(repairinfo);
	if(result !=0){
		return "success";
	}else{
		return "fail";
	}
}
@RequestMapping(value="repairinfoUpdateByGet")
public ModelAndView customerUpdateByGet(ModelAndView m,Repairinfo repairinfo){
	m.addObject("repairinfoId", repairinfo.getRepairinfoId());
	m.addObject("repairinfoOda", repairinfo.getRepairinfoOda());
	m.addObject("repairinfoRaccount", repairinfo.getRepairinfoRaccount());
	m.addObject("repairinfoTime", repairinfo.getRepairinfoTime());
	m.addObject("carId", repairinfo.getCarId());
	m.addObject("adminId", repairinfo.getAdminId());
	m.setViewName("repairinfoUpdate");//aftersales/customerUpdate.jsp
	return m;
}
}
