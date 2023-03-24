<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>내장 객체 예제</title>
</head>
<body>
	<form action="object_ok.jsp" name='join' class='join'>
		<fieldset>
			<legend>개인 정보</legend>
			<input type="text" name="name">
			<input type="date" name="birthday">
			<%-- 일단 send() 함수로 유효성 검사 후 서버에 넘기기 --%>
			<input type="button" value="확인" onclick="send()">
		</fieldset>
	</form>
</body>

<%-- jQuery를 이용해보자 --%>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(".join input[name='name']").on("click", function(){
		$(this).removeAttr("style");
		$(this).removeAttr("placeholder");
	});
	
	$(".join input[name='birthday']").on("click", function(){
		$(this).removeAttr("style");
	});
	
	<%-- 유효성 검사 --%>
	function send(){
		var form = document.join; // 현재 도큐먼트에서 name이 join인 요소를 가져옴

		if(!form.name.value){ // 만약 해당 join의 name 속성값이 없으면
			$("input[name='name']").css("border-color", "red");
			$("input[name='name']").attr("placeholder", "성함을 입력해주세요");
			return;
		}
		
		if(!form.birthday.value){
			$("input[name='birthday']").css("border-color", "red");	
			return;
		}
		
		form.submit(); // 폼 제출
	}
	
</script>
</html>