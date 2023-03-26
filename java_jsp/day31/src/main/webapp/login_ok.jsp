<%@page import="java.util.Base64"%>
<%@page import="java.util.Base64.Decoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean class="dao.UserDAO" id="dao"></jsp:useBean>

<%

	String id = request.getParameter("id");
	String pw = request.getParameter("password"); // 암호화된 password를 받음
	
	Decoder decoder = Base64.getDecoder(); // base64값을 디코딩할 decoder 객체를 생성
	pw = new String(decoder.decode(pw)); // base64로 암호화된 password를 디코딩함 (바이트로 반환되기 때문에 String으로 변환함)
	
// 	HttpSession session = request.getSession(); // 현재는 이미 session 객체가 있는 상태.

	if(dao.login(id, pw)){
		// 만약 로그인에 성공을 했다면, 세션에 저장을 한다.
		session.setAttribute("id", id); // session 객체에 id라는 attribute를 id라는 위에서 선언했던 값으로 넣겠다는 뜻이다
		// 그래서 페이지 이동을 하더라도 로그인 세션이 남아있어서 로그아웃이 되지 않도록 하는 그런 것이다
		// 로그아웃을 하면, 세션을 다 날리면 된다.
		response.sendRedirect("login_success.jsp"); // 보내기
		
	}else{
		response.sendRedirect("login.jsp?type=false"); // 다시 돌아가기
	}
	
	// 근데 단순히 위처럼 처리하면, 네트워크 헤더에 내용이 그대로 남는다.
	// 그러므로 암호화를 해줘야 한다

%>