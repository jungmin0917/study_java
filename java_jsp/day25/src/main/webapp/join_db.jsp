<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 요청을 자바빈즈로 받아 객체를 만들어 join() 메소드로 전달하여 DB 처리를 하자 --%>
<%-- 출력할 내용이 필요 없는 부분이기에 나머지 부분은 지우기로 한다 --%>

<%-- jsp:useBean 태그에는 class쪽에 해당 클래스의 전체 경로 및 클래스명, id에는 생성할 자바빈즈 인스턴스명 --%>
<jsp:useBean class="dao.UserDAO" id="dao"></jsp:useBean>
<jsp:useBean class="vo.UserVO" id="vo"></jsp:useBean>

<%-- name에 적은 객체명의 객체의 모든 멤버변수 가져옴 --%>
<jsp:setProperty property="*" name="vo"></jsp:setProperty>


<%
	// 자바빈즈를 써서 UserVO 객체를 사용하면 각자 필드명과 맵핑이 돼서 이름이 동일하면 알아서 값이 들어간다
	// 뭔 소린지 모르겠는데 써보면 알 듯
	
	// 여기부터 join메소드로 위에서 가져온 멤버변수를 이용해 DB에 써보자
	
%>