<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/jungmin.css">

<meta charset="UTF-8">
<title>아이디 찾기</title>
</head>
<body class="is-preload">
	<%-- param.code가 있다는 건, get방식으로 키값이 code인 무언가가 넘어왔을 때라는 것 --%>
	<c:if test="${not empty param.code}">
		<script>
			alert("아이디 또는 비밀번호를 다시 확인해주세요.");
		</script>
	</c:if>
	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
				<jsp:include page="/app/fix/header.jsp" />
			</div>
		</div>

		<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">

				<!-- Main -->
				<section class="main">
					<header class="major">
						<a href="#" class="image main"><img
							src="${pageContext.request.contextPath}/images/login01.png"
							alt="" /></a>
						<h1>아이디 찾기</h1>
					</header>
					<hr />
					<form method="post"
						action="${pageContext.request.contextPath}/member/MemberLogin.me"
						name="showIdForm">
						<div style="display: flex; justify-content: space-evenly;">
							<div style="width: 40%">
								<div>
									<div class="col-6 col-12-xsmall" style="width: 100%">
										<p style="text-align: center; font-size: 2rem;">
											<c:choose>
												<c:when test="${requestScope.memberId eq null}">
													해당하는 아이디가 없습니다
												</c:when> 
												<c:otherwise>
													${requestScope.memberId}
												</c:otherwise>
											</c:choose>
										</p>	
									</div>
								</div>
								<div class="col-12">
									<ul class="actions"
										style="display: block; text-align: center; margin-top: 9%">
										<li><input type="button" value="로그인" class="primary"
											style="width: 100%; font-size: 1em;" onclick="showIdForm.submit()" /></li>
									</ul>
								</div>
							</div>
							<div class="preview" style="width: 40%">
								<img src="${pageContext.request.contextPath}/images/login02.png">
							</div>
						</div>
					</form>
				</section>
			</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>

</html>