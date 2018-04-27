package com.hxzy.biz.impl.aftersales;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxzy.biz.aftersales.CarBiz;
import com.hxzy.dao.aftersales.CarMapper;
import com.hxzy.entity.aftersales.Car;
import com.hxzy.entity.aftersales.CarExample;
import com.hxzy.entity.aftersales.CarExample.Criteria;
import com.hxzy.util.PageUtil;
@Service
public class CarBizImpl implements CarBiz {
@Resource
CarMapper carDao;

@Override
public Integer carAdd(Car car) {
	Car carById = carDao.selectByPrimaryKey(car.getCarId()); 
	if(carById != null){
		carById.setCarId(car.getCarId());
		carById.setCarName(car.getCarName());
		carById.setCarOdo(car.getCarOdo());
		carById.setCarVersion(car.getCarVersion());
		carById.setCarState(1);
		return carDao.updateByPrimaryKeySelective(carById);
	}else{
		return carDao.insertSelective(car);
	}
	
}

@Override
public void pagingQuery(PageUtil<Car> paging, Map<String, Object> map) {
	CarExample example = new CarExample();
	Criteria c = example.createCriteria();
	c.andCarStateEqualTo(1);//根据显示状态查询
	example.setOffset(paging.getExclude());
	example.setLimit(paging.getPageSize());
	if(map!=null) {
		for (String   key: map.keySet()) {
			if(key.equalsIgnoreCase("carId")) {
				c.andCarIdEqualTo(Integer.valueOf(map.get(key).toString()));
			}
			if(key.equalsIgnoreCase("carVersion")){
				c.andCarVersionEqualTo(map.get(key).toString());
			}
		}
	}
	paging.setData(carDao.selectByExample(example));
	paging.setTotalCount((int)carDao.countByExample(example));

}
	


@Override
public Car carIdQuaryAll(Integer carId) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Integer carRemove(Car car) {
	if(car != null){
		car.setCarState(0);
	}
	return carDao.updateByPrimaryKey(car);
}

/**
 * 根据汽车主键carId修过信息
 * @param car
 * @return
 */
public int updateByPrimaryKeySelective(Car car) {
	return carDao.updateByPrimaryKeySelective(car);
}

}
