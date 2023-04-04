package com.jungmin.app.board.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardReplyDAO;
import com.jungmin.app.board.vo.BoardReplyVO;

public class BoardReplyListOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		BoardReplyDAO replyDao = new BoardReplyDAO();
		
		int boardNum = Integer.parseInt(req.getParameter("boardNum"));
		
		List<BoardReplyVO> replyList = replyDao.getReplyList(boardNum);
		
		// ���� ���� ���� reply list��, �츮�� ajax�� ����� ������ �Ŵϱ� JSON �����ͷ� ������ش�.
		JSONArray replies = new JSONArray();
		
		// �Խñ� �ϳ��� ����� ���� �ְ�, �� �� ��� �ϳ��� ������ ���� �� �ִ�
		// �׷��� JSON ��ü�� tree �������� �Ǿ������ϱ�, �װɷ� ������ �ְ������ ���ϰ� ����� �� �־ JSON�� ����Ѵ�
		
//		�����
//		replyNum NUMBER(38) PRIMARY KEY,
//		boardNum NUMBER(38) REFERENCES JUNGMIN_BOARD(boardNum) ON DELETE CASCADE,
//		memberId VARCHAR2(1000) REFERENCES JUNGMIN_MEMBER(memberId),
//		replyContent VARCHAR2(2000)
		
		for(BoardReplyVO reply : replyList) {
			JSONObject obj = new JSONObject();
			
			// �� obj�� �Ķ���� ����
			obj.put("replyNum", reply.getReplyNum());
			obj.put("memberId", reply.getMemberId());
			obj.put("replyContent", reply.getReplyContent());
			
			replies.add(obj); // JSONArray ��ü�� JSONObject ��ü �߰�
		}
		
		// �ٵ� �������� �ڹ��� JSONArray ��ü�� ������ ���� �����Ƿ�, �̸� String���� ��ȯ�Ͽ� �����ؾ� �Ѵ�.
		
		PrintWriter out = resp.getWriter(); // ��� ��Ʈ���� response ��ü�� getWriter() �޼ҵ�� �����´�.
		
		out.println(replies.toJSONString()); // ��� ��Ʈ���� ����
		out.close(); // ���� ���
		
		return null; // forward ����� �ʿ� ����
	}

}
