<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// ajax를 위한 페이지이므로 다른 건 다 지운다
	
	// getParameter를 이용해서 요청으로 받은 값들을 그냥 출력하면 그게 응답값이 되어 반환된다.
	out.println(request.getParameter("city"));
	out.println(request.getParameter("zipcode"));
%>