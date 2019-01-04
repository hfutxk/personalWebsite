<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- jQuery -->
    <script src="/plugins/jquery/js/jquery-3.2.1.min.js"></script>
	<link href="/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<script src="/plugins/bootstrap/js/bootstrap.min.js"></script>
	<link href="/css/login/style.css" rel="stylesheet">	
</head>
<body>
<script>
$(function(){
	
	$("form.loginForm").submit(function(){
		if(0==$("#name").val().length||0==$("#password").val().length){
			$("span.errorMessage").html("请输入账号密码");
			$("div.loginErrorMessageDiv").show();			
			return false;
		}
		return true;
	});
	
	$("form.loginForm input").keyup(function(){
		$("div.loginErrorMessageDiv").hide();	
	});
	
	
	var left = window.innerWidth/2+162;
	$("div.loginSmallDiv").css("left",left);
})
</script>

<div id="loginDiv" style="position: relative">
	<div class="simpleLogo">
		<a href="/index"><img src="/images/simpleLogo.jpg"></a>
	</div>
	<img id="loginBackgroundImg" class="loginBackgroundImg" src="/images/bg.jpg">
	<form class="loginForm" action="forelogin" method="post">
		<div id="loginSmallDiv" class="loginSmallDiv">
			<div class="loginErrorMessageDiv">
				<div class="alert alert-danger" >
				  <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
				  	<span class="errorMessage"></span>
				</div>
			</div>
				
			<div class="login_acount_text">账户登录</div>
			<div class="loginInput " >
				<span class="loginInputIcon ">
					<span class=" glyphicon glyphicon-user"></span>
				</span>
				<input id="name" name="name" placeholder="手机/会员名/邮箱" type="text">			
			</div>
			
			<div class="loginInput " >
				<span class="loginInputIcon ">
					<span class=" glyphicon glyphicon-lock"></span>
				</span>
				<input id="password" name="password" type="password" placeholder="密码" type="text">
			</div>					
			<div>
				<a class="notImplementLink" href="#nowhere">忘记登录密码</a> 
				<a href="/register" class="pull-right">免费注册</a> 
			</div>
			<div style="margin-top:20px">
				<button class="btn btn-block redButton" type="submit">登录</button>
			</div>
	</form>
	</div>
</div>	
<%@include file= "/module/common/footer.jsp" %>
</body>
</html>


