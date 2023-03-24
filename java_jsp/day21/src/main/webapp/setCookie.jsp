<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 현재 jsp 파일에 접속하는 것만으로 쿠키가 생성됨
	Cookie cookie = new Cookie("id", "apple"); // 쿠키 객체 생성 (key, value 순으로 인자를 담음)
	response.addCookie(cookie); // response 응답 객체에 담음
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>쿠키 생성</title>
</head>
<body>
	<h3>쿠키 생성</h3>
	<a href="getCookie1.jsp">쿠키 전송</a>
</body>
</html>