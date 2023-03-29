package com.jungmin.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;

// 아이디 중복 검사 Controller
// implements는 인터페이스를 구현할 때 사용하는 키워드이다
public class MemberCheckIdOk implements Action{
	// execute 메소드는 아주아주 많이 쓴다.. 그래서 이 공통된 틀을 추상화해놓고 해당 인터페이스를 상속해서 쓰면 편할 것이다.
	// 그래서 이 execute 메소드를 여기 선언하지 않고, 인터페이스를 하나 만든다.
//	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception{
//		
//	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 사용자 form에서 넘어온 값을 변수에 담음
		String memberId = req.getParameter("memberId");
		return null;
	}
}
