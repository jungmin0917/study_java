package test;

import com.jungmin.app.member.dao.MemberDAO;
import com.jungmin.app.member.vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		
		// �����
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
		vo.setMemberAddress("����");
		vo.setMemberAddressDetail("������");
		vo.setMemberAddressEtc("������");
		
//		String id = "jungmin0917";
		
//		if(dao.checkId(id)) {
//			System.out.println("���̵� �̹� �����մϴ�");
//		}else {
//			System.out.println("����ص� ������ ���̵��Դϴ�");
//
//			if(dao.join(vo)) {
//				System.out.println("ȸ������ �����Դϴ�");
//			}else {
//				System.out.println("ȸ������ �����Դϴ�");
//			}
//		}

		if(dao.login("jungmin0917", "1234")) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
	}
}
