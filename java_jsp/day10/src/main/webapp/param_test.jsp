<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param 액션 태그</title>
</head>
<body>
	<% // 하려고 하는 것 : 로그인, 회원가입 할 때 아이디, 이름 같은 데이터를 다른 페이지로 이동시키기 %>
	
	<h3>param 액션 태그</h3>
	<jsp:forward page="paramP.jsp">
		<jsp:param name="id" value="admin"/>
		<jsp:param name="name" value="관리자"/>
	</jsp:forward>
	
	<% // forward를 통해서 paramP.jsp로 가는데, 해당 parameter들을 가지고 보내는 코드이다 %>
</body>
</html>