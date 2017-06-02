<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<style type="text/css">
#ul1 li{
	float:left;
	border:1px solid red;
	width:40px;
	height:40px;
	margin-right:10px;
}
.red{
	background-color:red;
}
</style>

<script type="text/javascript">
$(function(){
	$('#ul1').find('li').hover(function(){
		var count=$(this).index();
		$('#ul1').find('li').each(function(i,elem){
			if(i<=count){
				$(this).addClass('red');
			}else{
				return false;
			}
		});
	},function(){
		$('#ul1').find('li').each(function(i,elem){
			$(elem).removeClass('red');
		});
	});
});
</script>
</head>
<body>
 <ul id="ul1">
 	<li>1</li>
 	<li>2</li>
 	<li>3</li>
 	<li>4</li>
 	<li>5</li>
 </ul>
</body>
</html>