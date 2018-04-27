package com.hxzy.biz.impl.aftersales;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.aftersales.RepairinfoBiz;
import com.hxzy.dao.aftersales.RepairinfoMapper;
import com.hxzy.entity.aftersales.Car;
import com.hxzy.entity.aftersales.Repairinfo;
import com.hxzy.entity.aftersales.RepairinfoExample;
import com.hxzy.entity.aftersales.RepairinfoExample.Criteria;
import com.hxzy.util.PageUtil;
@Service
public class RepairinfoBizImpl implements RepairinfoBiz {
@Resource
RepairinfoMapper repairinfoDao;
	@Override
	public Integer repirinfoAdd(Repairinfo repairinfo) {
		Repairinfo repairinfoById = repairinfoDao.selectByPrimaryKey(repairinfo.getRepairinfoId());
		if(repairinfoById != null){
			repairinfoById.setRepairinfoId(repairinfo.getRepairinfoId());
			repairinfoById.setRepairinfoTime(repairinfo.getRepairinfoTime());
			repairinfoById.setRepairinfoOda(repairinfo.getRepairinfoOda());
			repairinfoById.setRepairinfoRaccount(repairinfo.getRepairinfoRaccount());
			repairinfoById.setCarId(repairinfo.getCarId());
			repairinfoById.setAdminId(repairinfo.getAdminId());
			repairinfoById.setState(1);
			return repairinfoDao.updateByPrimaryKeySelective(repairinfo);
		}
		return repairinfoDao.insertSelective(repairinfo);
	}

	@Override
	public void pagingQuery(PageUtil<Repairinfo> paging, Map<String, Object> map) {
		RepairinfoExample example = new RepairinfoExample();
		Criteria c = example.createCriteria();
		c.andStateEqualTo(1);
		example.setOffset(paging.getExclude());
		example.setLimit(paging.getPageSize());
		if(map != null){
			for (String key : map.keySet()) {
				if(key.equalsIgnoreCase("carId")){
					c.andCarIdEqualTo(Integer.valueOf(map.get(key).toString()));
				}
			}
		}
		paging.setData(repairinfoDao.selectByExample(example));
		paging.setTotalCount((int)repairinfoDao.countByExample(example));
	}

	@Override
	public Car carIdQuary(Repairinfo repairinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer repairinfoRemove(Repairinfo repairinfo) {
		if(repairinfo != null){
			repairinfo.setState(0);
		}
		return repairinfoDao.updateByPrimaryKeySelective(repairinfo);
	}

	@Override
	public int updateByPrimaryKeySelective(Repairinfo repairinfo) {
		return repairinfoDao.updateByPrimaryKeySelective(repairinfo);
	}

}
