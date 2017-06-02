<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>tree</title>
<jsp:include page="../inc.jsp"></jsp:include>
<script type="text/javascript">
	$(function(){
		$("#test_tree").tree({
			url:'${pageContext.request.contextPath}/test/tree.json',
			parentField : 'pid'
		});
	});
</script>
</head>
<body>
	<ul id="test_tree"></ul>
</body>
</html>