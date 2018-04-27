package com.hxzy.biz.aftersales;

import java.util.Map;

import com.hxzy.entity.aftersales.Customer;
import com.hxzy.util.PageUtil;

public interface CustomerBiz {
	//添加客户信息
	Integer customerAdd(Customer customer);
	/**
	 * 分页查询汽车信息
	 * @param paging 分页工具类
	 * @param map 查询条件
	 * @return
	 */
	public void pagingQuery(PageUtil<Customer> paging,Map<String,Object>map);;
	
	//删除客户信息
	Integer customerRemove(Customer customer);
	//修改用户信息
	Integer customerUpdate(Customer customer);
	
}
