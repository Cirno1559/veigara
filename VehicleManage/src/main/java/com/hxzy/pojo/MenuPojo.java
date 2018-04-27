package com.hxzy.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.hxzy.entity.authority.Menu;





public class MenuPojo implements Serializable{
    /**
     * 菜单ID 主键
     */
    private Integer menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 0:不显示 1：显示
     */
    private Integer menuState;
    /**
     * 菜单连接地址
     */
    private String menuAdress;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 菜单层级
     */
    private Integer menuTier;
    /**
     * 子菜单
     */
    private List<MenuPojo> childMenu;
    /**
     * 是否匹配
     */
    private boolean isMarry ;
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Integer getMenuState() {
		return menuState;
	}
	public void setMenuState(Integer menuState) {
		this.menuState = menuState;
	}
	public String getMenuAdress() {
		return menuAdress;
	}
	public void setMenuAdress(String menuAdress) {
		this.menuAdress = menuAdress;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getMenuTier() {
		return menuTier;
	}
	public void setMenuTier(Integer menuTier) {
		this.menuTier = menuTier;
	}
	public List<MenuPojo> getChildMenu() {
		return childMenu;
	}
	public void setChildMenu(List<MenuPojo> childMenu) {
		this.childMenu = childMenu;
	}
	public boolean isMarry() {
		return isMarry;
	}
	public void setMarry(boolean isMarry) {
		this.isMarry = isMarry;
	}
	
 
}
