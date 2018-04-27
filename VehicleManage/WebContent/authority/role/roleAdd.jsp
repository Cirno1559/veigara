<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加菜单</title>
<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
<%@ include file="../../sales-plugin/common/common.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
</head>
<body>
	<div class="main_box">
			<h2><span></span>添加角色信息</h2>
				<dl class="tab_conbox">				
					<!--添加-->					
					<dd>
						<form action="adminAdd.do" method="post" id="edit_user">
							<div class="addpro_box clearfix">
								<label>角色名称：</label>
								<input type="text" style="height: 36px;" value="" id="roleName" required data-rule-fullname="true" data-msg-required="角色名称不能为空"/>		
							</div>																			
							<div class="probtn_box clearfix">
								<input type="button" value="保存" class="btn blue_btn submit" style="margin-top: 50px;margin-left:50px">
							</div>
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
				$("#roleName").blur(function(){
					var roleName = $.trim($("#roleName").val());
					if(roleName ==''){						
						layer.tips('该名称不能为空', '#roleName', {
	         			   tips: [1, '#FF4500'],
	         			   time: 4000
	         			 });
						 $(":button").addClass("disabled"); 
					}
				})
				
				$(":button").click(function(){					
					var roleName = $.trim($("#roleName").val());
							
				if(roleName!=''){
				
					var data = {roleName: roleName}	;
          		 $.ajax({
		               type: "POST",
		                url: "${pageContext.request.contextPath}/authority/roleAdd.do", 
		               data: data,
		               success: function (msg) {
		                   if (msg == "success") {
		                	   layer.alert('添加成功',function(){
		                		   var index = parent.layer.getFrameIndex(window.name);  
		       						parent.layer.close(index);
		       					 window.location.href="${pageContext.request.contextPath}/authority/roleQuery.do"; 
		                	   });<!--关闭父级窗口-->	
		       						
		               		}else if (msg == "fail") {
		               			layer.alert("添加失败！",function(){
			                		   var index = parent.layer.getFrameIndex(window.name);  
			       						parent.layer.close(index)});
		               			
			                   }
		                		 		                    
		                   }	              
		          	 });
					}
				})
				
				
				
		           
						
			})
			
		</script>
	</body>
</body>
</html>