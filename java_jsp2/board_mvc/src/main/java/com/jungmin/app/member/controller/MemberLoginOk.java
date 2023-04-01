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
		
		// session ��ü ����
		HttpSession session = req.getSession();
		
		ActionForward forward = new ActionForward(); // ��ȯ��
		
		String memberId = req.getParameter("memberId");
		String memberPw = req.getParameter("memberPw");

		forward.setRedirect(true); // �����ϵ� ���� true�� �ؾ� �� (����)
		
		if(dao.login(memberId, memberPw)){
			// �α��� ���� ��
			session.setAttribute("sessionId", memberId); // memberId�� ���� ����
			forward.setPath(req.getContextPath() + "/board/BoardList.bo"); // �Խ������� ����
		}else {
			forward.setPath(req.getContextPath() + "/member/MemberLogin.me?code=fail");
		}
		
		return forward;
	}

}
