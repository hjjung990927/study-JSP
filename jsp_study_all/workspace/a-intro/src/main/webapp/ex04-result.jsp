<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex04 - result</title>
</head>
<body>
	<% 
		String placeName = (String)request.getAttribute("placeName");
		
		if(placeName.equals("서울")) {
			placeName += " 강남구";
		} else if(placeName.equals("경기도")) {
			placeName += " 남양주시";
		}
	%>
	<h1><%=placeName%></h1>
</body>
</html>