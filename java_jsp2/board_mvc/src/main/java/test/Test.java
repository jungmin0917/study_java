package test;

import com.jungmin.app.member.dao.MemberDAO;

public class Test {
	public static void main(String[] args) {
		
		String id = "jungmin0917";
		
		MemberDAO dao = new MemberDAO();
		
		if(dao.checkId(id)) {
			System.out.println("아이디가 이미 존재합니다");
		}else {
			System.out.println("사용해도 괜찮은 아이디입니다");
		}
	}
}
