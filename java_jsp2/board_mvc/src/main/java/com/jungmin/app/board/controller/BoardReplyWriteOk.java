package com.jungmin.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardReplyDAO;
import com.jungmin.app.board.vo.BoardReplyVO;

public class BoardReplyWriteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		
		BoardReplyDAO replyDao = new BoardReplyDAO();
		
		// �Խñ� ��ȣ, �ۼ��� ���̵�, ���븸 ������ �ȴ�
		
		BoardReplyVO reply = new BoardReplyVO();
		
		reply.setBoardNum(Integer.parseInt(req.getParameter("boardNum")));
		reply.setMemberId((String)(req.getSession().getAttribute("sessionId")));
		reply.setReplyContent(req.getParameter("replyContent"));
		
		replyDao.insertReply(reply);
		
		return null;
	}

}
