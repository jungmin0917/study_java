<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 자바빈즈 이용해서 DB 연결 객체 만들어서 원하는 정보 가져올 것임 --%>
<jsp:useBean class="dao.UserDAO" id="dao"></jsp:useBean>

<%
	boolean check = dao.checkId(request.getParameter("id"));

	if(check){ // 이미 있는 아이디
		out.println("중복된 아이디입니다");
	}else{
		out.println("사용 가능한 아이디입니다");
	}
	
%>