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
 img{
 	border:none;
 }
 #box{
 	position:relative;
 	margin-top:100px;
 	margin-left:200px;
 	width:470px;
 	height:150px;
 	position:relative;
 	overflow:hidden;
 }
 #ul1{
 	width:470px;
 	height:150px;
 	z-index:1;
 	position:absolute;
 	top:0px;
 	left:0px;
 }
 #ul1 li{
 	list-style:none;
 	width:470px;
 	height:150px;
 	position:relative;
 	top:0px;
 	left:0px;
 }
 #ol1{
 	position:absolute;
 	top:100px;
 	left:280px;
 	z-index:2
 }
 #ol1 li{
 	list-style-type:none;
 	float:left;
 	width:25px;
 	height:25px;
 	color:red;
 	text-align:center;
 	background-color:white;
 	margin-right:3px;
 	cursor:pointer;
 }
 #ol1 .active{
 	background-color:red;
 	color:white;
 }
</style>

<!-- 
--滑动
$('#ol1').find('li').each(function(i,elem){
	$(elem).hover(function(){
		$('#ol1').find('li').each(function(i,elem){
			$(elem).removeClass('active');
		});
		var index=$(elem).index();
		$('#ul1').css("top",(-150*index)+'px');
		$(elem).addClass('active');
	},function(){
		
	});
});
 -->

<script type="text/javascript">

	$(function(){
		var index=0;
		var toRun=function(){
			index+=1;
			if(index>4){
				//$('#ul1').css("top",0+'px');
				$('#ul1').animate({top:0},1700);
				index=0;
			}else{
				//$('#ul1').css("top",(-150*index)+'px');
				$('#ul1').animate({top:-150*index},1700);
			}
			$('#ol1 li').each(function(){
				$(this).removeClass('active');
			});
			$('#ol1 li').eq(index).addClass('active');
		};
		//过一段时间滚动一张
		var timer=setInterval(toRun,2000);
		
		$('#ol1').find('li').each(function(i,elem){
			$(elem).hover(function(){
				$('#ol1').find('li').each(function(i,elem){
					$(elem).removeClass('active');
				});
				index=$(elem).index();
				clearInterval(timer);
				$('#ul1').stop().css("top",(-150*index)+'px');
				$(elem).addClass('active');
			},function(){
				timer=setInterval(toRun,2000);
			});
		});
		
	});
	
</script>
</head>
<body>
	<div id="box">
		<ul id="ul1">
			<li><img src="img/1.jpg"/></li>
			<li><img src="img/2.jpg"/></li>
			<li><img src="img/3.jpg"/></li>
			<li><img src="img/4.jpg"/></li>
			<li><img src="img/5.jpg"/></li>
		</ul>
		<ol id="ol1">
			<li class="active">1</li>
			<li>2</li>
			<li>3</li>
			<li>4</li>
			<li>5</li>
		</ol>
	</div>
</body>
</html>