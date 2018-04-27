<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<h2><span></span>修改车辆信息</h2>
				<dl class="tab_conbox">				
					<!--添加-->					
					<dd>
						<form action="carUpdate.do" method="post" id="edit_user">
							<input type="hidden" style="height: 36px;" value="${ carId}" id="carId" />
							<div class="addpro_box clearfix">
								<label>车辆名称：</label>
								<input type="text" style="height: 36px;" value="${ carName}" id="carName" required data-rule-fullname="true" data-msg-required="车辆名称不能为空"/>
							</div>
							<div class="addpro_box clearfix">
								<label>行驶里程数：</label>
								<input type="text"style="height: 36px;" value="${ carOdo}" id="carOdo" required data-rule-mobile="true" data-msg-required="行驶里程数不能为空"/>
							</div>
							<div class="addpro_box clearfix">
								<label>车辆类型：</label>
								<input type="text" style="height: 36px;"id="carVersion" value="${ carVersion}" required data-rule-mobile="true" data-msg-required="车辆类型不能为空"/>
							</div>							
							<div class="probtn_box clearfix">
								<input type="button" value="保存" class="btn blue_btn submit" id="submit">
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
				$(":button").click(function(){
					
				var carId=$.trim($("#carId").val());
				var carName = $.trim($("#carName").val());
				var carOdo = $.trim($("#carOdo").val());
				var carVersion = $.trim($("#carVersion").val());
				var data = {carId:carId,carName: carName, carOdo: carOdo,carVersion:carVersion};
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/aftersales/carUpdate.do?time="+new Date(),
		               data: data,
		               success: function (msg) {
		                   if (msg == "success") {
		                	   layer.alert('添加成功',function(index, layero){		                		    
		                		   layer.close(index);
		                		   window.location.href="carQuery.do";   
		                	   });
		                	   
		               		}else if (msg == "fail") {
		               			layer.alert('添加失败',function(index, layero){		                		    
			                		   layer.close(index)});
			                      
			                   }
		                		 		                    
		                   }	              
		           });
					
				});
			})
		</script>
</body>
</html>