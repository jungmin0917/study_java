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
		
		// 페이징 크기 (한 페이지에 몇 개)
		int pageSize = 10;
		
		// 페이지 사이즈를 통해 startRow, endRow 구하기
		int startRow;
		int endRow;
		
		startRow = page * pageSize - 1;
		endRow = startRow + pageSize;
		
		return null;
	}

}
