<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Scripting Tag 2</title>
	</head>
	<body>
		<%! // 주로 선언에 사용한다
			int count = 3;
			String makeItBeLower(String data){
				return data.toLowerCase();
			}
		%>
		
		<%
			for(int i=0; i < count; i++){
				out.println("Java Server Pages " + (i + 1) + "<br>");
			}
		%>
		
		<%=makeItBeLower("Hello World!") %>
		
	</body>
</html>