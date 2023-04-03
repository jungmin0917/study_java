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
		
		// �� �������� �� ������
		int rowSize = 10;
		
		// ��ü �� ���� �ִ���
		int totalCount = dao.getTotal();
		
		// ������ ����� ���� startRow, endRow ���ϱ�
		int startRow;
		int endRow;

		endRow = page * rowSize;
		startRow = endRow - rowSize + 1;
		
		// ������ ���� (1 ~ 10������, 11 ~ 20������...)
		int pageSize = 10; // ������ ���� ������
		// �ش� �������� ���� ����
		int startPage = ((page - 1) / pageSize) * pageSize + 1;
		// �ش� �������� �� ����
		int endPage = startPage + pageSize - 1;
		
		int realEndPage = (int)(Math.ceil((double)totalCount / pageSize));
		
		if(realEndPage < 1) {
			realEndPage = 1;
		}
		
		if(endPage > realEndPage) {
			endPage = realEndPage;
		}
		
		req.setAttribute("totalCount", totalCount);
		req.setAttribute("realEndPage", realEndPage);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("nowPage", page);
		req.setAttribute("boardList", dao.getList(startRow, endRow));
		
		forward.setRedirect(false);
		// setRedirect�� false�̹Ƿ� ���� contextPath �� �־ ��)
		forward.setPath("/app/board/boardList.jsp");
		
		return forward; // ����!! null�� �����ϸ� �� ��!!
	}

}








