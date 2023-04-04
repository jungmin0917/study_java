package com.jungmin.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.member.dao.MemberDAO;

public class MemberFindIdOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		MemberDAO memberDao = new MemberDAO();
		
		ActionForward forward = new ActionForward();
		
		String memberEmail = req.getParameter("memberEmail");
		String memberPw = req.getParameter("memberPw");
		
		// forward로 갈 거니까 request 객체에 memberId를 담아서 이동한다
		req.setAttribute("memberId", memberDao.findId(memberEmail, memberPw));
		
		forward.setRedirect(false);
		forward.setPath("/app/member/showId.jsp");
		
		return forward;
	}

}
