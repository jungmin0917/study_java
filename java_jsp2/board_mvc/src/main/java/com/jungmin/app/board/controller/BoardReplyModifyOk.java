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
		String memberId = (String)(req.getSession().getAttribute("sessionId")); // ������ �����Ѱ��� Ȯ���ϱ� ����
		String replyContent = req.getParameter("replyContent");
		
		// �ش� replyNum�� ������ ���ǰ��̶� �ٸ��� ���� ǥ���ؾ� �Ǵµ�.. �ϴ� �׳� ����
		
		BoardReplyVO reply = new BoardReplyVO();
		
		reply.setReplyNum(replyNum);
		reply.setReplyContent(replyContent);
		// memberId�� boardNum�� �ʿ� ����
		
		replyDao.updateReply(reply);
		
		return null;
	}

}
