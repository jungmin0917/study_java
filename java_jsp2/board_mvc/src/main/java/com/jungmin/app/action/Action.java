package com.jungmin.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// �������̽� ���ο� �߻� �޼ҵ常 �����Ѵ�.
public interface Action {
	// �߻� �޼ҵ带 ������ �� �߰�ȣ ����� �־ �� �ȴ�. (������ �������̵� �ؼ� ��� ��)
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
