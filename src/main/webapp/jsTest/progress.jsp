<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>测试首页</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- Meta, title, CSS, favicons, etc. -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<jsp:include page="../inc.jsp"></jsp:include>
	<jsp:include page="../inccss.jsp"></jsp:include>
	<jsp:include page="../incjs.jsp"></jsp:include>
	<link type="text/css" rel="stylesheet"
		href="../style/general_elements.css"></link>
	<script type="text/javascript">
		$(function(){
			
			
		});
	</script>
  </head>
  
  <body>
	<div class="progress vertical progress_wide bottom">
	  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
	    <span class="sr-only">20% Complete (success)</span>
	  </div>
	</div>
	<div class="progress vertical progress_wide bottom">
	  <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
	    <span class="sr-only">40% Complete</span>
	  </div>
	</div>
	<div class="progress vertical progress_wide bottom">
	  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
	    <span class="sr-only">60% Complete (warning)</span>
	  </div>
	</div>
	<div class="progress vertical progress_wide bottom">
	  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
	    <span class="sr-only">80% Complete (danger)</span>
	  </div>
	</div>
  </body>
</html>
