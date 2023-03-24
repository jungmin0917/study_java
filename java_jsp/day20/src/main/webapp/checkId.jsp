<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 아이디 유효성 검사하는 ajax용 파일
	
	String id = request.getParameter("id");
	if(!id.equals("jungmin")){
		out.println("성공");
	}else{
		out.println("실패");
	}

%>