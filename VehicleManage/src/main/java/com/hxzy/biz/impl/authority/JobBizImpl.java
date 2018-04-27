package com.hxzy.biz.impl.authority;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.authority.JobBiz;
import com.hxzy.dao.authority.JobMapper;
import com.hxzy.entity.authority.Job;
import com.hxzy.entity.authority.JobExample;
@Service
public class JobBizImpl implements JobBiz {
	@Resource
	JobMapper jobDao;
	@Override
	public List<Job> selectByExample() {
		JobExample example = new JobExample();
		return jobDao.selectByExample(example);
	}

}
