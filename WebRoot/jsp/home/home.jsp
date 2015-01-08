<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>
<html >
  <head>
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
	                    	<s:iterator value="#authorityList">
								<li class="accordion">
		                            <a><i class="glyphicon glyphicon-list-alt"></i><span>&nbsp;&nbsp;&nbsp;<s:property value="priAuthority"/></span></a>
		                            <ul class="nav nav-pills nav-stacked">
		                            	<s:iterator value="secondAuthorities">
		                            		<li><s:a action="validateAction_getThirdAuthorityById?secId=%{secId}" target="right"><s:property value="secAuthority"/></s:a></li>
		                            	</s:iterator>
		                            </ul>
	                        	</li>
							</s:iterator>
	                    	
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
	            
	            <iframe name="right" scrolling="no" frameborder="0" style="width: 100%;" onload="this.height=this.contentWindow.document.documentElement.scrollHeight*2">
	           		<ul id="myTab" class="nav nav-tabs">
				      <s:iterator value="#thirdAuthorities">
				      	<li><s:a action="url" data-toggle="tab" target="rightBottom"><s:property value="thiAuthority"/></s:a></li>
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
	            </iframe>
	
	    	</div>
	
	
	
	
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