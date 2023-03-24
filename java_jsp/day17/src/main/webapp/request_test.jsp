<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>요청 페이지</title>
</head>
<body>
	<%-- form 태그를 사용해 input 태그로 이름을 보내기 --%>
	<form action="response_test.jsp" method="get">
		<input type="text" name="name">
		<button type="submit">전송</button>
	</form>
	
	<%
		// 유효성 검사하기
		String name = request.getParameter("name");
	
		if(name != null){
			out.println(name);
		}
	%>
</body>
</html>