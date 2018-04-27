package com.hxzy.controller.authority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.authority.MenuBizImpl;
import com.hxzy.entity.authority.Menu;
import com.hxzy.pojo.TreePojo;
import com.hxzy.util.PageUtil;


@Controller
@RequestMapping(value="authority/")
public class MenuController {
	@Resource(name="menuBizImpl")
	MenuBizImpl menuBiz;
	/**
	 * 发送查询厂商的数据
	 * @param m
	 * @return
	 */
	@RequestMapping(value="menuQuery")//authority/menuQuery.do
	public ModelAndView menuQuery(ModelAndView m,String menuName,Integer page) {
		PageUtil<Menu> paging = new PageUtil<>();
		Map<String, Object> map = new HashMap<String, Object>();
		if(menuName!=null) {//厂商名称
			map.put("menuName", "%"+menuName+"%");
			m.addObject("menuName", menuName);
		}
		if(page!=null) {
			paging.setCurrentPage(page);
		}
		menuBiz.pagingQuery(paging, map);
	
		m.addObject("paging", paging);
		m.setViewName("menu/menuQuery");//authority/menu/menuQuery.jsp，展示查询数据
		return m;
		
	}
	/**
	 * 删除厂商信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="menuDelete")//authority/menuDelete.do
	@ResponseBody
	public String menuDelete(Menu record) {
		//record里需要一个主键
		record.setMenuState(0);//将状态改为0，不显示
		int result = menuBiz.updateByPrimaryKeySelective(record);
		return result>0?"success":"fail";
		
	}
	/**
	 * 根据主键修改厂商信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="menuUpdate")//authority/menuUpdate.do
	@ResponseBody
	public String menuUpdate(ModelAndView m,Menu record) {		
		//record 需要id,名称，地址和备注参数
		int result = menuBiz.updateByPrimaryKeySelective(record);
		return result>0?"success":"fail";
		
	}
	/**
	 * 添加厂商信息，ajax
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="menuAdd")//authority/menuAdd.do
	@ResponseBody
	public String menuAdd(Menu record) {
		record.setMenuState(1);
		int insertSelective = menuBiz.insertSelective(record);
		return insertSelective>0?"success":"fail";
		
	}
	/**
	 * 根据名称和层级查询菜单信息
	 * @param manufacturerName
	 * @return
	 */
	@RequestMapping(value="menuByName")
	@ResponseBody
	public String menuByName(Menu menu) {
		Map<String,Object> map=new HashMap<>();		
		List<Menu> selectByQueryAll=new ArrayList<>();
		if(map!=null){
			menu.setMenuState(1);
			map.put("menuName",menu.getMenuName());
			map.put("menuTier",menu.getMenuTier());
			 selectByQueryAll = menuBiz.selectByQueryAll(map);
			
		}
		
		return selectByQueryAll.size()>0?"success":"fail";
		
	}
	/**
	 * 发送修改数据
	 * @param m
	 * @param manufacturer
	 * @return
	 */
	@RequestMapping(value="menuUpdateByget")//authority/menuUpdateByget.do
	@ResponseBody
	public ModelAndView menuUpdateByget(ModelAndView m,Menu menu ) {						
		m.addObject("menu", menu);
		m.setViewName("menu/menuUpdate");//authority/menu/menuUpdate.jsp
		return m;
	}
	/**
	 * 发送父级Id信息
	 * @param m
	 * @return
	 */
	@RequestMapping(value="sendparentId")//authority/sendparentId.do
	@ResponseBody
	public List<Menu> sendparentId(){		
		  List<Menu> selectByExample = menuBiz.getByParentId(0);
		return selectByExample;
	}
	/**
	 * 发送父级Id信息
	 * @param m
	 * @return
	 */
	@RequestMapping(value="sendparentName")//authority/sendparentName.do
	@ResponseBody
	public  List<Menu>  sendparentName(Integer parentId){		
		  List<Menu> selectByExample = menuBiz.getByParentId(parentId);
		return selectByExample;
	}
	
	
	@RequestMapping(value="getMenuTree")
	@ResponseBody
	public List<TreePojo> getMenuTree(){
		
		List<Menu> list = menuBiz.getByParentId(0);
		
		return mergeTree(list);
	}
	
	/**
	 * 合并
	 * @return
	 */
	public List<TreePojo> mergeTree(List<Menu> list){
		
		List<TreePojo> treeList = new ArrayList<>();
		
		for (Menu menu : list) {
			TreePojo tp = new TreePojo();
			tp.setId(menu.getMenuId());
			tp.setName(menu.getMenuName());
			tp.setpId(menu.getParentId());
		
		
			
			//递归
			tp.setChildren(mergeTree(menu.getChildMenu()));
			
			treeList.add(tp);
		}
		
		return treeList;
	}
	
}