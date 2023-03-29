package com.jungmin.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.ActionForward;

// 서블릿을 쓰려면 HttpServlet을 상속받아야 한다.
public class MemberFrontController extends HttpServlet{
	
	// get 방식으로 요청됐을 때 처리할 메소드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get일 때, post일 때를 딱히 구분하지 않을 것이기 때문에 일단 이렇게 하기로 했다.
		doProcess(req, resp);
	}
	
	// post 방식으로 요청됐을 때 처리할 메소드
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get일 때, post일 때를 딱히 구분하지 않을 것이기 때문에 일단 이렇게 하기로 했다.
		doProcess(req, resp);
	}
	
	// get 방식, post 방식 상관없이 처리할 메소드 (임의로 doProcess라고 이름 붙였다)
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String requestURI = req.getRequestURI(); // 사용자가 요청한 URI
		// ContextPath를 먼저 구하고, 그 ContextPath를 기준으로 그 다음부터를 구하면 우리가 원하는 URI를 구할 수 있다.
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length()); // 우리가 원하는 URI (애플리케이션의 루트 경로를 제외한)
		
		ActionForward forward = null; // ActionForward 객체를 미리 만들어 놓음
		
		// switch문으로 분기를 하자
		switch(command) {
			case "/member/MemberCheckIdOk.me": // 아이디 검사해주는 컨트롤러로 보내야 함
				
				break;
			default:
				break;
		}
	}
}
