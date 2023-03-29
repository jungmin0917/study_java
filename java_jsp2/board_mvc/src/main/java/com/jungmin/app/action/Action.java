package com.jungmin.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 인터페이스 내부엔 추상 메소드만 존재한다.
public interface Action {
	// 추상 메소드를 선언할 땐 중괄호 블록이 있어선 안 된다. (무조건 오버라이딩 해서 써야 함)
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
