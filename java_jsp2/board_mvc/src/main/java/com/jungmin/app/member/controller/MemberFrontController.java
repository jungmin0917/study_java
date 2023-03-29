package com.jungmin.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.ActionForward;

// �������� ������ HttpServlet�� ��ӹ޾ƾ� �Ѵ�.
public class MemberFrontController extends HttpServlet{
	
	// get ������� ��û���� �� ó���� �޼ҵ�
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get�� ��, post�� ���� ���� �������� ���� ���̱� ������ �ϴ� �̷��� �ϱ�� �ߴ�.
		doProcess(req, resp);
	}
	
	// post ������� ��û���� �� ó���� �޼ҵ�
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get�� ��, post�� ���� ���� �������� ���� ���̱� ������ �ϴ� �̷��� �ϱ�� �ߴ�.
		doProcess(req, resp);
	}
	
	// get ���, post ��� ������� ó���� �޼ҵ� (���Ƿ� doProcess��� �̸� �ٿ���)
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String requestURI = req.getRequestURI(); // ����ڰ� ��û�� URI
		// ContextPath�� ���� ���ϰ�, �� ContextPath�� �������� �� �������͸� ���ϸ� �츮�� ���ϴ� URI�� ���� �� �ִ�.
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length()); // �츮�� ���ϴ� URI (���ø����̼��� ��Ʈ ��θ� ������)
		
		ActionForward forward = null; // ActionForward ��ü�� �̸� ����� ����
		
		// switch������ �б⸦ ����
		switch(command) {
			case "/member/MemberCheckIdOk.me": // ���̵� �˻����ִ� ��Ʈ�ѷ��� ������ ��
				
				break;
			default:
				break;
		}
	}
}