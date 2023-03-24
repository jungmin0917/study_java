<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>쿠키 출력 및 쿠키 수정</title>
</head>
<body>
	<%
		String cookieCheck = request.getHeader("Cookie"); // HTTP 요청 헤더 중 "Cookie" 필드의 값을 문자열로 반환하는 메소드
	
		if(cookieCheck != null){
			Cookie[] cookies = request.getCookies();
			
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("id")){ // "id"라는 키값의 쿠키가 있다면 출력
					%>
					<p>아이디 : <%=cookie.getValue()%></p>
					<%
				}
				
				if(cookie.getName().equals("id")){ // "id"라는 키값의 쿠키가 있다면 수정
					Cookie new_cookie = new Cookie("id", "banana");
					response.addCookie(cookie);
				}
			}
		}
	%>
	
</body>
</html>