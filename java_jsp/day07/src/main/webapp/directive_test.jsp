<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="myErrorPage.jsp" info="LocalDate 클래스를 이용한 날짜 출력" %>
    <!-- errorPage="myErrorPage.jsp"를 넣었다 (해당 페이지를 오류페이지로 쓸 것) -->
    <!-- 따로 에러페이지를 설정하지 않으면 기본 에러페이지 난다 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>디렉티브 태그 예제</title>
	</head>
	<body>
		Today is : <%=LocalDate.now() %>
		<%
			// 일부러 오류 냄
			// String data = null;
			// data.charAt(1);
		%>
	</body>
</html>