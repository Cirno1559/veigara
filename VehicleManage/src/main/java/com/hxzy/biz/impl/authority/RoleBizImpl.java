package com.hxzy.biz.impl.authority;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.authority.RoleBiz;
import com.hxzy.dao.authority.RoleMapper;
import com.hxzy.entity.authority.Menu;
import com.hxzy.entity.authority.Role;
import com.hxzy.entity.authority.RoleExample;
import com.hxzy.entity.authority.RoleExample.Criteria;
import com.hxzy.util.PageUtil;



@Service
public class RoleBizImpl implements RoleBiz {
	@Resource
	RoleMapper dao;
	/*
	@Override
	public List<Role> queryAll() {
		return dao.queryAll();
	}*/
	@Override
	/**
	 * 根据角色id查找菜单
	 */
	public List<Integer> querymenuByRoleId(int roleId) {
		return dao.querymenuByRoleId(roleId);
	}
	@Override
	public int insertAuthority(Integer roleId, Integer menuId) {
		// TODO Auto-generated method stub
		return dao.insertAuthority(roleId, menuId);
	}
	@Override
	public int deleteAuthority(Integer roleId) {
		// TODO Auto-generated method stub
		return dao.deleteAuthority(roleId);
	}
	@Override
	public void pagingQuery(PageUtil<Role> paging, Map<String, Object> map) {	
		//设置分页查询的数据
		RoleExample example = new RoleExample();		
		example.setOffset(paging.getExclude());//设置排除多少笔数据
		
		example.setLimit(paging.getPageSize());//设置最多显示的条数
		
		Criteria c = example.createCriteria();
		
		if(map != null){
			for (String key : map.keySet()) {
				if("roleName".equals(key)){
					c.andRoleNameLike(map.get(key).toString());
				}
			}
		}
		
		//设置分页查询的数据
		paging.setData(dao.selectByExample(example));
		
		long counts = dao.countByExample(example);
		
	    //设置分页查询的总条数
		paging.setTotalCount((int)counts);
		
	}
	@Override
	public List<Role> selectByExample() {
		RoleExample example = new RoleExample();
		return dao.selectByExample(example);
	}
	@Override
	public int insertSelective(Role record) {
	
		return dao.insertSelective(record);
	}
	@Override
	public int updateByPrimaryKeySelective(Role record) {
		
		return dao.updateByPrimaryKeySelective(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer roleId) {
		
		return dao.deleteByPrimaryKey(roleId);
	}

}
