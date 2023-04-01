package com.jungmin.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;

public class BoardListOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		BoardDAO dao = new BoardDAO();
		ActionForward forward = new ActionForward();
		
		// page �Ķ���Ͱ� ���� �ʾҴٴ� ��, ó������ �� �������� �Դٴ� ��.
		// �׷��Ƿ� page�� null�̸� 1�������� ó�� (�翬)
		
		String temp = req.getParameter("page");

		// null�̸� 1������, �ƴϸ� integer�� �Ľ�
		int page = temp == null ? 1 : Integer.parseInt(temp);
		
		// ����¡ ũ�� (�� �������� �� ��)
		int pageSize = 10;
		
		// ������ ����� ���� startRow, endRow ���ϱ�
		int startRow;
		int endRow;
		
		startRow = page * pageSize - 1;
		endRow = startRow + pageSize;
		
		return null;
	}

}
