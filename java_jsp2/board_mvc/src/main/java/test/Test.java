package test;

import com.jungmin.app.member.dao.MemberDAO;

public class Test {
	public static void main(String[] args) {
		
		String id = "jungmin0917";
		
		MemberDAO dao = new MemberDAO();
		
		if(dao.checkId(id)) {
			System.out.println("���̵� �̹� �����մϴ�");
		}else {
			System.out.println("����ص� ������ ���̵��Դϴ�");
		}
	}
}
