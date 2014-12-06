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
    <link id="bs-css" href="${pageContext.request.contextPath}/css/bootstrap-cerulean.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/charisma-app.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/fullcalendar/dist/fullcalendar.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/fullcalendar/dist/fullcalendar.print.css" rel="stylesheet" media="print">
    <link href="${pageContext.request.contextPath}/bower_components/chosen/chosen.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/colorbox/example3/colorbox.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/responsive-tables/responsive-tables.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/jquery.noty.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/noty_theme_default.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/elfinder.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/elfinder.theme.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/jquery.iphone.toggle.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/uploadify.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet">

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/bower_components/jquery/jquery.min.js"></script>

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
                        <li class="nav-header">订单</li>
                        <li><a class="ajax-link" href="form.html"><i class="glyphicon glyphicon-arrow-down"></i><span>&nbsp;&nbsp;&nbsp;快速下单</span></a>
                        </li>
						<li><a class="ajax-link" href="form.html"><i class="glyphicon glyphicon-search"></i><span>&nbsp;&nbsp;&nbsp;订单状态</span></a>
                        </li>
						<li class="accordion">
                            <a href="form.html"><i class="glyphicon glyphicon-align-justify"></i><span>&nbsp;&nbsp;&nbsp;订单管理</span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="form.html">查询订单</a></li>
                                <li><a href="form.html">修改订单</a></li>
								<li><a href="form.html">删除订单</a></li>
                            </ul>
                        </li>
						<li><a class="ajax-link" href="form.html"><i class="glyphicon glyphicon-list-alt"></i><span>&nbsp;&nbsp;&nbsp;分配计划</span></a>
						</li>
						<li class="nav-header">员工</li>
						<li class="accordion">
                            <a href="form.html"><i class="glyphicon glyphicon-user"></i><span>&nbsp;&nbsp;&nbsp;员工管理</span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="form.html">新增员工</a></li>
                                <li><a href="form.html">修改信息</a></li>
								<li><a href="form.html">员工状态</a></li>
                            </ul>
                        </li>
                        <li><a class="ajax-link" href="form.html"><i class="glyphicon glyphicon-edit"></i><span>&nbsp;&nbsp;&nbsp;工作安排</span></a>
						</li>
						<li><a class="ajax-link" href="form.html"><i class="glyphicon glyphicon-credit-card"></i><span>&nbsp;&nbsp;&nbsp;工资结算</span></a>
						</li>
						<li class="nav-header">客户</li>
                        <li><a class="ajax-link" href="chart.html"><i class="glyphicon glyphicon-search"></i><span>&nbsp;&nbsp;&nbsp;客户查询</span></a>
                        </li>
						<li class="accordion">
                            <a href="form.html"><i class="glyphicon glyphicon-wrench"></i><span>&nbsp;&nbsp;&nbsp;客户维护</span></a>
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="form.html">新增客户</a></li>
                                <li><a href="form.html">修改信息</a></li>
								<li><a href="form.html">删除客户</a></li>
                            </ul>
                        </li>
						<li class="nav-header">其他</li>
                        <li><a class="ajax-link" href="typography.html"><i class="glyphicon glyphicon-globe"></i><span>&nbsp;&nbsp;&nbsp;地区地址</span></a>
                        </li>
                        <li><a class="ajax-link" href="gallery.html"><i class="glyphicon glyphicon-th-list"></i><span>&nbsp;&nbsp;&nbsp;耗材统计</span></a>
                        </li>
						<li><a class="ajax-link" href="gallery.html"><i class="glyphicon glyphicon-stats"></i><span>&nbsp;&nbsp;&nbsp;历史数据</span></a>
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
            



				<div class="row">
				        <div class="col-md-6">
							<div class="panel panel-success">
				            <div class="panel-heading">
				              <h3 class="panel-title">今日工作安排</h3>
				            </div>
				            
				              <table class="table table-bordered">
				            <thead>
				              <tr>
				                <th>订单种类</th>
				                <th>地址</th>
				                <th>员工</th>
				                <th>完成情况</th>
				              </tr>
				            </thead>
				            <tbody>
				              <tr>
				                <td rowspan="2">保洁</td>
				                <td>盛世华城13#209</td>
				                <td>小张&nbsp;&nbsp;&nbsp;小杨</td>
				                <td><span class="label label-success">已收工</span></td>
				              </tr>
				              <tr>
				                <td>钱江方舟45#2021</td>
				                <td>小王</td>
				                <td><span class="label label-success">已收工</span></td>
				              </tr>
				              <tr>
				                <td>美缝</td>
				                <td>钱江方舟12#1207</td>
				                <td>小徐</td>
				                <td><span class="label label-warning">未完工</span></td>
				              </tr>
				              
				            </tbody>
				          </table>
				            
				          </div>
				          
				        </div>
		
        
      </div>
	  


    <!-- content ends -->
    	</div><!--/#content.col-md-0-->


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




</div></div><div style="display: none;" id="cboxOverlay"></div><div style="display: none;" tabindex="-1" role="dialog" class="" id="colorbox"><div id="cboxWrapper"><div><div style="float: left;" id="cboxTopLeft"></div><div style="float: left;" id="cboxTopCenter"></div><div style="float: left;" id="cboxTopRight"></div></div><div style="clear: left;"><div style="float: left;" id="cboxMiddleLeft"></div><div style="float: left;" id="cboxContent"><div style="float: left;" id="cboxTitle"></div><div style="float: left;" id="cboxCurrent"></div><button id="cboxPrevious" type="button"></button><button id="cboxNext" type="button"></button><button id="cboxSlideshow"></button><div style="float: left;" id="cboxLoadingOverlay"></div><div style="float: left;" id="cboxLoadingGraphic"></div></div><div style="float: left;" id="cboxMiddleRight"></div></div><div style="clear: left;"><div style="float: left;" id="cboxBottomLeft"></div><div style="float: left;" id="cboxBottomCenter"></div><div style="float: left;" id="cboxBottomRight"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none; max-width: none;"></div></div>
    
  
  </body>
</html>