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
				<form action="carAdd.do" method="post" id="user_form">
					<ul class="addpro_box adduser_box">
						<li>
							<label>车牌号：</label>
							<input type="text" placeholder="请输入车牌号码" name="carId" id="carId" required data-rule-isCarNo="true" data-msg-required="车牌号码不能为空"/>
						</li>
						<li>
							<label>行驶里程：</label>
							<input type="text" placeholder="请输入行驶里程" name="carOdo" required data-rule-mileage="true" data-msg-required="行驶里程不能为空"/>
						</li>
						<li>
							<label>保险到期日：</label>
							<input type="text" class="choose_date" placeholder="请选择保险到期日" name="chdate" readonly required data-msg-required="保险到期日不能为空"/>
						</li>
						<li>
							<label>车品牌型号：</label>
							<div class="select_group" id="carmodel">
								<select name="carVersion" class="carbrand" required data-msg-required="车品牌型号不能为空">
									<option value="">请选择</option>
									<option value="奥迪">奥迪</option>
									<option value="大众">大众</option>
									<option value="奔驰">奔驰</option>
									<option value="宝马">宝马</option>
									<option value="福特">福特</option>
								</select>
								
							</div>
						</li>
						<li>
							<label>车辆名称：</label>
							<input type="text" placeholder="请输入车辆名称" name="carName" required data-rule-isCarNo="true" data-msg-required="车辆名称不能为空"/>
						</li>
					</ul>
					<div class="probtn_box clearfix">
						<input type="button" value="添加爱车" class="btn blue_btn submit"/>
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
				$("#carId").change(function(){
					var carId = $.trim($(this).val());
					var data = {carId: carId}
					$.ajax({
						 type: "POST",
			               url: "${pageContext.request.contextPath}/aftersales/carQuery.do",
			               data: data,
			               success:function(msg) {
			            	   if (msg == "success"){
			            		   layer.tips('该名称已经存在', '#carId', {
			            			   tips: [1, '#FF4500'],
			            			   time: 4000
			            			 });
			            		   $(":button").addClass("disabled");           		   
			            		   
			            	   }else if(msg == "fail"){
			            		   layer.tips('该名称可以使用', '#carId', {
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
				var carId = $.trim($("#carId").val());	
				var carName = $.trim($("#carName").val());
				var carVersion = $.trim($("#carVersion").val());
				var carOdo = $.trim($("#carOdo").val());
				var data = {carId:carId,carName:carName,carOdo:carOdo,carVersion:carVersion};
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/aftersales/carAdd.do",
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