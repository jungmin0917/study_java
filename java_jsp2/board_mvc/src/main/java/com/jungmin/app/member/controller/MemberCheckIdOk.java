package com.jungmin.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;

// ���̵� �ߺ� �˻� Controller
// implements�� �������̽��� ������ �� ����ϴ� Ű�����̴�
public class MemberCheckIdOk implements Action{
	// execute �޼ҵ�� ���־��� ���� ����.. �׷��� �� ����� Ʋ�� �߻�ȭ�س��� �ش� �������̽��� ����ؼ� ���� ���� ���̴�.
	// �׷��� �� execute �޼ҵ带 ���� �������� �ʰ�, �������̽��� �ϳ� �����.
//	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception{
//		
//	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// ����� form���� �Ѿ�� ���� ������ ����
		String memberId = req.getParameter("memberId");
		return null;
	}
}
