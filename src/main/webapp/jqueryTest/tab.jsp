<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<style type="text/css">
div{
	border:1px solid green;
	width:100px;
	height:100px;
}
input{
	margin-bottom:5px;
}

</style>

<script type="text/javascript">
$(function(){
	$('div').hide();
	$('input').each(function(i,elem){
		$(elem).click(function(){
			var index=$(this).index();
			$('div').each(function(i,elem){
				if(i==index){
					$(elem).show();
				}else{
					$(elem).hide();
				}
			});
		});
	});
});
</script>
</head>
<body>
<input id="btn1" type="button" value="tab1"/>
<input id="btn2" type="button" value="tab2"/>
<input id="btn3" type="button" value="tab3"/>
<div>111</div>
<div>222</div>
<div>333</div>
</body>
</html>