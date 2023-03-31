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
		// 기본적으로 내장객체 인코딩 UTF-8로 처리 (항상 해주기)
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// 항상 받아야 하는 객체들
		MemberDAO dao = new MemberDAO();
		MemberVO member = new MemberVO();
		
		// CheckIdOk 쪽에서는 반환값이 필요가 없었지만 (ajax용이었기 때문) 현재는 필요하다
		ActionForward forward = new ActionForward();
		
//		참고용
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
		
		// 이제 ActionForward 객체 멤버변수에 어떻게 보낼 것인지, 어디로 보낼 것인지 설정하기
		forward.setRedirect(true); // redirect해서 request 초기화하기
		// setRedirect를 true로 해버리면 리다이렉트 실행 시 contextPath가 날아간다.
		forward.setPath(req.getContextPath() + "/member/MemberLogin.me"); // 회원가입 성공 시 로그인 페이지로 보냄
		
		// 이번엔 forward를 반환한다
		return forward;
	}
	
}
