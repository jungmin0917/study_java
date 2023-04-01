<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- pageContext.request.contextPath는 웹 어플리케이션의 루트 경로이다. 그걸 기준으로 상대경로로 진행하면 된다 --%>
<%-- 나의 경우에는, /webapp 여기가 루트 경로이다. --%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/jungmin.css">
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
					<header class="major">
						<a href="javascript:;" class="image main"><img
							src="${pageContext.request.contextPath}/images/join01.png"></a>
						<%-- 광고 넣을 부분 --%>

						<h1>회원가입</h1>
						<p>
							환영합니다 고객님<br> 회원가입 후 정상적인 서비스를 이용하실 수 있습니다.
						</p>
					</header>

					<hr>

					<form
						action="${pageContext.request.contextPath}/member/MemberJoinOk.me"
						method="POST" name="joinForm" class="join_form">
						<div class="join_subwrap">
							<%-- 아래는 회원가입 입력 항목 들어가는 곳 --%>
							<div class="join_left">
								<p>
									<span>*</span> 아래 항목은 모두 작성해주세요
								</p>
								<div class="p_down">
									<div class="col-6 col-12-xsmall">
										<p>
											아이디 <span id="idCheck_text"></span>
										</p>
										<input type="text" name="memberId" id="memberId"
											placeholder="6자 이상의 영문 및 숫자로 입력"> <br>
										<p>비밀번호</p>
										<input type="password" name="memberPw" id="memberPw"
											placeholder="영문 4자 ~ 20자로 입력"> <br>
										<div class="name_age_wrap">
											<div>
												<p>이름</p>
												<input type="text" name="memberName" id="memberName">
											</div>
											<div>
												<p>나이</p>
												<input type="text" name="memberAge" id="memberAge">
											</div>
										</div>

										<hr>
										<div class="col-12 join_term">
											<input type="checkbox" id="term" name="term"> <label
												for="term"> 전체 동의합니다. </label>
										</div>

										<div class="col-12 join_term_text">
											<div>
												<input type="checkbox" id="term1" name="term1" class="terms">
												<label for="term1">서비스 이용약관</label>
											</div>
											<div class="term-detail">
												<a href="javascript:;" data-href="term1-content">펼쳐보기</a>
											</div>
										</div>
										<textarea name="term1-content" id="term1-content" rows="3"
											class="term_textarea"></textarea>
										<div class="col-12 join_term_text">
											<div>
												<input type="checkbox" id="term2" name="term2" class="terms">
												<label for="term2">개인정보 수집 및 이용</label>
											</div>
											<div class="term-detail">
												<a href="javascript:;" data-href="term2-content">펼쳐보기</a>
											</div>
										</div>
										<textarea name="term2-content" id="term2-content" rows="3"
											class="term_textarea"></textarea>
										<br>

									</div>
								</div>

								<hr>
								<p class="join_options">아래 항목은 선택사항입니다.</p>

								<div class="p_down">
									<p>성별</p>
									<div class="col-4 col-12-small">
										<input type="radio" id="male" name="memberGender" value="남자">
										<label for="male">남자</label> <input type="radio" id="female"
											name="memberGender" value="여자"> <label for="female">여자</label>
										<input type="radio" id="none" name="memberGender" value="선택안함"
											checked> <label for="none">선택안함</label>
									</div>

									<p>이메일</p>
									<input type="text" id="memberEmail" name="memberEmail"
										placeholder="이메일 입력"> <br>

									<p>우편번호</p>
									<div class="join_zipcode">
										<input type="text" id="memberZipcode" name="memberZipcode"
											class="postcodify_postcode5">
										<ul class="actions">
											<li><input type="button" id="postcodify_search_button"
												class="button primary" style="border-radius: 0;" value="검색">
											</li>
										</ul>
									</div>
									<p>주소</p>
									<input type="text" id="memberAddress" name="memberAddress"
										class="postcodify_address"> <br>
									<p>상세주소</p>
									<input type="text" id="memberAddressDetail"
										name="memberAddressDetail" class="postcodify_details">
									<br>
									<p>참고항목</p>
									<input type="text" id="memberAddressEtc"
										name="memberAddressEtc" class="postcodify_extra_info">
									<br>
									<div class="col-12 join_buttons">
										<ul class="actions">
											<li><input type="button" class="primary"
												onclick="formSubmit()" value="완료"></li>
											<li><input type="button" class="primary"
												onclick="history.back()" value="취소"></li>
										</ul>
									</div>
								</div>
							</div>

							<%-- 아래는 광고 들어가는 곳 --%>
							<div class="join_right preview">
								<div>
									<h4>광고1</h4>
									<img alt="광고이미지1"
										src="${pageContext.request.contextPath}/images/ex01.png">
								</div>
								<hr>
								<div>
									<h4>광고2</h4>
									<img alt="광고이미지2"
										src="${pageContext.request.contextPath}/images/ex02.png">
								</div>
								<hr>
								<div>
									<h4>광고3</h4>
									<img alt="광고이미지2"
										src="${pageContext.request.contextPath}/images/ex03.png">
								</div>
								<hr>
							</div>
						</div>
					</form>

				</section>
			</div>
		</div>
	</div>
</body>

<%-- 자바스크립트 불러오는 순서 중요함!! --%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/js/main.js"></script>

<%-- jsp 파일이라 script 내부에서 EL문 사용 가능 --%>
<script type="text/javascript">
	var contextPath = "${pageContext.request.contextPath}";
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/app/member/join.js"></script>
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
<script>
	$(function() {
		$("#postcodify_search_button").postcodifyPopUp();
	});
</script>

</html>