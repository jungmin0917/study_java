package com.jungmin.app.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.ActionForward;

// ������ ������ HttpServlet�� ��ӹ޾ƾ� �Ѵ�.
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
				try {
					forward = new MemberCheckIdOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("���̵� �ߺ��˻� ���� " + e);
				}
				break;
			case "/member/MemberJoinOk.me":
				// ȸ�������� �Ϸ����� ��
				try {
					forward = new MemberJoinOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("ȸ������ ���� " + e);
				}
				break;
			case "/member/MemberLoginOk.me":
				// �α��� �� ��
				try {
					forward = new MemberLoginOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("�α��� ���� " + e);
				}
				break;
			// �ܼ� ������ �̵��̸� Ok�� �� ���̱�� ��
			case "/member/MemberLogin.me":
				// ���� controller �� ����� ���⼭ �ذ���
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
					System.out.println("�α׾ƿ� ���� " + e);
				}
				break;
			case "/member/MemberFindIdOk.me":
				try {
					forward = new MemberFindIdOk().execute(req, resp);
				} catch (Exception e) {
					System.out.println("���̵� ã�� ���� " + e);
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
		
		if(forward != null) { // forward�� null���̸� ������ �̵��� ���� �ʴ´ٴ� ����
			if(forward.isRedirect()) { // �ش� forward ��ü�� �����̷�Ʈ�� �����Ǿ�����
				resp.sendRedirect(forward.getPath());
			}else { // �����̷�Ʈ�� �ƴ� ������ �̵�����̸�
				RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
				dispatcher.forward(req, resp); // forward ����� ������ ��ü���� ���� ���� �̵��Ѵ�.
			}
		}
	}
}
