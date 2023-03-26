<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td class="td1">
				<h2>실시간 검색 순위</h2>
			</td>
			<td class="td2">
				<div id="ranking">키워드</div>
			</td>
		</tr>
	</table>
</body>

<script type="text/javascript">
	// window.onload() : HTML 문서의 모든 리소스를 다운로드하고 브라우저가 문서를 렌더링하는 것이 완료된 후에 실행되는 이벤트
	window.onload = function(){
		let ranking = document.getElementById("ranking");
		let xhr = new XMLHttpRequest();
		let obj; // JSON을 자바스크립트 객체로 받을 곳.
		let words = new Array(); // 데이터 재가공해서 words에 넣음
		let str; // 재가공용 string
		
		xhr.open("GET", "data.json", true);
		xhr.send();
		
		xhr.onreadystatechange = function(){
			if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200){ // 성공적으로 데이터를 받아왔을 시
// 				JSON.parse(); // JSON 형식의 문자열을 JavaScript 객체로 변환해주는 메소드.
				obj = JSON.parse(xhr.responseText); // JSON 형태의 반환값을 자바스크립트 객체로 변환해준다.
				
				// 아래는 데이터 재가공해서 words에 넣음
				for (let i = 0; i < obj.search_word.length; i++) {
					str = "[" + obj.search_word[i].rank	+ "]" + obj.search_word[i].name;
					words[i] = str;
				}
			}
		}
		
		// 1등 1초 나오고 2등 2초 나오고 이런 실시간검색어 만들기
		
		let i = 0;
		
		// interval이라는 변수에 담아두는 이유는, 이것이 타이머가 되어 나중에 타이머를 조정하거나, 반복을 중지할 수 있기 때문이다.
		// setInterval() : 일정 시간마다 함수를 실행하는 메소드
		let interval = setInterval(function(){
			ranking.innerHTML = "<h3>" + words[i] + "</h3>";
			i++;
			
			if(i >= obj.search_word.length){
				i = 0;
			}
		}, 1000);
		
		// setTimeout() : 일정 시간 후에 함수를 1회 실행하는 메소드
		// clearInterval() : 해당 타이머 변수를 가진 setInterval 객체의 실행을 중지
		setTimeout(function(){
			clearInterval(interval);
		}, 10000);
		
	}
	
</script>

</html>