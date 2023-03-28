package test;

import dao.MemberDAO;
import vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
		vo.setId("jungmin0917");
		vo.setPw("1234");
		vo.setName("Ȳ����");
		vo.setAge(20);
		
		// ���̵� �ߺ� �˻�
		if(!dao.checkId(vo.getId())) { // �ߺ��� ���̵� ������
			dao.join(vo); // vo ��ü �Ķ���� ����
		}
		
		// ������ ������ ���� JDBC�� ���� ���� ���ؼ� ���־��� �ܼ��������� Ȯ���� �� �ִ�
		
		// �α��� �غ���
		if(dao.login("jungmin0917", "1234")) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
		// ���̵� ��ȸ�ϱ�
		
		// ���� ��ȸ�ϱ�
	}
}
