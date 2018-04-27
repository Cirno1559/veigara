package com.hxzy.controller.workTime;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.workTime.OverTimeBiz;
import com.hxzy.biz.workTime.OverTimeTypeBiz;
import com.hxzy.entity.workTime.OverTimePojo;
import com.hxzy.entity.workTime.Overtime;
import com.hxzy.entity.workTime.Overtimetype;



@Controller
@RequestMapping(value="workTime/")
public class OverTimeController {

	@Resource(name="overTimeBizImpl")
	OverTimeBiz overTimeBizImpl;
	
	@Resource(name="overTimeTypeBizImpl")
	OverTimeTypeBiz overTimeTypeBizImpl;
	
	
	
	/**
	 * 动态显示信息
	 * @param mav
	 * @param adminIds
	 * @param page
	 * @return
	 */
	@RequestMapping(value="showOverTimeInfo")//workTime/showOverTimeInfo.do
	public ModelAndView showOverTimeInfo(ModelAndView mav,Integer adminIds,Integer page){
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<OverTimePojo> overTimeList = overTimeBizImpl.findOverTimeInfo(adminIds, offset);
		Integer count = overTimeBizImpl.findOverTimeCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("overTimeList", overTimeList);
		mav.addObject("pages", pages);
		mav.setViewName("overTime_list");
		return mav;	
	}
	/**
	 * 删除信息
	 * @param mav
	 * @param overTimeId
	 * @param adminIds
	 * @param page
	 * @return
	 */
	@RequestMapping(value="removeOverTime")//workTime/removeOverTime.do
	public ModelAndView removeAttendance(ModelAndView mav,Integer overTimeId,Integer adminIds,Integer page){
		int deleteCount = overTimeBizImpl.deleteByPrimaryKey(overTimeId);
		
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<OverTimePojo> overTimeList = overTimeBizImpl.findOverTimeInfo(adminIds, offset);
		Integer count = overTimeBizImpl.findOverTimeCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("overTimeList", overTimeList);
		mav.addObject("pages", pages);
		
		if(deleteCount>0){
			mav.addObject("removeState", "success");
			mav.setViewName("overTime_list");
		}else{
			mav.addObject("removeState", "failure");
			mav.setViewName("overTime_list");
		}
		return mav;
	}
	
	
	
	/**
	 * 添加加班信息
	 * @param overTime
	 * @param mav
	 * @param adminIds
	 * @param page
	 * @param beginTimes
	 * @param endTimes
	 * @return
	 */
	@RequestMapping(value="insertOverTime")//workTime/insertOverTime.do
	public ModelAndView insertAttendance(Overtime overTime, ModelAndView mav,Integer adminIds,Integer page,String beginTimes,String endTimes){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date beginTime = sdf.parse(beginTimes);
			Date endTime = sdf.parse(endTimes);
			int hours= (int)Math.floor((endTime.getTime()-beginTime.getTime())/(1000*60*60));
			
			overTime.setOverTimeTotal(hours);
			overTime.setOverTimeBegin(beginTime);
			overTime.setOverTimeEnd(endTime);
			int addcount=0;
			if(hours!=0){
				addcount = overTimeBizImpl.insert(overTime);
			}
			
			if(page==null){
				page=0;
			}
			Integer offset =page*2;
			List<OverTimePojo> overTimeList = overTimeBizImpl.findOverTimeInfo(adminIds, offset);
			Integer count = overTimeBizImpl.findOverTimeCount(adminIds);
			int ceil = (int)Math.ceil(count*1.0/2);
			int[] pages= new int[ceil];
			for (int i = 0; i < ceil; i++) {
				pages[i]=i;
			}
			mav.addObject("overTimeList", overTimeList);
			mav.addObject("pages", pages);
			
			if(addcount>0){
				mav.addObject("addState", "success");
				mav.setViewName("overTime_list");
			}else{
				mav.addObject("addState", "failure");
				mav.setViewName("overTime_list");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	
	@RequestMapping(value="updateOverTime")//workTime/updateOverTime.do
	public ModelAndView updateOverTime(Overtime overTime, ModelAndView mav,Integer adminIds,Integer page,String beginTimes,String endTimes,Integer overTimeId){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date beginTime = sdf.parse(beginTimes);
			Date endTime = sdf.parse(endTimes);
			int hours= (int)Math.floor((endTime.getTime()-beginTime.getTime())/(1000*60*60));
			
			overTime.setOverTimeTotal(hours);
			overTime.setOverTimeBegin(beginTime);
			overTime.setOverTimeEnd(endTime);
			overTime.setOverTimeId(overTimeId);
			int updateCount=0;
			if(hours!=0){
				updateCount = overTimeBizImpl.updateByPrimaryKey(overTime);
			}
			
			if(page==null){
				page=0;
			}
			Integer offset =page*2;
			List<OverTimePojo> overTimeList = overTimeBizImpl.findOverTimeInfo(adminIds, offset);
			Integer count = overTimeBizImpl.findOverTimeCount(adminIds);
			int ceil = (int)Math.ceil(count*1.0/2);
			int[] pages= new int[ceil];
			for (int i = 0; i < ceil; i++) {
				pages[i]=i;
			}
			mav.addObject("overTimeList", overTimeList);
			mav.addObject("pages", pages);
			
			if(updateCount>0){
				mav.addObject("updateState", "success");
				mav.setViewName("overTime_list");
			}else{
				mav.addObject("updateState", "failure");
				mav.setViewName("overTime_list");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	
	
	
	/**
	 * 查询角色id列表
	 * @param response
	 */
	@RequestMapping(value="findoverTimeAdminId")//workTime/findAllAdminId.do
	public void findAllAdminId(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		List<Integer> allAdminId = overTimeBizImpl.findAllAdminId();
		PrintWriter writer= null;
		try {
			writer = response.getWriter();
			writer.write("<option value=\"qingxuanzhe\">-请选择-</option>");
			
			for (Integer integer : allAdminId) {
				writer.write("<option value="+integer+">"+integer+"</option>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			writer.flush();
			writer.close();
		}
	}
	
	
	@RequestMapping(value="findOverTimeType")//workTime/findOverTimeType.do
	@ResponseBody
	public List<Overtimetype> findOverTimeType(){
		
		List<Overtimetype> allOverTimeType = overTimeTypeBizImpl.findAllOverTimeType();
		
		return allOverTimeType;
	}
	
	
}
