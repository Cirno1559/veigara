<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>供应商信息</title>
<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
<%@ include file="../../sales-plugin/common/common.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
</head>
<body>
	<div class="main_box">
			<h2><span></span>角色信息</h2>
			
			<form action="roleQuery.do" method="post" id="myForm">
			<div class="search_box clearfix">
				<label class="f_left">搜索角色：</label>
				<input type="search" placeholder="请输入角色名称" class="f_left search_input" name="roleName" value="${roleName}"/>
				<input type="submit" value="搜索" class="btn blue_btn search"/>
			</div>			
			<div class="cont_box">
				<ul class="tab_tit clearfix">
					<li>用户信息</li>							
				</ul>
				<div class="margin_tb clearfix">
							<button type="button" class="btn blue_btn add_pcard" id="add">添加角色信息</button>
						</div>
				<dl class="tab_conbox">
					<dd>				
						<table border="0" cellspacing="0" cellpadding="0" class="table">
							<thead>
								<tr>
									<th>角色编号</th>
									<th>角色名称</th>									
									<th>操作</th>
								</tr>
							</thead>
							<tbody>						
							 <c:forEach items="${paging.data }" var="fa">
								  <tr>
								      <td>${fa.roleId }</td>
								      <td>${fa.roleName }</td>
								     
								       <td>										
										<a href="javascript:void(0);" class="table_btn table_info recharge_btn update" id="abc" dataId="${fa.roleId }" dataName="${fa.roleName }" >
											<i class="fa fa-mail-forward"></i>
											<span>修改</span>
										</a>
										<a href="javascript:void(0);" class="table_btn table_info recharge_btn autha" dataId="${fa.roleId}" >
											<i class="fa fa-mail-forward"></i>
											<span>分配权限</span>
										</a>
										<a href="javascript:void(0);" class="table_btn table_del del_btn removea" dataId="${fa.roleId}">
											<i class="fa fa-trash-o"></i>
											<span>删除</span>
										</a>
									</td>
								    </tr>    
							</c:forEach>								
							</tbody>
						</table>
						<div class="col-sm-12">
						<div class="col-sm-8"></div> ${paging.navigation }
						</div>
						
					</dd>
					</form>											
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
				 $(".pagination a").click(function(){
		    		    var page = $(this).attr("pdata");
		    		  
		    		    //给隐藏框赋值
		    		    $("#myPage").val(page);
		    		    
		    		    //表单提交
		    		    $("#myForm").submit();
		    	  }) ;
				 $("#add").click(function(){
					 layer.open({
						  type: 2,
						  title: false,
						  shadeClose: true,
						  shade: 0.5,
						  area: ['380px', '70%'],
						  closeBtn: 0,
						  content: 'role/roleAdd.jsp' //iframe的url
						}); 
				 })
				 <!--修改页面弹窗+ajax-->
				 $(".update").click(function(){	
					 var dataName=$(this).attr("dataName");
					 var dataId=$(this).attr("dataId");					
					 var data1 = {"roleId":dataId,"roleName": dataName};
					 $.ajax({
						 type:"POST", 						 
						 data :data1,
						 url:"roleUpdateByget.do?time="+new Date(),  
						 success: function(result) {  
                             var htmlCont = result;//返回的结果页面  
                             layer.open({
                            	 // type: 1,                           	                              	   
                            	  anim: 2,
                            	  title: false,
                            	  area: ['330px', '64%'],
                            	  shadeClose: true, //开启遮罩关闭
                            	  content: htmlCont,
                            	  closeBtn: 0
                            	});                     
                             
                             }
						 });								 
				 });
				 <!--删除信息-->
				 $(".removea").click(function(){						 
					 var dataId=$(this).attr("dataId");
					 layer.confirm('您确定要删除这条记录吗？', {
						  btn: ['确定','返回'] //按钮
						}, function(){
							$.ajax({
								 type:"POST",						 
								 data:{"roleId":dataId},
								 url:"roleDelete.do?time="+new Date(),  
								 success: function(result) {  
									 if (result == "success") {
					                	   layer.alert('删除成功',function(index, layero){		                		    
					                		   layer.close(index);
					                		   window.location.href="${pageContext.request.contextPath}/authority/roleQuery.do";   
					                	   });
					                	   
					               		}else if (result == "fail") {
					               			layer.alert('删除失败',function(index, layero){		                		    
						                		   layer.close(index)});
					               		}    
						               }	                                                
							 });
						}, function(index){
						 layer.close(index);
						});
					 
				 });
				 <!--分配权限-->
				 $(".autha").click(function(){
				 	 var data1=$(this).attr("dataId");
				 	 $.ajax({
						 type:"POST", 						 
						 data :{"roleId":+data1},
						 url:"${pageContext.request.contextPath }/authority/getMenuId.do?time="+new Date(),  
						 success: function(result) {  
                             var htmlCont = result;//返回的结果页面  
                             layer.open({
                            	  //type: 1,                           	                              	   
                            	  anim: 2,
                            	  title: false,
                            	  area: ['300px', '70%'],
                            	  shadeClose: true, //开启遮罩关闭
                            	  content: htmlCont,
                            	  closeBtn: 0,
                            	  btn:false
                            	});                     
                             
                             }
						 });	
		 
				 })
				 
			});
		</script>
	</body>
</body>
</html>