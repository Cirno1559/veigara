package com.hxzy.biz.impl.aftersales;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.aftersales.CustomerBiz;
import com.hxzy.dao.aftersales.CustomerMapper;
import com.hxzy.entity.aftersales.Customer;
import com.hxzy.entity.aftersales.CustomerExample;
import com.hxzy.entity.aftersales.CustomerExample.Criteria;
import com.hxzy.util.PageUtil;
@Service
public class CustomerBizImpl implements CustomerBiz {
@Resource
CustomerMapper customerDao; 
	@Override
	public Integer customerAdd(Customer customer) {
		Customer ct = customerDao.selectByPrimaryKey(customer.getCustomerId());
		if(ct != null){
			return 0;
		}
		int result = customerDao.insertSelective(customer);
		return result;
	}

	@Override
	public void pagingQuery(PageUtil<Customer> paging, Map<String, Object> map)  {
		CustomerExample example = new CustomerExample();
		Criteria criteria = example.createCriteria();
		criteria.andCustomerStateEqualTo(1);
		example.setOffset(paging.getExclude());
		example.setLimit(paging.getPageSize());
		if(map != null){
			for (String key : map.keySet()) {
				if(key.equalsIgnoreCase("customerNo")){
					criteria.andCustomerNoEqualTo(map.get(key).toString());
				}
			}
		}
		paging.setData(customerDao.selectByExample(example));
		paging.setTotalCount((int)customerDao.countByExample(example));
		
	}

	

	@Override
	public Integer customerRemove(Customer customer) {
		if(customer != null){
			customer.setCustomerState(0);
		}
		return customerDao.updateByPrimaryKeySelective(customer);
	}

	@Override
	public Integer customerUpdate(Customer customer) {
		return customerDao.updateByPrimaryKeySelective(customer);
	}

}
