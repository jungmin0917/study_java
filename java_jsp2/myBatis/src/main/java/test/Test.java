package test;

import dao.MemberDAO;
import vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
//		vo.setId("gildong123");
//		vo.setPw("1234");
//		vo.setName("ȫ�浿");
//		vo.setAge(30);
		
		// ���̵� �ߺ� �˻� �� ȸ������
//		if(!dao.checkId(vo.getId())) { // �ߺ��� ���̵� ������
//			dao.join(vo); // vo ��ü �Ķ���� ����
//		}
		
		// ������ ������ ���� JDBC�� ���� ���� ���ؼ� ���־��� �ܼ��������� Ȯ���� �� �ִ�
		
		// �α��� �غ���
//		if(dao.login("jungmin0917", "1234")) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
		// �̸�, ���� �����ϱ�
//		if(dao.update(vo)) {
//			System.out.println("���� ����");
//		}else {
//			System.out.println("���� ����");
//		}
		
		// ȸ��Ż��
//		if(dao.remove("jungmin0917")) {
//			System.out.println("ȸ��Ż�� ����");
//		}else {
//			System.out.println("ȸ��Ż�� ����");
//		}
		
		// ���̵� ��ȸ�ϱ� (�̸�, ��й�ȣ��)
//		String id = dao.searchId("������", "1234");
//		if(id != null) {
//			System.out.printf("�˻��Ͻ� ���̵�� %s�Դϴ�", id);
//		}else {
//			System.out.println("�ش� ���̵� �������� �ʽ��ϴ�");
//		}
		
		// ���� ��ȸ�ϱ� (20���� ������� ��ü ���� ��������)
		dao.searchMember().forEach(member -> {
			System.out.print(member.getId() + ", ");
			System.out.print(member.getName() + ", ");
			System.out.print(member.getPw() + ", ");
			System.out.print(member.getAge());
			System.out.println();
		});
		
	}
}
