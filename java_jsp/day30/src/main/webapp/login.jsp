<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 화면</title>
</head>
<body>
	<form action="login_ok.jsp" name="loginForm" method="POST">
		<p>
			<label for="id">
				아이디 : <input type="text" name="id" id="id">
			</label>
		</p>
		<p>
			<label for="password">
				비밀번호 : <input type="password" name="password" id="password">
			</label>
		</p>
		<p>
			<input type="button" value="로그인" onclick="login()">
		</p>	
	</form>
</body>

<script type="text/javascript">
	function login(){
		var form = document.loginForm;

		if(!form.id.value){
			alert("아이디를 입력해주세요");
			return;
		}
		
		if(!form.password.value){
			alert("비밀번호를 입력해주세요");
			return;
		}
		
		form.submit();
	}
</script>
</html>