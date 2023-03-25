<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>쿠키 삭제 확인</title>
</head>
<body>
	<%
		String cookie_check = request.getHeader("Cookie");
	
		if(cookie_check == null){ // 쿠키가 하나도 없다면
			%>
			<p>쿠키가 전부 삭제되었습니다</p>
			<%
		}else{
			%>
			<p>쿠키가 삭제되지 않았습니다</p>
			<%
		}
	%>
</body>
</html>