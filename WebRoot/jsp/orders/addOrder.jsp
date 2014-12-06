<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common.jsp"%>

<html >
  <head>
	<title>订单管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  </head>
  
  <body>
   <ul id="myTab" class="nav nav-tabs">
   <li class="active"><a href="#home" data-toggle="tab">订单录入</a></li>
   <li><a href="#ios" data-toggle="tab">订单查找</a></li>
   <li class="dropdown">
      <a href="#" id="myTabDrop1" class="dropdown-toggle" 
         data-toggle="dropdown">Java <b class="caret"></b>
      </a>
      <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">
         <li><a href="#jmeter" tabindex="-1" data-toggle="tab">
            jmeter</a>
         </li>
         <li><a href="#ejb" tabindex="-1" data-toggle="tab">
            ejb</a>
         </li>
      </ul>
   </li>
</ul>
<div id="myTabContent" class="tab-content">
   <div class="tab-pane fade in active" id="home">
		      订单录入：/order/orderAction_addOrder.action
		（form:接单时间，要求到货时间，模板编号，合同号，业务员，
					托运方，托运方联系人，托运方联系电话，装货地址，卸货地址，
					收货方，收货方联系人，收货方联系电话，承运货物，预发量（包车？）
		计量单位（吨，车，台，箱，只，个，车次，立方），预发量（包车？），
		运输线路，载重公里，空车公里，提单号，运费单价，运费，
		结算方式（现结，预付，月结），
		计费公式（计量*运费单价，计量*运费单价*公里，固定运费，备注））
		（资料维护：客户资料（托运方，收货方）(界面链接见系统维护中的客户资料)
		运输路线（界面链接见系统维护中的常用资料）
		承运货物（界面链接见系统维护中的常用资料）
		装货地址（界面链接见系统维护中的常用资料
		卸货地址（界面链接见系统维护中的常用资料）
		*实现方式Ajax）
		<form class="form-horizontal" role="form">
		   <div class="form-group">
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
		       <label for="firstname" class="col-sm-1 control-label">要求到货时间</label>
		      <div class="col-sm-2">
		         <input type="text" class="form-control" id="firstname" 
		            placeholder="接单时间">
		      </div>
		   </div>
		   <div class="form-group">
		      <label for="lastname" class="col-sm-1 control-label">姓</label>
		      <div class="col-sm-2">
		         <input type="text" class="form-control" id="lastname" 
		            placeholder="请输入姓">
		      </div>
		   </div>
		   <div class="form-group">
		      <div class="col-sm-offset-2 col-sm-10">
		         <div class="checkbox">
		            <label>
		               <input type="checkbox"> 请记住我
		            </label>
		         </div>
		      </div>
		   </div>
		   <div class="form-group">
		      <div class="col-sm-offset-2 col-sm-10">
		         <button type="submit" class="btn btn-default">登录</button>
		      </div>
		   </div>
		</form>

   </div>
   <div class="tab-pane fade" id="ios">
      <p>iOS 是一个由苹果公司开发和发布的手机操作系统。最初是于 2007 年首次发布 iPhone、iPod Touch 和 Apple 
      TV。iOS 派生自 OS X，它们共享 Darwin 基础。OS X 操作系统是用在苹果电脑上，iOS 是苹果的移动版本。</p>
   </div>
   <div class="tab-pane fade" id="jmeter">
      <p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>
   </div>
   <div class="tab-pane fade" id="ejb">
      <p>Enterprise Java Beans（EJB）是一个创建高度可扩展性和强大企业级应用程序的开发架构，部署在兼容应用程序服务器（比如 JBOSS、Web Logic 等）的 J2EE 上。
      </p>
   </div>
</div>
<script>
   $(function () {
      $('#myTab li:eq(1) a').tab('show');
   });
</script>

  </body>
</html>
