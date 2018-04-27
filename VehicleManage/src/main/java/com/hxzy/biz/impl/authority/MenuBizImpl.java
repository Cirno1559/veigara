package com.hxzy.biz.impl.authority;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.authority.MenuBiz;
import com.hxzy.dao.authority.MenuMapper;
import com.hxzy.entity.authority.Menu;
import com.hxzy.entity.authority.MenuExample;
import com.hxzy.entity.authority.MenuExample.Criteria;
import com.hxzy.util.PageUtil;




@Service
public class MenuBizImpl implements MenuBiz {
	@Resource
	MenuMapper dao;
	@Override
	public List<Menu> getByParentId(int parentId) {
		
		return recursion(parentId);
	}
	/**
	 * 用递归获得子菜单
	 * @param parentId
	 * @return
	 */
	public List<Menu> recursion(int parentId){
		List<Menu> list =new ArrayList<>();
		List<Menu> menu = dao.getByParentId(parentId);
	
		for (Menu menu2 : menu) {
			Integer menuId = menu2.getMenuId();
			List<Menu> twolist = dao.getByParentId(menuId);//第二层
			menu2.setChildMenu(twolist);
			list.add(menu2);
			recursion(menuId);
		}
		return list;
	}
	
	@Override
	public int insertSelective(Menu record) {
		return dao.insertSelective(record);
	}
	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		return dao.updateByPrimaryKeySelective(record);
	}
	@Override
	public void pagingQuery(PageUtil<Menu> paging, Map<String, Object> map) {
		MenuExample example = new MenuExample();
		Criteria c = example.createCriteria();
		c.andMenuStateEqualTo(1);//根据显示状态查询
		example.setOffset(paging.getExclude());
		example.setLimit(paging.getPageSize());
		example.setOrderByClause("menuTier");//根据厂商地址排序		
		if(map!=null) {
			for (String   key: map.keySet()) {
				if(key.equals("menuName")) {
					c.andMenuNameLike(map.get(key).toString());
				}
				
			}
		}
		paging.setData(dao.selectByExample(example));
		paging.setTotalCount((int)dao.countByExample(example));

	
	}
	/**
	 * 根据条件全查询菜单信息
	 */
	@Override
	public List<Menu> selectByQueryAll(Map<String, Object> map) {
		MenuExample example = new MenuExample();
		Criteria c = example.createCriteria();
		c.andMenuStateEqualTo(1);//根据显示状态查询
		if(map!=null) {
			for (String   key: map.keySet()) {
				if(key.equals("menuName")) {
					c.andMenuNameEqualTo(map.get(key).toString());
				}
				if(key.equals("menuTier")) {
					c.andMenuTierEqualTo((int)map.get(key));
				}
			}
			
		}
		
		return dao.selectByExample(example);
	}
	
	
	
	
}
