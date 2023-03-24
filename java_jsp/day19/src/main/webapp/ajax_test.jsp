<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>GET, POST 방식의 요청</title>
</head>
<body>
	<h1>GET 방식의 요청</h1>
	<button onclick="sendRequest()">GET 방식으로 요청 보내기!</button>
	<p id="text"></p> <%-- 여기에 XMLHttpRequest의 응답값 집어넣기 --%>
</body>
<script type="text/javascript">
	function sendRequest(){
		var xhr = new XMLHttpRequest(); // Ajax 통신을 위한 XMLHttpRequest 객체를 만듦
		// open(전달 방식, URL, 동기 여부);
		
		const params = new URLSearchParams();
		params.append('city', 'seoul');
		params.append('zipcode', '12345');
		
		const qstr = params.toString();
		
		xhr.open("GET", "request_ajax.jsp?" + qstr, true);
		xhr.send(); // GET 방식이라 send에는 인수가 없다
		
		xhr.onreadystatechange = function(){
			if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200){ // 서버가 제대로 응답을 받았고 요청이 성공했는지
				// XMLHttpRequest 객체의 responseText 프로퍼티는 서버로부터 받아온 HTTP 응답 본문을 문자열 형태로 담고 있다.
				document.getElementById("text").innerHTML = xhr.responseText;
			}
		} // 상태가 변할 때마다 실행이 되는 메소드
	}
</script>
</html>