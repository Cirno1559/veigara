package com.hxzy.biz.impl.workTime;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.workTime.TravelBiz;
import com.hxzy.dao.workTime.TravelMapper;
import com.hxzy.entity.workTime.Travel;



@Service
public class TravelBizImpl implements TravelBiz {
	
	
	@Resource
	TravelMapper  travelMapper;
	
	
	@Override
	public List<Travel> findTravelRoleList(Integer adminId, Integer offset) {
		return travelMapper.findTravelRoleList(adminId, offset);
	}

	@Override
	public Integer findTravelRoleCount(Integer adminId) {
		return travelMapper.findTravelRoleCount(adminId);
	}

	@Override
	public List<Integer> findAllAdminId() {
		return travelMapper.findAllAdminId();
	}

	@Override
	public int insert(Travel record) {
		return travelMapper.insert(record);
	}

	@Override
	public Travel selectByPrimaryKey(Integer travelId) {
		return travelMapper.selectByPrimaryKey(travelId);
	}

	@Override
	public int updateByPrimaryKey(Travel record) {
		return travelMapper.updateByPrimaryKey(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer travelId) {
		return travelMapper.deleteByPrimaryKey(travelId);
	}

}
