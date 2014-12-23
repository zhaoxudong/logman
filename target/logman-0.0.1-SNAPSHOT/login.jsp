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
    <form class="form-signin" role="form">
        <h2 class="form-signin-heading" >请登录系统</h2>
        <input type="text" class="form-control" placeholder="用户名" required autofocus>
        <input type="password" class="form-control" placeholder="密  码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住我
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      </form>
  </body>
</html>
