<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>
<html >
  <head>
	<title>订单</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  </head>

  <body>
   <ul id="myTab" class="nav nav-tabs">
   <li class="active" data-toggle="tab"><a href="#">下单</a></li>
   <li data-toggle="tab"><a href="#">列出订单</a></li>
  
	</ul>
<script>
   $(function () {
      $('#myTab li:eq(1) a').tab('show');
   });
</script>
  </body>
</html>