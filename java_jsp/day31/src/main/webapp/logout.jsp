<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 로그아웃 페이지
	
// 	session.invalidate(); // 세션에 저장된 모든 속성과 값을 제거하고 세션 자체를 무효화함
	session.removeAttribute("id"); // 지정된 속성만 제거하는 메소드
	
%>

<script type="text/javascript">
	location.href = "login.jsp";
</script>