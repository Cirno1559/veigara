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

import com.hxzy.biz.workTime.AttendanceBiz;
import com.hxzy.entity.workTime.Attendance;


@Controller
@RequestMapping("workTime/")
public class AttendanceController {

	@Resource(name="attendanceBizImpl")
	AttendanceBiz attendanceBizImpl;
	
	/**
	 * 分页显示条数的信息
	 */
	@RequestMapping(value="showAttendanceinfo")
	public ModelAndView showAttendanceinfo(ModelAndView mav,Integer adminIds,Integer page){
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<Attendance> AttendRoleList = attendanceBizImpl.findAttendRoleList(adminIds, offset);
		Integer count = attendanceBizImpl.findAttendRoleCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("AttendRoleList", AttendRoleList);
		mav.addObject("pages", pages);
		mav.setViewName("attend_list");
		return mav;	
	}
	/**
	 * 添加员工出勤信息 ;
	 * @param attendance
	 * @return
	 */
	@RequestMapping(value="insertAttendance")
	public ModelAndView insertAttendance(Attendance attendance, ModelAndView mav,Integer adminIds,Integer page,String beginTimes,String endTimes){
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<Attendance> AttendRoleList = attendanceBizImpl.findAttendRoleList(adminIds, offset);
		Integer count = attendanceBizImpl.findAttendRoleCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("AttendRoleList", AttendRoleList);
		mav.addObject("pages", pages);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date beginTime = sdf.parse(beginTimes);
			Date endTime = sdf.parse(endTimes);
			attendance.setBeginTime(beginTime);
			attendance.setEndTime(endTime);
			int addcount = attendanceBizImpl.insert(attendance);
			if(addcount>0){
				mav.addObject("addState", "success");
				mav.setViewName("attend_list");
			}else{
				mav.addObject("addState", "failure");
				mav.setViewName("attend_list");
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mav;
	}
	/**
	 * 删除出勤信息
	 * @param mav
	 * @param attendanceId
	 * @return
	 */
	@RequestMapping(value="removeAttendance")
	public ModelAndView removeAttendance(ModelAndView mav,Integer attendanceId,Integer adminIds,Integer page){
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<Attendance> AttendRoleList = attendanceBizImpl.findAttendRoleList(adminIds, offset);
		Integer count = attendanceBizImpl.findAttendRoleCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("AttendRoleList", AttendRoleList);
		mav.addObject("pages", pages);
		int deleteCount = attendanceBizImpl.deleteByPrimaryKey(attendanceId);
		if(deleteCount>0){
			mav.addObject("removeState", "success");
			mav.setViewName("attend_list");
		}else{
			mav.addObject("removeState", "failure");
			mav.setViewName("attend_list");
		}
		return mav;
	}
	/**
	 * 更新方法(有问题)
	 * @param mav
	 * @param attendanceId
	 * @return
	 */
	@RequestMapping(value="updateAttrendance")
	public ModelAndView updateAttrendance(Attendance attendance, ModelAndView mav,Integer adminIds,Integer page,String beginTimes,String endTimes,Integer attendanceId){
		if(page==null){
			page=0;
		}
		Integer offset =page*2;
		List<Attendance> AttendRoleList = attendanceBizImpl.findAttendRoleList(adminIds, offset);
		Integer count = attendanceBizImpl.findAttendRoleCount(adminIds);
		int ceil = (int)Math.ceil(count*1.0/2);
		int[] pages= new int[ceil];
		for (int i = 0; i < ceil; i++) {
			pages[i]=i;
		}
		mav.addObject("AttendRoleList", AttendRoleList);
		mav.addObject("pages", pages);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date beginTime = sdf.parse(beginTimes);
			Date endTime = sdf.parse(endTimes);
			attendance.setBeginTime(beginTime);
			attendance.setEndTime(endTime);
			attendance.setAttendanceId(attendanceId);
			int updateCount = attendanceBizImpl.updateByPrimaryKey(attendance);
			if(updateCount>0){
				mav.addObject("updateState", "success");
				mav.setViewName("attend_list");
			}else{
				mav.addObject("updateState", "failure");
				mav.setViewName("attend_list");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value="findAllAdminId")
	public void findAllAdminId(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		List<Integer> allAdminId = attendanceBizImpl.findAllAdminId();
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
