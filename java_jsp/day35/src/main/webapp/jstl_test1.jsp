<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 테스트 (변수)</title>
</head>
<body>
	<h2>JSTL 테스트 (변수)</h2>
	<%-- var 부분은 변수명, value는 값, scope는 내가 어디 영역까지 값을 유지할 것인가 --%>
	<c:set var="name" value="황정민" scope="page"></c:set>
	<c:out value="${name}"></c:out>
	<%-- $를 출력하고 싶을 때는 \$, $dollar;를 사용한다 --%>
	<br>
	
	\${name} ====> &dollar;{name}
	
	<%-- session 스코프의 변수 등록 --%>
	<c:set var="nation" value="한국" scope="session"></c:set>
	
	<hr>
	${sessionScope.nation}
	
	<!-- session 스코프의 변수 제거 -->
	<c:remove var="nation" scope="session"></c:remove>
	<br>
	<hr>
	
	nation 삭제 후 값은 >> [<c:out value="${nation}" default="미국"></c:out>] >> 변수 값이 삭제됨
		
	<hr>
	
	<c:set var="data1" value="10"></c:set>
	<c:set var="data2" value="${10+10}"></c:set>
	<c:set var="data3">${30*50}</c:set>
	
	합은 <c:out value="${data1 + data2 + data3}"></c:out>
	
</body>
</html>