package com.hxzy.biz.impl.workTime;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.workTime.OverTimeTypeBiz;
import com.hxzy.dao.workTime.OvertimetypeMapper;
import com.hxzy.entity.workTime.Overtimetype;


@Service
public class OverTimeTypeBizImpl implements OverTimeTypeBiz {

	@Resource
	OvertimetypeMapper overTimeTypeMapper;
	
	@Override
	public List<Overtimetype> findAllOverTimeType() {
		return overTimeTypeMapper.findAllOverTimeType();
	}

}
