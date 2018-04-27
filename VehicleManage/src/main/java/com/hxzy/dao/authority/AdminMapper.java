package com.hxzy.dao.authority;

import com.hxzy.entity.authority.Admin;
import com.hxzy.entity.authority.AdminExample;
import com.hxzy.entity.sales.Manufacturer;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);
    /**
     * 根据条件添加用户信息
     * @param record
     * @return
     */
    int insertSelective(Admin record);
    /**
     * 分页查询用户信息
     * @param example
     * @return
     */
    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer adminId);
   
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);
    /**
     * 根据主键及条件修改用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    /**
     * 根据用户名和密码查找用户信息
     * @param adminLoginName
     * @param adminLoginPwd
     * @return
     */
    Admin selectByNamePwd(@Param("adminLoginName")String adminLoginName,@Param("adminLoginPwd") String adminLoginPwd);
    /**
     * 根据名称查询用户信息，名称唯一
     * @param factoryName
     * @return
     */
    Admin selectByName(String adminLoginName);
}