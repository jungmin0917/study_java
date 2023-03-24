<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>응답 페이지</title>
</head>
<body>
	<%-- request_test에서 받은 form 값을 출력하기 --%>
	<%-- 이름 전달받기 --%>
	<%
// 		String name = request.getParameter("name");
	
// 		out.println(name); // 실제로 줄바꿈이 되지는 않음
	%>
	
	<%-- 전달받은 이름을 request_test.jsp로 다시 전달 --%>
	
	<%--
	<form action="request_test.jsp" method="GET">
		<input type="text" name="name" value="<%=request.getParameter("name") %>">
		<button type="submit">전송</button>
	</form>
 	--%>
	
	<%-- 아래와 같이 아무것도 입력하지 않으면 아무 값도 가지지 않은 채 리다이렉트됨 --%>
<%-- 	<%response.sendRedirect("request_test.jsp"); %> --%>
	
	<%-- ?키=값 형태로 쿼리스트링에 넣어 전달해보기 --%>
	<%-- sendRedirect의 쿼리 문자열에 한글이 들어가면 URL 인코딩이 필요함 --%>
	<%
		String name = request.getParameter("name");
	
		String encodedName = URLEncoder.encode(name, "UTF-8");
	%>
	<%response.sendRedirect("request_test.jsp?name=" + encodedName); %>
</body>
</html>