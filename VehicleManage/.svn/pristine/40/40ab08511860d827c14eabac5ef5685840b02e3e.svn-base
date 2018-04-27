package com.hxzy.biz.authority;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hxzy.entity.authority.Admin;

import com.hxzy.util.PageUtil;

public interface AdminBiz {
	 /**
     * 根据用户名和密码查找用户信息
     * @param adminLoginName
     * @param adminLoginPwd
     * @return
     */
    Admin selectByNamePwd(@Param("adminLoginName")String adminLoginName,@Param("adminLoginPwd") String adminLoginPwd);
    /**
	 * 分页查询用户信息
	 * @param paging 分页工具类
	 * @param map 查询条件
	 * @return
	 */
	public void pagingQuery(PageUtil<Admin> paging,Map<String,Object>map);
	/**
     * 根据条件修改用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Admin record);
   
    /**
     * 根据条件添加用户信息
     * @param record
     * @return
     */
    int insertSelective(Admin record);
    /**
     * 根据主键删除用户信息
     * @param record
     * @return
     */
    int deleteByPrimaryKey(Integer adminId);
   /**
    * 根据名称查询用户，用户名称唯一
    * @param ManufacturerName
    * @return
    */
    Admin selectByName(String adminLoginName);
}
