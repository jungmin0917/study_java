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
		
		// page 파라미터가 오지 않았다는 건, 처음으로 이 페이지에 왔다는 것.
		// 그러므로 page가 null이면 1페이지로 처리 (당연)
		
		String temp = req.getParameter("page");

		// null이면 1페이지, 아니면 integer로 파싱
		int page = temp == null ? 1 : Integer.parseInt(temp);
		
		// 한 페이지에 몇 개인지
		int rowSize = 10;
		
		// 전체 몇 개가 있는지
		int totalCount = dao.getTotal();
		
		// 페이지 사이즈를 통해 startRow, endRow 구하기
		int startRow;
		int endRow;

		endRow = page * rowSize;
		startRow = endRow - rowSize + 1;
		
		// 페이지 구간 (1 ~ 10페이지, 11 ~ 20페이지...)
		int pageSize = 10; // 페이지 구간 사이즈
		// 해당 페이지의 시작 구간
		int startPage = ((page - 1) / pageSize) * pageSize + 1;
		// 해당 페이지의 끝 구간
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
		// setRedirect가 false이므로 굳이 contextPath 안 넣어도 됨)
		forward.setPath("/app/board/boardList.jsp");
		
		return forward; // 주의!! null을 리턴하면 안 됨!!
	}

}








