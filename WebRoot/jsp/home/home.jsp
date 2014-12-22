<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>

<html >
  <head>
    <!--
        ===
        This comment should NOT be removed.

        Charisma v2.0.0

        Copyright 2012-2014 Muhammad Usman
        Licensed under the Apache License v2.0
        http://www.apache.org/licenses/LICENSE-2.0

        http://usman.it
        http://twitter.com/halalit_usman
        ===
    -->
    <meta charset="utf-8">
    <title>物流管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
    <meta name="author" content="Muhammad Usman">

    <!-- The styles -->
    <link id="bs-css" href="${pageContext.request.contextPath}/css/bootstrap-slate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/charisma-app.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/fullcalendar/dist/fullcalendar.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/fullcalendar/dist/fullcalendar.print.css" rel="stylesheet" media="print">
    <link href="${pageContext.request.contextPath}/bower_components/chosen/chosen.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/colorbox/example3/colorbox.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/responsive-tables/responsive-tables.css" rel="stylesheet">
   	<link href="${pageContext.request.contextPath}/css/bootstrap-cerulean.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/jquery.noty.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/noty_theme_default.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/elfinder.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/elfinder.theme.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/jquery.iphone.toggle.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/uploadify.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet">

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/bower_components/jquery/jquery.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="img/favicon.ico">


  </head>
  
  <body>
    <div class="navbar navbar-default" role="navigation">
       
    </div>
    <!-- topbar ends -->
	<div class="ch-container">
	    <div class="row">
	        
	        <!-- left menu starts -->
	        <div class="col-sm-2 col-lg-2">
	            <div class="sidebar-nav">
	                <div class="nav-canvas">
	                    <div class="nav-sm nav nav-stacked">
	
	                    </div>
	                    <ul class="nav nav-pills nav-stacked main-menu">
							<li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-list-alt"></i><span>&nbsp;&nbsp;&nbsp;业务管理</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">订单管理</a></li>
	                                <li><a href="../orders/order.jsp" target="right">调度配送</a></li>
									<li><a href="../orders/order.jsp" target="right">出车登记</a></li>
									<li><a href="../orders/order.jsp" target="right">回车报账</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-header"></i><span>&nbsp;&nbsp;&nbsp;车辆管理</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">维修登记</a></li>
	                                <li><a href="../orders/order.jsp" target="right">保养登记</a></li>
									<li><a href="../orders/order.jsp" target="right">违章登记</a></li>
									<li><a href="../orders/order.jsp" target="right">事故登记</a></li>
									<li><a href="../orders/order.jsp" target="right">规费登记</a></li>
									<li><a href="../orders/order.jsp" target="right">配件相关</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-tower"></i><span>&nbsp;&nbsp;&nbsp;油料管理</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">油料管理</a></li>
	                                <li><a href="../orders/order.jsp" target="right">油卡管理</a></li>
									<li><a href="../orders/order.jsp" target="right">加油登记</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-credit-card"></i><span>&nbsp;&nbsp;&nbsp;现金银行</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">路卡充值登记</a></li>
	                                <li><a href="../orders/order.jsp" target="right">办公用品管理</a></li>
	                                <li><a href="../orders/order.jsp" target="right">银行存取款</a></li>
									<li><a href="../orders/order.jsp" target="right">借还款登记</a></li>
									<li><a href="../orders/order.jsp" target="right">其他支出</a></li>
									<li><a href="../orders/order.jsp" target="right">其他收入</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-list-alt"></i><span>&nbsp;&nbsp;&nbsp;应收应付</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">应付结算</a></li>
	                                <li><a href="../orders/order.jsp" target="right">应收结算</a></li>
									<li><a href="../orders/order.jsp" target="right">预收预付管理</a></li>
									<li><a href="../orders/order.jsp" target="right">应收应付账簿</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-calendar"></i><span>&nbsp;&nbsp;&nbsp;工资管理</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">缺勤登记</a></li>
	                                <li><a href="../orders/order.jsp" target="right">工资结算</a></li>
									<li><a href="../orders/order.jsp" target="right">工资设置</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-stats"></i><span>&nbsp;&nbsp;&nbsp;经营分析</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">订单管理</a></li>
	                                <li><a href="../orders/order.jsp" target="right">调度配送</a></li>
									<li><a href="../orders/order.jsp" target="right">出车登记</a></li>
									<li><a href="../orders/order.jsp" target="right">回车报账</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-asterisk"></i><span>&nbsp;&nbsp;&nbsp;系统维护</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">企业资料</a></li>
	                                <li><a href="../orders/order.jsp" target="right">客户资料</a></li>
	                                <li><a href="../orders/order.jsp" target="right">常用资料</a></li>
									<li><a href="../orders/order.jsp" target="right">供应商资料</a></li>
	                            </ul>
	                        </li>
	                        <li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-inbox"></i><span>&nbsp;&nbsp;&nbsp;仓储管理</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="../orders/order.jsp" target="right">入库管理</a></li>
	                                <li><a href="../orders/order.jsp" target="right">出库管理</a></li>
									<li><a href="../orders/order.jsp" target="right">库存明细</a></li>
									<li><a href="../orders/order.jsp" target="right">出入库查询</a></li>
	                            </ul>
	                        </li>
							<li class="accordion">
	                            <a href="form.html"><i class="glyphicon glyphicon-wrench"></i><span>&nbsp;&nbsp;&nbsp;辅助工具</span></a>
	                            <ul class="nav nav-pills nav-stacked">
	                                <li><a href="form.html">新增员工</a></li>
	                                <li><a href="form.html">修改信息</a></li>
									<li><a href="form.html">员工状态</a></li>
	                            </ul>
	                        </li>
	                    </ul>
	                </div>
	            </div>
	        </div>
	        <!--/span-->
	        <!-- left menu ends -->
	
	        <noscript>
	            <div class="alert alert-block col-md-12">
	                <h4 class="alert-heading">Warning!</h4>
	
	                <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a>
	                    enabled to use this site.</p>
	            </div>
	        </noscript>
	
	        <div id="content" class="col-lg-10 col-sm-10">
	            <!-- content starts -->
	            <iframe name="right" scrolling="no" frameborder="0" style="width: 100%;" onload="this.height=this.contentWindow.document.documentElement.scrollHeight*2">
	           
	            </iframe>
	
	
	
					
	
	    <!-- content ends -->
	    	</div><!--/#content.col-md-0-->
	
	
	
	
	
	</div></div>
	<div style="display: none;" id="cboxOverlay"></div><div style="display: none;" tabindex="-1" role="dialog" class="" id="colorbox"><div id="cboxWrapper"><div><div style="float: left;" id="cboxTopLeft"></div><div style="float: left;" id="cboxTopCenter"></div><div style="float: left;" id="cboxTopRight"></div></div><div style="clear: left;"><div style="float: left;" id="cboxMiddleLeft"></div><div style="float: left;" id="cboxContent"><div style="float: left;" id="cboxTitle"></div><div style="float: left;" id="cboxCurrent"></div><button id="cboxPrevious" type="button"></button><button id="cboxNext" type="button"></button><button id="cboxSlideshow"></button><div style="float: left;" id="cboxLoadingOverlay"></div><div style="float: left;" id="cboxLoadingGraphic"></div></div><div style="float: left;" id="cboxMiddleRight"></div></div><div style="clear: left;"><div style="float: left;" id="cboxBottomLeft"></div><div style="float: left;" id="cboxBottomCenter"></div><div style="float: left;" id="cboxBottomRight"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none; max-width: none;"></div></div>
	    
  	</div>
  </body>
  <!-- external javascript -->
	
	<script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	
	<!-- library for cookie management -->
	<script src="${pageContext.request.contextPath}/js/jquery.cookie.js"></script>
	<!-- calender plugin -->
	<script src="${pageContext.request.contextPath}/bower_components/moment/min/moment.min.js"></script>
	<script src="${pageContext.request.contextPath}/bower_components/fullcalendar/dist/fullcalendar.min.js"></script>
	<!-- data table plugin -->
	<script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
	
	<!-- select or dropdown enhancer -->
	<script src="${pageContext.request.contextPath}/bower_components/chosen/chosen.jquery.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="${pageContext.request.contextPath}/bower_components/colorbox/jquery.colorbox-min.js"></script>
	<!-- notification plugin -->
	<script src="${pageContext.request.contextPath}/js/jquery.noty.js"></script>
	<!-- library for making tables responsive -->
	<script src="${pageContext.request.contextPath}/bower_components/responsive-tables/responsive-tables.js"></script>
	<!-- tour plugin -->
	<script src="${pageContext.request.contextPath}/bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
	<!-- star rating plugin -->
	<script src="${pageContext.request.contextPath}/js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="${pageContext.request.contextPath}/js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="${pageContext.request.contextPath}/js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="${pageContext.request.contextPath}/js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="${pageContext.request.contextPath}/js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="${pageContext.request.contextPath}/js/charisma.js"></script>
</html>