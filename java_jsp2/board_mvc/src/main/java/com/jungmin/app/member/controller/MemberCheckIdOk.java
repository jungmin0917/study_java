package com.jungmin.app.member.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.member.dao.MemberDAO;

// 아이디 중복 검사 Controller
// implements는 인터페이스를 구현할 때 사용하는 키워드이다
// 단순 페이지 이동이면 Ok를 안 붙이고, DB 조회가 필요하면 Ok를 붙이기로 함
public class MemberCheckIdOk implements Action{
	// execute 메소드는 아주아주 많이 쓴다.. 그래서 이 공통된 틀을 추상화해놓고 해당 인터페이스를 상속해서 쓰면 편할 것이다.
	// 그래서 이 execute 메소드를 여기 선언하지 않고, 인터페이스를 하나 만든다.
//	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception{
//		
//	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 사용자 form에서 넘어온 값을 변수에 담음
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String memberId = req.getParameter("memberId");
		MemberDAO dao = new MemberDAO();
		JSONObject obj = new JSONObject();
		PrintWriter out = resp.getWriter(); // HTTP 응답에 대한 출력 스트림을 생성
		
		// 여기서 JSON을 사용할 것이다 (데이터 전송용 파일 형태)
		// ajax에서 쓰려고 하는 것임. (ajax 반환값에 따라 실시간으로 아이디 중복인지 아닌지 알려주기 위함임)
		if(dao.checkId(memberId)) {
			obj.put("status", "not-ok");
		}else {
			obj.put("status", "ok");
		}
		
		out.println(obj.toJSONString()); // JSON 자료형을 { }로 감싸진 문자열로 출력 (body 태그에 출력)
		out.close(); // 출력 스트림을 명시적으로 닫음으로써 리소스 낭비를 방지함
		
		return null; // 페이지 이동이 필요없기에 null을 리턴함
	}
}
