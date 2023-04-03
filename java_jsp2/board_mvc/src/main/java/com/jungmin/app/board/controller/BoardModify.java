package com.jungmin.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;

public class BoardModify implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		int boardNum = Integer.parseInt(req.getParameter("boardNum"));
		
		ActionForward forward = new ActionForward();
		
		BoardDAO boardDao = new BoardDAO();
		
		// board 변수에 게시글 정보 담는다
		req.setAttribute("board", boardDao.getDetail(boardNum));
		
		forward.setRedirect(false); // 당연히 false
		forward.setPath("/app/board/boardModify.jsp"); //write 로 가야 하는 거 아닌가?
		// 수정 페이지 굳이 안 만들어도 되지 않나.. write 페이지에서 분기해서 쓰면 되는디.. 
		
		return forward;
	}

}
