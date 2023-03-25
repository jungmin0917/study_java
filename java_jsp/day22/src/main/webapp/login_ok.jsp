<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>아이디, 비밀번호 정보를 쿠키로 저장</title>
</head>
<body>
	<%
		// 전달받은 id, pw를 쿠키로 저장하기

		Cookie cookie_id = new Cookie("id", request.getParameter("id"));
		cookie_id.setMaxAge(10000); // 초 단위이다
		response.addCookie(cookie_id);

		Cookie cookie_pw = new Cookie("pw", request.getParameter("pw"));
		cookie_pw.setMaxAge(10000); // 초 단위이다
		response.addCookie(cookie_pw);
	%>
	
</body>
</html>