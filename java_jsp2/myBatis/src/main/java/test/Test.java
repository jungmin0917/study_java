package test;

import dao.MemberDAO;
import vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
		vo.setId("jungmin0917");
		vo.setPw("1234");
		vo.setName("황정민");
		vo.setAge(20);
		
		// 아이디 중복 검사
		if(!dao.checkId(vo.getId())) { // 중복된 아이디가 없으면
			dao.join(vo); // vo 객체 파라미터 전달
		}
		
		// 위에서 보듯이 기존 JDBC만 썼을 때와 비교해서 아주아주 단순해졌음을 확인할 수 있다
		
		// 로그인 해보기
		if(dao.login("jungmin0917", "1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		// 아이디 조회하기
		
		// 나이 조회하기
	}
}
