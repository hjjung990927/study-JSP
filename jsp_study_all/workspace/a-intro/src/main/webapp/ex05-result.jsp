<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex05 - result</title>
</head>
<body>
	<%
		String checkId = (String)request.getAttribute("checkId");
	%>
	<h1><%=checkId%>님 환영합니다</h1>
	
</body>
</html>