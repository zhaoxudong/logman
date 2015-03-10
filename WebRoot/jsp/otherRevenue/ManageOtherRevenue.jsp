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
<div class="row">
    <div class="box col-md-12">
    <div class="box-inner">
    <div class="box-header well" data-original-title="">
        <h2>收入列表</h2>
    </div>
    <div class="box-content">
    <table class="table table-striped table-bordered bootstrap-datatable datatable responsive">
    <thead>
    <tr>
        <th>单据编号</th>
        <th>日期</th>
        <th>收入项目</th>
        <th>车号</th>
        <th>金额</th>
        <th>收款账户</th>
        <th>经办人</th>
        <th>备注</th>
        <th>管理</th>
    </tr>
    </thead>
    <tbody>
    
    <s:iterator value="#otherinCollection">
    <tr>
        <td><s:property value="inId"/></td>
        <td><s:property value="date"/></td>
        <td><s:property value="type"/></td>
        <td><s:property value="vehicle"/></td>
        <td><s:property value="amount"/></td>
        <td><s:property value="account"/></td>
        <td><s:property value="operator"/></td>
        <td><s:property value="remark"/></td>
        <td class="center" id="editBtn">
            <a class="btn btn-info" href="#">
                <i class="glyphicon glyphicon-edit icon-white" ></i>
                                                         修改
            <a>
            <a class="btn btn-danger" >
                <i class="glyphicon glyphicon-trash icon-white"></i>
                                                         删除
            </a>
        </td>
    </tr>
    </s:iterator>
    </tbody>
     
    </table>
    </div>
    </div>
    </div>
    <!--/span-->
    
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">

        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">×</button>
                    <h3>修改其他收入</h3>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form" action="otherrevenueAction_updateOtherrevenue.action">
					   <div class="form-group">
					      <br>
					      <div class="col-sm-12">
						   	  <label for="firstname" class="col-sm-2 control-label">编号</label>
						   	  <div class="col-sm-10">
							      <div class="col-sm-10">
						          <input type="text" class="form-control" id="" name="inId">
						      	  </div>
							  </div>
						  </div>
						  <div class="col-sm-12"><br></div>
						  <div class="col-sm-12">
						   	  <label for="firstname" class="col-sm-2 control-label">日期</label>
						   	  <div class="col-sm-4">
							      <div class="input-group date form_time col-md-12" data-date="" data-date-format="yyyy-mm-dd hh:ii:00" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
					                    <input class="form-control" size="16" type="text" value="" name="date" readonly>
										<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
					              </div>
							  </div>
							  <label for="firstname" class="col-sm-2 control-label">收入项目</label>
						   	  <div class="col-sm-4">
							   	<div>
								<select data-placeholder="" class="chosen-select-width" name="type" >
									<option value=""></option>
									<option>American Black Bear</option>
									<option>Asiatic Black Bear</option>
									<option>Brown Bear</option>
									<option>Giant Panda</option>
									<option>Sloth Bear</option>
									<option>Sun Bear</option>
									<option>Polar Bear</option>
									<option>Spectacled Bear</option>
								</select>
								</div>
							  </div>
						  </div>
					      <div class="col-sm-12"><br></div>
					      <div class="col-sm-12">
						      <label for="firstname" class="col-sm-2 control-label">车号</label>
						      <div class="col-sm-4">
						         <select data-placeholder="" class="chosen-select-width" name="vehicle" >
									<option value=""></option>
									<option>American Black Bear</option>
									<option>Asiatic Black Bear</option>
									<option>Brown Bear</option>
									<option>Giant Panda</option>
									<option>Sloth Bear</option>
									<option>Sun Bear</option>
									<option>Polar Bear</option>
									<option>Spectacled Bear</option>
								</select>
						      </div>
						      <label for="firstname" class="col-sm-2 control-label">金额</label>
						      <div class="col-sm-4">
						         <input type="text" class="form-control" id="firstname" name="amount">
						      </div>
						  </div>
					      <div class="col-sm-12"><br></div>
						  <div class="col-sm-12">
						      <label for="firstname" class="col-sm-2 control-label">收款账户</label>
						      <div class="col-sm-4">
						         <select data-placeholder="" class="chosen-select-width" name="account" >
									<option value=""></option>
									<option>American Black Bear</option>
									<option>Asiatic Black Bear</option>
									<option>Brown Bear</option>
									<option>Giant Panda</option>
									<option>Sloth Bear</option>
									<option>Sun Bear</option>
									<option>Polar Bear</option>
									<option>Spectacled Bear</option>
								</select>
						      </div>
						      <label for="firstname" class="col-sm-2 control-label">经办人</label>
						      <div class="col-sm-4">
						         <input type="text" class="form-control" id="" name="operator">
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

		
                </div>
                <div class="modal-footer">
                    <a href="#" class="btn btn-default" data-dismiss="modal">Close</a>
                    <a href="#" class="btn btn-primary" data-dismiss="modal">Save changes</a>
                </div>
            </div>
        </div>
    </div>
    </div><!--/row-->

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
	    var config = {
			'.chosen-select-width'		 : {width:"100%"}
		}
		for (var selector in config) {
			$(selector).chosen(config[selector]);
		}
		
	    $('.btn-info').click(function (e) {
	        e.preventDefault();
	        $(".chosen-search").children().attr("name","notinclude");
	        $(".form-group :input[name!='notinclude']").each(function(n){
	        	$(this).attr("id","input"+n);
	        	$(this).val("1");
	        });
	        alert($(this).text());
	        $(this).parent().parent().children().each(function(n){
		   		//alert($(this).text()+n);
		   		
		   		//alert($("[id='input"+n+"']").get(0).tagName);
		   		if($("[id='input"+n+"']").get(0).tagName=="INPUT"){
		   			$("[id='input"+n+"']").val($(this).text());
		   		}else if($("[id='input"+n+"']").get(0).tagName=="SELECT"){
		   			$("[id='input"+n+"']").parent().children("div").children("a").children("span").html($(this).text());
		   		}
			 });
	        $('#myModal').modal('show');
    	});
    	
	</script>
  
  </body>
</html>