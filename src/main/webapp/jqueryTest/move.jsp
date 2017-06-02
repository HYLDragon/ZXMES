<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<style type="text/css">
#div1{
	width:50px;
	height:50px;
	background-color:red;
	position:relative;
}
</style>

<!-- 
			$(document).on({mouseup:function(ev){
				//alert("up");
				$(document).off();//取消所有的事件
			},mousemove:function(ev){
				$('#div1').css("left",ev.pageX-disX);
				$('#div1').css("top",ev.pageY-disY);
				console.log(ev.pageX);
			}});
 -->

<script type="text/javascript">
	var disX=0;
	var disY=0;
	$(function(){
		$('#div1').on({mousedown:function(ev){
			//alert("down");
			disX=ev.pageX-$('#div1').offset().left;
			disY=ev.pageY-$('#div1').offset().top;
			
			//js setCapture的应用 
			
			
			$(document).mousemove(function(ev){
				//console.log(ev);//注意只有添加下列属性才可移动 position:relative;
				$('#div1').css("left",ev.pageX-disX);
				$('#div1').css("top",ev.pageY-disY);
			});
			$(document).mouseup(function(ev){
				$(document).off();
			});
		}});
	});
</script>
</head>
<body>
<div id="div1"></div>
</body>
</html>