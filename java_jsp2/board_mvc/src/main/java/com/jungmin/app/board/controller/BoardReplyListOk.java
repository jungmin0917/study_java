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
		
		// 위와 같이 받은 reply list를, 우리는 ajax로 댓글을 관리할 거니까 JSON 데이터로 만들어준다.
		JSONArray replies = new JSONArray();
		
		// 게시글 하나에 댓글이 많이 있고, 또 그 댓글 하나에 정보가 여러 개 있다
		// 그러니 JSON 객체는 tree 형식으로 되어있으니까, 그걸로 정보를 주고받으면 편하게 사용할 수 있어서 JSON을 사용한다
		
//		참고용
//		replyNum NUMBER(38) PRIMARY KEY,
//		boardNum NUMBER(38) REFERENCES JUNGMIN_BOARD(boardNum) ON DELETE CASCADE,
//		memberId VARCHAR2(1000) REFERENCES JUNGMIN_MEMBER(memberId),
//		replyContent VARCHAR2(2000)
		
		for(BoardReplyVO reply : replyList) {
			JSONObject obj = new JSONObject();
			
			// 각 obj의 파라미터 설정
			obj.put("replyNum", reply.getReplyNum());
			obj.put("memberId", reply.getMemberId());
			obj.put("replyContent", reply.getReplyContent());
			
			replies.add(obj); // JSONArray 객체에 JSONObject 객체 추가
		}
		
		// 근데 브라우저는 자바의 JSONArray 객체를 이해할 수가 없으므로, 이를 String으로 변환하여 전송해야 한다.
		
		PrintWriter out = resp.getWriter(); // 출력 스트림을 response 객체의 getWriter() 메소드로 가져온다.
		
		out.println(replies.toJSONString()); // 출력 스트림에 담음
		out.close(); // 실제 출력
		
		return null; // forward 출력할 필요 없음
	}

}
