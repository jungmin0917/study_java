<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
</head>
<body>
	<%-- 유효성 검사에 ajax를 이용해보도록 하겠음 --%>
	<form>
		아이디 <input type="text" name="id" id="id">
		<input type="button" onclick="checkId()" value="유효성 검사">
		<p id="check"></p>
		비밀번호 <input type="password" name="pw">
	</form>
</body>

<script type="text/javascript">

	var input = document.getElementById("id");
	input.addEventListener("keypress", function(e){
		if(e.key === "Enter"){
			checkId();
		}
	});

	function checkId(){
	
		const id = document.getElementById("id").value;
		
		var xhr = new XMLHttpRequest();
		
		const params = new URLSearchParams();
		params.append("id", id);
		
		const qstr = params.toString();
		
		xhr.open("POST", "checkId.jsp", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(qstr);
		
		xhr.onreadystatechange = function(){
			if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200){
				var result = xhr.responseText.trim();
				var text = "";
				
				if(result == "성공"){
					text = "아주 좋은 아이디입니다!";
				}else{
					text = "이미 존재하는 아이디입니다";
				}
				
				document.getElementById("check").innerHTML = text;
			}
		}
	}
	
</script>
</html>