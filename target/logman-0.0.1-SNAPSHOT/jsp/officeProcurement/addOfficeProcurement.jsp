<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>

<html >
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
     <!-- The styles -->
    <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/charisma-app.css" rel="stylesheet">
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
  <form class="form-horizontal" role="form" action="">
			   <div class="form-group">
			      <br>
				  <div class="col-sm-12">
				   	  <label for="" class="col-sm-2 control-label">日期</label>
				   	  <div class="col-sm-4">
					      <div class="input-group date form_time col-md-12" data-date="" data-date-format="yyyy-mm-dd hh:ii:00" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
			                    <input class="form-control" size="16" type="text" value="" name="date" readonly>
								<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
			              </div>
					  </div>
					  <label for="" class="col-sm-2 control-label">品名</label>
				   	  <div class="col-sm-4">
					      <select style="width: 100%;" data-placeholder="" id="selectError2" name="goods" data-rel="chosen">
                            <option value=""></option>
                                <option>Dallas Cowboys</option>
                                <option>New York Giants</option>
                                <option>Philadelphia Eagles</option>
                          </select>
					  </div>
				  </div>
			      <div class="col-sm-12"><br></div>
			      <div class="col-sm-12">
				      <label for="" class="col-sm-2 control-label">数量</label>
				      <div class="col-sm-4">
				      	 <input type="text" class="form-control" id="" name="quantity">
				      </div>
				      <label for="" class="col-sm-2 control-label">单价</label>
				      <div class="col-sm-4">
				      	 <input type="text" class="form-control" id="" name="unitPrice">
				      </div>
				  </div>
			      <div class="col-sm-12"><br></div>
				  <div class="col-sm-12">
				      <label for="" class="col-sm-2 control-label">金额</label>
				      <div class="col-sm-4">
				         <input type="text" class="form-control" id="" name="amount">
				      </div>
				      <label for="" class="col-sm-2 control-label">支付账号</label>
				      <div class="col-sm-4">
					      <select style="width: 100%;" data-placeholder="" id="selectError2" name="account" data-rel="chosen">
                            <option value=""></option>
                                <option>Dallas Cowboys</option>
                                <option>New York Giants</option>
                                <option>Philadelphia Eagles</option>
                          </select>
					  </div>
			      </div>
			      <div class="col-sm-12"><br></div>
			      <div class="col-sm-12">
				      <label for="" class="col-sm-2 control-label">购买地点</label>
				      <div class="col-sm-4">
				      	 <input type="text" class="form-control" id="" name="buyplace">
				      </div>
				      <label for="" class="col-sm-2 control-label">凭证号</label>
				      <div class="col-sm-4">
				      	 <input type="text" class="form-control" id="" name="voucherNo">
				      </div>
				  </div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12">
				      <label for="" class="col-sm-2 control-label">购买人</label>
				      <div class="col-sm-4">
				      	 <input type="text" class="form-control" id="" name="buyer">
				      </div>
				  </div>
				  <div class="col-sm-12"><br></div>
			      <div class="col-sm-12">
				      <label for="firstname" class="col-sm-2 control-label">备注</label>
				      <div class="col-sm-10">
				         <input type="text" class="form-control" id="" name="remark">
				      </div>
				  </div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12"><br></div>
				  <div class="col-sm-12"><div class="col-sm-8"></div><div class="col-sm-2"><button class="btn btn-primary btn-lg">重置</button></div><div class="col-sm-2"><button class="btn btn-warning btn-lg">提交</button></div></div>
			   </div>
			</form>

			<input type="hidden" id="dtp_input1" value="" />
				
<!-- external javascript -->

<script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- library for cookie management -->
<script src="${pageContext.request.contextPath}/js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src="${pageContext.request.contextPath}/bower_components/moment/min/moment.min.js"></script>
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
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>

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