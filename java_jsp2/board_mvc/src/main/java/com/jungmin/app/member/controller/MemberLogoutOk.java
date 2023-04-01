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
		
		HttpSession session = req.getSession(); // ������ ��û�ϸ� �ش� �������� ����� ������ �ϳ� ��.
		session.invalidate(); // ���� ����
		
		ActionForward forward = new ActionForward();
		
		// �α��� ������ �̵�
		forward.setRedirect(true); // �α׾ƿ� �ÿ��� ��ü�� ���� ���ִ� �� ����
		forward.setPath(req.getContextPath() + "/member/MemberLogin.me"); // �α׾ƿ� �� �α��� �������� ���� �ϱ�
		
		return forward;
	}

}
