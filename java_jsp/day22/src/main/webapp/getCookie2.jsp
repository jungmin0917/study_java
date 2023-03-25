<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>쿠키 수정, 쿠키 삭제</title>
</head>
<body>
	<%
		String cookieCheck = request.getHeader("Cookie");
	
		if(cookieCheck != null){
			Cookie[] cookies = request.getCookies();
			
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("id")){
					%>
					<p>아이디 : <%=cookie.getValue()%></p>
					<%	
				}
			}
			
			// 이번엔 쿠키 삭제하기 (setMaxAge 메소드 이용)
			// 어차피 다른 도메인에서 설정한 쿠키에는 접근하지 못함
			// 현재 도메인 쿠키만 삭제됨
			for(Cookie cookie : cookies){ // 모든 쿠키를 순회하며 쿠키 삭제
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
	%>
	<a href="delete_check.jsp">쿠키 삭제 확인</a>
</body>
</html>