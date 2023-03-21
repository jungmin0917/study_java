package com.online.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/Hello")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		아래와 같이 하면 한글이 깨짐
		response.setContentType("text/html; charset=UTF-8"); // 이걸 넣으면 한글이 깨지지 않음
		PrintWriter out = response.getWriter(); // 출력 버퍼를 생성한다
		out.println("<html><body><h1>서블릿으로 만든 페이지</h1>");
		out.println("<a href='index.jsp'>JSP로 이동!</a>");
		out.close(); // 버퍼를 닫는다
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); // 이걸 넣으면 한글이 깨지지 않음
		PrintWriter out = response.getWriter(); // 출력 버퍼를 생성한다
		out.println("<html><body><h1>서블릿으로 만든 페이지</h1>");
		out.println("<a href='Baby'>JSP로 이동!</a>");
		out.close(); // 버퍼를 닫는다
	}

}
