package com.jungmin.app.member.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.member.dao.MemberDAO;

// ���̵� �ߺ� �˻� Controller
// implements�� �������̽��� ������ �� ����ϴ� Ű�����̴�
// �ܼ� ������ �̵��̸� Ok�� �� ���̰�, DB ��ȸ�� �ʿ��ϸ� Ok�� ���̱�� ��
public class MemberCheckIdOk implements Action{
	// execute �޼ҵ�� ���־��� ���� ����.. �׷��� �� ����� Ʋ�� �߻�ȭ�س��� �ش� �������̽��� ����ؼ� ���� ���� ���̴�.
	// �׷��� �� execute �޼ҵ带 ���� �������� �ʰ�, �������̽��� �ϳ� �����.
//	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception{
//		
//	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// ����� form���� �Ѿ�� ���� ������ ����
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String memberId = req.getParameter("memberId");
		MemberDAO dao = new MemberDAO();
		JSONObject obj = new JSONObject();
		PrintWriter out = resp.getWriter(); // HTTP ���信 ���� ��� ��Ʈ���� ����
		
		// ���⼭ JSON�� ����� ���̴� (������ ���ۿ� ���� ����)
		// ajax���� ������ �ϴ� ����. (ajax ��ȯ���� ���� �ǽð����� ���̵� �ߺ����� �ƴ��� �˷��ֱ� ������)
		if(dao.checkId(memberId)) {
			obj.put("status", "not-ok");
		}else {
			obj.put("status", "ok");
		}
		
		out.println(obj.toJSONString()); // JSON �ڷ����� { }�� ������ ���ڿ��� ��� (body �±׿� ���)
		out.close(); // ��� ��Ʈ���� ��������� �������ν� ���ҽ� ���� ������
		
		return null; // ������ �̵��� �ʿ���⿡ null�� ������
	}
}
