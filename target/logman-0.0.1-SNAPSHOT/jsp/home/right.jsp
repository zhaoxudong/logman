<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>
<script type="text/javascript" src="../../js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<link href="../../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<html >
  <head>
	<title>right</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
     <!-- The styles -->
    <link id="bs-css" href="${pageContext.request.contextPath}/css/bootstrap-slate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/charisma-app.css" rel="stylesheet">
   	<link href="${pageContext.request.contextPath}/css/bootstrap-cerulean.min.css" rel="stylesheet">

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!-- The fav icon -->
  </head>
<body>
  
  <body>
    <ul id="myTab" class="nav nav-tabs">
		<s:iterator value="#thirdAuthorities">
			<li><s:a action="%{url}" target="rightBottom"><s:property value="thiAuthority"/></s:a></li>
		</s:iterator>
	</ul>
   	<script>
		$(function () {
			$('#myTab li:eq(0) a').tab('show');
		});
	</script>
	<div class="col-sm-12 col-lg-12">
		<iframe name="rightBottom" scrolling="no" frameborder="0" style="width: 100%;" onload="this.height=this.contentWindow.document.documentElement.scrollHeight*2">
	           				
	    </iframe>
	           		
	</div>
	
	
	
	
	<script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- application script for Charisma demo -->
	<script src="${pageContext.request.contextPath}/js/charisma.js"></script>
  </body>
</html>
