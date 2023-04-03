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
		
		// �ϴ� �Խñ� ������
		req.setAttribute("board", boardDao.getDetail(boardNum));
		
		// �ش� �Խñ��� ���ϵ� ������
		req.setAttribute("files", filesDao.getFiles(boardNum));
		
		// ��ȸ�� ����
		boardDao.updateReadCount(boardNum);
		
		forward.setRedirect(false); // �翬�� ������ ������� ���� �� (���⼭ ������ View������ �����ؾ� �ϴ�)
		forward.setPath("/app/board/boardView.jsp"); // view ������ �̵���Ŵ
		
		return forward;
	}

}
