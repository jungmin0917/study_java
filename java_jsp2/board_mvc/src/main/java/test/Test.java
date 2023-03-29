package test;

import com.jungmin.app.member.dao.MemberDAO;
import com.jungmin.app.member.vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		
		// 참고용
		// memberId VARCHAR2(1000) PRIMARY KEY,
		// memberPw VARCHAR2(1000),
		// memberAge NUMBER(3),
		// memberGender VARCHAR2(1000),
		// memberEmail VARCHAR2(1000),
		// memberZipcode VARCHAR2(1000),
		// memberAddress VARCHAR2(1000),
		// memberAddressDetail VARCHAR2(1000),
		// memberAddressEtc VARCHAR2(1000)
		
		MemberDAO dao = new MemberDAO();
		
		MemberVO vo = new MemberVO();
		vo.setMemberId("jungmin0917");
		vo.setMemberPw("1234");
		vo.setMemberAge(20);
		vo.setMemberGender("male");
		vo.setMemberEmail("jungmin09172@naver.com");
		vo.setMemberZipcode("01234");
		vo.setMemberAddress("서울");
		vo.setMemberAddressDetail("강남구");
		vo.setMemberAddressEtc("강남역");
		
//		String id = "jungmin0917";
		
//		if(dao.checkId(id)) {
//			System.out.println("아이디가 이미 존재합니다");
//		}else {
//			System.out.println("사용해도 괜찮은 아이디입니다");
//
//			if(dao.join(vo)) {
//				System.out.println("회원가입 성공입니다");
//			}else {
//				System.out.println("회원가입 실패입니다");
//			}
//		}

		if(dao.login("jungmin0917", "1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
