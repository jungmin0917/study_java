<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 테스트 (제어문 - 반복문)</title>
</head>
<body>
	<h1>forEach 실습</h1>
	
	<c:forEach var="i" begin="1" end="10" step="1">
		<c:out value="${i}"></c:out>&nbsp;
	</c:forEach>
	
	<hr>
	
	<c:forEach var="i" begin="1" end="10" step="2" varStatus="status">
		index : <c:out value="${status.index}"></c:out><br>
		count : <c:out value="${status.count}"></c:out><br>
		begin : <c:out value="${status.begin}"></c:out><br>
		end : <c:out value="${status.end}"></c:out><br>
		step : <c:out value="${status.step}"></c:out><br>
		first : <c:out value="${status.first}"></c:out><br>
		last : <c:out value="${status.last}"></c:out><br>
		<hr>
	</c:forEach>
</body>
</html>