<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// ajax 요청이 들어오는 페이지

	out.println(request.getParameter("city"));
	out.println(request.getParameter("zipcode"));
%>