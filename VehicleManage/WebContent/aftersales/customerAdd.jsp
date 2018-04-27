<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加客户</title>
		<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
		<%@ include file="../../sales-plugin/common/common.jsp" %>
</head>
<body>
		<div class="main_box">
			<div class="cont_box editpro_box">
				<form action="customerAdd.do" method="post" id="user_form">
					<ul class="addpro_box adduser_box">
						<li>
							<label>客户编号：</label>
							<input type="text" placeholder="请输入客户编号" id="customerId"  required data-rule-isCarNo="true" data-msg-required="客户编号不能为空"/>
						</li>
						<li>
							<label>客户名称：</label>
							<input type="text" placeholder="请输入客户名称" id="customerName"  required data-rule-isCarNo="true" data-msg-required="客户名称不能为空"/>
						</li>
						<li>
							<label>客户证件：</label>
							<input type="text" placeholder="请输入证件号码" id="customerNo" required data-rule-mileage="true" data-msg-required="证件号码不能为空"/>
						</li>
						<li>
							<label>客户电话：</label>
							<input type="text"  placeholder="请输入客户电话" id="customerPhone" required data-rule-mileage="true" data-msg-required="电话号码不能为空"/>
						</li>
						
						<li>
							<label>车辆号码：</label>
							<input type="text" placeholder="请输入车辆号码" id="carId" required data-rule-isCarNo="true" data-msg-required="车辆号码不能为空"/>
						</li>
					</ul>
					<div class="probtn_box clearfix">
						<input type="button" value="添加客户" class="btn blue_btn submit"/>
					</div>
				</form>
			</div>
		</div>
		<!--javascript include-->
		<%@ include file="../../sales-plugin/common/admin-common-foot.jsp" %>
		<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
		<script>
			$(function(){
				$.jqtab(".tab_tit",".tab_conbox","click");
				$("#customerId").change(function(){
					var customerId = $.trim($(this).val());
					var data = {customerId: customerId}
					$.ajax({
						 type: "POST",
			               url: "${pageContext.request.contextPath}/aftersales/customerQuery.do",
			               data: data,
			               success:function(msg) {
			            	   if (msg == "success"){
			            		   layer.tips('该名称已经存在', '#customerId', {
			            			   tips: [1, '#FF4500'],
			            			   time: 4000
			            			 });
			            		   $(":button").addClass("disabled");           		   
			            		   
			            	   }else if(msg == "fail"){
			            		   layer.tips('该名称可以使用', '#customerId', {
			            			   tips: [1, '#3595CC'],
			            			   time: 4000
			            			 });
			            		   $(":button").removeClass("disabled");
			            		  

			            	   }
			               }
					})
				});
				<!--layer弹框iframe插件-->
				$(":button").click(function(){	
				var customerId = $.trim($("#customerId").val());	
				var customerName = $.trim($("#customerName").val());
				var customerNo = $.trim($("#customerNo").val());
				var customerPhone = $.trim($("#customerPhone").val());
				var carId = $.trim($("#carId").val());
				var data = {customerId:customerId,customerName:customerName,customerNo:customerNo,customerPhone:customerPhone,carId:carId};
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/aftersales/customerAdd.do",
		               data: data,
		               success: function (msg) {
		                   if (msg == "success") {
		                	   layer.alert('添加成功',function(){
		                		   var index = parent.layer.getFrameIndex(window.name);  
		       						parent.layer.close(index)});<!--关闭父级窗口-->	
		               		}else if (msg == "fail") {
		               			layer.alert("添加失败！",function(){
			                		   var index = parent.layer.getFrameIndex(window.name);  
			       						parent.layer.close(index)});
			                      
			                   }
		                		 		                    
		                   }	              
		           });
					
				})
			})
		</script>
	</body>
</html>