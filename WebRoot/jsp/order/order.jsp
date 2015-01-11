<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>
<script type="text/javascript" src="../../js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../../js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<link href="../../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<html >
  <head>
	<title>订单管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
     <!-- The styles -->
    <link id="bs-css" href="${pageContext.request.contextPath}/css/bootstrap-slate.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css">
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

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!-- The fav icon -->
  </head>
  
  <body>
  
  
    <ul id="myTab" class="nav nav-tabs">
      <li class="active"><a href="#addOrder" data-toggle="tab">订单录入</a></li>
      <li><a href="#listOrder" data-toggle="tab">订单查找</a></li>
    </ul>
   
   
	<div id="myTabContent" class="tab-content">
	   <div class="tab-pane fade in active" id="addOrder">
	   		<br>
	   		<form class="form-horizontal" role="form" action="orderAction_addOrders.action">
			   <div class="form-group">
			      <br>
				  <div class="col-sm-12">
				   	  <label for="firstname" class="col-sm-1 control-label">接单时间</label>
				   	  <div class="col-sm-2">
					      <div class="input-group date form_time col-md-12" data-date="" data-date-format="yyyy-mm-dd hh:ii" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
			                    <input class="form-control" size="16" type="text" value="" readonly>
								<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
			              </div>
					  </div>
				      <label for="firstname" class="col-sm-1 control-label">要求到货时间</label>
				   	  <div class="col-sm-2">
					      <div class="input-group date form_time col-md-12" data-date="" data-date-format="yyyy-mm-dd hh:ii" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
			                    <input class="form-control" size="16" type="text" value="" readonly>
								<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
			              </div>
					  </div>
				      <label for="firstname" class="col-sm-1 control-label">模板编号</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">合同号</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" name="contractNumber"
				            placeholder="接单时间">
				      </div>
				     </div>
			      <div class="col-sm-12"><br></div>
			      <div class="col-sm-12">
				      <label for="firstname" class="col-sm-1 control-label">托运方</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">托运方联系人</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">托运方联系电话</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">装货地址</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				  </div>
			      <div class="col-sm-12"><br></div>
				  <div class="col-sm-12">
				      <label for="firstname" class="col-sm-1 control-label">收货方</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">收货方联系人</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">收货方联系电话</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">卸货地址</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
			      </div>
			      <div class="col-sm-12"><br></div>
			      <div class="col-sm-12">
				      <label for="firstname" class="col-sm-1 control-label">承运货物</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">计量单位</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">预发量</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">是否包车</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				  </div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12">
				      <label for="firstname" class="col-sm-1 control-label">运输线路</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">载重公里</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				       <label for="firstname" class="col-sm-1 control-label">空车公里</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				       <label for="firstname" class="col-sm-1 control-label">提单号</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				  </div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12">
				      <label for="firstname" class="col-sm-1 control-label">计费公式</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">运输单价</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">运费</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">结算方式</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				  </div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12">
				      <label for="firstname" class="col-sm-1 control-label">业务员</label>
				      <div class="col-sm-2">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="接单时间">
				      </div>
				      <label for="firstname" class="col-sm-1 control-label">备注</label>
				      <div class="col-sm-8">
				         <input type="text" class="form-control" id="firstname" 
				            placeholder="请在此写入备注">
				      </div>
				  </div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12"><div class="col-sm-8"></div><div class="col-sm-2"><button class="btn btn-primary btn-lg">重置</button></div><div class="col-sm-2"><button class="btn btn-warning btn-lg">提交</button></div></div>
			   </div>
			</form>
			<input type="hidden" id="dtp_input1" value="" />
	   </div>
	   
	   <div class="tab-pane fade" id="listOrder">
	     aaaaaaaaaaaaaaaaaaaaaaaaaaa
	   </div>
    </div>  
    
    
    
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
   


	<script>
	   $(function () {
	      $('#myTab li:eq(0) a').tab('show');
	   });
	</script>
	<script type="text/javascript">
		$('.form_time').datetimepicker({
	        language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 1,
			minView: 0,
			maxView: 1,
			initialDate: new Date(),
			forceParse: 0
	    });
	</script>

  </body>
</html>
