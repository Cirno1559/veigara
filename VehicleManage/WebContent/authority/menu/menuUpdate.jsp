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
			<h2><span></span>修改供应商信息</h2>
				<dl class="tab_conbox">				
					<!--添加-->					
					<dd>
						<form action="manufacturerUpdate.do" method="post" id="edit_user">
							<input type="hidden" style="height: 36px;" value="${ menu.menuId}" id="menuId" />
							<div class="addpro_box clearfix">
								<label>菜单名称：</label>
								<input type="text" style="height: 36px;" value="${ menu.menuName}" id="menuName" required data-rule-fullname="true" data-msg-required="菜单名称不能为空"/>
							</div>
							
							<div class="addpro_box clearfix">
								<label>菜单地址</label>
								<input type="text" style="height: 36px;" value="${ menu.menuAdress}" id="menuAdress" required data-rule-fullname="true" >
							</div>
							<div class="addpro_box clearfix">
								<label>父级Id：</label>
								<select  name="parentId" id="parentId"><!--部门下拉框  -->
									<option value="0">请选择</option>
								</select>																				
							</div>
							<div class="addpro_box clearfix">
								<label>层级：</label>
								<input type="text"style="height: 36px;" value="${ menu.menuTier}" id="menuTier" required data-rule-mobile="true" >
							</div>								
							<div class="probtn_box clearfix">
								<input type="button" value="保存" class="btn blue_btn submit" id="submit">
							</div>
							<input type="hidden" style="height: 36px;" value="${ menu.menuId}" id="menuId" />
							<input type="hidden" style="height: 36px;" value="${ menu.parentId}" id="parent" />
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
					
					var menuId = $.trim($("#menuId").val());
					var menuName = $.trim($("#menuName").val());
					var menuAdress = $.trim($("#menuAdress").val());
					var parentId = $.trim($("#parentId").val());
					var menuTier = $.trim($("#menuTier").val());
					
					 var data1 = {"menuId":menuId,"menuName": menuName, "menuAdress":menuAdress,"parentId":parentId,"menuTier":menuTier,"menuState":1};
					
          		 $.ajax({
		               type: "POST",
		               url: "${pageContext.request.contextPath}/authority/menuUpdate.do?time="+new Date(),
		               data: data1,
		               success: function (msg) {
		                   if (msg == "success") {
		                	   layer.alert('修改成功',function(index, layero){		                		    
		                		   layer.close(index);
		                		   window.location.href="menuQuery.do";   
		                	   });
		                	   
		               		}else if (msg == "fail") {
		               			layer.alert('修改失败',function(index, layero){		                		    
			                		   layer.close(index)});
			                      
			                   }
		                		 		                    
		                   }	              
		           });
					
				});
			
				$.ajax({
					 type: "POST",
		               url: "${pageContext.request.contextPath }/authority/sendparentId.do",
		               data:'',
		               success:function(data) {
		            	   var $sel=$("#parentId")
						    var optValue=$("#parent").val();
		            	   console.log(optValue);
						  for(var i = 0;i<data.length;i++){  
						    $item = $("<option </option>");  //添加option  
						    $item.val(data[i].menuId);      //添加option的value ，<span style="line-height:1.5;white-space:pre-wrap;font-family:Arial, Helvetica, sans-serif;"><span style="font-size:10px;">数据库中用id和type保存的数据</span></span>  						                                 
						  //将后台传的值选中
						    if($item.val()==optValue){
						    	$item.attr("selected","selected");
						    }
						    $text=$item.text(data[i].menuName);
						   
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
						    
						  for(var i = 0;i<data.length;i++){  
						    $item = $("<option></option>");  //添加option  
						    $item.val(data[i].jobId);      //添加option的value ，<span style="line-height:1.5;white-space:pre-wrap;font-family:Arial, Helvetica, sans-serif;"><span style="font-size:10px;">数据库中用id和type保存的数据</span></span>  						                                 
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
						    
						  for(var i = 0;i<data.length;i++){  
						    $item = $("<option></option>");  //添加option  
						    $item.val(data[i].roleId);      //添加option的value ，<span style="line-height:1.5;white-space:pre-wrap;font-family:Arial, Helvetica, sans-serif;"><span style="font-size:10px;">数据库中用id和type保存的数据</span></span>  						                                 
						    $text=$item.text(data[i].roleName);
						  
						    //添加option数据  
						    $sel.append($item); //将option添加进select  
						   }  
		            	   }
		               })
			})
		</script>
	</body>
</body>
</html>