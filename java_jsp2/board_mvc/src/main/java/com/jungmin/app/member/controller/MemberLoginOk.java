package com.jungmin.app.member.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.member.dao.MemberDAO;

public class MemberLoginOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		MemberDAO dao = new MemberDAO();
		
		// session 객체 생성
		HttpSession session = req.getSession();
		
		ActionForward forward = new ActionForward(); // 반환용
		
		String memberId = req.getParameter("memberId");
		String memberPw = req.getParameter("memberPw");

		forward.setRedirect(true); // 성공하든 말든 true로 해야 함 (보안)
		
		if(dao.login(memberId, memberPw)){
			// 로그인 성공 시
			session.setAttribute("sessionId", memberId); // memberId로 세션 생성
			forward.setPath(req.getContextPath() + "/board/BoardList.bo"); // 게시판으로 가기
		}else {
			forward.setPath(req.getContextPath() + "/member/MemberLogin.me?code=fail");
		}
		
		return forward;
	}

}
