<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
<%@ include file="../../sales-plugin/common/common.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
</head>
<body>
	<div class="main_box">
			<h2><span></span>修改用户信息</h2>
				<dl class="tab_conbox">				
					<!--添加-->					
					<dd>
						<form action="manufacturerUpdate.do" method="post" id="edit_user">
							
							<div class="addpro_box clearfix">
								<label>用户名称：</label>
								<input type="text" style="height: 36px;" value="${ admin.adminLoginName}" id="adminLoginName" required data-rule-fullname="true" data-msg-required="供应商名称不能为空"/>
							</div>
							<div class="addpro_box clearfix">
								<label>用户密码：</label>
								<input type="text"style="height: 36px;" value="" id="adminLoginPwd" required data-rule-mobile="true" data-msg-required="供应商地址不能为空"/>
							</div>
							<div class="addpro_box clearfix">
								<label>部门：</label>
								<select  name="department.departmentId" id="depar"><!--部门下拉框  -->
									<option value="">请选择</option>
								</select>																				
							</div>
							<div class="addpro_box clearfix">
								<label>职位：</label>
								<select  name="job.jobId" id="jobn"><!--部门下拉框  -->
									<option value="">请选择</option>
								</select>																				
							</div>	
							<div class="addpro_box clearfix">
								<label>角色：</label>
								<select  name="role.roleId" id="rolen"><!--部门下拉框  -->
									<option value="">请选择</option>
								</select>																				
							</div>	
							<div class="addpro_box clearfix">
								<label>状态：</label>
								<select  name="adminState" id="adminState"><!--部门下拉框  -->
									<option value="">请选择</option>
									<option value="1" <c:if test="${ admin.adminState ==1}">selected="selected"</c:if>>在职</option>
									<option value="0" <c:if test="${ admin.adminState ==0}">selected="selected"</c:if>>离职</option>
								</select>																				
							</div>									
							<div class="probtn_box clearfix">
								<input type="button" value="保存" class="btn blue_btn submit" id="submit">
							</div>
							<input type="hidden" style="height: 36px;" value="${ admin.adminId}" id="adminId" />
							<input type="hidden" style="height: 36px;" value="${ admin.department.departmentId}" id="departmentId" />
							<input type="hidden" style="height: 36px;" value="${ admin.job.jobId}" id="jobId" />
							<input type="hidden" style="height: 36px;" value="${ admin.role.roleId}" id="roleId" />
							
						</form>
					</dd>				
				</dl>					
					</div>	  				
			</div>
		</div>
		<!--javascript include-->
		<%@ include file="../../sales-plugin/common/admin-common-foot.jsp" %>
		<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
		<script>
			$(function(){
				$.jqtab(".tab_tit",".tab_conbox","click");
				
			
				<!--layer弹框iframe插件-->
				$(":button").click(function(){
					var adminId = $.trim($("#adminId").val());
					var adminLoginName = $.trim($("#adminLoginName").val());
					var adminLoginPwd = $.trim($("#adminLoginPwd").val());
					var department = $.trim($("#depar").val());
					var job = $.trim($("#jobn").val());
					var role = $.trim($("#rolen").val());
					var adminState = $.trim($("#adminState").val());
					
					var data = {"adminId":adminId,"adminLoginName": adminLoginName, "adminLoginPwd": adminLoginPwd,"department.departmentId":department,"job.jobId":job,"role.roleId":role,"adminState":adminState};
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/authority/adminUpdate.do?time="+new Date(),
		               data: data,
		               success: function (msg) {
		                   if (msg == "success") {
		                	   layer.alert('添加成功',function(index, layero){		                		    
		                		   layer.close(index);
		                		   window.location.href="adminQuery.do";   
		                	   });
		                	   
		               		}else if (msg == "fail") {
		               			layer.alert('添加失败',function(index, layero){		                		    
			                		   layer.close(index)});
			                      
			                   }
		                		 		                    
		                   }	              
		           });
					
				});
				
				$.ajax({
					 type: "POST",
		               url: "${pageContext.request.contextPath }/authority/sendDepartment.do",
		               data:'',
		               success:function(data) {
		            	   var $sel=$("#depar")
						   var optValue=$("#departmentId").val();
		            	   
						  for(var i = 0;i<data.length;i++){  
						    $item = $("<option > </option>");  //添加option  
						    $item.val(data[i].departmentId);//添加option的value ，<span style="line-height:1.5;white-space:pre-wrap;font-family:Arial, Helvetica, sans-serif;"><span style="font-size:10px;">数据库中用id和type保存的数据</span></span>  						                             
						    //将后台传的值选中
						    if($item.val()==optValue){
						    	$item.attr("selected","selected");
						    }
						    //添加option的value ，<span style="line-height:1.5;white-space:pre-wrap;font-family:Arial, Helvetica, sans-serif;"><span style="font-size:10px;">数据库中用id和type保存的数据</span></span>  						                                 
						    $text=$item.text(data[i].departmentName);
						   
						    //添加option数据  
						    $sel.append($item); //将option添加进select  
						   }  
		            	   }
		               })
		             
				$.ajax({
					 type: "POST",
		               url: "${pageContext.request.contextPath }/authority/sendJob.do",
		               data:'',
		               success:function(data) {
		            	   var $sel=$("#jobn")
						     var optValue=$("#jobId").val();
						  for(var i = 0;i<data.length;i++){  
						    $item = $("<option></option>");  //添加option  
						    $item.val(data[i].jobId);      //添加option的value ，<span style="line-height:1.5;white-space:pre-wrap;font-family:Arial, Helvetica, sans-serif;"><span style="font-size:10px;">数据库中用id和type保存的数据</span></span>  						                                 
						    //将后台传的值选中
						    if($item.val()==optValue){
						    	$item.attr("selected","selected");
						    }
						    $text=$item.text(data[i].jobName);
						  
						    //添加option数据  
						    $sel.append($item); //将option添加进select  
						   }  
		            	   }
		               })
		               
						$.ajax({
					 type: "POST",
		               url: "${pageContext.request.contextPath }/authority/sendRoleAjax.do",
		               data:'',
		               success:function(data) {
		            	   var $sel=$("#rolen")
						    var optValue=$("#roleId").val();
						  for(var i = 0;i<data.length;i++){
							  
						    $item = $("<option></option>");  //添加option  
						    $item.val(data[i].roleId);      //添加option的value ，<span style="line-height:1.5;white-space:pre-wrap;font-family:Arial, Helvetica, sans-serif;"><span style="font-size:10px;">数据库中用id和type保存的数据</span></span>  						                                 
						  //将后台传的值选中
						    if($item.val()==optValue){
						    	$item.attr("selected","selected");
						    }
						    $text=$item.text(data[i].roleName);
						  
						    //添加option数据  
						    $sel.append($item); //将option添加进select  
						   }  
		            	   }
		               });
		              
			})
			
			 
		</script>
		
	</body>
</body>
</html>