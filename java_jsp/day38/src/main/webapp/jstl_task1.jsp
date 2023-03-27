<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 실습 1</title>
</head>
<body>

	<% 
		// 사용자에게 이름을 입력받고 확인 버튼을 눌렀을 때 admin일 경우 "관리자", member일 경우 "일반 회원 [사용자명]" (GET 방식)
		// 그 외에는 "비회원"을 출력한다
		
		// 다른 페이지 없이 현재 페이지에서만 처리하고, 결과가 출력될 때에는 input 태그와 submit 버튼이 나오게 해서는 안 된다.
	%>

	<c:choose>
		<%-- 만약 param.id가 비어있으면 null이 아닌 빈 문자열로 취급된다. --%>
		<c:when test="${empty param.id}">
			<form action="./jstl_task1.jsp" method="GET">
				
				<label for="id">
					<input type="text" name="id" id="id">
				</label>
				
				<button type="submit">전송</button>
			</form>
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${param.id == 'admin'}">
					<strong>관리자</strong>
				</c:when>
				<c:when test="${param.id == 'member'}">
					<strong>일반 회원 ${param.id} 입니다</strong>
				</c:when>
				<c:otherwise>
					<strong>비회원</strong>
				</c:otherwise>
			</c:choose>
		</c:otherwise>
	</c:choose>
	
</body>
</html>