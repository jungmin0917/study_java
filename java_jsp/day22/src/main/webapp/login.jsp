<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
</head>
<body>
	<%
		// 쿠키가 있는지 확인해서 있으면 input value값으로 채워넣기
		
		String id = "";
		String pw = "";
		
		String cookie_check = request.getHeader("Cookie");
		if(cookie_check != null){
			Cookie[] cookies = request.getCookies();
			
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("id")){
					id = cookie.getValue();
				}else if(cookie.getName().equals("pw")){
					pw = cookie.getValue();
				}
			}
		}
	%>
	<form action="login_ok.jsp" method="POST">
		<div class="login_id">
			<label for="id"> 아이디 : </label><input type="text" id="id" name="id" value="<%=id%>" placeholder="아이디">
		</div>
		<div class="login_pw">
			<label for="pw"> 비밀번호 : </label><input type="password" id="pw" name="pw" value="<%=pw%>" placeholder="비밀번호">
		</div>
		<button type="submit">로그인</button>
	</form>
</body>
</html>