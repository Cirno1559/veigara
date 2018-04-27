<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../../sales-plugin/common/common.jsp" %>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/sales-plugin/adminPlugin/fontsawesome/css/font-awesome.css"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/sales-plugin/adminPlugin/css/style.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath }/sales-plugin/adminPlugin/foldMenu/foldMenu.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/sales-plugin/adminPlugin/foldMenu/foldMenu.js" ></script>
</head>
<body>
<div class="header">
	<div class="logo">
		<a href="#"><img src="${pageContext.request.contextPath }/sales-plugin/adminPlugin/images/logo.png"/></a>
	</div>
	<div class="nav" style="width: 800px;">
		<ul class="clearfix">							
		</ul>
	</div>
	<!-- <li >${admin.adminLoginName} </li> -->
	<!-- <div class="nav_roll f_left" style="display:none;">
		<div class="f_left">
			<i class="fa fa-caret-left fa-1x"></i>
		</div>
		<div class="f_right">
			<i class="fa fa-caret-right fa-1x"></i>
		</div>
	</div> -->
	<ul class="login_msg">
		<li title="">登录名：${admin.adminLoginName }</li>
		<li title="">部门：${admin.department.departmentName }</li>
		<li title="">职位：${admin.job.jobName }</li>
		<li><a href="javascript:void(0);" id="esc">退出</a></li>
	</ul>
</div>
<div class="main_left" style="height: 251px;display: block;width: 212px;">		
	<div class="list">
        <ul class="yiji">
	          <c:forEach items="${list }" var="menu">
	          		<c:if test="${menu.marry == true }">
		          		 <li><a href="javascript:void(0);" class="inactive active" >${menu.menuName }</a>
		          			<ul>
		          				 <c:forEach items="${menu.childMenu}" var="ch">
		          				 	<c:if test="${menu.marry == true }">
		          				  		 <li><a href="javascript:void(0);" data="${ch.menuAdress }" class="href">${ch.menuName }</a></li>
		          				  	</c:if>
		          				  </c:forEach> 
		          			</ul>
		          			</li>
	          		</c:if>	
	           </c:forEach> 
        </ul>
    </div>
</div>

<!--left end-->
<div class="main_right">
	<iframe src="" name="cont_box" frameborder="0" width="100%" height="100%" seamless id="iframe"></iframe>
</div>
<!--desktop end-->
<!--javascript include-->
<script src="${pageContext.request.contextPath }/sales-plugin/adminPlugin/js/jquery-2.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/sales-plugin/adminPlugin/js/tipSuppliers.js"></script>
<script>
	$("iframe[name='cont_box']").on("load",function(){
		$(".loading").hide();
		setTimeout(function(){$("iframe[name='cont_box']").css("opacity","1");},500);
	});
	$(function(){
		$(".loading").hide();
		setTimeout(function(){$("iframe[name='cont_box']").css("opacity","1");},500);
		$(".nav li:first").trigger("click");
	});
	jQuery("body").jrdek({Mtop:".header",Mleft:".main_left",Mright:".main_right",foldCell:".main_left h2"});
	$(".logo").click(function(){
		$("iframe[name='cont_box']").prop("src","Hello.html");
	});
	<!--将子菜单地址赋给iframe-->
	$(function(){
		$(".href").click(function(){
			var adress=$(this).attr("data");
			$("#iframe").attr("src",'${pageContext.request.contextPath }/'+adress);
		})
		$("#esc").click(function(){
			window.location.href="${pageContext.request.contextPath }/authority/index.jsp"
		})
	})
</script>
</body>
</html>