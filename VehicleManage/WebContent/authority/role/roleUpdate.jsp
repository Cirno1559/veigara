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
			<h2><span></span>修改菜单信息</h2>
							
					<!--添加-->					
					<dd>
						
							
							<div class="addpro_box clearfix">
								<label>菜单名称：</label>
								<input type="text" style="height: 36px;" value="${ role.roleName}" id="roleName" required data-rule-fullname="true" data-msg-required="角色名称不能为空"/>
							</div>
							<div class="probtn_box clearfix">
								<input type="button" value="保存" class="btn blue_btn submit" id="submit" style="margin-top: 50px;margin-left:50px">
								<input type="hidden" style="height: 36px;" value="${ role.roleId}" id="roleId" />
							</div>
						
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
					
					var roleId = $.trim($("#roleId").val());
					var roleName = $.trim($("#roleName").val());
					
					
					 var data1 = {"roleId":roleId,"roleName": roleName};
					
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/authority/roleUpdate.do?time="+new Date(),
		               data: data1,
		               success: function (msg) {
		                   if (msg == "success") {
		                	   layer.alert('修改成功',function(index, layero){		                		    
		                		   layer.close(index);
		                		   window.location.href="roleQuery.do";   
		                	   });
		                	   
		               		}else if (msg == "fail") {
		               			layer.alert('修改失败',function(index, layero){		                		    
			                		   layer.close(index)});
			                      
			                   }
		                		 		                    
		                   }	              
		           });
					
				});
			
			
			})
		</script>
	</body>
</body>
</html>