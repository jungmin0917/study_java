package com.jungmin.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;
import com.jungmin.app.board.vo.BoardVO;
import com.jungmin.app.files.dao.FilesDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		
		// 여기서 받은 requst.parameter로 BoardVO 객체 생성해주고 DAO의 insertBoard() 메서드 사용
		
		BoardDAO boardDao = new BoardDAO();
		BoardVO board = new BoardVO();
		
		// form에서 multipart/form-data로 전송된 데이터를 처리하기 위해 cos 라이브러리를 설치하였다.
		// 일단 multipart 타입 request로 게시글 제목, 내용, 작성자 세 가지를 받아보자.
		
		MultipartRequest multi = null;

		String saveFolder = "C:\\Users\\jungmin\\Desktop\\eclipse_workspace\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload"; // 로컬 업로드 파일 디렉터리 위치
		
		int megaByte = 1024 * 1024;
		int fileSize = megaByte * 5; // 5MB
		
//		아래와 같이 생성한다.
//		multi = new MultipartRequest(req, 실제파일경로, 최대파일크기(바이트 단위), 인코딩방식, 정책);
//		일반 request 객체를 multipartrequest 객체로 변환
		multi = new MultipartRequest(req, saveFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		board.setBoardTitle(multi.getParameter("boardTitle"));
		board.setBoardContent(multi.getParameter("boardContent"));
		board.setBoardMemberId(multi.getParameter("boardMemberId"));
		
		// 이제 첨부파일을 추가하자 (일단 파일 관련 DB 테이블을 만들자)
		
		boardDao.insertBoard(board);
		// 여기까지가 board 테이블에 등록 완료
		
		// 파일도 추가할 것
		FilesDAO fileDao = new FilesDAO();
		
		// insertFile할 때 boardNum이 필요하므로, 위에서 넣은 것을 가져올 것
		fileDao.insertFile(multi, boardDao.getSeq());
		
		// 파일 업로드까지 완료했으면 게시글 목록 페이지로 이동시키기
		forward.setRedirect(true);
		forward.setPath(req.getContextPath() + "/board/BoardListOk.bo");
		
		return forward;
	}

}
