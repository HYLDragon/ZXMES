<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<style type="text/css">
	.box{
		background-color:red;
	}
	.box1{
		border-color:green;
	}
	.box2{
		font-color:yellow;
	}
	.box3{
		font-size:28px;
	}
</style>
<!--
http://10.30.90.62:8080/ZXMES/jqueryTest/class%E7%9A%84%E6%93%8D%E4%BD%9C.jsp
-->
<script type="text/javascript">

	

	$(function(){
		//$("#div1").addClass("box box1 box2 box1");//重复的不会真的重加 
		//$('#div1').addClass();
		//$("#div1").removeClass("box3");
		$("#div1").toggleClass("box1 box3");   //当于原有的class相同时，则去掉，不同则加上样式
		//$(selector).toggleClass(class,switch) switch:boolean
		//该方法检查每个元素中指定的类。如果不存在则添加类，如果已设置则删除之。这就是所谓的切换效果。
		//不过，通过使用 "switch" 参数，您能够规定只删除或只添加类。
	});
</script>
</head>
<body>
	<div id="div1" class="box3">xxxxiih</div>
</body>
</html>