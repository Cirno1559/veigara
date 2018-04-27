<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加爱车</title>
		<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
		<%@ include file="../../sales-plugin/common/common.jsp" %>
</head>
<body>
		<div class="main_box">
			<div class="cont_box editpro_box">
				<form action="repairinfoAdd.do" method="post" id="user_form">
					<ul class="addpro_box adduser_box">
						<li>
							<label>车牌号：</label>
							<input type="text" placeholder="请输入车牌号码" name="carId" id="carId" required data-rule-isCarNo="true" data-msg-required="车牌号码不能为空"/>
						</li>
						<li>
							<label>修理时间：</label>
							<input type="text" placeholder="请输入修理时间" name="repairinfoTime" id="repairinfoTime" required data-rule-isCarNo="true" data-msg-required="修理时间不能为空"/>
						</li>
						<li>
							<label>维修原因：</label>
							<input type="text" placeholder="请输入维修原因" name="repairinfoRaccount" id="repairinfoRaccount" required data-rule-isCarNo="true" data-msg-required="维修原因不能为空"/>
						</li>
						<li>
							<label>经办人：</label>
							<input type="text" placeholder="请输入经办人" name="adminId" id="adminId" required data-rule-isCarNo="true" data-msg-required="经办人不能为空"/>
						</li>
						<li>
							<label>行驶里程：</label>
							<input type="text" placeholder="请输入行驶里程" name="repairinfoOda" required data-rule-mileage="true" data-msg-required="行驶里程不能为空"/>
						</li>
						
						
						
					</ul>
					<div class="probtn_box clearfix">
						<input type="button" value="添加修理表单" class="btn blue_btn submit"/>
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
				
				<!--layer弹框iframe插件-->
				$(":button").click(function(){	
				var carId = $.trim($("#carId").val());	
				var repairinfoTime = $.trim($("#repairinfoTime").val());
				var repairinfoRaccount = $.trim($("#repairinfoRaccount").val());
				var adminId = $.trim($("#adminId").val());
				var repairinfoOda = $.trim($("#repairinfoOda").val());
				var data = {carId:carId,repairinfoTime:repairinfoTime,repairinfoRaccount:repairinfoRaccount,repairinfoOda:repairinfoOda,adminId:adminId};
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/aftersales/repairinfoAdd.do",
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