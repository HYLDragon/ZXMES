<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<style type="text/css">

*{
	margin:0px;
	padding:0px;
}

#div1{
	border:1px solid red;
	width:100px;
	height:100px;
	margin:10px;
	padding:5px;
	
}
#outdiv{
	border:1px solid green;
	padding:7px;
	position:relative;
}
</style>
<script type="text/javascript">
	$(function(){
		//alert($('#div1').width());   //100px;
		//alert($('#div1').innerWidth());//110px  width+padding
		//alert($('#div1').outerWidth()); //112px width+padding+border
		//alert($('#div1').outerWidth(true)); //132px; width+padding+border+margin
		
		alert($('#div1').offset().left);//始终相对于浏览器的距离
		alert($('#div1').position().left);//不记margin的值 //padding算在内
		
		console.log($('#div1').offsetParent());//元素的 CSS position 属性设置为 relative、absolute 或 fixed
		
	});
</script>
</head>
<body>
	<div id="outdiv">
		<div id="div1">111</div>
	</div>
</body>
</html>