<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>

<html >
  <head>
	<title>登陆</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/signin.css" rel="stylesheet">
  </head>
<body>
  
  <body>
	  <div class="ch-container">
	  	<div class="row">
	  	 <div class="col-sm-10 col-lg-10"></div>
	  	 <div class="col-sm-2 col-lg-2">
	  	 	<h3><s:fielderror/></h3>
	  	 	<form class="form-signin" role="form" action="validateAction_login.action">
		        <h2 class="form-signin-heading" >请登录系统</h2>
		        <input type="text" class="form-control" placeholder="用户名" required autofocus name="userName">
		        <input type="password" class="form-control" placeholder="密  码" required name="passwd">
		        <div class="checkbox">
		          <label>
		            <input type="checkbox" value="remember-me"> 记住我
		          </label>
		        </div>
		        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
		      </form>
	  	 </div>
	  	</div>
	  </div>
    
  </body>
</html>
