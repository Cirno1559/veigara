<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
<%@ include file="../../sales-plugin/common/common.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
</head>
<body>
	<div class="main_box container">
			<h2><span></span>出勤信息列表</h2>
			<div class="cont_box">
				<!-- 判断是否删除成功 -->
				<p><c:if test="${removeState =='success'}"><strong><span style="color:green">删除成功!</span></strong></c:if>
					<c:if test="${removeState =='failure'}"><strong><span style="color:red">删除失败!</span></strong></c:if>
				<p>
				<p><c:if test="${updateState =='success'}"><strong><span style="color:green">修改成功!</span></strong></c:if>
					<c:if test="${updateState =='failure'}"><strong><span style="color:red">修改失败!</span></strong></c:if>
				<p>
				<table border="0" cellspacing="0" cellpadding="0" class="table" id="table_box">
				<thead>
					<tr>
						<th>用户编号</th>
						<th>上班时间</th>
						<th>下班时间</th>
						<th>缺勤描述:0: 缺勤 1：出勤  2：迟到</th>
						
						<th width="268">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${AttendRoleList }" var="role">
					<tr>
						
						<th>${role.adminId }</th>
						<th>${role.beginTime }</th>
						<th>${role.endTime }</th>
						<th>${role.unAttendance }</th>
						<td>
							<a  href="javascript:void(0)" class="table_btn table_edit edit_btn edit"  abc="${role.attendanceId }">
								<span>编辑</span>
							</a>
							<a href="${pageContext.request.contextPath}/workTime/removeAttendance.do?attendanceId=${role.attendanceId}" class="table_btn table_del del_btn"  >
								<i class="fa fa-trash-o"></i>
								<span>删除</span>
							</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<p>页码:<c:forEach items="${pages }" var="page">
			<a href="${pageContext.request.contextPath}/workTime/showAttendanceinfo.do?page=${page}">第${page+1 }页</a>
			</c:forEach>
			</p>
		</div>
		<p><a id="add" href="javascript:void(0)" class="btn blue_btn ">添加员工出勤信息</a></p>
		<br/>
		<br/>
		<!-- 判断是否添加成功 -->
		<p><c:if test="${addState =='success'}"><span style="color:green">添加成功</span></c:if>
		<c:if test="${addState =='failure'}"><span style="color:red">添加失败</span></c:if>
		<p>
		<div id="div1" style="display: none" >
			<form action="${pageContext.request.contextPath}/workTime/insertAttendance.do" method="post" id="addPro_form" >
					<ul class="addpro_box">
						<li>
							<label>用户编号：</label>
							<select name="adminId" class="select">
								
								<!-- xianshi -->
							</select>
						</li>
						<li>
							<label>上班时间：</label>
							<input type="text"   name="beginTimes" id="beginTime1" />
						</li>
						<li>
							<label>下班时间：</label>
							<input type="text"  name="endTimes" id="endTime1"/>
						</li>
						<li>
							<label>缺勤描述：</label>
							<select name="unAttendance">
								<option value="100">-请选择-</option>
								<option value="0">缺勤</option>
								<option value="1">出勤</option>
								<option value="2">迟到</option>
							</select>
						</li>
					</ul>
					<div class="probtn_box clearfix">
						<input type="submit" value="添加信息" class="btn blue_btn submit"/>&nbsp;&nbsp;&nbsp;&nbsp;<input id="no" type="button" value="取消" class="btn blue_btn submit"/>
					</div>
				</form>
		</div>
		<div id="div2" style="display: none" >
				<form action="" method="post" id="editPro_form">
					<ul class="addpro_box">
						<li>
						
							<label>用户编号：</label>
							<select name="adminId" class="select">
								
								<!-- xianshi -->
							</select>
						</li>
						<li>
							<label>上班时间：</label>
							<input type="text"  name="beginTimes" id="beginTime2" />
						</li>
						<li>
							<label>下班时间：</label>
							<input type="text"  name="endTimes" id="endTime2" />
						</li>
						<li>
							<label>出勤描述：</label>
							<select name="unAttendance" class="select">
								<option value="100">-请选择-</option>
								<option value="0">缺勤</option>
								<option value="1">出勤</option>
								<option value="2">迟到</option>
							</select>
						</li>
					</ul>
					<div class="probtn_box clearfix">
						<input type="submit" value="保存修改" class="btn blue_btn submit"/>
						<input id="close" type="button" value="取消" class="btn blue_btn submit"/>
					</div>
				</form>
			</div>
	</div>

<%@ include file="../../sales-plugin/common/admin-common-foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
<script src="${pageContext.request.contextPath }/sales-plugin/laydate/laydate.js"></script>
<script>
		//执行一个laydate实例
		laydate.render({
		  elem: '#beginTime2' //指定元素
		});
		laydate.render({
			elem: '#endTime2' //指定元素
		});
		laydate.render({
			  elem: '#beginTime1' //指定元素
		});
		laydate.render({
			elem: '#endTime1' //指定元素
		});
</script>
<script>
		$(function(){
			$(".edit").click(function(){
				$("#div2").css("display","block");
			})
			$("#close").click(function(){
				$("#div2").css("display","none");
			})
			$("#add").click(function(){
				$("#div1").css("display","block");
			})
			$("#no").click(function(){
				$("#div1").css("display","none");
			})
			//添加点击事件ajax
				var url= "${pageContext.request.contextPath}/workTime/findAllAdminId.do"
				$.get(url,function(data){
					$(".select").html($(data))
				})
		
		$(".edit").click(function(){
			
			var attendanceId=$(this).attr("abc");
			var url ="${pageContext.request.contextPath}/workTime/updateAttrendance.do?attendanceId="+attendanceId;
			$("#div2 form").attr("action",url);
			var b= $("#div2 form").attr("action");
			//alert(b)
		})
		
			
			
		})	
</script>
</body>
</html>