package com.hxzy.dao.authority;

import com.hxzy.entity.authority.Role;
import com.hxzy.entity.authority.RoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
   
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
     * 分页查询全查询总的条数
     * @return
     */
    long getTotalcount();
}