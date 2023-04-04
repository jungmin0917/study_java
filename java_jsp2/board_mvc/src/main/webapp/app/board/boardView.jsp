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
	
	section *{
		max-width: 100%;
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
							<a href="${pageContext.request.contextPath}/board/FileDownloadOk.bo?fileName=${file.getFileName()}"><c:out value="${file.getFileName()}"/></a>
							<br>
						</c:forEach>
					</c:if>
					<hr />
					<%-- 내용 보여줄 때는 웬만하면 pre 태그로 사용하기 (여백, 줄바꿈 등이 DB 내용 그대로 출력됨) --%>
					<h3><pre>${board.getBoardContent()}</pre></h3>
					
					<%-- 이건 내가 추가한 건데, 혹시 (이미지)파일 있으면 출력하기 --%>
					<c:forEach var="file" items="${files}">
						<img alt="${file.getFileName()}" src="${pageContext.request.contextPath}/app/upload/${file.getFileName()}">
					</c:forEach>
				</section>
				
				<section class="main accent2" style="padding:3%">
					<header class="major" style="text-align:left;">
						<h2>댓글</h2>
						<p>여러분의 소중한 댓글을 작성해주세요.</p>
					</header>
					
					<%-- ajax로 처리하려고 action 부분이 비어있다 --%>
					<form id="replyContent" method="post" action="#" class="combined" style="width:auto;">
						<textarea name="content" id="content" placeholder="비속어를 사용하지 말아주세요." class="invert" rows="5" style="border-radius:0; resize:none;"></textarea>
						<input id="register" type="button" class="primary" value="등록" onclick="comment()"/>
					</form>
					
					<%-- 댓글 View 부분 --%>
					<form id="replies" class="combined" style="flex-direction:column; margin:0; display:contents;">
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

<%-- 댓글 관련 스크립트 작성 --%>
<script type="text/javascript">
	<%-- DOM 로딩 완료 후 실행 --%>
	$(document).ready(function(){
		getList();
	});
	
	let pageContext = "${pageContext.request.contextPath}";
	let boardNum = "${param.boardNum}";
	
	<%-- 댓글 목록 가져오는 ajax --%>
	function getList(){
		$.ajax({
			url: pageContext + "/board/BoardReplyList.bo",
			type: "GET",
			data: {
				// 여기서 boardNum을 넘겨야 함
				"boardNum": boardNum,
			},
			dataType: "JSON",
			success: function(res){
				// 여기서 바로 HTML을 만드는 것보다, 여기서 또 모듈화를 한다.
				showList(res);
			},
			error: function(err){
				console.error(err);
			}
		});
	}
	
	// 댓글 수정취소 시 원댓글 내용을 갖고있어야 하기에 저장해놓는다
	
	let replyList;
	
	function showList(replies){ // JSON 형태의 값이 매개변수로 담긴다
		
		replyList = replies;
		
		let text = ""; // 댓글 보여줄 HTML 작성
		
		if(replies != null && replies.length != 0){
			
			// iterable한 객체에 대하여 $.each를 적용함으로써 순회하면서 익명함수 적용
			$.each(replies, function(index, reply){
				text += "<div id='reply'>";
					text += "<p class='writer'>" + reply.memberId + "</p>";
					text += "<div class='content' id='" + (index + 1) + "' style='width:100%'>";
					text += "<pre>" + reply.replyContent + "</pre>";
					text += "</div>"
				
				// 수정, 삭제 버튼 출력할 건데, sessionId와 동일한지 확인
				// 각각 수정, 수정완료, 삭제 버튼 만들어줄 것이다.
				if("${sessionId}" == reply.memberId){
					text += "<input type='button' id='ready" + (index + 1) + "' class='primary' onclick='readyToUpdate(" + (index + 1) + ")' value='수정'>";
					text += "<input type='button' id='ok" + (index + 1) + "' class='primary' style='display:none' onclick='update(" + (index + 1) + "," + reply.replyNum + ")' value='수정완료'>";
					text += "<input type='button' id='remove" + (index + 1) + "' class='primary' onclick='' value='삭제'>";
				}

				text += "</div>";
			});
		}else{ // 댓글이 없을 때
			text += "<p>댓글이 없습니다</p>";
		}

		$("#replies").html(text);
	}
	
	function comment(){
		let memberId = "${sessionId}";
		let replyContent = $("#replyContent textarea").val();
		
		if(!replyContent || replyContent.trim() == ''){
			alert("댓글 내용을 입력해주세요");
			return;
		}
		
		$.ajax({
			url: pageContext + "/board/BoardReplyWriteOk.bo",
			type: "POST",
			data: {
				"boardNum": boardNum,
				"memberId": memberId,
				"replyContent": replyContent,
			},
			success: function(res){
				// 새로 달린 댓글 표시해줘야 함 (보통 다른 사람이 그 사이에 달 수 있으니 리로드 형식으로 한다)
				// 댓글 부분 비워줌
				$("#replyContent textarea").val("");
				
				// 댓글 부분 다시 리로드
				getList(); // 여기서 showList까지 함으로써 댓글 부분이 리로드된다.
				// 그래서 따로따로 구현했구나...
			},
			error: function(err){
				console.error(err);
			}
		});
	}
	
	// 현재 수정 중인 댓글이 있는지 여부
	let modifyCheck = false;
	
	// 수정 버튼
	function readyToUpdate(index){
		// 일단 각 dom 객체 가져옴 (jQuery로)
		let div = $("#" + index);
		let modifyReady = $("#ready" + index);
		let modifyOk = $("#ok" + index);
		
		// 삭제 버튼을 수정취소 버튼으로 바꿔서 쓸 생각임
		let remove = $("#remove" + index);
		
		if(!modifyCheck){
			// 해당 댓글 div를 textarea로 바꿔줌
			div.replaceWith("<textarea name='replyContent' id='" + index + "' class='invert' style='border-radius:0; resize:none;'>" + div.text() + "</textarea>");
			
			// 삭제 버튼을 수정취소 버튼으로 바꾸기
			remove.replaceWith("<input type='button' id='cancel" + index + "' value='취소' onclick='updateCancel(" + index + ")'>");
			
			modifyReady.hide();
			modifyOk.show();
			
			modifyCheck = true;
		}else{
			alert("이미 수정 중인 댓글이 있습니다");
			return;
		}
	}
	
	// 수정 취소 버튼
	function updateCancel(index){
		// 다시 수정취소 버튼을 삭제 버튼으로 바꿔야 함
		let remove = $("#cancel" + index);
		// textarea를 다시 div로 바꿔야 함
		let textarea = $("#" + index);
		// 다시 보여줄 것
		let modifyReady = $("#ready" + index);
		// 다시 숨길 것
		let modifyOk = $("#ok" + index);
		
		modifyReady.show();
		modifyOk.hide();
		
		// 수정취소 버튼을 삭제 버튼으로 되돌리기
		remove.replaceWith("<input type='button' id='remove" + index + "' class='primary' onclick='' value='삭제'>");
		
		// textarea를 다시 div로 바꿔야 함
		// 참고용 : "<div class='content' id='" + (index + 1) + "' style='width:100%'>";
		// 취소해야 되니까 취소 전이었던 replyContent를 저장해놔야 함
		textarea.replaceWith("<div class='content' id='" + index + "' style='width:100%'><pre>" + replyList[index - 1].replyContent + "</pre></div>");
		
		modifyCheck = false;
	}
	
	// 수정 완료
	function update(index, replyNum){
		let replyContent = $("textarea#" + index).val();
		
		// 이번엔 서버에 데이터 전달할 때 json 객체에 넣어서 보내보자.
		let json = new Object();
		
		json.replyNum = replyNum;
		json.replyContent = replyContent;
		
		$.ajax({
			url: pageContext + "/board/BoardReplyModifyOk.bo",
			type: "POST",
			data: json, // 이렇게 할 수도 있음
			success: function(res){
				// 제대로 댓글 수정이 완료됐다면 modifyCheck를 다시 false로 바꿔주자
				modifyCheck = false;
				getList(); // 수정됐으므로 다시 댓글창 로드하기
			},
			error: function(err){
				console.error(err);
			}
		});
		
	}
	
</script>

</html>