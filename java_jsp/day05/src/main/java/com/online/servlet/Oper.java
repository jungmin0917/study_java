package com.online.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Oper
 */
@WebServlet("/Oper")
public class Oper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oper() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); // 이걸 넣으면 한글이 깨지지 않음
		
		try {
			
			String input = request.getParameter("calc_input");
			
			// 너무 빡세게 예외처리를 하진 않을 것임. 어차피 입력 자체가 저렇게 받는 데는 아무도 없음
			
			String[] inputs = input.split("[\\+\\-\\*\\/]");
			
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			
			String res = "";
			
			res += "<html><body><h1>결과 페이지</h1>";
			
			res += "정답 : ";
			
			if(input.contains("+")) {
				res += Calc.add(a, b) + "";
			}else if(input.contains("-")) {
				res += Calc.sub(a, b) + "";
			}else if(input.contains("*")) {
				res += Calc.mul(a, b) + "";
			}else if(input.contains("/")) {
				if(b == 0) {
					response.getWriter().append("제대로 입력해주세요").close();
				}
				res += Calc.div(a, b) + "";
			}
			
			res += "<br>";
			
			res += "<a href='calc.jsp'>jsp로 돌아가기</a>";
			
			response.getWriter().append(res).close();
		} catch (Exception e) {
			response.getWriter().append("제대로 입력해주세요").close();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
