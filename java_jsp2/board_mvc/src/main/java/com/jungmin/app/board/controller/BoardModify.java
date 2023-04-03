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
		
		// board ������ �Խñ� ���� ��´�
		req.setAttribute("board", boardDao.getDetail(boardNum));
		
		forward.setRedirect(false); // �翬�� false
		forward.setPath("/app/board/boardModify.jsp"); //write �� ���� �ϴ� �� �ƴѰ�?
		// ���� ������ ���� �� ���� ���� �ʳ�.. write ���������� �б��ؼ� ���� �Ǵµ�.. 
		
		return forward;
	}

}
