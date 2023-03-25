<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
</head>
<body>
	<%-- jsp -> jsp -> jsp 세 단계에 걸쳐 요청 - 응답할 것임 --%>
	<form action="join_db.jsp" method="POST" name="joinForm"> <%-- 중요한 데이터이므로 POST (데이터 길이도 길거니와) --%>
		<p>
			<label for="id">아이디 : <input type="text" name="id" id="id"></label>
		</p>
		<%-- 아이디 중복검사 부분 --%>
		<p id="id_check_result">
		</p>
		<p>
			<label for="name">이름 : <input type="text" name="name" id="name"></label>
		</p>
		<p>
			<label for="password">비밀번호 : <input type="password" name="password" id="password"></label>
		</p>
		<p>
			<label for="password_re">비밀번호 확인 : <input type="password" name="password_re" id="password_re"></label>
		</p>
		<p>
			성별 :  
			<label for="gender_1">
				남자 <input type="radio" name="gender" id="gender_1" value="남자" checked> 
			</label>
			<label for="gender_2">
				여자 <input type="radio" name="gender" id="gender_2" value="여자">
			</label>
		</p>
		
	</form>
</body>
</html>