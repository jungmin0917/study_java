<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 실습 2ㄴ</title>
</head>
<body>
	<%
		// 사용자에게 1 ~ 100까지의 숫자를 입력받아 입력받은 단수로 구구단 출력
		// 입력받은 값이 정수인지 아닌지 판단, 값을 입력했는지 안 했는지 판단
		// 다른 페이지 이동 없이 현재 페이지에서만 기능 구현
		// 자바스크립트 사용 가능
		
	%>
	
	<form action="./jstl_task2.jsp" method="GET">
	
		<label for="num">
			1 ~ 100까지의 정수 입력 : 
		</label>
	</form>
</body>

<script type="text/javascript">

</script>

</html>