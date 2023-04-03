package com.jungmin.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;
import com.jungmin.app.files.dao.FilesDAO;

public class BoardViewOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		int boardNum = -1;
		
		try {
			boardNum = Integer.parseInt(req.getParameter("boardNum"));
		} catch (NumberFormatException e) {
			boardNum = -1;
		}
		
		BoardDAO boardDao = new BoardDAO();
		FilesDAO filesDao = new FilesDAO();
		
		ActionForward forward = new ActionForward();
		
		// 일단 게시글 가져옴
		req.setAttribute("board", boardDao.getDetail(boardNum));
		
		// 해당 게시글의 파일도 가져옴
		req.setAttribute("files", filesDao.getFiles(boardNum));
		
		// 조회수 증가
		boardDao.updateReadCount(boardNum);
		
		forward.setRedirect(false); // 당연히 포워드 방식으로 가야 함 (여기서 정보를 View쪽으로 전달해야 하니)
		forward.setPath("/app/board/boardView.jsp"); // view 쪽으로 이동시킴
		
		return forward;
	}

}
