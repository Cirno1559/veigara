package com.hxzy.biz.impl.authority;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.authority.AdminBiz;
import com.hxzy.dao.authority.AdminMapper;
import com.hxzy.entity.authority.Admin;
import com.hxzy.entity.authority.AdminExample;
import com.hxzy.entity.authority.AdminExample.Criteria;
import com.hxzy.entity.sales.Manufacturer;
import com.hxzy.util.PageUtil;
@Service
public class AdminBizImpl implements AdminBiz {
	@Resource
	AdminMapper adminDao;
	@Override
	/**
	 * 根据用户名和密码查找用户信息
	 */
	public Admin selectByNamePwd(String adminLoginName, String adminLoginPwd) {
		return adminDao.selectByNamePwd(adminLoginName, adminLoginPwd);
	}
	/**
	 * 分页查询用户信息
	 * @param paging 分页工具类
	 * @param map 查询条件
	 * @return
	 */
	@Override
	public void pagingQuery(PageUtil<Admin> paging, Map<String, Object> map) {
		AdminExample example = new AdminExample();
		Criteria c=example.createCriteria();
		
		example.setOffset(paging.getExclude());
		example.setLimit(paging.getPageSize());
		example.setOrderByClause("adminLoginName");//根据用户名排序		
		if(map!=null) {
			for (String   key: map.keySet()) {
				if(key.equals("adminLoginName")) {					
					c.andAdminLoginNameLike(map.get(key).toString());
				}				
			}
		}
		paging.setData(adminDao.selectByExample(example));
		paging.setTotalCount((int)adminDao.countByExample(example));
		
	}
	/**
     * 根据条件修改用户信息
     * @param record
     * @return
     */
	@Override
	public int updateByPrimaryKeySelective(Admin record) {
		
		return adminDao.updateByPrimaryKeySelective(record);
	}
	/**
     * 根据条件添加用户信息
     * @param record
     * @return
     */
	@Override
	public int insertSelective(Admin record) {
		
	return adminDao.insertSelective(record);
		
	}
	 /**
     * 根据主键删除用户信息
     * @param record
     * @return
     */
	

	
	/**
	    * 根据名称查询用户，用户名称唯一
	    * @param ManufacturerName
	    * @return
	    */
	@Override
	public Admin selectByName(String adminLoginName) {
		
		return adminDao.selectByName(adminLoginName);
	}
	@Override
	public int deleteByPrimaryKey(Integer adminId) {
		// TODO Auto-generated method stub
		return adminDao.deleteByPrimaryKey(adminId);
	}

}
