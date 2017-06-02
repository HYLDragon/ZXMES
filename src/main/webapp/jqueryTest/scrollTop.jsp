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
	border:1px solid black;
	width:470px;
	height:150px;
	margin-top:300px;
}
</style>

<!-- 
$(window).scroll(function(){
			$('img').each(function(i,elem){
				//console.log($(elem).offset().top);
				//console.log($(window).height()+$(window).scrollTop());
				if($(elem).offset().top<$(window).height()+$(window).scrollTop()){
					$(elem).attr("src",$(elem).attr("_src"));
				}
			});
		});
 -->

<script type="text/javascript">
	var toChange=function(){
		$('img').each(function(i,elem){
			//console.log($(elem).offset().top);
			//console.log($(window).height()+$(window).scrollTop());
			if($(elem).offset().top<$(window).height()+$(window).scrollTop()){
				$(elem).attr("src",$(elem).attr("_src"));
			}
		});
	};
	$(function(){
		toChange();
		$(window).scroll(toChange);
		
		
	});
</script>
</head>
<body>
<div><img _src="img/1.jpg"/></div>
<div><img _src="img/2.jpg"/></div>
<div><img _src="img/3.jpg"/></div>
<div><img _src="img/4.jpg"/></div>
<div><img _src="img/5.jpg"/></div>
</body>
</html>