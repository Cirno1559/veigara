package com.hxzy.controller.authority;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.impl.authority.AdminBizImpl;
import com.hxzy.biz.impl.authority.DepartmentBizImpl;
import com.hxzy.biz.impl.authority.JobBizImpl;
import com.hxzy.biz.impl.authority.RoleBizImpl;
import com.hxzy.entity.authority.Admin;
import com.hxzy.entity.authority.Department;
import com.hxzy.entity.authority.Job;
import com.hxzy.entity.authority.Role;
import com.hxzy.entity.sales.Manufacturer;
import com.hxzy.util.MD5Util;
import com.hxzy.util.PageUtil;


@Controller
@RequestMapping(value="authority/")
public class AdminController {
	@Resource(name="adminBizImpl")
	AdminBizImpl adminBiz;
	@Resource(name="departmentBizImpl")
	DepartmentBizImpl deBiz;
	@Resource(name="jobBizImpl")
	JobBizImpl jobBiz;
	@Resource(name="roleBizImpl")
	RoleBizImpl roleBiz;
	
	@RequestMapping(value="login")//authority/login.do
	public ModelAndView login(ModelAndView m,Admin admin,HttpServletRequest request,String code){
		String adminLoginPwd="";
		if(admin!=null){
		try {
			 adminLoginPwd = MD5Util.MD5(admin.getAdminLoginPwd());
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		Admin login = adminBiz.selectByNamePwd(admin.getAdminLoginName(), adminLoginPwd);
		String parameter = request.getSession().getAttribute("codeValue").toString();
		if(parameter!=null&&parameter.equalsIgnoreCase(code)) {
			if(login!=null) {
				//m.addObject("adminId",login.getAdminId());
				request.getSession().setAttribute("admin", login);
				m.setViewName("redirect:sendAuthority.do"); 
				return m;
			}else {
				m.setViewName("index");//authority/index.jsp
				return m;
			}
		}
		m.setViewName("index");
		}
		return m;		
	}
	/**
	 * 发送用户信息
	 * @param m
	 * @param adminLoginName
	 * @param page
	 * @return
	 */
	@RequestMapping(value="adminQuery")//authority/adminQuery.do
	public ModelAndView adminQuery(ModelAndView m,String adminLoginName,Integer page) {
		PageUtil<Admin> paging = new PageUtil<>();
		Map<String, Object> map = new HashMap<String, Object>();
		if(adminLoginName!=null) {//厂商名称
			map.put("adminLoginName", "%"+adminLoginName+"%");
			m.addObject("adminLoginName", adminLoginName);
		}
		if(page!=null) {
			paging.setCurrentPage(page);
		}
		adminBiz.pagingQuery(paging, map);
		m.addObject("paging", paging);
		m.setViewName("admin/adminQuery");//authority/admin/adminQuery.jsp，展示查询数据
		return m;
		
	}
	/**
	 * 发送部门信息
	 * @param m
	 * @return
	 */
	@RequestMapping(value="sendDepartment")//authority/sendDepartment.do
	@ResponseBody
	public List<Department> sendDepartment(){
		
		  List<Department> selectByExample = deBiz.selectByExample();
		return selectByExample;
	}
	/**
	 * 发送职位信息
	 * @param m
	 * @return
	 */
	@RequestMapping(value="sendJob")//authority/sendJob.do
	@ResponseBody
	public List<Job> sendJob(){
		
		  List<Job> selectByExample = jobBiz.selectByExample();
		return selectByExample;
	}
	/**
	 * 发送角色信息
	 * @param m
	 * @return
	 */
	@RequestMapping(value="sendRoleAjax")//authority/sendRoleAjax.do
	@ResponseBody
	public List<Role> sendRole(){
		
		  List<Role> selectByExample = roleBiz.selectByExample();
		return selectByExample;
	}
	/**
	 * 添加用户信息，ajax
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="adminAdd")//authority/adminAdd.do
	@ResponseBody
	public String adminAdd(Admin record) {
		String pwd = record.getAdminLoginPwd();
		try {
			record.setAdminLoginPwd(MD5Util.MD5(pwd));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
			}
		int insertSelective = adminBiz.insertSelective(record);
		
			
			return insertSelective>0?"success":"fail";
	
		
		
	}
	/**
	 * 根据用户名查询
	 * @param adminLoginName
	 * @return
	 */
	@RequestMapping(value="adminQueryByName")//authority/adminQueryByName.do
	@ResponseBody
	public String adminQueryByName(String adminLoginName) {
		Admin selectByName = adminBiz.selectByName(adminLoginName);		
		return selectByName!=null?"success":"fail";
		
	}
	/**
	 * 发送修改数据
	 * @param m
	 * @param admin
	 * @return
	 */
	@RequestMapping(value="adminUpdateByget")
	@ResponseBody
	public ModelAndView manufacturerUpdateByget(ModelAndView m,Admin admin ) {
		if(admin!=null){
		m.addObject("admin", admin);
		
		m.setViewName("admin/adminUpdate");//admin/manufacturerUpdate.jsp
		}
		
		return m;
	}
	/**
	 * 根据主键修改厂商信息
	 * @param m
	 * @param record
	 * @return
	 */
	@RequestMapping(value="adminUpdate")//authority/adminUpdate.do
	@ResponseBody
	public String adminUpdate(ModelAndView m,Admin record) {		
		//record 需要id,名称，地址和备注参数
		String pwd = record.getAdminLoginPwd();
		try {
			record.setAdminLoginPwd(MD5Util.MD5(pwd));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		int result = adminBiz.updateByPrimaryKeySelective(record);
		return result>0?"success":"fail";
		
	}
	/**
	 * 删除信息
	 * @param record
	 * @return
	 */
	@RequestMapping(value="adminDelete")//authority/adminDelete.do
	@ResponseBody
	public String adminDelete(Integer adminId) {
		int result=0;
		if(adminId!=null) {
			 result = adminBiz.deleteByPrimaryKey(adminId);
		}
		return result>0?"success":"fail";
	}
}
