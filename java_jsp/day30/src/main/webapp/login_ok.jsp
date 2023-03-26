<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
// 	HttpSession session = request.getSession(); // 현재는 이미 session 객체가 있는 상태.

	// 만약 로그인에 성공을 했다면, 세션에 저장을 한다.
	session.setAttribute("id", id); // session 객체에 id라는 attribute를 id라는 위에서 선언했던 값으로 넣겠다는 뜻이다
	// 그래서 페이지 이동을 하더라도 로그인 세션이 남아있어서 로그아웃이 되지 않도록 하는 그런 것이다
	
	// 로그아웃을 하면, 세션을 다 날리면 된다.

%>