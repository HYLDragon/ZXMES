<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jslib/jquery-2.2.4.js"></script>
<script type="text/javascript">
	$(function(){
		$('#one').find('li').click(function(){
			$(this).toggleClass('red');
		});
		$('#two').find('li').click(function(){
			$(this).toggleClass('red');
		});
		
		$('#btn1').click(function(){
			$('#one').find('li').each(function(i,elem){
				//$('#two').append();
				//console.log(i); //index
				//console.log(elem); //this
				if($(elem).hasClass('red')){
					$(elem).removeClass('red');
					$('#two').append($(elem));//原来的不保留
					//$('#two').append($(elem).clone());//保留原有的
				}
			});
		});
	});
</script>
<style type="text/css">
 
 #one{
 	border:1px solid green;
 	float:left;
 	width:100px;
 }
 input{
 	float:left;
 	margin-top:50px;
 	margin-left:10px;
 	margin-right:10px;
 }
 #two{
 	border:1px solid gray;
 	float:left;
 	width:100px;
 }
 li{
 	cursor:pointer;
 }
 .red{
 	background-color:red;
 }
 
</style>
</head>
<body>
 <ul id="one">
 	<li>第一个内容</li>
 	<li>第二个内容</li>
 	<li>第三个内容</li>
 	<li>第四个内容</li>
 </ul>
 
 <input id="btn1" type="button" value="→"/>
 <input id="btn2" type="button" value="←"/>
 
 <ul id="two">
 	<li>第1个内容</li>
 	<li>第2个内容</li>
 	<li>第3个内容</li>
 	<li>第4个内容</li>
 </ul>
</body>
</html>