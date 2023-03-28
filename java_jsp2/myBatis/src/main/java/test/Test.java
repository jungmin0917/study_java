package test;

import dao.MemberDAO;
import vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
//		vo.setId("gildong123");
//		vo.setPw("1234");
//		vo.setName("홍길동");
//		vo.setAge(30);
		
		// 아이디 중복 검사 및 회원가입
//		if(!dao.checkId(vo.getId())) { // 중복된 아이디가 없으면
//			dao.join(vo); // vo 객체 파라미터 전달
//		}
		
		// 위에서 보듯이 기존 JDBC만 썼을 때와 비교해서 아주아주 단순해졌음을 확인할 수 있다
		
		// 로그인 해보기
//		if(dao.login("jungmin0917", "1234")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		// 이름, 나이 수정하기
//		if(dao.update(vo)) {
//			System.out.println("수정 성공");
//		}else {
//			System.out.println("수정 실패");
//		}
		
		// 회원탈퇴
//		if(dao.remove("jungmin0917")) {
//			System.out.println("회원탈퇴 성공");
//		}else {
//			System.out.println("회원탈퇴 실패");
//		}
		
		// 아이디 조회하기 (이름, 비밀번호로)
//		String id = dao.searchId("정민이", "1234");
//		if(id != null) {
//			System.out.printf("검색하신 아이디는 %s입니다", id);
//		}else {
//			System.out.println("해당 아이디가 존재하지 않습니다");
//		}
		
		// 나이 조회하기 (20대인 사람들의 전체 정보 가져오기)
		dao.searchMember().forEach(member -> {
			System.out.print(member.getId() + ", ");
			System.out.print(member.getName() + ", ");
			System.out.print(member.getPw() + ", ");
			System.out.print(member.getAge());
			System.out.println();
		});
		
	}
}
