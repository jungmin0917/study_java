package ex1_overload;

public class Ex1_Overload {
	
	public void result() {
		System.out.println("�Ű������� ���� �޼���");
	}
	
	public void result(int n) {
		System.out.printf("������ ���ڷ� �޴� �޼��� : %d\n", n);
	}
	
	public void result(char ch) {
		System.out.printf("���ڸ� ���ڷ� �޴� �޼��� : %c\n", ch);
	}
	
	public void result(String s, int n) {
		System.out.printf("���ڿ� �� ������ ���ڷ� �޴� �޼��� :\n���ڿ�: %s, ����: %d\n", s, n);
	}
	
	public void result(int n, String s) {
		System.out.printf("���� �� ���ڿ��� ���ڷ� �޴� �޼��� :\n����: %d, ���ڿ�: %s\n", n, s);
	}
	
}
