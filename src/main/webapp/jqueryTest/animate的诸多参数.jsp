<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<script type="text/javascript">
//animate() : 
//第一个参数 : 对象 {} 去设置样式属性和值(目标点)
//第二个参数 : 时间 默认是400
//第三个参数 : 运动形式 只有两种 swing(默认 : 缓冲 : 慢快慢)  linear(匀速的)
//第四个参数 : 运行结束的回调


	$(function(){
		//第一种写法
		$('#btn').click(function(){
			$('#div1').animate({"width":"300px"},1000,'swing',function(){
				alert("动画执行完成!");
			});
		});
		//第二种写法
		$('#btn2').click(function(){
			$('#div1').animate({
				width:500
			},{
				duration:2000,
				easing:'linear',
				complete:function(){
					alert("123");
				},
				step:function(a,b){//监测动画过程中所有值的变化
					console.log(a);
					//console.log(b.pos);   //运动过程中的比例值(0~1)
				}
			});
		});
	});
</script>
<style type="text/css">
 div{
 	width:200px;
 	height:100px;
 	background-color:red;
 }
</style>
</head>
<body>
	<input type="button" id="btn" value="点击"/>
	<input type="button" id="btn2" value="点击2"/>
	<div id="div1"></div>
</body>
</html>