<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>POST 방식의 요청</title>
</head>
<body>
	<h1>POST 방식의 요청</h1>
	
	<button onclick="sendRequest()">POST 방식으로 요청 보내기</button>
	<p id="text"></p> <%-- ajax 응답값을 넣을 곳 --%>
	
</body>
<script type="text/javascript">
	function sendRequest(){
		var xhr = new XMLHttpRequest();
		
		const city = "seoul";
		const zipcode = "13513";
		
		const params = new URLSearchParams();
		params.append("city", city);
		params.append("zipcode", zipcode);
		
		const qstr = params.toString();
		
		xhr.open("POST", "request_ajax.jsp", true);
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		xhr.send(qstr); // GET방식과 다르게 여기에 인수가 들어가야 함
		// 다만, send 내부 인수로 다양한 방식으로 보낼 수 있기 때문에 어떤 방식으로 보내는지에 대한 명시를 해줘야 함
		
		xhr.onreadystatechange = function(){
			if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200){
				document.getElementById("text").innerHTML = xhr.responseText;
			}
		}
	}
</script>
</html>