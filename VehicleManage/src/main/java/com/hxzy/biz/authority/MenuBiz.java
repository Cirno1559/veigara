package com.hxzy.biz.authority;

import java.util.List;
import java.util.Map;

import com.hxzy.entity.authority.Admin;
import com.hxzy.entity.authority.Menu;
import com.hxzy.entity.authority.MenuExample;
import com.hxzy.entity.sales.Manufacturer;
import com.hxzy.util.PageUtil;



public interface MenuBiz {
	 /**
     * 根据父级Id查询菜单信息
     */
    List<Menu> getByParentId(int parentId);
   
    /**
     * 根据条件添加菜单信息
     * @param record
     * @return
     */
    int insertSelective(Menu record);
    
    /**
     * 根据主键及条件修改菜单信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Menu record);
    /**
	 * 分页查询菜单信息
	 * @param paging 分页工具类
	 * @param map 查询条件
	 * @return
	 */
	public void pagingQuery(PageUtil<Menu> paging,Map<String,Object>map);
	 /**
     * 查询菜单信息
     * @param example
     * @return
     */
    List<Menu> selectByQueryAll(Map<String,Object>map);
}
