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
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.biz.workTime.TravelBiz;
import com.hxzy.entity.workTime.Travel;

/**
 *旅游信息表
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="workTime/")
public class TravelController {

	@Resource(name="travelBizImpl")
	TravelBiz travelBizImpl;
	
	/**
	 * 分页显示条数的信息
	 */
	@RequestMapping(value="showTravelInfo")//workTime/showTravelInfo.do
	public ModelAndView showAttendanceinfo(ModelAndView mav,Integer adminIds,Integer page){
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<Travel> travelRoleList = travelBizImpl.findTravelRoleList(adminIds, offset);
		Integer count = travelBizImpl.findTravelRoleCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("travelRoleList", travelRoleList);
		mav.addObject("pages", pages);
		mav.setViewName("travel_list");
		return mav;	
	}
	/**
	 * 添加出差信息
	 * @param travel
	 * @param mav
	 * @param adminIds 模糊查询所用值暂时用不到
	 * @param page
	 * @param beginTimes
	 * @param endTimes
	 * @return
	 */
	@RequestMapping(value="insertTravel")//workTime/insertTravel.do
	public ModelAndView insertAttendance(Travel travel, ModelAndView mav,Integer adminIds,Integer page,String beginTimes,String endTimes){
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date beginTime = sdf.parse(beginTimes);
			Date endTime = sdf.parse(endTimes);
			int days=(int) Math.ceil((endTime.getTime()-beginTime.getTime())/(1000*60*60*24));
			if(days==0){
				days=1;
			}
			travel.setTravelBegin(beginTime);
			travel.setTravelEnd(endTime);
			travel.setTravelTotal(days);
			int addcount = travelBizImpl.insert(travel);
			if(page==null){
				page=0;
			}
			Integer offset =page*2;
			List<Travel> travelRoleList = travelBizImpl.findTravelRoleList(adminIds, offset);
			Integer count = travelBizImpl.findTravelRoleCount(adminIds);
			int ceil = (int)Math.ceil(count*1.0/2);
			int[] pages= new int[ceil];
			for (int i = 0; i < ceil; i++) {
				pages[i]=i;
			}
			mav.addObject("travelRoleList", travelRoleList);
			mav.addObject("pages", pages);
			
			if(addcount>0){
				mav.addObject("addState", "success");
				mav.setViewName("travel_list");
			}else{
				mav.addObject("addState", "failure");
				mav.setViewName("travel_list");
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	
	/**
	 * 
	 * @param travel
	 * @param mav
	 * @param adminIds
	 * @param page
	 * @param beginTimes
	 * @param endTimes
	 * @param travelId
	 * @return
	 */
	@RequestMapping(value="updateTravel")//workTime/updateTravel.do
	public ModelAndView updateAttrendance(Travel travel, ModelAndView mav,Integer adminIds,Integer page,String beginTimes,String endTimes,Integer travelId){
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date beginTime = sdf.parse(beginTimes);
			Date endTime = sdf.parse(endTimes);
			int days=(int) Math.ceil((endTime.getTime()-beginTime.getTime())/(1000*60*60*24));
			if(days==0){
				days=1;
			}
			travel.setTravelBegin(beginTime);
			travel.setTravelEnd(endTime);
			travel.setTravelTotal(days);
			travel.setTravelId(travelId);
			int updateCount = travelBizImpl.updateByPrimaryKey(travel);
			if(page==null){
				page=0;
			}
			Integer offset =page*2;
			List<Travel> travelRoleList = travelBizImpl.findTravelRoleList(adminIds, offset);
			Integer count = travelBizImpl.findTravelRoleCount(adminIds);
			int ceil = (int)Math.ceil(count*1.0/2);
			int[] pages= new int[ceil];
			for (int i = 0; i < ceil; i++) {
				pages[i]=i;
			}
			mav.addObject("travelRoleList", travelRoleList);
			mav.addObject("pages", pages);
			
			if(updateCount>0){
				mav.addObject("updateState", "success");
				mav.setViewName("travel_list");
			}else{
				mav.addObject("updateState", "failure");
				mav.setViewName("travel_list");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	
	@RequestMapping(value="removeTravel")//workTime/removeTravel.do
	public ModelAndView removeAttendance(ModelAndView mav,Integer travelId,Integer adminIds,Integer page){
		
		int deleteCount = travelBizImpl.deleteByPrimaryKey(travelId);
		
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<Travel> travelRoleList = travelBizImpl.findTravelRoleList(adminIds, offset);
		Integer count = travelBizImpl.findTravelRoleCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("travelRoleList", travelRoleList);
		mav.addObject("pages", pages);
		if(deleteCount>0){
			mav.addObject("removeState", "success");
			mav.setViewName("travel_list");
		}else{
			mav.addObject("removeState", "failure");
			mav.setViewName("travel_list");
		}
		return mav;
	}
	
	
	
	
	
	@RequestMapping(value="findTravelAdminId")//workTime/findTravelAdminId.do
	public void findAllAdminId(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		List<Integer> allAdminId = travelBizImpl.findAllAdminId();
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
	
	
}
