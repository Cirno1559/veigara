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
	<div class="main_box">
			<h2><span></span>添加供应商信息</h2>
				<dl class="tab_conbox">				
					<!--添加-->					
					<dd>
						<form action="manufacturerAdd.do" method="post" id="edit_user">
							<div class="addpro_box clearfix">
								<label>供应商名称：</label>
								<input type="text" style="height: 36px;" value="" id="manufacturerName" required data-rule-fullname="true" data-msg-required="供应商名称不能为空"/>
							</div>
							<div class="addpro_box clearfix">
								<label>供应商地址：</label>
								<input type="text"style="height: 36px;" value="" id="manufacturerAddress" required data-rule-mobile="true" data-msg-required="供应商地址不能为空"/>
							</div>
							<div class="addpro_box clearfix">
								<label>备注：</label>
								<input type="text" style="height: 36px;"id="manufacturerContent" value="" />
							</div>							
							<div class="probtn_box clearfix">
								<input type="button" value="保存" class="btn blue_btn submit" >
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
				$("#manufacturerName").change(function(){
					var manufacturerName = $.trim($(this).val());
					var data = {manufacturerName: manufacturerName}
					$.ajax({
						 type: "POST",
			               url: "${pageContext.request.contextPath}/sales/manufacturerQueryByName.do",
			               data: data,
			               success:function(msg) {
			            	   if (msg == "success"){
			            		   layer.tips('该名称已经存在', '#manufacturerName', {
			            			   tips: [1, '#FF4500'],
			            			   time: 4000
			            			 });
			            		   $(":button").addClass("disabled");           		   
			            		   
			            	   }else if(msg == "fail"){
			            		   layer.tips('该名称可以使用', '#manufacturerName', {
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
				var manufacturerName = $.trim($("#manufacturerName").val());
				var manufacturerAddress = $.trim($("#manufacturerAddress").val());
				var manufacturerContent = $.trim($("#manufacturerContent").val());				
				var data = {manufacturerName: manufacturerName, manufacturerAddress: manufacturerAddress,manufacturerContent:manufacturerContent};
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/sales/manufacturerAdd.do",
		               data: data,
		               success: function (msg) {
		                   if (msg == "success") {
		                	   layer.alert('添加成功',function(){
		                		   var index = parent.layer.getFrameIndex(window.name);  
		       						parent.layer.close(index)});<!--关闭父级窗口-->		
		       						window.location.href="${pageContext.request.contextPath}/sales/manufacturerQuery.do";
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
</body>
</html>