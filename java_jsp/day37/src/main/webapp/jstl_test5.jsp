<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 테스트 (제어문 실습)</title>
</head>
<body>
	<form>
		<label for="kor">국어 : <input type="text" name="kor" id="kor" value=""></label><br>
		<label for="eng">영어 : <input type="text" name="eng" id="eng" value=""></label><br>
		<label for="math">수학 : <input type="text" name="math" id="math" value=""></label><br>
		
		<button type="submit">전송</button>
	</form>
	
	<c:if test="${!empty param.kor}">
		<c:set var="total" value="${param.kor + param.eng + param.math}"></c:set>
		<c:set var="avg" value="${total / 3.0}"></c:set>
		총점 : <c:out value="${total}"></c:out><br>
		평균 : <c:out value="${avg}"></c:out><br>
		
		<c:choose>
			<c:when test="${avg >= 60}">
				<strong>참 잘했어요!</strong>
			</c:when>
			<c:otherwise>
				<strong>분발해주세요</strong>
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>