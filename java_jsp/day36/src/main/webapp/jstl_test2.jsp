<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 테스트 (출력의 종류)</title>
</head>
<body>
	<c:set var="name" value="황정민"></c:set>
	${name}
	<c:out value="${name}"></c:out>
	
	<%-- 아래와 같은 부분을 악용할 수 있기 때문!!! --%>
	${"<script>alert('안녕');</script>"}
	<c:out value="<script>alert('안녕');</script>"></c:out>
	<%-- c:out의 기본 옵션으로 escapeXml=true가 되어있어서 XSS(Cross Site Scripting) 공격을 방어할 수 있다 --%>
</body>
</html>