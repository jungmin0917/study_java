package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("����", "010-1234-1234");
		Bank b2 = new Bank("�д�", "010-2345-2345");
		Bank b3 = new Bank("����", "010-3455-3445");
		
		// �̷� ��Ȳ���� b1.interest = 5, b2.interest = 5 �̷��� �ٲٸ� ����� ������.
		Bank.interest = 5; // �̷� ������ Ŭ������.�������������� ������ �ϸ� �������� ���� �ٲ��. (�̹� ��ü�� �ܶ� �����ƴ���)
		
		b1.printBank();
		b2.printBank();
		b3.printBank();
	}
}
