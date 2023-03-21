<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 아래 모양과 같이 테이블 만들기 -->
		
		<table border="1">
			<c:forEach var="i" begin="1" end="5">
			    <tr>
					<c:forEach var="j" begin="1" end="${i}">
						<td>
							${i}행 ${j}열
						</td>
					</c:forEach>
			    </tr>
			</c:forEach>
			<c:forEach var="i" begin="1" end="4">
			    <tr>
					<c:forEach var="j" begin="1" end="${4 - i + 1}">
						<td>
							${4 - i + 1}행 ${j}열
						</td>
					</c:forEach>
			    </tr>
			</c:forEach>
		</table>
		
	</body>
</html>