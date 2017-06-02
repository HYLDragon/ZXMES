<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
div,a,img{
	margin:0px;
	padding:0px;
}

#div1{
	margin-top:5px;
	width:255px;
}
#div2{
	float:left;
}
#div1 div{
	border:1px solid black;
	width:80px;
	height:80px;
	float:left;
	margin-right:2px;
	margin-bottom:2px;
}
</style>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<script type="text/javascript">
	$(function(){
		var tmp;
		$('#btn').click(function(){
			var index;
			var count=0;
			var CJ=setInterval(function(){
					index=parseInt(Math.random()*9);
					//alert(index);
					if(tmp){
						tmp.css("background-color","");				
					}else{
					}
					tmp=$('#div1').find('div').eq(index);
					tmp.css("background-color","red");
					count+=1;
					if(count>20){
						clearInterval(CJ);
						//alert(tmp.html());
						$('#div2').html(tmp.html());
					}else{
						
					}
			},200);
		});
	});

	
</script>
</head>
  
<body>
	<input id="btn" type="button" value="抽奖" />
	<div id="div2"></div>
	<div id="div1">
		<div>一等奖</div>
		<div>二等奖</div>
		<div>三等奖</div>
		<div>四等奖</div>
		<div>五等奖</div>
		<div>六等奖</div>
		<div>七等奖</div>
		<div>八等奖</div>
		<div>九等奖</div>
	</div>
</body>
</html>
