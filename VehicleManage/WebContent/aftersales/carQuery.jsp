<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>车辆信息</title>
		<%@ include file="../../sales-plugin/common/admin-common-head.jsp" %>
		<%@ include file="../../sales-plugin/common/common.jsp" %>
		<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
	<script type="text/javascript">
     $(function(){
    	  $(".pagination a").click(function(){
    		    var page = $(this).attr("pdata");
    		    
    		    //给隐藏框赋值
    		    $("#myPage").val(page);
    		    
    		    //表单提交
    		    $("#myForm").submit();
    	  }) 
     })
</script>
</head>
<body>
		<div class="main_box">
			<h2><span></span>售后列表</h2>
			<form action="carQuery.do" method="post" id="myForm">
			<div class="col-sm-12">
				<div class="search_box clearfix col-sm-5">
					<input type="text" class="f_left" name="carId" placeholder="输入车牌号查询" style="margin-right:15px;"/>
					<select name="carVersion" class="carbrand"  required data-msg-required="车品牌型号不能为空">
									<option value="0">请选择</option>
									<option value="奥迪" <c:if test="${carVersion =='奥迪'}">selected="selected"</c:if> >奥迪</option>
									<option value="大众" <c:if test="${carVersion =='大众'}">selected="selected"</c:if> >大众</option>
									<option value="奔驰" <c:if test="${carVersion =='奔驰'}">selected="selected"</c:if> >奔驰</option>
									<option value="宝马" <c:if test="${carVersion =='宝马'}">selected="selected"</c:if> >宝马</option>
									<option value="福特" <c:if test="${carVersion =='福特'}">selected="selected"</c:if> >福特</option>
							</select>
					
					<input type="submit" value="搜索" class="btn blue_btn"/>
				</div>
				<div class="col-sm-7">
					<input type="button" value="添加" class="btn blue_btn" id="add"/>
				</div>
			</div>
			<div class="cont_box">
				<table border="0" cellspacing="0" cellpadding="0" class="table" id="table_box">
				<thead>
					<tr>
						<th>车牌号码</th>
						<th>行驶里程</th>
						<th>车辆名称</th>
						<th>车辆型号</th>
						<th>车辆状态</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>						
							 <c:forEach items="${paging.data }" var="ca">
								  <tr>
								      <td>${ca.carId }</td>
								      <td>${ca.carOdo }</td>
								      <td>${ca.carName}</td>
								      <td>${ca.carVersion}</td>
								      <td>${ca.carState}</td>
								      <td>										
										<a href="javascript:void(0);" class="table_btn table_info recharge_btn update" id="abc" dataId="${ca.carId}" dataOdo="${ca.carOdo }" dataName="${ca.carName}" dataVersion="${ca.carVersion }" >
											<i class="fa fa-mail-forward"></i>
											<span >修改</span>
										</a>
										<a href="javascript:void(0);" class="table_btn table_del del_btn removes" dataId="${ca.carId}">
											<i class="fa fa-trash-o"></i>
											<span>删除</span>
										</a>
									</td>
								    </tr>    
							</c:forEach>								
							</tbody>
			</table>
		</div>${paging.navigation }
	</form>
		</div>
		<!--javascript include-->
		<%@ include file="../../sales-plugin/common/admin-common-foot.jsp" %>
		<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/layer/layer.js"></script>
		<script type="text/javascript">
		$(function(){
			<!--添加页面 -->
			$("#add").click(function(){
				 layer.open({
					  type: 2,
					  title: false,
					  shadeClose: true,
					  shade: 0.5,
					  area: ['380px', '60%'],
					  content: 'carAdd.jsp' //iframe的url
					}); 
			 })
			<!--修改页面弹窗+ajax-->
			 $(".update").click(function(){	
				 var dataId=$(this).attr("dataId");
				 var dataName=$(this).attr("dataName");
				 var dataOdo=$(this).attr("dataOdo");
				 var dataVersion=$(this).attr("dataVersion");
				 $.post({
					 type:"POST",						 
					 data:{carId:dataId,carName:dataName,carOdo:dataOdo,carVersion:dataVersion},
					 url:"carUpdateByGet.do?time="+new Date(),  
					 success: function(result) {  
                        var htmlCont = result;//返回的结果页面  
                        layer.open({
                       	 // type: 1,                           	                              	   
                       	  anim: 2,
                       	  title: false,
                       	  area: ['380px', '60%'],
                       	  shadeClose: true, //开启遮罩关闭
                       	  content: htmlCont,
                       	  closeBtn: 0
                       	});                     
                        
                        }
					 });								 
			 });
			<!--删除信息-->
			 $(".removes").click(function(){	
				 var dataId=$(this).attr("dataId");
				 $.post({
					 type:"POST",						 
					 data:{carId:dataId},
					 url:"carRemove.do?time="+new Date(),  
					 success: function(result) {  
						 if (result > 0) {
		                	   layer.alert('删除成功',function(index, layero){		                		    
		                		   layer.close(index);
		                		   window.location.href="carQuery.do";   
		                	   });
		                	   
		               		}else if (result == 0) {
		               			layer.alert('删除失败',function(index, layero){		                		    
			                		   layer.close(index)});
		               		}    
			               }	                                                
				 });
			 });
		});
		</script>
		<script>
			$(function(){
				$("body").other({tableId:"#table_box",tableWrap:[0,1,6],tableAas:[3,"desc"],tableSearch:true});
				 
			
			});
		</script>
	
	</body>
</html>