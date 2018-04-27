package com.hxzy.dao.authority;


import com.hxzy.entity.authority.Menu;
import com.hxzy.entity.authority.MenuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);
    /**
     * 根据条件添加菜单信息
     * @param record
     * @return
     */
    int insertSelective(Menu record);
    /**
     * 分页查询菜单信息
     * @param example
     * @return
     */
    List<Menu> selectByExample(MenuExample example);
    /**
     * 根据主键及条件修改菜单信息
     * @param record
     * @return
     */
    Menu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    /**
     * 根据父级Id查询菜单信息
     */
    List<Menu> getByParentId(int parentId);
   
}