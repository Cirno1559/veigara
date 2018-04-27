package com.hxzy.controller.sales;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.sales.ManufacturerBizImpl;
import com.hxzy.entity.sales.Manufacturer;
import com.hxzy.util.PageUtil;

@Controller
@RequestMapping(value="sales/")
public class ManufacturerController {
	@Resource(name="manufacturerBizImpl")
	ManufacturerBizImpl manBiz;
	/**
	 * 发送查询厂商的数据
	 * @param m
	 * @return
	 */
	@RequestMapping(value="manufacturerQuery")//sales/manufacturerQuery.do
	public ModelAndView manufacturerQuery(ModelAndView m,String manufacturerName,Integer page) {
		PageUtil<Manufacturer> paging = new PageUtil<>();
		Map<String, Object> map = new HashMap<String, Object>();
		if(manufacturerName!=null) {//厂商名称
			map.put("manufacturerName", "%"+manufacturerName+"%");
			m.addObject("manufacturerName", manufacturerName);
		}
		if(page!=null) {
			paging.setCurrentPage(page);
		}
		manBiz.pagingQuery(paging, map);
		m.addObject("paging", paging);
		m.setViewName("manufacturerQuery");//sales/manufacturerquery.jsp，展示查询数据
		return m;
		
	}
	/**
	 * 删除厂商信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="manufacturerDelete")//sales/factoryDelete.do
	@ResponseBody
	public String manufacturerDelete(Manufacturer record) {
		//record里需要一个主键
		record.setManufacturerState("0");//将状态改为0，不显示
		int result = manBiz.updateByPrimaryKeySelective(record);
		return result>0?"success":"fail";
		
	}
	/**
	 * 根据主键修改厂商信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="manufacturerUpdate")
	@ResponseBody
	public String manufacturerUpdate(ModelAndView m,Manufacturer record) {		
		//record 需要id,名称，地址和备注参数
		int result = manBiz.updateByPrimaryKeySelective(record);
		return result>0?"success":"fail";
		
	}
	/**
	 * 添加厂商信息，ajax
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="manufacturerAdd")
	@ResponseBody
	public String manufacturerAdd(Manufacturer record) {
		record.setManufacturerState("1");
		int insertSelective = manBiz.insertSelective(record);
		if(insertSelective>0) {
			//m.setViewName("redirect:manufacturerQuery.do");
			return "success";
		}
		//m.setViewName("manufacturerAdd");//sales/manufacturerAdd.jsp
		return "fail";
	}
	/**
	 * 根据名称和状态查询厂商信息
	 * @param manufacturerName
	 * @return
	 */
	@RequestMapping(value="manufacturerQueryByName")
	@ResponseBody
	public String manufacturerAdd(String manufacturerName) {
		Manufacturer selectByName = manBiz.selectByName(manufacturerName);		
		return selectByName!=null?"success":"fail";
		
	}
	/**
	 * 发送修改数据
	 * @param m
	 * @param manufacturer
	 * @return
	 */
	@RequestMapping(value="manufacturerUpdateByget")
	@ResponseBody
	public ModelAndView manufacturerUpdateByget(ModelAndView m,Manufacturer manufacturer ) {						
		m.addObject("manufacturerId", manufacturer.getManufacturerId());
		m.addObject("manufacturerName", manufacturer.getManufacturerName());
		m.addObject("manufacturerAddress", manufacturer.getManufacturerAddress());
		m.addObject("manufacturerContent", manufacturer.getManufacturerContent());
		m.setViewName("manufacturerUpdate");//sales/manufacturerUpdate.jsp
		return m;
	}
}
