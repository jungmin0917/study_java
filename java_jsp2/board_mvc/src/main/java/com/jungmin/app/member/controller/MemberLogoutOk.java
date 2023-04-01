package com.jungmin.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;

public class MemberLogoutOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		HttpSession session = req.getSession(); // 어차피 요청하면 해당 브라우저와 연결된 세션은 하나 뿐.
		session.invalidate(); // 세션 제거
		
		ActionForward forward = new ActionForward();
		
		// 로그인 쪽으로 이동
		forward.setRedirect(true); // 로그아웃 시에도 객체나 변수 없애는 게 좋음
		forward.setPath(req.getContextPath() + "/member/MemberLogin.me"); // 로그아웃 시 로그인 페이지로 가게 하기
		
		return forward;
	}

}
