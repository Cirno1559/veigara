package com.hxzy.controller.authority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.authority.MenuBizImpl;
import com.hxzy.biz.impl.authority.RoleBizImpl;
import com.hxzy.entity.authority.Admin;
import com.hxzy.entity.authority.Menu;
import com.hxzy.entity.authority.Role;
import com.hxzy.pojo.MenuPojo;
import com.hxzy.util.PageUtil;
import com.hxzy.util.StringUtil;



@Controller
@Scope(value="prototype")
@RequestMapping(value="")
public class RoleController {
	@Resource(name="roleBizImpl")	
	RoleBizImpl rolebiz;
	@Resource(name="menuBizImpl")
	MenuBizImpl menubiz;
	/**
	 * 查询所有的角色信息
	 * @param m
	 * @return
	 */
	@RequestMapping(value="authority/roleQuery")//authority/roleQuery.do
	public ModelAndView sendRole(ModelAndView m,Integer page,String roleName) {		
		PageUtil<Role> paging = new PageUtil<>();
		Map<String,Object> map=new HashMap<>();
		if(roleName!=null) {
		map.put("roleName", "%"+roleName+"%");
		}
		if(page!=null) {
			paging.setCurrentPage(page);
		
		}
		rolebiz.pagingQuery(paging, map);
		m.addObject("paging", paging);
		m.addObject("roleName", roleName);
		m.setViewName("role/roleQuery");
		
		return m;
	}
	/**
	 * 匹配权限,发送匹配菜单
	 * @param m
	 * @param id
	 * @return
	 */
	@RequestMapping(value="authority/sendAuthority")//authority/sendAuthority.do
	public ModelAndView send(ModelAndView m,HttpServletRequest request) {
		    Admin admin= (Admin) request.getSession().getAttribute("admin");		
			int roldId=admin.getAdminId();
			List<Integer> list = rolebiz.querymenuByRoleId(roldId);
			List<Menu> menulist = menubiz.getByParentId(0);
			List<MenuPojo> matching = matching(menulist,list);
			m.addObject("list", matching);
			//m.addObject("roleId", roldId);
			m.setViewName("main");///role/
		
		return m;
		
	}
	/**
	 * 递归，匹配权限
	 * @param menulist
	 * @param list
	 * @return
	 */
	public List<MenuPojo> matching(List<Menu> menulist,List<Integer> list){
		List<MenuPojo> pojo=new ArrayList<>();
		for (Menu menu : menulist) {
			MenuPojo menuPojo = new MenuPojo();
			Integer menuId = menu.getMenuId();
			if(list.contains(menuId)) {
				menuPojo.setMarry(true);			
			}else {
				menuPojo.setMarry(false);
			}
			menuPojo.setMenuId(menu.getMenuId());
			menuPojo.setMenuName(menu.getMenuName());
			menuPojo.setMenuAdress(menu.getMenuAdress());
			
			menuPojo.setParentId(menu.getParentId());
			menuPojo.setMenuTier(menu.getMenuTier());
			
		
					
			menuPojo.setChildMenu(matching(menu.getChildMenu(),list));
			
			pojo.add(menuPojo);
		}
		return pojo;
	}
	
	
	/**
	 * 添加角色信息，ajax
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="authority/roleAdd")//authority/roleAdd.do
	@ResponseBody
	public String menuAdd(Role record) {		
		int insertSelective = rolebiz.insertSelective(record);
		return insertSelective>0?"success":"fail";
		
	}
	/**
	 * 发送修改数据
	 * @param m
	 * @param manufacturer
	 * @return
	 */
	@RequestMapping(value="authority/roleUpdateByget")//authority/roleUpdateByget.do
	@ResponseBody
	public ModelAndView roleUpdateByget(ModelAndView m,Role role ) {						
		m.addObject("role", role);
		m.setViewName("role/roleUpdate");//authority/role/roleUpdate.jsp
		return m;
	}
	/**
	 * 根据主键修改角色信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="authority/roleUpdate")//authority/roleUpdate.do
	@ResponseBody
	public String menuUpdate(ModelAndView m,Role record) {		
		//record 需要id,名称
		int result = rolebiz.updateByPrimaryKeySelective(record);
		return result>0?"success":"fail";
		
	}
	/**
	 * 删除角色信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="authority/roleDelete")//authority/roleDelete.do
	@ResponseBody
	public String menuDelete(Role record) {
		//record里需要一个主键		
		int result = rolebiz.deleteByPrimaryKey(record.getRoleId());
		return result>0?"success":"fail";
		
	}
	/**
	 * 根据id 查找权限
	 * @param record
	 * @return
	 */
	@RequestMapping(value="authority/getMenuId")//authority/getMenuId.do
	
	public ModelAndView roleAuthrity(String roleId ,ModelAndView m) {		
		//record里需要一个主键	
		if(roleId!=null){
			 int id=Integer.parseInt(roleId);
			  List<Integer> list = rolebiz.querymenuByRoleId(id);
			  m.addObject("roleId", id);
			  m.addObject("list", list);
			  m.setViewName("role/getTree");
		}
		return m;
	}
	/**
	 * 保存权限
	 * @param m
	 * @param accesse
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="authority/keep")//admin/keep.do
	@ResponseBody
	//ajax 传入array数组，后台获取方式：
	public String keep(@RequestParam(value = "list[]")Integer[]  list,Integer roleId) {
		int insert=0;
		if(list.length>0) {
			rolebiz.deleteAuthority(roleId);
		for (int i = 0; i < list.length; i++) {			
			 insert = rolebiz.insertAuthority(roleId, list[i]);			
		}
		}
		return insert>0?"success":"fail";
		
	}
}
