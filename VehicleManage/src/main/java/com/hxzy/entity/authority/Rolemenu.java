package com.hxzy.entity.authority;

import java.io.Serializable;

/**
 * @author 
 */
public class Rolemenu implements Serializable {
    /**
     * 角色菜单表 主键
     */
    private Integer rolemenuId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 菜单ID
     */
    private Integer menuId;

    private static final long serialVersionUID = 1L;

    public Integer getRolemenuId() {
        return rolemenuId;
    }

    public void setRolemenuId(Integer rolemenuId) {
        this.rolemenuId = rolemenuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}