package com.jungmin.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.member.dao.MemberDAO;
import com.jungmin.app.member.vo.MemberVO;

public class MemberJoinOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// �⺻������ ���尴ü ���ڵ� UTF-8�� ó�� (�׻� ���ֱ�)
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// �׻� �޾ƾ� �ϴ� ��ü��
		MemberDAO dao = new MemberDAO();
		MemberVO member = new MemberVO();
		
		// CheckIdOk �ʿ����� ��ȯ���� �ʿ䰡 �������� (ajax���̾��� ����) ����� �ʿ��ϴ�
		ActionForward forward = new ActionForward();
		
//		�����
//		CREATE TABLE JUNGMIN_MEMBER(
//			memberId VARCHAR2(1000) PRIMARY KEY,
//			memberPw VARCHAR2(1000),
//			memberName VARCHAR2(1000),
//			memberAge NUMBER(3),
//			memberGender VARCHAR2(1000),
//			memberEmail VARCHAR2(1000),
//			memberZipcode VARCHAR2(1000),
//			memberAddress VARCHAR2(1000),
//			memberAddressDetail VARCHAR2(1000),
//			memberAddressEtc VARCHAR2(1000)
//		);
		
		member.setMemberId(req.getParameter("memberId"));
		member.setMemberPw(req.getParameter("memberPw"));
		member.setMemberName(req.getParameter("memberName"));
		member.setMemberAge(Integer.parseInt(req.getParameter("memberAge")));
		member.setMemberGender(req.getParameter("memberGender"));
		member.setMemberEmail(req.getParameter("memberEmail"));
		member.setMemberZipcode(req.getParameter("memberZipcode"));
		member.setMemberAddress(req.getParameter("memberAddress"));
		member.setMemberAddressDetail(req.getParameter("memberAddressDetail"));
		member.setMemberAddressEtc(req.getParameter("memberAddressEtc"));
		
		dao.join(member);
		
		// ���� ActionForward ��ü ��������� ��� ���� ������, ���� ���� ������ �����ϱ�
		forward.setRedirect(true); // redirect�ؼ� request �ʱ�ȭ�ϱ�
		// setRedirect�� true�� �ع����� �����̷�Ʈ ���� �� contextPath�� ���ư���.
		forward.setPath(req.getContextPath() + "/member/MemberLogin.me"); // ȸ������ ���� �� �α��� �������� ����
		
		// �̹��� forward�� ��ȯ�Ѵ�
		return forward;
	}
	
}
