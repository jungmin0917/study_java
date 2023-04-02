<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
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
	
	input#board_title{
		border-radius: 0;
		border: none;
		text-align: left;
		font-size: 1.75em;
		font-weight: 500;
		line-height: 1.5;
		letter-spacing: 0.1em;
		padding:0;
	}
	
	input[type='file']{
		display:none;
	}
	
	div.files{
		text-align:center;
		margin-right: 3%;
	}
	
	textarea {
		font-size: 1em;
  			font-weight: 600;
  			letter-spacing: 0.1em;
	}
	
</style>
</head>
<body class="is-preload">
	<%-- 로그인해야 페이지 들어올 수 있음 --%>
	<c:if test="${sessionId eq null}">
		<script>
			alert("로그인 후 이용하세요.");
			location.replace("${pageContext.request.contextPath}/member/MemberLogin.me");
		</script>
	</c:if>
	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Wrapper -->
		<div class="wrapper">
			<div class="inner">
				<%-- 헤더 붙임 --%>
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
							<%-- 게시글 목록 보기 --%>
							<li><input type="button" value="목록" class="primary" onclick="location.href='${pageContext.request.contextPath}/board/BoardListOk.bo'"/></li>
						</ul>
					</div>
					
					<%-- 글쓰기 form --%>
					<form action="${pageContext.request.contextPath}/board/BoardWriteOk.bo" name="writeForm" method="post" enctype="multipart/form-data">
						<header class="major">
							<p>
								<input id="boardTitle" name="boardTitle" type="text" placeholder="제목 입력">
							</p>
							<p style="text-align:left; margin-bottom:1%; margin-top:-1.75em;">작성자 : <c:out value="${sessionId}"/></p>
							<%-- hidden 타입으로 sessionId 넘김 --%>
							<input type="hidden" name="boardMemberId" value="${sessionId}">
						</header>
						<hr style="margin-top:0;">
						<div style="margin-bottom:2%;">
							첨부파일
						</div>
						<div style="display:flex;">
							<div class="files">
								<div>
									<label for="board_file1" style="display:inline;">
										<img id="board_file1Img" src="${pageContext.request.contextPath}/images/filePlus.png" width="110px" height="110px" style="display:inline;">
									</label>
								</div>
								<input id="board_file1" name="board_file1" type="file">
								<input type="button" onclick="cancelFile('board_file1')" value="첨부 삭제">
							</div>
							<div class="files">
								<div>
									<label for="board_file2" style="display:inline;">
										<img id="board_file2Img" src="${pageContext.request.contextPath}/images/filePlus.png" width="110px" height="110px" style="display:inline;">
									</label>
								</div>
								<input id="board_file2" name="board_file2" type="file">
								<input type="button" onclick="cancelFile('board_file2')" value="첨부 삭제">
							</div>
							<div class="files">
								<div>
									<label for="board_file3" style="display:inline;">
										<img id="board_file3Img" src="${pageContext.request.contextPath}/images/filePlus.png" width="110px" height="110px" style="display:inline;">
									</label>
								</div>
								<input id="board_file3" name="board_file3" type="file">
								<input type="button" onclick="cancelFile('board_file3')" value="첨부 삭제">
							</div>
						</div>
						<div style="margin-top:3%;">
							<textarea name="boardContent" placeholder="내용 작성" style="resize:none;" rows="30"></textarea>
						</div>
						<ul class="actions" style="display:flex; justify-content:center; margin-top:3%;">
							<li><input type="button" value="글쓰기" class="primary" onclick="send()"/></li>
							<li><input type="button" value="취소" onclick="history.back()"/></li>
						</ul>
					</form>
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
<script>
	function send(){
		// 유효성 검사 등 처리
		if(!$("input#boardTitle").val()){
			alert("제목을 작성해주세요");
			return;
		}
		
		if(!$("textarea[name='boardContent']").val()){
			alert("내용을 작성해주세요");
			return;
		}
		
		document.writeForm.submit();
	}

	// 이벤트 버블링 때문에 아래와 같이 div 태그에만 걸어도 해당 태그 아래의 input 요소까지 전파됨
	$(".files").change(function(e){
		let file = e.target.files[0];
		let img = $(this).find("img"); // 여기서 this는 .files이다
		
		if(!file.type.match("image.*")){
			img.attr("src", "${pageContext.request.contextPath}/images/no_img.jpg");
		}else{
			let reader = new FileReader(); // 자바스크립트 내장 객체 (파일 읽어서 데이터 얻음)
			reader.onload = function(e){
				// console.log(e.target.result);
				img.attr("src", e.target.result); // 미리보기용 파일 URL을 src 속성에 넣는다
			}
			
			reader.readAsDataURL(file); // 해당 파일을 읽어서 DataURL 형태로 반환한다. (브라우저에서 해당 URL을 렌더링해서 보여줌).
		}
	});
	
</script>
</html>

























