<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex03 - result</title>
<style>
	table {
		width: 70%;
		margin: 0 auto;
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	tr, th, td {
		border: 1px solid black;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<th>과일 이름</th>
			<th>과일 가격(￦)</th>
		</tr>
		<tr>
			<td><%=request.getParameter("fruitName") %></td>
			<td><%=request.getParameter("fruitPrice") %></td>
		</tr>
	</table>
</body>
</html>





