package com.hxzy.entity.authority;

import java.io.Serializable;
import java.util.List;



/**菜单
 * @author 
 */
public class Menu implements Serializable {
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
    private List<Menu> childMenu;
    private static final long serialVersionUID = 1L;

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

	public List<Menu> getChildMenu() {
		return childMenu;
	}

	public void setChildMenu(List<Menu> childMenu) {
		this.childMenu = childMenu;
	}
    
}