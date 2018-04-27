package com.hxzy.biz.impl.authority;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.authority.DepartmentBiz;
import com.hxzy.dao.authority.DepartmentMapper;
import com.hxzy.entity.authority.Department;
import com.hxzy.entity.authority.DepartmentExample;
@Service
public class DepartmentBizImpl implements DepartmentBiz {
	@Resource
	DepartmentMapper deDao;
	@Override
	public List<Department> selectByExample() {
		DepartmentExample example = new DepartmentExample();
		return deDao.selectByExample(example);
	}

}
