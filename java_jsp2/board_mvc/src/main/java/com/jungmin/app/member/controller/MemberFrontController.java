package com.jungmin.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿을 쓰려면 HttpServlet을 상속받아야 한다.
public class MemberFrontController extends HttpServlet{
	
	// get 방식으로 요청됐을 때 처리할 메소드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	// post 방식으로 요청됐을 때 처리할 메소드
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	// get 방식, post 방식 상관없이 처리할 메소드 (임의로 doProcess라고 이름 붙였다)
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	}
}
