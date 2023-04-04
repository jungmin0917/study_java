package com.jungmin.app.board.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;
import com.jungmin.app.board.vo.BoardVO;
import com.jungmin.app.files.dao.FilesDAO;
import com.jungmin.app.files.vo.FilesVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardModifyOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		ActionForward forward = new ActionForward();
		
		// 여기서 게시글 및 첨부파일 전부 삭제했다가 다시 등록하는 절차를 진행할 것임
		BoardDAO boardDao = new BoardDAO();
		BoardVO board = new BoardVO();
		FilesDAO filesDao = new FilesDAO();
		String saveFolder = "C:\\Users\\jungmin\\Desktop\\eclipse_workspace\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload";
		
		int megaByte = 1024 * 1024;
		int fileSize = megaByte * 5; // 5MB

//		지금 올린 파일을 실제로 업로드 (어쩔 수 없이 업로드부터 해야 됨. boardNum을 가져와야 하니...)
		MultipartRequest multi = null; // multipart 속성으로 넘어온 form값 처리
//		multi = new MultipartRequest(req, 실제파일경로, 최대파일크기(바이트 단위), 인코딩방식, 정책);
		multi = new MultipartRequest(req, saveFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		// 현재 boardNum으로 된 걸 다시 써야하므로 그걸 잘 생각한다
		int boardNum = Integer.parseInt(multi.getParameter("boardNum")); // hidden으로 넘어왔다
		
//		일단 원래 boardNum에 등록되어 있던 file들 순회하면서 지우기
		for(FilesVO file : filesDao.getFiles(boardNum)) {
			File f = new File(saveFolder, file.getFileName());
			
			if(f.exists()) {
				f.delete(); // 삭제 먼저
			}
		}
		
//		파일 DB에서 삭제
		filesDao.deleteFiles(boardNum);
		
//		파일 DB에도 등록
		filesDao.insertFile(multi, boardNum);
	
//		게시글은 삭제-등록 말고 UPDATE 쿼리 한다고 한다.
		
//		참고용
//		boardNum NUMBER(38),
//		boardTitle VARCHAR2(2000),
//		boardContent VARCHAR2(2000),
//		boardMemberId VARCHAR2(2000),
		
//		게시글 등록을 위한 board 객체 파라미터 설정
		board.setBoardNum(boardNum);
		board.setBoardTitle(multi.getParameter("boardTitle"));
		board.setBoardContent(multi.getParameter("boardContent"));
		
		forward.setRedirect(false);
		forward.setPath("/board/BoardViewOk.bo?boardNum=" + boardNum);
		
		return forward;
	}

}
