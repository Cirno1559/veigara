package com.hxzy.biz.authority;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hxzy.entity.authority.Job;
import com.hxzy.entity.authority.Menu;
import com.hxzy.entity.authority.Role;
import com.hxzy.util.PageUtil;




public interface RoleBiz {
	/**
	 * 查询所有角色信息
	 * @return
	 */
	 List<Role> selectByExample();
    /**
     * 根据角色Id查询菜单信息
     */
    List<Integer> querymenuByRoleId(int roleId);
    /**
     * 保存权限
     * @param roleId
     * @param menuId
     * @return
     */
    int insertAuthority(@Param("roleId") Integer roleId,@Param("menuId") Integer menuId);
    
    
    /**
     * 删除权限
     * @param roleId
     * @return
     */
    int deleteAuthority(Integer roleId);
    /**
	 * 分页查询
	 * @param paging
	 * @param map
	 */
	public void pagingQuery(PageUtil<Role> paging,Map<String,Object> map);
	/**
	 * 添加角色信息
	 * @param record
	 * @return
	 */
	public int insertSelective(Role record);
	/**
	 * 修改
	 * @param record
	 * @return
	 */
	public int updateByPrimaryKeySelective(Role record);
	/**
	 * 删除角色
	 * @param roleId
	 * @return
	 */
	int deleteByPrimaryKey(Integer roleId);
}
