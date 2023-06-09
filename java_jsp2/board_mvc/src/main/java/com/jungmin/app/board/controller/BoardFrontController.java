package com.jungmin.app.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.ActionForward;

public class BoardFrontController extends HttpServlet{
	
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

		switch(command) {
			case "/board/BoardListOk.bo":
				try {
					forward = new BoardListOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("게시판 읽기 오류 : " + e);
				}
				break;
			// 단순 이동
			case "/board/BoardWrite.bo":
				// 단순 이동이기에 여기서 액션 포워드 객체 처리
				forward = new ActionForward();
				forward.setPath("/app/board/boardWrite.jsp");
				forward.setRedirect(false);
				break;
			case "/board/BoardWriteOk.bo":
				try {
					forward = new BoardWriteOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("글쓰기 오류 : " + e);
				}
				break;
			case "/board/BoardViewOk.bo":
				try {
					forward = new BoardViewOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("글보기 오류 : " + e);
				}
				break;
			case "/board/FileDownloadOk.bo":
				try {
					forward = new FileDownloadOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("파일 다운로드 오류 : " + e);
				}
				break;
			case "/board/BoardDeleteOk.bo":
				try {
					forward = new BoardDeleteOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("게시글 삭제 오류 : " + e);
				}
				break;
			case "/board/BoardModify.bo":
				// 단순히 값을 가지고 이동하긴 하지만 DB 조회는 하므로 forward 객체가 필요하다
				try {
					forward = new BoardModify().execute(req, resp);
				} catch (Exception e) {
					System.out.println("게시글 수정 페이지 이동 오류 : " + e);
				}
				break;
			case "/board/BoardModifyOk.bo":
				try {
					forward = new BoardModifyOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("게시글 수정 오류 : " + e);
				}
				break;
				
			// ****************** 댓글 *******************
			case "/board/BoardReplyList.bo":
				try {
					forward = new BoardReplyListOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("댓글 목록 오류 : " + e);
				}
				break;
			case "/board/BoardReplyWriteOk.bo":
				try {
					forward = new BoardReplyWriteOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("댓글 작성 오류 : " + e);
				}
				break;
			case "/board/BoardReplyModifyOk.bo":
				try {
					forward = new BoardReplyModifyOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("댓글 작성 오류 : " + e);
				}
				break;
			case "/board/BoardReplyDeleteOk.bo":
				try {
					forward = new BoardReplyDeleteOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("댓글 작성 오류 : " + e);
				}
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
		