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
			<input type="button" onclick="checkId()" value="중복 확인">
		</p>
		<%-- 아이디 중복검사 부분 --%>
		<p id="id_check_result"></p> <%-- 중복검사 안내 태그 --%>
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
		<p>
			<label for="zipcode">
				우편번호 : <input type="text" name="zipcode" id="zipcode" class="postcodify_postcode5" value="" />
				<button type="button" id="postcodify_search_button">검색</button><br />
			</label>
		</p>
		<p>
			<label for="address">
				주소 : <input type="text" name="address" id="address" class="postcodify_address" value="" /><br />
			</label>
		</p>
		<p>
			<label for="address_detail">
				상세주소 : <input type="text" name="address_detail" id="address_detail" class="postcodify_details" value="" /><br />
			</label>
		</p>
		<p>
			<label for="address_etc">
				참고항목 : <input type="text" name="address_etc" id="address_etc" class="postcodify_extra_info" value="" /><br />
			</label>
		</p>
		
		<input type="button" onclick="join()" value="회원가입하기">
	</form>
</body>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>

<script type="text/javascript">
	$(function() { $("#postcodify_search_button").postcodifyPopUp(); }); 
</script>
<script src="member.js"></script>

</html>