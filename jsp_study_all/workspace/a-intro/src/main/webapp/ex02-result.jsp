<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex02 - result</title>
</head>
<body>
	<% 
		String number01 = (String)request.getAttribute("number01");
		String number02 = (String)request.getAttribute("number02");
		String result = (String)request.getAttribute("result");
	%>
	<h1><%=number01%> + <%=number02 %> = <%=result %></h1>
</body>
</html>





