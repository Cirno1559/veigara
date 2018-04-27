package com.hxzy.biz.authority;

import java.util.List;

import com.hxzy.entity.authority.Department;


public interface DepartmentBiz {
	/**
	 * 查询所有部门信息
	 * @return
	 */
	 List<Department> selectByExample();
}
