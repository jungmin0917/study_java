<%@page import="com.jspex.beans.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="com.jspex.beans.MemberVO" id="vo"></jsp:useBean>
<jsp:useBean class="com.jspex.beans.MemberDAO" id="dao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바빈즈 예제</title>
</head>
<body>
	<%-- 새로 만든 vo 객체에 값 넣기 --%>
	<%-- 
	<jsp:setProperty property="name" name="vo" value="jungmin"/>
	<jsp:setProperty property="birthday" name="vo" value="2023-03-23"/>
	--%>
	
	<%-- 새로 만든 vo 객체에서 값 가져오기 (자동으로 출력이 됨) --%>
	<%-- 
	<jsp:getProperty property="name" name="vo"/>
	<jsp:getProperty property="birthday" name="vo"/>
	--%>
	
	<%-- 이제 DAO 클래스를 이용해서 새 ArrayList에 직접 DB에서 값을 불러와서 넣어보자 --%>
	<%-- 스크립틀릿 태그도 같이 섞어서 할 것이다 --%>
	<%
		ArrayList<MemberVO> members = dao.select("유채연");
	%>
	
	<table border=1>
		<%for(int i=0; i < members.size(); i++){ %>
			<%-- 이번엔 setProperty 자바빈즈 태그로 값을 넣어보기 --%>
			<jsp:setProperty property="num" name="vo" value="<%=members.get(i).getNum() %>"/>
			<jsp:setProperty property="name" name="vo" value="<%=members.get(i).getName() %>"/>
			<jsp:setProperty property="birthday" name="vo" value="<%=members.get(i).getBirthday() %>"/>
			<tr>
				<td>
					<jsp:getProperty property="num" name="vo"/>
				</td>
				<td>
					<jsp:getProperty property="name" name="vo"/>
				</td>
				<td>
					<jsp:getProperty property="birthday" name="vo"/>
				</td>
<!-- 				<td> -->
<%-- 					<%=members.get(i).getNum() %> --%>
<!-- 				</td> -->
<!-- 				<td> -->
<%-- 					<%=members.get(i).getName() %> --%>
<!-- 				</td> -->
<!-- 				<td> -->
<%-- 					<%=members.get(i).getBirthday() %> --%>
<!-- 				</td> -->

			</tr>
		<%} %>
	</table>
	
</body>
</html>