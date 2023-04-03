<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
<style>
	form textarea{
		border-radius:0; 
		resize:none;
		color:black !important;
	}
	
	form div#reply{
		display:flex;
		margin-bottom:3%;
	}
	
	input[type='submit']:not(#register), input[type='button'] {border-radius:0;}
	
	ul.actions li {
	    padding: 0 0 0 0.2em;
	}
	
	p.content{
		width:63%;
	}
	
	p.writer{
		width:20%;
		font-weight:bold;
	}
</style>
</head>
<body class="is-preload">
	<%-- 해당 글이 없으면 조회 불가능 --%>
	<c:if test="${board eq null}">
		<script type="text/javascript">
			alert("존재하지 않는 게시글입니다");
			location.replace("${pageContext.request.contextPath}/board/BoardListOk.bo");
		</script>
	</c:if>

	<%-- 로그인해야 조회 가능 --%>
	<c:if test="${sessionId eq null}">
		<script>
			alert("로그인 후 이용하세요.");
			location.replace("${pageContext.request.contextPath}/member/MemberLogin.me");
		</script>
	</c:if>
	
	<%-- 이건 굳이 필요 없는데 왜 하는지? --%>
	<c:set var="board" value="${board}"/>
	<c:set var="files" value="${files}"/>
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
					<a href="#" class="image main"><img src="${pageContext.request.contextPath}/images/boardView.png" alt="" /></a>
					<div class="col-12">
						<ul class="actions" style="display:flex; justify-content:flex-end;">
							<li><input type="button" value="글쓰기" class="primary" onclick="location.href='${pageContext.request.contextPath}/board/BoardWrite.bo'"/></li>
							<li><input type="button" value="목록" class="primary" onclick="location.href='${pageContext.request.contextPath}/board/BoardListOk.bo'"/></li>
							<c:if test="${sessionId eq board.getBoardMemberId()}">
								<li><input type="button" value="수정" onclick="location.href='${pageContext.request.contextPath}/board/BoardModify.bo?boardNum=${board.getBoardNum()}'"/></li>
								<li><input type="button" value="삭제" onclick="location.href='${pageContext.request.contextPath}/board/BoardDeleteOk.bo?boardNum=${board.getBoardNum()}'"/></li>
							</c:if>
						</ul>
					</div>
					<header class="major">
					
						<h2 style="text-align:left;">제목 ${board.getBoardTitle()}</h2>
						<p style="text-align:left; margin-bottom:1%">작성자 : ${board.getBoardMemberId()}</p>
					</header>
					<hr style="margin-top:0;">
					<c:if test="${files != null}">
						<div>
							첨부파일
						</div>
						<c:forEach var="file" items="${files}">
							<a href="${pageContext.request.contextPath}/board/FileDownload.bo?file_name=${file.getFileName()}"><c:out value="${file.getFileNameOriginal()}"/></a>
							<br>
						</c:forEach>
					</c:if>
					<hr />
					<%-- 내용 보여줄 때는 웬만하면 pre 태그로 사용하기 (여백, 줄바꿈 등이 DB 내용 그대로 출력됨) --%>
					<h3><pre>${board.getBoardContent()}</pre></h3>
				</section>
			</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
</html>