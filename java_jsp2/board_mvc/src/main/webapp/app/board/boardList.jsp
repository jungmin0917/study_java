<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- functions JSTL 라이브러리를 사용할 시, List 객체에서 하나씩 빼오는 것을 JSTL 태그로 할 수 있음 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
<style>
	table tbody tr{
		background-color:rgb(245 246 246 / 48%) !important;
	}
</style>
</head>
<body class="is-preload">
	<%-- 로그인 안 되어있으면 로그인으로 보내기 (세션 확인) --%>
	<c:if test="${sessionId eq null}">
		<script>
			alert("로그인 후 이용하세요.");
			location.replace("${pageContext.request.contextPath}/member/MemberLogin.me");
		</script>
	</c:if>
<!-- c:set에서 내용으로 파라미터 값을 넣으면, 문자열로 변환된 후 저장된다. -->
<!-- c:set value속성에 값을 넣으면, 해당 값의 타입이 그대로 유지된다. -->

	<%-- 각종 값을 받아옴 (전의 페이지에서 forward로) --%>
	<c:set var="totalCount" value="${totalCount}"/>
	<c:set var="realEndPage" value="${realEndPage}"/>
	<c:set var="startPage" value="${startPage}"/>
	<c:set var="endPage" value="${endPage}"/>
	<c:set var="nowPage" value="${nowPage}"/>
	<c:set var="boardList" value="${boardList}"/>

<!-- Page Wrapper -->
	<div id="page-wrapper">
	<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
				<jsp:include page="/app/fix/header.jsp"/>
			</div>
		</div>

	<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">

				<!-- Main -->
					<section class="main">

						<a href="#" class="image main"><img src="${pageContext.request.contextPath}/images/boardMain.png" alt="" /></a>
						<header class="major">
							<h1>게시판</h1>
							<p>자유 게시판</p>
						</header>

						<div class="table-wrapper">
							<div style="display:flex; justify-content:space-between;">
								<span>글 개수 : ${totalCount}개</span>
								<%-- 글쓰기 버튼 (그냥 글쓰는 페이지로 이동이기 때문에 Ok가 안 붙음. Ok는 글쓰기 완료 시 사용할 부분임) --%>					
								<button style="border-radius:0;" onclick="location.href='${pageContext.request.contextPath}/board/BoardWrite.bo'">글쓰기</button>
							</div>
							<table>
								<caption style="text-align:left; margin-bottom:3%;">
									
								</caption>
								<thead>
									<tr>
										<th>번호</th>
										<th>제목</th>
										<th>작성자</th>
										<th>날짜</th>
										<th>조회수</th>
									</tr>
								</thead>
								<tbody>
									<%-- 전달받은 List가 존재하고, 해당 List 개수가 1개 이상이면 --%>
									<c:choose>
										<%-- fn:length(전달받은 List명) : list의 개수 --%>
										<c:when test="${boardList != null and fn:length(boardList) > 0}">
											<%-- forEach JSTL 태그로 순환 --%>
											<c:forEach var="board" items="${boardList}">
											<tr>
												<%-- getBoard~~~로 정보 전부 가져옴 (DAO에 만들어야 함) --%>
												<%-- 메소드를 쓸 땐 반드시 소괄호 붙일 것!!!!! --%>
												<td>${board.getBoardNum()}</td>
												<td>
													<%-- BoardViewOk에 boardNum 넘김으로써 게시글 보기 페이지로 감 --%>
													<a href="${pageContext.request.contextPath}/board/BoardViewOk.bo?boardNum=${board.getBoardNum()}">${board.getBoardTitle()}</a>
												</td>
												<td>${board.getBoardMemberId()}</td>
												<td>${board.getBoardDate()}</td>
												<td>${board.getReadCount()}</td>
											</tr>
											</c:forEach>
										</c:when>
										<%-- List가 없을 시 게시글이 없다고 표시 --%>
										<c:otherwise>
											<tr>
												<td colspan="5" align="center">등록된 게시물이 없습니다.</td>
											</tr>
										</c:otherwise>
									</c:choose>
								</tbody>
							</table>
							
							<table style="font-size:1.3rem">
								<tr align="center" valign="middle">
									<td>
									<%-- 여기서부터 페이징 처리 --%>
									<%-- 이전 버튼 (페이지 구간 이동이 아닌 그냥 ㄹㅇ 다음 페이지로) --%>
									<c:if test="${nowPage > 1}">
										<a href="${pageContext.request.contextPath}/board/BoardListOk.bo?page=${nowPage-1}">&lt;</a>
									</c:if>
									
									<%-- 해당 페이지 구간만큼 반복 --%>
									<c:forEach var="i" begin="${startPage}" end="${endPage}">
										<c:choose>
											<%-- 현재 페이지인 경우 []로 덮어줌 --%>
											<c:when test="${i eq nowPage}">
												<c:out value="[${i}]"/>&nbsp;
											</c:when>
											<c:otherwise>
												<a href="${pageContext.request.contextPath}/board/BoardListOk.bo?page=${i}"><c:out value="${i}"/></a>
											</c:otherwise>
										</c:choose>
									</c:forEach>
									
									<%-- 다음 버튼 --%>
									<%-- !=로 비교하면 안 됨 (기본적으로 문자열 타입으로 넘어옴) --%>
									<c:if test="${nowPage < realEndPage}">
										<a href="${pageContext.request.contextPath}/board/BoardListOk.bo?page=${nowPage+1}">&gt;</a>
									</c:if>
									</td>
								</tr>
							</table>
						</div>
					</section>
			</div>
		</div>`
	</div>
</body>
<!-- Scripts -->
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
</html>