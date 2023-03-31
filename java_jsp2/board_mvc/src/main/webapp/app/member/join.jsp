<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<%-- pageContext.request.contextPath는 웹 어플리케이션의 루트 경로이다. 그걸 기준으로 상대경로로 진행하면 된다 --%>
	<%-- 나의 경우에는, /webapp 여기가 루트 경로이다. --%>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
	<title>회원가입</title>
</head>
<body class="is-preload">
	<!-- Page Wrapper -->
	<div id="page-wrapper">
	<!-- 일단은 시맨틱적인 요소 고려하지 않고 div 위주로 하겠음 -->
		<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
				<jsp:include page="/app/fix/header.jsp"></jsp:include>
			</div>
		</div>
		
		<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
				<!-- Main -->
				<section class="main">
					<a href="javascript:;" class="image main"><img src="${pageContext.request.contextPath}/images/join01.png"></a> <%-- 광고 넣을 부분 --%>
					
					<h1>회원가입</h1>
					<p>
						환영합니다 고객님<br>
						회원가입 후 정상적인 서비스를 이용하실 수 있습니다.
					</p>
				</section>
			</div>
		</div>
	</div>
</body>

<%-- 자바스크립트 불러오는 순서 중요함!! --%>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/main.js"></script>

</html>