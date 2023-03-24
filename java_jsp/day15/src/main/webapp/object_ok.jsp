<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%-- 현재 페이지에서 object.jsp에서 보내온 form 값을 처리 (내장객체 이용) --%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>내장 객체 request 예제</title>
</head>
<body>
	<table>
		<tr>
			<th>이름</th>
			<th>생일</th>
		</tr>
		<tr>
			<td><%=request.getParameter("name") %></td>
			<td><%=request.getParameter("birthday") %></td>
		</tr>
	</table>
</body>
</html>