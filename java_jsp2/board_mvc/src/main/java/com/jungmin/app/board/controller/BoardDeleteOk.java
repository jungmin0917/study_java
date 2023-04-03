package com.jungmin.app.board.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;
import com.jungmin.app.files.dao.FilesDAO;
import com.jungmin.app.files.vo.FilesVO;

public class BoardDeleteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		
		// 업로드한 웹서버에서도 파일을 삭제해야 함
		// 이 과정에서 File 객체의 delete 메소드를 사용할 것임
		
		// 업로드 저장소 위치
		String saveFolder = "D:\\JAVA19_hjm\\git\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload";
		
		FilesDAO filesDao = new FilesDAO();
		BoardDAO boardDao = new BoardDAO();
		
		int boardNum = Integer.parseInt(req.getParameter("boardNum"));
		
		// 첨부파일이 여러 개일 수 있으므로 먼저 첨부파일들 이름을 가져와야 됨
		// 웹서버에서 실제 파일 삭제
		for(FilesVO file : filesDao.getFiles(boardNum)) { // 순회하면서 처리함
			File f = new File(saveFolder, file.getFileName()); // File 객체에 각 파일을 담음

			if(f.exists()) { // File.exists() : 파일 존재여부 확인 메소드
				f.delete(); // 순회하면서 관련 파일 전부 삭제
			}
		}
		
		// JUNGMIN_FILES DB에서 관련 파일 레코드 삭제
		filesDao.deleteFiles(boardNum);
		
		// 이제 게시글 삭제하자
		
		// JUNGMIN_BOARD DB에서 게시글 삭제
		boardDao.deleteBoard(boardNum);
		
		// 얘는 삭제 후 목록으로 이동시켜야 하므로 forward 필요
		
		forward.setRedirect(false); // true로 해도 상관 없음 (contextPath만 제대로 하면 됨)
//		forward.setPath(req.getContextPath() + "/app/board/boardList.jsp");
//		위에처럼 바로 boardList가면 안 됨!!! (boardListOk에서 연산 거쳐야 DB에서 데이터 받아서 표출함)
		forward.setPath("/board/BoardListOk.bo"); // 컨트롤러 거쳐서 가게 하기
		
		return forward;
	}

}







