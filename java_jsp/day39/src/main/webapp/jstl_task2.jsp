<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 실습 2</title>
</head>
<body>
	<%
		// 사용자에게 1 ~ 100까지의 숫자를 입력받아 입력받은 단수로 구구단 출력
		// 입력받은 값이 정수인지 아닌지 판단, 값을 입력했는지 안 했는지 판단
		// 다른 페이지 이동 없이 현재 페이지에서만 기능 구현
		// 자바스크립트 사용 가능
		
	%>
	
	<form action="./jstl_task2.jsp" method="GET" name="numForm">
		<label for="num">
			1 ~ 100까지의 정수 입력 : <input type="text" name="num" id="num" placeholder="숫자 입력">
		</label>
		<input type="button" value="제출" name="button">
	</form>
	
	<%-- 정상적으로 submit 됐을 시 --%>
	<c:if test="${not empty param.num}">
		<hr>
		
		<c:forEach var="i" begin="1" end="9" step="1">
			<c:out value="${param.num} * ${i} = ${i * param.num}"></c:out><br>
		</c:forEach>
	</c:if>
</body>

<script type="text/javascript">
	const form = document.numForm;
	
	const button = form.button;
	
	button.addEventListener("click", buttonClick);
	
	function buttonClick(){
		// 검사 후 submit 시키기
		
		const regex = /[^0-9]/;
		const input = form.num.value;
		
		if(input == ""){
			alert("숫자를 입력해주세요");
			form.num.focus();
			return;
		}
		
		if(regex.test(input)){ // 숫자가 아닌 게 있으면
			alert("숫자만 입력해주세요");
			form.num.value = "";
			form.num.focus();
			return;
		}
		
		const num = parseInt(input);
		
		if(num < 1 || num > 100){
			alert("1 ~ 100 사이의 정수만 입력해주세요");
			form.num.value = "";
			form.num.focus();
			return;
		}
		
		form.num.value = num;
		
		// 정상적으로 통과했을 시
		form.submit();
	}
</script>

</html>