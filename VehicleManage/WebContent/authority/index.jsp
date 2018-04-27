<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>车辆管理系统 </title>
		<%@ include file="../../sales-plugin/common/common.jsp" %>
		<script type="text/javascript" src="${pageContext.request.contextPath}/sales-plugin/admin-login/js/jquery-2.2.4.js"></script>
		<link href="${pageContext.request.contextPath}/sales-plugin/admin-login/css/main.css" rel="stylesheet" type="text/css" />
			<script type="text/javascript" src="${pageContext.request.contextPath}/sales-plugin/admin-login/js/fun.base.js"></script>
			<script type="text/javascript" src="${pageContext.request.contextPath}/sales-plugin/admin-login/js/script.js"></script>
	</head>

	<body>

		<form method="post" action="login.do">
			<div class="login">
				<div class="box png">
					<div class="logo png"></div>
					<div class="input">
						<div class="log">
							<div class="name">
								<label>用户名</label><input type="text" class="text" id="value_1" placeholder="用户名" name="adminLoginName" tabindex="1">
							</div>
							<div class="pwd">
								<label>密　码</label><input type="password" class="text" id="value_2" placeholder="密码" name="adminLoginPwd" tabindex="2">								
							</div>						
									<img id="img" class="KaptchaImage" src="${pageContext.request.contextPath }/code.do" width="120"  alt="看不清，点击重新加载" /> 													
							<div class="pwd">
								<label>验证码</label><input type="text" class="Kaptcha_input text" id="code" placeholder="验证码" name="code" tabindex="2">								
							</div>
							<div >
								<input type="submit" class="submit" tabindex="3" value="登录">
								<div class="check"></div>
							</div>
							<div class="tip"></div>
						</div>
					</div>
				</div>
				<div class="air-balloon ab-1 png"></div>
				<div class="air-balloon ab-2 png"></div>
				<div class="footer"></div>
			</div>					
		</form>
		<script type="text/javascript">
		$(function (){
			$(".KaptchaImage").click(function(){
				$(this).attr("src","${pageContext.request.contextPath }/code.do?time="+new Date())
			});
			
		})
	
	</script>
	</body>

</html>