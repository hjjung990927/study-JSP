<%@page import="com.app.domain.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<style>
	#check {
		color: red;
	}
</style>
</head>
<body>
	<% 
		MemberVO member = (MemberVO)request.getSession().getAttribute("member");
	%>
	
	<a href="/logout.member">로그아웃</a>
	<h1><%=member.getMemberName()%>님 환영합니다.</h1>
	<form action="" method="post">
		<div>
			<input type="text" name="memberEmail" value="<%=member.getMemberEmail()%>">
		</div>
		<div>
			<input type="text" name="memberName" value="<%=member.getMemberName()%>">
		</div>
		<div>
			<input type="text" name="memberAge" value="<%=member.getMemberAge()%>">
		</div>
		<div>
			<input type="radio" name="memberGender" value="남자" <%=member.getMemberGender().equals("남자") ? "checked" : ""%>> 남자
			<input type="radio" name="memberGender" value="여자" <%=member.getMemberGender().equals("여자") ? "checked" : ""%>> 여자
			<input type="radio" name="memberGender" value="선택 안함" <%=member.getMemberGender().equals("선택안함") ? "checked" : ""%>> 선택안함
		</div>
	</form>
</body>
</html>









