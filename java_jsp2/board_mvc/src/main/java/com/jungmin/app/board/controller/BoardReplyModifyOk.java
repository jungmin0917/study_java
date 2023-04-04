package com.jungmin.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardReplyDAO;
import com.jungmin.app.board.vo.BoardReplyVO;

public class BoardReplyModifyOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		BoardReplyDAO replyDao = new BoardReplyDAO();
		
		int replyNum = Integer.parseInt(req.getParameter("replyNum"));
		String memberId = (String)(req.getSession().getAttribute("sessionId")); // 본인이 수정한건지 확인하기 위해
		String replyContent = req.getParameter("replyContent");
		
		// 해당 replyNum의 주인이 세션값이랑 다르면 에러 표시해야 되는데.. 일단 그냥 진행
		
		BoardReplyVO reply = new BoardReplyVO();
		
		reply.setReplyNum(replyNum);
		reply.setReplyContent(replyContent);
		// memberId랑 boardNum은 필요 없음
		
		replyDao.updateReply(reply);
		
		return null;
	}

}
