package com.hxzy.biz.impl.workTime;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.workTime.OverTimeBiz;
import com.hxzy.dao.workTime.OvertimeMapper;
import com.hxzy.entity.workTime.OverTimePojo;
import com.hxzy.entity.workTime.Overtime;


@Service
public class OverTimeBizImpl implements OverTimeBiz {

	@Resource
	OvertimeMapper overTimeMapper;
	
	@Override
	public int updateByPrimaryKey(Overtime record) {
		return overTimeMapper.updateByPrimaryKey(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer overTimeId) {
		return overTimeMapper.deleteByPrimaryKey(overTimeId);
	}

	@Override
	public int insert(Overtime record) {
		return overTimeMapper.insert(record);
	}

	@Override
	public List<OverTimePojo> findOverTimeInfo(Integer adminId, Integer offset) {
		return overTimeMapper.findOverTimeInfo(adminId, offset);
	}

	@Override
	public Integer findOverTimeCount(Integer adminId) {
		return overTimeMapper.findOverTimeCount(adminId);
	}

	@Override
	public List<Integer> findAllAdminId() {
		return overTimeMapper.findAllAdminId();
	}

}
