package com.hxzy.controller.aftersales;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.aftersales.CustomerBizImpl;
import com.hxzy.entity.aftersales.Customer;
import com.hxzy.util.PageUtil;

@Controller
@RequestMapping(value="aftersales/")
public class CustomerController {

	@Resource(name="customerBizImpl")
	CustomerBizImpl customerBiz;
	@RequestMapping(value="customerQuery")
	public ModelAndView customerQuery(ModelAndView m,Integer customerId,Integer page,String customerNo){
		PageUtil<Customer> paging = new PageUtil<>();
		Map<String, Object> map = new HashMap<String,Object>();
		if(customerId != null){
			map.put("customerId", customerId);
			m.addObject("customerId", customerId);
		}
		if(customerNo != null&&customerNo.length()>0){
			map.put("customerNo", customerNo);
			m.addObject("customerNo", customerNo);
		}
		if(page != null){
			paging.setCurrentPage(page);
		}
		customerBiz.pagingQuery(paging, map);
		m.addObject("paging", paging);
		m.setViewName("customerQuery");//aftersales/customerQuery.jsp
		return m;
	}
	@RequestMapping(value="customerRemove")
	@ResponseBody
	public String customerRemove(Customer customer){
		customer.setCustomerState(0);
		return customerBiz.customerRemove(customer)>0?"success":"fild";
	}
	@RequestMapping(value="customerAdd")
	@ResponseBody
	public String customerAdd(Customer customer){
		customer.setCustomerState(1);
		int result = customerBiz.customerAdd(customer);
		return result > 0? "success":"fild";
	}
	@RequestMapping(value="customerUpdate")
	@ResponseBody
	public String customerUpdate(Customer customer){
		int result = 0;
		result = customerBiz.customerUpdate(customer);
		if(result !=0){
			return "success";
		}else{
			return "fail";
		}
	}
	@RequestMapping(value="customerUpdateByGet")
	public ModelAndView customerUpdateByGet(ModelAndView m,Customer customer){
		m.addObject("customerId", customer.getCustomerId());
		m.addObject("customerName", customer.getCustomerName());
		m.addObject("customerNo", customer.getCustomerNo());
		m.addObject("customerPhone", customer.getCustomerPhone());
		m.addObject("carId", customer.getCarId());
		m.setViewName("customerUpdate");//aftersales/customerUpdate.jsp
		return m;
	}
}
