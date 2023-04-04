package com.jungmin.app.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
				try {
					forward = new MemberCheckIdOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("아이디 중복검사 오류 " + e);
				}
				break;
			case "/member/MemberJoinOk.me":
				// 회원가입을 완료했을 때
				try {
					forward = new MemberJoinOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("회원가입 오류 " + e);
				}
				break;
			case "/member/MemberLoginOk.me":
				// 로그인 할 때
				try {
					forward = new MemberLoginOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("로그인 오류 " + e);
				}
				break;
			// 단순 페이지 이동이면 Ok를 안 붙이기로 함
			case "/member/MemberLogin.me":
				// 굳이 controller 안 만들고 여기서 해결함
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("/app/member/login.jsp");
				break;
			case "/member/MemberJoin.me":
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("/app/member/join.jsp");
				break;
			case "/member/MemberLogoutOk.me":
				try {
					forward = new MemberLogoutOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("로그아웃 오류 " + e);
				}
				break;
			case "/member/MemberFindIdOk.me":
				try {
					forward = new MemberFindIdOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("아이디 찾기 오류 " + e);
				}
				break;
			case "/member/MemberFindId.me":
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("/app/member/findId.jsp");
				break;
			default:
				break;
		}
		
		if(forward != null) { // forward가 null값이면 페이지 이동을 하지 않는다는 것임
			if(forward.isRedirect()) { // 해당 forward 객체가 리다이렉트로 설정되었으면
				resp.sendRedirect(forward.getPath());
			}else { // 리다이렉트가 아닌 포워드 이동방식이면
				RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
				dispatcher.forward(req, resp); // forward 방식은 기존의 객체들을 전부 갖고 이동한다.
			}
		}
	}
}
